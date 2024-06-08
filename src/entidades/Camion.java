//Clase creada por Gustavo Garcia
package entidades;

//Clase hija que hereda de Vehiculo

import java.util.Scanner;

public class Camion extends Vehiculo {
    private int capacidadCarga;
    private int numeroEjes;
    private String placa;
    private String tipoCamion;
    
    //Contructor por defecto
    public Camion(){}
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Camion(String marca, String modelo, int año, String tipo, float km, int capacidadCarga, int numeroEjes, String placa, String tipoCamion) {
        super(marca, modelo, año, tipo, km);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.placa = placa;
        this.tipoCamion = tipoCamion;
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
    
    public String getTipoCamion(){
        return this.tipoCamion;
    }
    
    public void setTipoCamion(String tipo){
        boolean valido = true;
        char[] arreglo = tipo.toCharArray();//convertir en un arreglo de char
        for (char c : arreglo) { // revisar cada caracter del arreglo
            if (!Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                //si hay un caracter que no se alfabetico o que no sea espacio en blanco
                System.out.println("Tipo no valido");
                valido = false;
                break; //salir del lazo for
            }
        }
        if (valido==true) {// si valido es verdadero
            this.tipoCamion = tipo;
        }
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Capacidad de carga: " + getCapacidadCarga() + " Toneladas");
        System.out.println("Numero de ejes: " + getNumeroEjes());
        System.out.println("Placa: " + getPlaca());
    }
    
    @Override
    public void ingresarDatos() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIngresando datos del camion:");
        super.ingresarDatos();
        System.out.println("Numero de placa(ej.AAA-000-A): ");
        this.setPlaca(scan.nextLine());
        System.out.println("Tipo de camion(Carga pesado-Liviano)");
        this.setTipoCamion(scan.nextLine());
        System.out.print("Capacidad(ej. 2 toneladas):");
        this.setCapacidadCarga(scan.nextInt());
        System.out.print("Numerp de ejes(ej. 3):");
        this.setNumeroEjes(Integer.parseInt(scan.nextLine()));
    }
    
}
