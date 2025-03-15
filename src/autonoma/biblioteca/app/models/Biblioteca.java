
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
    
}
