package concesionario_app;
/**
 *
 * @author SSSA
 */
public class VehiculoDeportivo extends VehiculoSuperDeportivo{

    public VehiculoDeportivo(String nombre, String marca, String modelo, String caja, String color, String precio, String kmetraje, String stock, String kitCarroceria) {
        super(nombre, marca, modelo, caja, color, precio, kmetraje, stock, kitCarroceria);
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
    @Override
    public String Mostradatos() {
        return "\n-------Vehiculo Deportivo-------"+
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

