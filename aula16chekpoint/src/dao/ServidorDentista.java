package dao;

import config.ConfigJDBC;
import model.Dentista;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ServidorDentista implements IDao<Dentista>{

    private ConfigJDBC config = new ConfigJDBC();
    private static final Logger logger = Logger.getLogger(ServidorDentista.class);

    @Override
    public void create() {

//        Drop query para os testes
        String dropQuery = String.format("DROP TABLE Dentista IF EXISTS");

        String createQuery = String.format("CREATE TABLE IF NOT EXISTS Dentista(Id INT AUTO_INCREMENT PRIMARY KEY, numeroMatricula VARCHAR(50), " +
                "nome VARCHAR(100), sobrenome VARCHAR(100))");

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(dropQuery);
            statement.execute(createQuery);
            statement.close();
            logger.info("A tabela Dentista foi criada!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Dentista insert(Dentista dentista) {
        String insertQuery = String.format("INSERT INTO Dentista (numeroMatricula, nome, sobrenome) VALUES ('%s', '%s', '%s')",
                dentista.getNumeroMatricula(), dentista.getNome(), dentista.getSobrenome());

        String selectIdQuery = String.format("SELECT id FROM Dentista WHERE numeroMatricula = '%s'", dentista.getNumeroMatricula());

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(insertQuery);

            ResultSet result = statement.executeQuery(selectIdQuery);
            while(result.next()) {
                Integer id = result.getInt(1);
                dentista.setId(id);
            }

            statement.close();
            logger.info(String.format("O dentista %s %s foi incluído!", dentista.getNome(), dentista.getSobrenome()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dentista;
    }

    @Override
    public void update(Integer id, String coluna, String valorNovo) {
        String updateQuery = String.format("UPDATE Dentista SET %s = '%s' WHERE Id = '%s'", coluna, valorNovo, id);

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(updateQuery);
            statement.close();
            logger.info(String.format("O dentista de id %s foi atualizado!", id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        String deleteQuery = String.format("DELETE FROM Dentista WHERE Id = %s", id);

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(deleteQuery);
            statement.close();
            logger.warn(String.format("O dentista de id %s foi deletado!", id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void select(Integer id) {
        String selectQuery = String.format("SELECT * FROM Dentista WHERE id = %s", id);

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectQuery);

            while(result.next()){
                logger.info(String.format("\n--------------------\n %s \n%s \n%s \n%s \n--------------------",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4)));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList selectAll() {
        String selectAllQuery = String.format("SELECT * FROM Dentista");
        ArrayList<String> selectAllInfo = new ArrayList<>();

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectAllQuery);

            while(result.next()){
                String selectAllLog = String.format("\n--------------------\n%s \n%s \n%s %s \n--------------------",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4));
                logger.info(selectAllLog);

                selectAllInfo.add(selectAllLog);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return selectAllInfo;
    }
}