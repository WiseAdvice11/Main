package SQLExp;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {
private static String url;
    public static void main(String[] args) throws Exception{

        
      //  Class.forName("org.postgresql.Driver");     С версии JDBC 4.0   эта строчка не обязательна.
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/NorthWind",
                "postgres","456456");

        String justForCheck;

        Statement stmn = con.createStatement();
        ResultSet resultSet = stmn.executeQuery("SELECT * FROM customers");
        while (resultSet.next()){
            System.out.println(resultSet.getString("customer_id"));


        }
    }
}


