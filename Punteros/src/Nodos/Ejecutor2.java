/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;


/**
 *
 * @author SALA H
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Nodo objA = new Nodo(8);
        System.out.println(objA);
        
        Nodo objB = new Nodo();
        System.out.println(objB);
        
        objA.concatenarNext(objB);
        System.out.println("\nNext A: " + objA.next);
        System.out.println(objB);
        
        Nodo objC = new Nodo(15);
        objB.concatenarNext(objC);
        
        System.out.println("\nNext B: " + objB.next);
        System.out.println(objC);
        
        System.out.println("\nNext C: "+ objC.next);
        
        objA.obtenerDato();
        
    }
    
}
