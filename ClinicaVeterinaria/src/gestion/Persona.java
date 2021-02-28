package gestion;

import java.io.Serializable;

/**
 * Clase persona que tendr� los atributos nombre (texto), apellidos (texto), dni
 * (texto) y edad (n�mero entero)
 * @author xavier
 * @version: 1.0
 */
public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    //CONSTRUCTOR
    /**
     * Constructor de la clase Persona
     *
     * @param nombre
     * @param apellidos
     * @param dni
     * @param edad
     */
    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    //M�TODOS SETTER & GETTER    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nuevo nombre para la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return los apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos los nuevos apellidos para la persona
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return el dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni el nuevo dni para la persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad la nueva edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //M�TODOS GEN�RICOS
    /**
     * dameAnyoNacimiento d�ndole el a�o actual (int anyoactual) devuelve el a�o
     * de nacimiento
     *
     * @param anyoactual
     * @return anyo de nacimiento
     */
    public int dameAnyoNacimiento(int anyoactual) {
        return (anyoactual - this.getEdad());
    }
    
    /**
     * @return un String con los campos de la persona
     */
    @Override
    public String toString() {
        return("Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Edad: " + edad);        
    }
    
}