//Clase realizada pod Gustavo Garcia
package entidades;

// Clase Automóvil (Clase Hija)
public class Automovil extends vehiculo {
    private int puertas;
    private String transmision;

    public Automovil(String marca, String modelo, int año, String tipo, int puertas, String transmision) {
        super(marca, modelo, año, tipo);
        this.puertas = puertas;
        this.transmision = transmision;
    }
    
    //Metodos Getters
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTransmision() {
        return transmision;
    }

    //Metodo Setter    
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
}
