package connections;

import tables.category;

import java.util.Scanner;

public class service {

    public static void crear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre de la categoría.");
        String cat = sc.nextLine();
        category category = new category();
        category.setName(cat);
        DAO.crear(category);
    }
    public static void listar(){
        DAO.leer();
    }
    public static void borrar(){
    }
    public static void editar(){
    }
}
