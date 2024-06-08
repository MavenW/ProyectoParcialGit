//Clase padre Persona con sus hijas Clientes y Mecanico
//revisar si esta bien creo que asi no se hace un padre:c
package entidades;

import java.util.Scanner;

public class Persona {
    private String nombres;
    private String apellidos;
    private String cedula;
    private int edad;
    
    //constructor por defecto/sin parámetros con valores quemados
    public Persona(){
        edad = 35;
    }
    
    public Persona(String nombres, String apellidos, String cedula){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }
    
    public String getNombres(){
        return nombres;
    }
    
    public void setNombres(String nombres){
        boolean valido = true; //verifica si hay error
        char[] arreglo = nombres.toCharArray();//convertir nombres en un arreglo de char
        for (char c : arreglo) { // revisar cada caracter del arreglo
            if (!Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                //si hay un caracter que no se alfabetico o que no sea espacio en blanco
                System.out.println("Nombres del cliente no valido");
                valido = false;
                break; //salir del lazo for
                }
           }
           if (valido) {// si valido es verdadero
                this.nombres = nombres;
                System.out.println("Nombres del cliente valido");
            }
      }
            
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        boolean valido = true; //verifica si hay error
        char[] arreglo = apellidos.toCharArray();//convertir apellidos en un arreglo de char
        for (char c : arreglo) { // revisar cada caracter del arreglo
            if (!Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                //si hay un caracter que no se alfabetico o que no sea espacio en blanco
                System.out.println("Apellidos del cliente no valido");
                valido = false;
                break; //salir del lazo for
                }
           }
           if (valido) {// si valido es verdadero
                this.apellidos = apellidos;
                System.out.println("Apellidos del cliente valido");
            }
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public void setCedula(String cedula){
        String cedulaRegex = "^[0-9]{10}$";//patron a seguir
        if (cedula.length() != 10) { //manejo de cadenas
            System.out.println("La cedula debe tener 10 digitos");
        } else if (!cedula.matches(cedulaRegex)) {
            System.out.println("La cedula debe tener solo digitos");
        } else {
            this.cedula = cedula;
            System.out.println("Cedula valida");
        }
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if(edad <= 0){
            System.out.println("Edad no valido");
        }else{
            this.edad = edad;
            System.out.println("Edad valido");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Nombres: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Cedula: " + this.getCedula());
        System.out.println("Edad: " + this.getEdad());
    }
    
    public void ingresarDatos(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Digite los nombres: ");
        this.setNombres(datos.nextLine());
        System.out.println("Digite los apellidos: ");
        this.setApellidos(datos.nextLine());
        System.out.println("Digite la cedula: ");
        this.setCedula(datos.nextLine());
        System.out.println("Digite la edad: ");
        this.setEdad(datos.nextInt());
    }
}