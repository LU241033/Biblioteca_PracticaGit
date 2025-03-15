/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.app.models;

/**
 *
 * @author Luisa Fernanda Henao
 * @since 20252403
 * @version 1.0.0
 */

import java.util.ArrayList;
public class Biblioteca {
    //Se crea la lista para almacenar los libros
    private ArrayList<Libro> libros;
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