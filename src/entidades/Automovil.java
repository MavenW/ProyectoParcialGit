//Clase realizada por Gustavo Garcia
package entidades;

// Clase Automóvil (Clase Hija) que hereda de Vehiculo

import java.util.Scanner;

public class Automovil extends vehiculo {
    private int puertas;
    private String transmision;
    
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Automovil(String marca, String modelo, int año, String tipo, float km, int puertas, String transmision) {
        super(marca, modelo, año, tipo, km);
        this.puertas = puertas;
        this.transmision = transmision;
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
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puertas: " + getPuertas());
        System.out.println("Transmisión: " + getTransmision());
    }
    
    @Override
    public void ingresarDatos(Scanner scan) {
        System.out.println("\nIngresando datos del Automovil:");
        super.ingresarDatos(scan);
        System.out.print("Puertas: ");
        this.setPuertas(scan.nextInt());
        System.out.println("Transmision(Manual-Automatica): ");
        this.setTransmision(scan.nextLine());
    }
    
}
