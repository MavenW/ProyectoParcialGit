//Clase Hija creada por Gustavo Garcia
package entidades;

//Clase hija que hereda de Vehiculo

import java.util.Scanner;

public class Autobus extends Vehiculo {
    //Atributos con encapsulamiento
    private int capacidadPasajeros;
    private boolean tieneBaño;
    private String placa;
    
    //Contructor por Defecto
    public Autobus(){}
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Autobus(String marca, String modelo, int año, String tipo, float km, int capacidadPasajeros, boolean tieneBaño) {
        super(marca, modelo, año, tipo, km);
        this.capacidadPasajeros = capacidadPasajeros;
        this.tieneBaño = tieneBaño;
    }
    
    //Metodo Getter para el atributo capacidadPasageros
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    
    //Metodo Setter para el atributo capacidadPasageros
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        if(capacidadPasajeros <= 0 || capacidadPasajeros > 50){
            System.out.println("Capacidad invalida");
        }else{
            this.capacidadPasajeros = capacidadPasajeros;
        }
    }
    
    //Metodo Getter para el atributo isTieneBaño
    public boolean getIsTieneBaño() {
        return tieneBaño;
    }
    
    //Metodo Setter para el atributo Tienebaño
    public void setTieneBaño(boolean tieneBaño) {
        this.tieneBaño = tieneBaño;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String pla){
        String PlacaRegex = "([A-Z]{3}[-][0-9]{3}-[A-Z]{1}) | ([A-Z]{3}[-][0-9]{2}[-][0-9]{2})";
        if (placa.length() != 9) {
            System.out.println("La placa debe tener 9 digitos");
        } else if (!pla.matches(PlacaRegex)) {
            System.out.println("la placa es inavlida");
        } else {
            this.placa = pla;
        }
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Capacidad de pasajeros: " + getCapacidadPasajeros());
        System.out.println("Tiene baño: " + getIsTieneBaño());
        System.out.println("Placa: " + getPlaca());
    }
    
    @Override
    public void ingresarDatos() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIngresando datos del Autobus:");
        super.ingresarDatos();
        System.out.print("Capacidad de opasajeros: ");
        this.setCapacidadPasajeros(scan.nextInt());
        System.out.println("Numero de placa(ej.AAA-000-A): ");
        this.setPlaca(scan.nextLine());
        System.out.println("Tiene baño(true-false): ");
        this.setTieneBaño(scan.nextBoolean());
    }
    
}
