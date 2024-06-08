//ELABORADO POR: Leonardo De Jesus Pluas Larrea - Grupo 2 - Curso: 2-2
package entidades;

import java.util.Scanner;

public class Mecanico extends Persona{//inicio de la clase mecanico
    
    //constructor "Atribudos heredados de persona"
    public Mecanico(String nombres, String apellidos, String cedula, int edad){
        super(nombres,apellidos,cedula,edad);
    }
        
    //metodo mostrar informacion (usamos los getters de la clase Persona)
    public void mostrarInfo(){
    //se usa el "super." debido ah que esos metodos no estan en esta clase
        System.out.println("Nombre del //Mecanico//" + super.getNombres());
        System.out.println("Appelido del //Mecanico//" + super.getApellidos());
        System.out.println("Cedula del //Mecanico//" + super.getCedula());
        System.out.println("Edad del //Mecanico//" + super.getEdad());
    }
    
    //metodo ingresar datos (usamos los getters de la clase Persona)
    public void ingresarDatos(){
    //se usa el "super." debido ah que esos metodos no estan en esta clase
        Scanner datos = new Scanner(System.in);
        System.out.println("Digite los nombres: ");
        super.setNombres(datos.nextLine());
        System.out.println("Digite los apellidos: ");
        super.setApellidos(datos.nextLine());
        System.out.println("Digite la cedula: ");
        super.setCedula(datos.nextLine());
        System.out.println("Digite la edad: ");
        super.setEdad(datos.nextInt());
    }
    
}//fin de la clase mecanico
