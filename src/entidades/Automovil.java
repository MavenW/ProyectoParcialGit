//Clase realizada por Gustavo Garcia
package entidades;

// Clase Automóvil (Clase Hija) que hereda de Vehiculo

import java.util.Scanner;

public class Automovil extends Vehiculo {
    private int puertas;
    private String transmision;
    private String placa;
    
    //contructor por defecto
    public Automovil(){}
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Automovil(String marca, String modelo, int año, String tipo, float km, int puertas, String transmision, String placa) {
        super(marca, modelo, año, tipo, km);
        this.puertas = puertas;
        this.transmision = transmision;
        this.placa = placa;
    }
    
    //Metodo Getter para el atributo Puertas
    public int getPuertas() {
        return puertas;
    }
    
    //Metodo Setter para el atributo Puertas
    public void setPuertas(int puertas) {
        if(puertas <=1 || puertas >4){
            System.out.println("Numero de puertas invalido");
        }else{
            this.puertas = puertas;
        }
    }
    
    //Metodo Getter para el atributo Transmision
    public String getTransmision() {
        return transmision;
    }

    //Metodo Setter para el atributo Transmision    
    public void setTransmision(String transmision) {
        if (transmision.equalsIgnoreCase("manual") || transmision.equalsIgnoreCase("automatica")) {
        this.transmision = transmision;
        } else {
            System.out.println("Transmision no válida. Debe ser 'manual' o 'automatica'.");
        }
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String pla){
        String PlacaRegex = "([A-Z]{3}[-][0-9]{3}-[A-Z]{1})|([A-Z]{3}[-][0-9]{2}[-][0-9]{2})";
        if (pla.length() != 9) {
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
        System.out.println("Puertas: " + getPuertas());
        System.out.println("Transmisión: " + getTransmision());
        System.out.println("Placa: " + getPlaca());
    }
    
    @Override
    public void ingresarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nIngresando datos del Automovil:");
        super.ingresarDatos();
        System.out.println("Transmision:");
        this.setTransmision(teclado.nextLine());
        System.out.println("Numero de placa(ej.AAA-000-A): ");
        this.setPlaca(teclado.nextLine());
        System.out.println("Puertas (ej.2):");
        int capacidad = Integer.parseInt(teclado.nextLine());
        this.setPuertas(capacidad); 
    }
    
}
