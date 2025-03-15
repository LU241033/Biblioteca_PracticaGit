package autonoma.biblioteca.app.main;

import autonoma.biblioteca.app.models.Biblioteca;
import autonoma.biblioteca.app.models.Libro;
import java.util.Scanner;

/**
 *
 * @author Luisa Fernanda Henao Posada
 * @since 20251303
 *@version 1.0.0
 */
public class SistemaBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca ();
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese el ID del libro :");
            long id= teclado.nextLong();
            teclado.nextLine();
            System.out.println("Ingrese el titulo del libro: ");
            String titulo = teclado.nextLine();
            
            Libro nuevoLibro= new Libro(id,titulo);
            boolean agregado= biblioteca.agregarLibro(nuevoLibro);
            if(agregado){
                System.out.println("Libro agregado");
                
            }else{
                System.out.println("No se pudo agregar el libro");
            }
            
            System.out.println(biblioteca.mostrarLibros());   
        }
        
    }
}

