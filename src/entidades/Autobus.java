//Clase Hija creada por Gustavo Garcia
package entidades;

//Clase hija que hereda de Vehiculo
public class Autobus extends vehiculo {
    //Atributos con encapsulamiento
    private int capacidadPasajeros;
    private boolean tieneBaño;
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Autobus(String marca, String modelo, int año, String tipo, int capacidadPasajeros, boolean tieneBaño) {
        super(marca, modelo, año, tipo);
        this.capacidadPasajeros = capacidadPasajeros;
        this.tieneBaño = tieneBaño;
    }
    
    //Metodo Getter para el atributo capacidadPasageros
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    
    //Metodo Setter para el atributo capacidadPasageros
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
    //Metodo Getter para el atributo isTieneBaño
    public boolean isTieneBaño() {
        return tieneBaño;
    }
    
    //Metodo Setter para el atributo Tienebaño
    public void setTieneBaño(boolean tieneBaño) {
        this.tieneBaño = tieneBaño;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Tiene baño: " + tieneBaño);
    }
}
