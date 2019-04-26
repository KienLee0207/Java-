package assignment_8;
import  java.sql.*;
public class Connector {
    public Connection conn;

    public static Connector instance;

    private Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/t1807m";
            this.conn = DriverManager.getConnection(URL,"root","");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connector getInstance(){
        if(instance == null){
            instance = new Connector();
        }
        return  instance;
    }

    public ResultSet getQuery(String sql) throws Exception{
        Statement statement = this.conn.createStatement();
        return statement.executeQuery(sql);
    }

    public int updateQuery(String sql) throws Exception{
        Statement statement = this.conn.createStatement();
        return statement.executeUpdate(sql);
    }

    public void close() throws Exception{
        this.conn.close();
    }
}
