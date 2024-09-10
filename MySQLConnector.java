import java.sql.*;

public class MySQLConnector 
{
    public static Connection conectar(){

        String status = "Nada Aconteceu ainda...";
        String mysqlHost = "127.0.0.1";
        String mysqlDb = "db_senac";
        String mysqlUser = "root";
        String mysqlPassword = "senac@02";
        String mysqlPort = "3306";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + ":" + mysqlPort + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
            status = "Conexão realizada com sucesso";
        } catch (Exception e) {
            status = "Ops! Algo de errado não errado nao esta certo com a conexão com o banco de dados MySQL! mensagem do servidor " + e;
        }
        System.out.println(status);
        return conn;
    }
}