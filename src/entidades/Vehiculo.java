//Clase realizada por Gustavo Garcia
package entidades;

import interfaces.Imprimible;
import java.util.Scanner;

public class Vehiculo implements Imprimible{
    //Parametros aplicando el encapulamiento
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private float kilometraje;
    private Clientes oClientes;
    private String codigoUnico;
    
    //contructor por defecto
    public Vehiculo(){}
    
    //Contructor Parametrizado
    public Vehiculo(String marca, String modelo, int año, String tipo, float okilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.kilometraje = okilometraje;
    }
    
    //Metodos Getter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        boolean valido = true;
        char[] arreglo = marca.toCharArray();//convertir en un arreglo de char
        for (char c : arreglo) { // revisar cada caracter del arreglo
            if (!Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                //si hay un caracter que no se alfabetico o que no sea espacio en blanco
                System.out.println("Marca no valida");
                valido = false;
                break; //salir del lazo for
            }
        }
        if (valido==true) {// si valido es verdadero
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }
    
    //Metodo setter
    public void setModelo(String modelo) {
        boolean valido = true;
        char[] arreglo = modelo.toCharArray();//convertir en un arreglo de char
        for (char c : arreglo) { // revisar cada caracter del arreglo
            if (!Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                //si hay un caracter que no se alfabetico o que no sea espacio en blanco
                System.out.println("Modelo no valido");
                valido = false;
                break; //salir del lazo for
            }
        }
        if (valido==true) {// si valido es verdadero
            this.modelo = modelo;
        }
    }

    public int getAño() {
        return año;
    }
    
    //Metodo Setter
    public void setAño(int año) {
        if(año <= 0 || año > 2024){
            System.out.println("Año invalido");
        }else{
            this.año = año;
        }
    }

    public String getTipo() {
        return tipo;
    }
    
    //Metodo Setter
    public void setTipo(String tipo) {
        boolean valido = true;
        char[] arreglo = tipo.toCharArray();//convertir en un arreglo de char
        for (char c : arreglo) { // revisar cada caracter del arreglo
            if (!Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                //si hay un caracter que no se alfabetico o que no sea espacio en blanco
                System.out.println("Modelo no valido");
                valido = false;
                break; //salir del lazo for
            }
        }
        if (valido==true) {// si valido es verdadero
            this.tipo = tipo;
        }
    }
    public float getKilometraje(){
        return this.kilometraje; 
    }
    
    public void setKilometraje(float km){
        if(km <= 0){
            System.out.println("Kilometrage invalido");
        }else{
            this.kilometraje = km;
        }
    }
    
    public String getCodigoUnico(){
        return this.codigoUnico;
    }
    
    public void setCodigoUnico(String codigo){
        String cedulaRegex = "^[0-9]{5}$";
        if (codigo.length() != 5) {
            System.out.println("El codigo debe tener 5 digitos");
        } else if (!codigo.matches(cedulaRegex)) {
            System.out.println("cedula debe tener solo digitos");
        } else {
            this.codigoUnico = codigo;
        }
    }
    
    @Override
    public void imprimir() {
        System.out.println("Codigo:" + getCodigoUnico());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Kilometraje: " + getKilometraje());
    }
    
    public void ingresarDatos(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Codigo");
        String codigo = scan.nextLine();
        if(codigo.length() != 5){
            codigo = scan.nextLine();
            this.setCodigoUnico(codigo);
        }else{
            this.setCodigoUnico(codigo);
        }
        System.out.println("Marca: ");
        this.setMarca(scan.nextLine());
        System.out.println("Modelo: ");
        this.setModelo(scan.nextLine());
        System.out.println("Año: ");
        this.setAño(scan.nextInt());
        System.out.println("Tipo: ");
        String tipos = scan.nextLine();
        this.setTipo(tipos);
        System.out.println("Kilometraje: ");
        this.setKilometraje(scan.nextFloat());
    }
    
}
