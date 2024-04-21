/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labosession4escrita;

import Entidades.Cliente;
import Entidades.Empleados;
import Entidades.Persona;

/**
 *
 * @author Home
 */
public class LaboSession4Escrita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = new Persona("Juan","Perez",10);
        Empleados emp = new Empleados("pepe","435345345","Ingeneria");
        Cliente cli = new Cliente("roberto","324343","6");
        
        System.out.print("El Nombre es: "+per.getNombre() + "\n");
        System.out.print("El Area es: "+emp.getArea() + "\n");
        System.out.print("El Codigo de Cliente es: "+cli.getCodcliente() + "\n");

    }
    
}
