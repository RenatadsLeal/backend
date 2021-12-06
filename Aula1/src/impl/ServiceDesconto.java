package impl;

import exapi.ApiCartao;
import exapi.ApiProduto;
import exapi.ApiQuantidade;
import interfac.IDesconto;
import modal.Cartao;
import modal.Produto;

public class ServiceDesconto implements IDesconto {

    private ApiCartao apiCartao = new ApiCartao();
    private ApiProduto apiProduto = new ApiProduto();
    private ApiQuantidade apiQuantidade = new ApiQuantidade();

    @Override
    public Double calcularDesconto(Cartao cartao, Produto produto, Integer quantidade) {
        Double desconto = 0.00;

        desconto = desconto + apiCartao.checkDesconto(cartao.getBanco());
        desconto += apiProduto.checkDesconto(produto.getTipo());
        desconto += apiQuantidade.checkDesconto(quantidade);

        return desconto;
    }
}
