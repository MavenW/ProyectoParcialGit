//Elaborado por Daniel Fernando Castillo Mera - Grupo 2 - Curso: 2-2
package entidades;

import java.util.Scanner;

public class Clientes {
    //atributos con metodos de accesos privados
    private String nombres;
    private String apellidos;
    private String cedula;
    private String telefono;
    private String correoElectronico;
    private int numeroFactura;
    
    //contructor por defecto
    public Clientes(){
    }
    
    //contructor con parametros
    public Clientes(String nombres, String apellidos, String cedula){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }
    
    public Clientes(String telefono, String correoElectronico, int numeroFactura){
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.numeroFactura = numeroFactura;
    }
    
    //metodo getters
    public String getNombres(){
        return nombres;
    }
    
    //metodo setters
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
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        String telefonoRegex = "^[0-9]{10}$";//patron a seguir
        if (telefono.length() != 10) { //manejo de cadenas
            System.out.println("El telefono debe tener 10 digitos");
        } else if (!telefono.matches(telefonoRegex)) {
            System.out.println("El telefono debe tener solo digitos");
        } else {
            this.telefono = telefono;
            System.out.println("Telefono valida");
        }
    }
    
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico){
        String regexcorreoElectronico = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        if(!correoElectronico.matches(regexcorreoElectronico)){ //si el correo electronico no sigue los parametros de regexcorroElectronico
            System.out.println("El correo electronico no valido"); // se muestra este mensaje
        }else{
            this.correoElectronico = correoElectronico;
            System.out.println("Correo electronico valido");
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