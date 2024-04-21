/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Home
 */
public class Empleados extends Persona {

    private String codempleado;
    private String area;
    
    public Empleados(){}
    
    public Empleados(String nombre, String codempleado, String area) {
        super(nombre);
        this.codempleado = codempleado;
        this.area = area;
    }

    /**
     * @return the codempleado
     */
    public String getCodempleado() {
        return codempleado;
    }

    /**
     * @param codempleado the codempleado to set
     */
    public void setCodempleado(String codempleado) {
        this.codempleado = codempleado;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

}
