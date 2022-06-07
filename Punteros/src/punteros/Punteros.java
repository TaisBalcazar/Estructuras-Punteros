/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punteros;

/**
 *
 * @author SALA H
 */
public class Punteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona personaA;
        Persona personaB;

        personaA = new Persona("Ana", 22);
        personaB = new Persona("Juan", 20);
        System.out.print("personaA: " + personaA + "\n");
        System.out.print("personaB: " + personaB + "\n");

        Persona personaC;
        personaC = new Persona("Kevin", 22);
        System.out.print("personaC: " + personaC + "\n");
        personaC = personaA;
        System.out.print("personaC: " + personaC + "\n");

        personaA.cambiarDatos("Doris", 33);
        personaA.mostrarDatos();

    }

}
