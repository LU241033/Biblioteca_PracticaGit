
package autonoma.biblioteca.app.models;

/**
 *
 * @author Luisa Fernanda Henao
 * @since 20252403
 * @version 1.0.0
 */

import java.util.ArrayList;
import java.util.Comparator;
public class Biblioteca {
    //Se crea la lista para almacenar los libros
    private final ArrayList<Libro> libros;
    //Metodo constructor de el Array
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    //Metodo para mostrar los libros
    public String mostrarLibros(){
        if(libros.isEmpty()){
            return "La biblioteca no tiene libros";
        }
        String resultados = "Libros en la biblioteca\n";
        for(Libro libro : libros){
            resultados += "ID: "+libro.getId()+", Titulo: "+libro.getTitulo()+"\n";
        }
        
        return resultados;
    }
    //Metodo para agregar libro
    public boolean agregarLibro(Libro libro){
        if(libro == null){
            return false;
        }
        return libros.add(libro);
    }
     // Método para actualizar un libro
    public boolean actualizarLibro(long id, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, nuevoLibro);
                return true;
            }
        }
        return false;
    }
     // Método para obtener los libros ordenados alfabéticamente por título
    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
        librosOrdenados.sort(Comparator.comparing(Libro::getTitulo));
        return librosOrdenados;
    }
}

