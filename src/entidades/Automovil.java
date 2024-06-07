//Clase realizada pod Gustavo Garcia
package entidades;

// Clase Automóvil (Clase Hija) que hereda de Vehiculo
public class Automovil extends vehiculo {
    private int puertas;
    private String transmision;
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Automovil(String marca, String modelo, int año, String tipo, int puertas, String transmision) {
        super(marca, modelo, año, tipo);
        this.puertas = puertas;
        this.transmision = transmision;
    }
    
    //Metodo Getter para el atributo Puertas
    public int getPuertas() {
        return puertas;
    }
    
    //Metodo Setter para el atributo Puertas
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    //Metodo Getter para el atributo Transmision
    public String getTransmision() {
        return transmision;
    }

    //Metodo Setter para el atributo Transmision    
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
}
