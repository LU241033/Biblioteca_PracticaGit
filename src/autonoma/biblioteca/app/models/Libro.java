/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.app.models;

/**
 *
 * @author Juan Jacobo Cañas Henao
 * @since 20251403
 * @version 1.0.0
 */
public class Libro {
    //Atributos
    
    //Numero id del Libro
    private long id;
    
    //titulo del Libro
    private String titulo;
    
    //Metodo constructor

    public Libro(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    
    //Metodos get and set

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
