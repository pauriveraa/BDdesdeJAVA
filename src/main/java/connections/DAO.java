package connections;

import tables.actor;
import tables.category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    public static void crear(category category){
        connectionRentalFilm db_connect = new connectionRentalFilm();
        ResultSet rs = null;
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO category(name) VALUES(?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, category.getName());
                ps.executeUpdate();
                System.out.println("Mensaje creado correctamente.");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leer(){
        category ct = new category();
        connectionRentalFilm db_connect = new connectionRentalFilm();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM category";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                ct.setCategory_id(rs.getInt("category_id"));
                ct.getCategory_id();

                System.out.println("ID: " + rs.getInt("category_id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo recuperar los datos.");
        }
    }
    public static void borrar(int category_id){
    }
    public static void actualizar(category category){
    }
}