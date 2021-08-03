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
public class tarjeta extends persona {
    private String no_tarjeta, uso;

    public String getNo_tarjeta() {
        return no_tarjeta;
    }

    public void setNo_tarjeta(String no_tarjeta) {
        this.no_tarjeta = no_tarjeta;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    @Override
  public void agregar(){
  System.out.println("No Tarjeta: " + getNo_tarjeta() );
  System.out.println("Uso: " + getUso() );
  System.out.println("Nombre: " + this.getNombre() );
  System.out.println("Apellido: " + this.getApellido() );
  System.out.println("Direccion: " + this.getDireccion() );
  System.out.println("Telefono: " + this.getTelefono() );
  System.out.println("Fecha Nacimiento: " + this.getFecha_nacimiento() );
  
}
  
   public void mostar(){}
}
