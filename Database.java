import java.sql.*;

class Database{
    public static void main(String[] args) throws Exception{
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/","root","");
            System.out.println("Xampp Mysql Connected..");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}