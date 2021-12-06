import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    private static final String createSql = "CREATE TABLE Funcionario (Id INT PRIMARY KEY, Nome VARCHAR2, Sobrenome " +
            "VARCHAR2, Idade INT, Cargo VARCHAR2)";
    private static final String dropSql = "DROP TABLE IF EXISTS Funcionario";
    private static final String insertSql = "INSERT INTO Funcionario(Id, Nome, Sobrenome, Idade, Cargo) VALUES (1, " +
            "'Renata', 'Leal', 22, 'CEO')";
    private static final String insertSql2 = "INSERT INTO Funcionario(Id, Nome, Sobrenome, Idade, Cargo) VALUES (2, " +
            "'Adryana', 'Portugal', 21, 'PO')";
    private static final String insertSql3 = "INSERT INTO Funcionario(Id, Nome, Sobrenome, Idade, Cargo) VALUES (3, " +
            "'Clarissa', 'Farencena', '23', 'PM')";
    private static final String insertSql4 = "INSERT INTO Funcionario(Id, Nome, Sobrenome, Idade, Cargo) VALUES (4, " +
            "'Pedro', 'Farencena', '29', 'Estagiario')";
    private static final String insertSql5 = "INSERT INTO Funcionario(Id, Nome, Sobrenome, Idade, Cargo) VALUES (4, " +
            "'Paulo', 'Dehon', '22', 'Estagiario')";

    private static final String deleteSql = "DELETE FROM Funcionario WHERE Id = 3";

    private static final String selectAllSql = "SELECT * FROM Funcionario";

    private static final String selectSql = "SELECT * FROM Funcionario WHERE id = 4";

    private static final String updateSql = "UPDATE Funcionario SET Cargo = 'Júnior' WHERE id = 4";

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(dropSql);
            statement.execute(createSql);

            statement.execute(insertSql);
            statement.execute(insertSql2);
            statement.execute(insertSql3);
            statement.execute(insertSql4);

            selectUsuarios(connection);

            statement.execute(deleteSql);
            statement.execute(updateSql);

            selectUsuario(connection);

            selectUsuarios(connection);

            try {
                statement.execute(insertSql5);
            } catch (Exception e) {
                logger.warn(e.getMessage());
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void selectUsuarios(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectAllSql);
        logger.info("---------------------------------");
        while (resultSet.next()) {
            logger.info(String.format("%s %s %s %s %s",
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5)));
        }
    }

    private static void selectUsuario(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectSql);
        logger.info("---------------------------------");
        while (resultSet.next()) {
            logger.debug(String.format("%s %s %s %s %s",
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5)));
        }
    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    }
}
