//Clase realizada por Gustavo
package entidades;

// Clase Motocicleta (Clase Hija) que hereda de Vehiculo

import java.util.Scanner;

public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Motocicleta(String marca, String modelo, int año, String tipo, float km, int cilindrada, String tipoMotor) {
        super(marca, modelo, año, tipo, km);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }
    
    //Metodo Getter para el atributo Cilindrada
    public int getCilindrada() {
        return cilindrada;
    }
    
    //Metodo Setter para el atributo Cilindrada
    public void setCilindrada(int cilindrada) {
        if (cilindrada > 0) {
        this.cilindrada = cilindrada;
        } else {
            System.out.println("Cilindrada no válida. Debe ser un número positivo.");
        }
    }
    
    //Metodo Getter para el atributo TipoMotor
    public String getTipoMotor() {
        return tipoMotor;
    }
    
    //Metodo Setter para el atributo TipoMotor
    public void setTipoMotor(String tipoMotor) {
        if (tipoMotor.equalsIgnoreCase("gasolina") || tipoMotor.equalsIgnoreCase("diesel") || tipoMotor.equalsIgnoreCase("electrico")) {
        this.tipoMotor = tipoMotor;
        } else {
            System.out.println("Tipo de motor no válido. Debe ser 'gasolina', 'diesel' o 'electrico'.");
        }
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cilindrada: " + getCilindrada());
        System.out.println("Tipo de motor: " + getTipoMotor());
    }
    
    @Override
    public void ingresarDatos(Scanner scan) {
        System.out.println("\nIngresando datos del Motocicleta:");
        super.ingresarDatos(scan);
        System.out.print("Cilindrada: ");
        this.setCilindrada(scan.nextInt());
        System.out.println("Tipo de motor: ");
        this.setTipoMotor(scan.nextLine());
    }
    
}
