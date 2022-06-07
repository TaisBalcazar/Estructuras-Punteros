/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punteros;

/**
 *
 * @author SALA H
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }

    public void cambiarDatos(String nuevonombre, int nuevaedad) {
        nombre = nuevonombre;
        edad = nuevaedad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n");
    }

}
