package Streams.Colecciones.models;

public class Usuario {
    //Atributos

    private String nombre;
    private String apellido;
    private Integer id;
    private static int ultimoId;
    

    //Constructor
    public Usuario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ultimoId++;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //Getters
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public Integer getId() {
        return id;
    }

    

    @Override
    public String toString(){
        return this.nombre + " " + this.apellido;
    }

}
