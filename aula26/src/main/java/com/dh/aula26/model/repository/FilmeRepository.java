package com.dh.aula26.model.repository;

import com.dh.aula26.model.Filme;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FilmeRepository implements IRepository<Filme>{

    public static Map<Integer, Filme> filmeMap = new HashMap<>();


    @Override
    public Map<Integer, Filme> create(Filme obj) {

        Integer id = filmeMap.size() + 1;

        filmeMap.put(id, obj);

        Map<Integer, Filme> create = new HashMap<>();
        create.put(id, filmeMap.get(id));

        return create;
    }

    @Override
    public Map<Integer, Filme> update(Filme obj, Integer id) {

        Filme updateFilme = filmeMap.get(id);

        updateFilme.setClassificacao(obj.getClassificacao());
        updateFilme.setDistribuidora(obj.getDistribuidora());

        Map<Integer, Filme> update = new HashMap<>();
        update.put(id, updateFilme);

        return update;
    }

    @Override
    public Map<Integer, Filme> selectAll() {
        return filmeMap;
    }

    @Override
    public Map<Integer, Filme> select(Integer id) {

        Map<Integer, Filme> select = new HashMap<>();
        select.put(id, filmeMap.get(id));
        return select;
    }

    @Override
    public void delete(Integer id) {
        filmeMap.remove(id);
    }
}
