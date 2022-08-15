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
public class Vehiculo {
    //DEFINICION DE ATRIBUTOS DEL VEHICULO
        protected String nombre;
        protected String marca;
        protected String modelo;
        protected String caja;
        protected String color;
        protected String precio;
        protected String kmetraje;
        protected String Stock;

    //CONTRUSCTOR POR DEFECTO
        public Vehiculo(){

        }

    //CONSTRUCTOR CON PARAMETROS A DEFINIR

    public Vehiculo(String nombre, String marca, String modelo, String caja, String color, String precio, String kmetraje, String Stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.caja = caja;
        this.color = color;
        this.precio = precio;
        this.kmetraje = kmetraje;
        this.Stock = Stock;
    }
        
      
             //METODOS PARA OBTENER EL VALOR
            public String getNombre(){
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

           

    //METODO PARA MOSTRAR LOS DATOS DE LA CLASE
    public String Mostradatos() {
        return Mostradatos();
    }

}

