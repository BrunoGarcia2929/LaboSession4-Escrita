/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Home
 */
public class Cliente extends Persona {

    private String codcliente;
    private String cantcompras;

    public Cliente() {
    }

    public Cliente(String nombre,String codcliente, String cantcompras) {
        super(nombre);
        this.codcliente = codcliente;
        this.cantcompras = cantcompras;
    }

    /**
     * @return the codcliente
     */
    public String getCodcliente() {
        return codcliente;
    }

    /**
     * @param codcliente the codcliente to set
     */
    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    /**
     * @return the cantcompras
     */
    public String getCantcompras() {
        return cantcompras;
    }

    /**
     * @param cantcompras the cantcompras to set
     */
    public void setCantcompras(String cantcompras) {
        this.cantcompras = cantcompras;
    }

}
