package com.digitalhouse.aula13.dao;

import com.digitalhouse.aula13.config.ConfigJDBC;
import com.digitalhouse.aula13.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ServidorH2 implements IDao<Medicamento>{

    private ConfigJDBC config = new ConfigJDBC();
    private static final Logger logger = Logger.getLogger(ServidorH2.class);

    @Override
    public Medicamento insert(Medicamento medicamento) {
        String query = String.format("INSERT INTO Medicamento VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",
                medicamento.getId(), medicamento.getCoddigoNumerico(), medicamento.getNome(), medicamento.getLaboratorio(),
                medicamento.getQuantidade(), medicamento.getPreco());

        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            stmt.close();
            logger.info(String.format("O medicamento %s foi incluído!", medicamento.getNome()));
        } catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public void delete(Integer id) {
        String query = String.format("DELETE FROM Medicamento WHERE id = %s", id);

        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            stmt.close();
            logger.warn(String.format("O medicamento com o id %s foi deletado!", id));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void select(Integer id) {
        String query = String.format("SELECT * FROM Medicamento WHERE id = %s", id);

        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while(result.next()){
                logger.info(String.format("\n--------------------\n %s \n%s \n%s \n%s \n%s \n%s \n--------------------",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getInt(5),
                        result.getDouble(6)));
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void selectCodigo(String codigo) {
        String query = String.format("SELECT * FROM Medicamento WHERE codigoNumerico = %s", codigo);

        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while(result.next()){
                logger.info(String.format("\n--------------------\n %s \n%s \n%s \n%s \n%s \n%s \n--------------------",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getInt(5),
                        result.getDouble(6)));
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void selectAll() {
        String query = String.format("SELECT * FROM Medicamento");

        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while(result.next()){
                logger.info(String.format("\n--------------------\n %s \n%s \n%s \n%s \n%s \n%s \n--------------------",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getInt(5),
                        result.getDouble(6)));
            }
            stmt.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
