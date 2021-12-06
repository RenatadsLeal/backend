package com.dh.aula28.service;

import com.dh.aula28.persistence.entities.ProdutoEntity;
import com.dh.aula28.persistence.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoEntity> buscarTodos() {
        return repository.findAll();
    }

    public ProdutoEntity salvar(ProdutoEntity produtoEntity) {
        return repository.save(produtoEntity);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public ProdutoEntity subtrair(Integer id, Integer quantidade) {
        //obtendo o produto
        Optional<ProdutoEntity> produto = repository.findById(id);
        //mudou a qtd mas nao salvou
        produto.get().setQuantidade(produto.get().getQuantidade() - quantidade);
        //salvando o produto
        salvar(produto.get());
        return produto.get();
    }
}
