package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionRentalFilm {
    public Connection get_connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com:3306/PaublaRivera", "sofka_training", "BZenX643bQHw");
            /*
            if (connection != null){
                System.out.println("Conexion Exitosa");
            }
             */
        }catch (SQLException e){
            System.out.println(e);

        }
        return connection;
    }
}
