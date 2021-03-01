package Main;
import connections.connectionRentalFilm;
import connections.service;

import java.sql.Connection;
import java.util.Scanner;

public class mainRentalFilm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("---------------");
            System.out.println("APLICACION");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Editar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    service.crear();
                    break;
                case 2:
                    service.listar();
                    break;
                case 3:
                    service.borrar();
                    break;
                case 4:
                    service.editar();
                    break;
                default:
                    break;
            }
        }while (opcion != 5);





        connectionRentalFilm conexion = new connectionRentalFilm();

        try(Connection conex = conexion.get_connection()) {

        }catch (Exception e){
            System.out.println("Error de conexión");
        }
    }
}
