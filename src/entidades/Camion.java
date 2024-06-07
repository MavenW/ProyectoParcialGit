//Clase creada por Gustavo Garcia
package entidades;

//Clase hija que hereda de Vehiculo
public class Camion extends vehiculo {
    private int capacidadCarga;
    private int numeroEjes;
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Camion(String marca, String modelo, int año, String tipo, int capacidadCarga, int numeroEjes) {
        super(marca, modelo, año, tipo);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    
    //Metodo Getter para el atributo CapacidadCarga
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    
    //Metodo Setter para el atributo CapacidadCarga
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    //Metodo Getter para el atributo NumeroEjes
    public int getNumeroEjes() {
        return numeroEjes;
    }
    
    //Metodo Setter para el atributo NumeroEjes
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
