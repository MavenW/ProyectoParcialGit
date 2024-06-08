//Clase creada por Gustavo Garcia
package entidades;

//Clase hija que hereda de Vehiculo
public class Camion extends vehiculo {
    private int capacidadCarga;
    private int numeroEjes;
    private Mecanico omecanico;
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Camion(String marca, String modelo, int año, String tipo, float km, int capacidadCarga, int numeroEjes) {
        super(marca, modelo, año, tipo, km);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    
    //Metodo Getter para el atributo CapacidadCarga
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    
    //Metodo Setter para el atributo CapacidadCarga
    public void setCapacidadCarga(int capacidadCarga) {
        if(capacidadCarga >=2 || capacidadCarga <=4){
            this.capacidadCarga = capacidadCarga;
        }else{
            System.out.println("Capacidad invalidad");
        }
    }
    
    //Metodo Getter para el atributo NumeroEjes
    public int getNumeroEjes() {
        return numeroEjes;
    }
    
    //Metodo Setter para el atributo NumeroEjes
    public void setNumeroEjes(int numeroEjes) {
        if(numeroEjes >= 2 || numeroEjes <=6){
            this.numeroEjes = numeroEjes;
        }else{
            System.out.println("Numero de ejes incorrecto");
        }
    }

}
