//Clase realizada por Gustavo
package entidades;

// Clase Motocicleta (Clase Hija) que hereda de Vehiculo

import java.util.Scanner;

public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;
    private String placa;
    
    //Contructor `por defecto
    public Motocicleta(){}
    
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
        System.out.println("Cilindrada: " + getCilindrada());
        System.out.println("Tipo de motor: " + getTipoMotor());
        System.out.println("Placa: " + getPlaca());
    }
    
    @Override
    public void ingresarDatos() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIngresando datos del Motocicleta:");
        super.ingresarDatos();
        System.out.println("Tipo de motor: ");
        String motor = scan.nextLine();
        this.setTipoMotor(motor);
        System.out.println("Numero de placa(ej.AAA-000-A): ");
        this.setPlaca(scan.nextLine());
        System.out.print("Cilindrada: ");
        this.setCilindrada(scan.nextInt());
    }
    
}
