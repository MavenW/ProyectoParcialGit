//Elaborado por Daniel Fernando Castillo Mera - Grupo 2 - Curso: 2-2
package entidades;

import java.util.Scanner;

public class Clientes extends Persona{
    //atributos con metodos de accesos privados
    //atributos propios de la clase hija Clienetes
    private String telefono;
    private String correoElectronico;
    
    //contructor con parametros
    public Clientes(String nombres, String apellidos, String cedula, int edad, String telefono, String correoElectronico){
        //con el operador de super hace referencia a los atributos de la clase padre Persona a la clase hija Clientes
        super(nombres, apellidos, cedula, edad);
        //inicializa los atributos propios
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
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
    
    public void mostrarDatos(){
        System.out.println("Nombres: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Cedula: " + this.getCedula());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Correo Electronico: " + this.getCorreoElectronico());
    }
    
    @Override
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