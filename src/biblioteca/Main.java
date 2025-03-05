package  biblioteca;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n Biblioteca Menu");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Buscar libro Por Titulo");
            System.out.println("3. Buscar libro Por Autor");
            System.out.println("4. Buscar libro Por Editora");
            System.out.println("5. Salir");
            System.out.println("Elige una  opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Titulo:");
                    String Titulo = scanner.nextLine();
                    System.out.println("Autor:");
                    String Autor = sacnner.nextLine();
                    System.out.println("ISBN:");
                    String ISBN = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(Titulo, Autor, ISBN));
                    break;




            }
        }
    }
}