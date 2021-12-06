package dao;

import java.util.ArrayList;

public interface IDao<T> {
    public void create();
    public T insert(T t);
    public void update(Integer id, String coluna, String valorNovo);
    public void delete(Integer id);
    public void select(Integer id);
    public ArrayList selectAll();
}
