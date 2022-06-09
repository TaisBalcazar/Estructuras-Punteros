/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapunteros;

/**
 *
 * @author SALA A
 */
public class Persona {

    private String nombre;
    private int edad;
    private int codigo;
    private Persona siguiente;

    public Persona(String n, int e, int c) {
        nombre = n;
        edad = e;
        codigo = c;
        siguiente = null;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public void establecerCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Persona obtenerSiguiente() {
        return siguiente;
    }

    public void establecerSiguiente(Persona siguiente) {
        this.siguiente = siguiente;
    }

    public void cambiarDatos(String nuevon, int nuevae, int nuevoc) {
        establecerNombre(nuevon);
        establecerEdad(nuevae);
        establecerCodigo(nuevoc);
    }

    public void mostrarDatos() {
        System.out.printf("Nombre: %s\n "
                + "Edad: %d\n"
                + "Codigo: %d\n"
                + "Siguiente: %s\n", obtenerNombre(), 
                obtenerEdad(),
                obtenerCodigo(), 
                obtenerSiguiente());
    }
    

}
