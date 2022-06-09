/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapunteros;

/**
 *
 * @author SALA A
 */
public class PracticaPunteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona p1;
        Persona p2;
        Persona p3;

        p1 = new Persona("Ana", 22, 1150083242);
        p1.cambiarDatos("Tais", 18, 1100221100);
        p1.obtenerCodigo();
       
        p2 = new Persona("Juan", 20, 110022331);
        p2.cambiarDatos("Paul", 48, 789654123);
        p2.obtenerCodigo();
        
        p3 = new Persona("Kevin", 22, 3);
        p3.cambiarDatos("Paula", 14, 1150087964);
        p3.obtenerCodigo();
        
        // concatenar
        p1.establecerSiguiente(p2);
        p2.establecerSiguiente(p3);
        
        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();
    }

}
