
package autonoma.biblioteca.app.models;

/**
 *
 * @author Luisa Fernanda Henao Posada
 * @since 20251303
 * @version 1.0.0
 */
public abstract class Persona {
    
    // Atributos
    
    //Nombre de la persona
    private String nombre;
    //Documento de identificacion de la persona
    private String documentoIdentidad;
    //Correo electronico de la persona;
    private String correoElectronico;
    
    //Metodo constructor
    public Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }
    
    //Metodos getter y setter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
}
