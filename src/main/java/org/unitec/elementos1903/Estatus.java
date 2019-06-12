/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

/**
 *
 * @author Servicios Especiales
 */
public class Estatus {
    private String mensaje;
    private boolean sucess;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isSucess() {
        return sucess;
    }

    public void setSucess(boolean sucess) {
        this.sucess = sucess;
    }

    public Estatus() {
    }

    public Estatus(String mensaje, boolean sucess) {
        this.mensaje = mensaje;
        this.sucess = sucess;
    }
    
}
