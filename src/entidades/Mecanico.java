package entidades;

import java.util.Scanner;

public class Mecanico extends Persona{//inicio de la clase mecanico
    
    //constructor "Atribudos heredados de persona"
    public Mecanico(String nombres, String apellidos, String cedula, int edad){
        super(nombres,apellidos,cedula,edad);
        
    //metodo mostrar informacion (usamos los getters de la clase Persona)
    public void mostrarInfo(){
        System.out.println("Nombre del //Mecanico//" + getNombres());
        System.out.println("Appelido del //Mecanico//" + getApellidos());
        System.out.println("Cedula del //Mecanico//" + getCedula());
        System.out.println("Edad del //Mecanico//" + getEdad());
    }
    
    //metodo ingresar datos (usamos los getters de la clase Persona)
    public void ingreseDatos(){
        System.out.println("Ingrese los nombre del //Mecanico//" + getNombres());
        System.out.println("Ingrese los apellidos del //Mecanico//" + getApellidos());
        System.out.println("Ingrese la cedula del //Mecanico//" + getCedula());
        System.out.println("Ingrese la edad del //Mecanico//" + getEdad());
    }

}//fin de la clase mecanico