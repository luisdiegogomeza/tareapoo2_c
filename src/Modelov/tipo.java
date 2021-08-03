/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelov;

/**
 *
 * @author Usuaria
 */
public class tipo extends vehiculo{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void agregar(){
  System.out.println("Tipo: " + getTipo () );
 
  
}
    
    public void mostar(){}
}
