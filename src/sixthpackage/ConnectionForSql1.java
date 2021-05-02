package sixthpackage;

import java.sql.*;

public class ConnectionForSql1 {
    public static void main(String[] args) throws SQLException {
        String username = "root";
        String password = "root1234";
        String dbName = "students";
        //jdbc:mysql-->driver name
        //localhost-->host name
        //3306--> port number by default its 3306 in mysql(interview Q)

        String url ="jdbc:mysql://localhost:3306/"+dbName;
        String query = "select * from students;";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("exception occurred in the driver");
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(url,username,password);
        
        Statement statement = connection.createStatement();
        
        ResultSet table = statement.executeQuery(query);
        
        while (table.next()){
           // table.getInt(columnLabel:"id")
          //  table.getString(columnLabel: "name");
          //  table.getString(columnLabel: "state");
            //table.getString(columnLabel: "zipcode");


        }
        
        


    }

   
    }
