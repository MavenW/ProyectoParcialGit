//Clase padre Persona con sus hijas Clientes y Mecanico
//revisar si esta bien creo que asi no se hace un padre:c
package entidades;

import java.util.Scanner;

public class Persona {
    private String nombres;
    private String apellidos;
    private String cedula;
    
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
    
    public void mostrarInfo(){
        System.out.println("Los nombres del cliente son: " + this.getNombres());
        System.out.println("Los apellidos del cliente son: " + this.getApellidos());
        System.out.println("La cedula del cliente es: " + this.getCedula());
    }
    
    public void ingresarDatos(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Digite los nombres del cliente: ");
        this.setNombres(datos.nextLine());
        System.out.println("Digite los apellidos del cliente: ");
        this.setApellidos(datos.nextLine());
        System.out.println("Digite la cedula del cliente: ");
        this.setCedula(datos.nextLine());
    }
     
}