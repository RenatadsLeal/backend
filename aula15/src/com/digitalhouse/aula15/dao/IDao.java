package com.digitalhouse.aula15.dao;

public interface IDao<T> {
    public void create();
    public T insert(T t);
    public void update(Integer id, String coluna, String valorNovo);
    public void delete(Integer id);
    public String select(Integer id);
    public void selectAll();
}
