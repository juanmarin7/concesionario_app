/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario_app;

/**
 *
 * @author SSSA
 */
public class VehiculoSuperDeportivo extends Vehiculo{
    String kitCarroceria;

    public VehiculoSuperDeportivo(String kitCarroceria) {
        this.kitCarroceria = kitCarroceria;
    }

    public VehiculoSuperDeportivo(String nombre, String marca, String modelo, String caja, String color, String precio, String kmetraje, String Stock,String kitCarroceria) {
        super(nombre, marca, modelo, caja, color, precio, kmetraje, Stock);
        this.kitCarroceria = kitCarroceria;
    }

  

    public String getKitCarroceria() {
        return kitCarroceria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCaja() {
        return caja;
    }

    public String getColor() {
        return color;
    }

    public String getPrecio() {
        return precio;
    }

    public String getKmetraje() {
        return kmetraje;
    }

    public String getStock() {
        return Stock;
    }
    
    public String Mostradatos() {
        return "\n-------Vehiculo Super Deportivo-------"+
               "\nNombre: "+nombre+
                "\nMarca: "+marca+
                "\nModelo: "+modelo+
                "\nCaja: "+caja+
                "\nColor: "+color+
                "\nPrecio: "+precio+
                "\nKilometraje: "+kmetraje+
                "\nStock: "+Stock+
                "\nBodyKit: "+kitCarroceria;
    }
}

