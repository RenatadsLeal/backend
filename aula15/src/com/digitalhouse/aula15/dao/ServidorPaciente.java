package com.digitalhouse.aula15.dao;

import com.digitalhouse.aula15.config.ConfigJDBC;
import com.digitalhouse.aula15.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class ServidorPaciente implements IDao<Paciente>{

    private ConfigJDBC config = new ConfigJDBC();
    private static final Logger logger = Logger.getLogger(ServidorEndereco.class);

    @Override
    public void create() {

        String dropQuery = String.format("DROP TABLE Paciente IF EXISTS");

        String createQuery = String.format("CREATE TABLE IF NOT EXISTS Paciente(id INT PRIMARY KEY AUTO_INCREMENT, nome VARCHAR(100), " +
                "sobrenome VARCHAR(100), rg VARCHAR(100), enderecoId INT NOT NULL, dataCadastro DATE)");

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(dropQuery);
            statement.execute(createQuery);
            statement.close();
            logger.info("A tabela Paciente foi criada!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Paciente insert(Paciente paciente) {
        String insertQuery = String.format("INSERT INTO Paciente (nome, sobrenome, rg, enderecoId, dataCadastro) VALUES ('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(), paciente.getSobrenome(), paciente.getRg(), (paciente.getEndereco().getId()), paciente.getDataCadastro());
        String selectIdQuery = String.format("SELECT Id FROM Paciente WHERE Rg = %s", paciente.getRg());

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(insertQuery);

            ResultSet result = statement.executeQuery(selectIdQuery);
            while(result.next()) {
                Integer id = result.getInt(1);
                paciente.setId(id);
            }

            statement.close();
            logger.info(String.format("O Paciente %s %s foi incluído!", paciente.getNome(), paciente.getSobrenome()));
        } catch (Exception e){
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public void update(Integer id, String coluna, String valorNovo) {
        String updateQuery = String.format("UPDATE Paciente SET %s = '%s' WHERE id = '%s'",
                coluna, valorNovo, id);
        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(updateQuery);
            statement.close();
            logger.warn(String.format("O Paciente com o id %s foi atualizado!", id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        String deleteQuery = String.format("DELETE FROM Paciente WHERE id = %s", id);
        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(deleteQuery);
            statement.close();
            logger.warn(String.format("O Paciente com o id %s foi deletado!", id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String select(Integer id) {
            String selectQuery = String.format("SELECT * FROM Paciente WHERE id = %s", id);
            String temNoBanco = "Id não existe no banco!";

            try {
                Connection connection = config.getConnectionH2();
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(selectQuery);

                    while (result.next()) {
                        temNoBanco = "Id existe no banco";
                        logger.info(String.format("\n--------------------\n %s \n%s %s \n%s \n%s \n%s \n--------------------",
                                result.getInt(1),
                                result.getString(2),
                                result.getString(3),
                                result.getString(4),
                                result.getInt(5),
                                result.getString(6)));
                    }

            } catch (Exception e) {
                e.printStackTrace();
        }
        return temNoBanco;

    }

    @Override
    public void selectAll() {
        String selectQuery = String.format("SELECT * FROM Paciente");

        try{
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectQuery);

            while(result.next()){
                logger.info(String.format("\n--------------------\n%s \n%s %s \n%s \n%s \n%s \n--------------------",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getInt(5),
                        result.getString(6)));
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}