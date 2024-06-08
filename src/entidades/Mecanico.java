package entidades;

import java.util.Scanner;

public class Mecanico {//inicio de la clase mecanico
//atributos con metodos de accesos privados
    private String nombres;
    private String apellidos;

//IMPLIMENTACION DE METODOS
//metodo por defecto
public Mecanico(){
}

//metodo parametrizado (con parametros)
public Mecanico(String nombres, String apellidos){
    this.nombres = nombres;
    this.apellidos = apellidos;
}

//PARA NOMBRES
//metodo getter (retorna)
public String getNombres(){
    return this.nombres;
}

//metodo setter (no returno, uso de void)
public void setNombres(String nombres){
    
}

//PARA APELLIDOS
//metodo getter (retorna)
public String getApellidos(){
    return this.apellidos;
}

//metodo setter (no retorna, uso de void)
public void setApellidos(String apellidos){
    
}

//metodo mostrar informacion
public void mostrarInfo(){
System.out.println("Los nombres del mecanico es: " + this.getNombres());
System.out.println("Los apellidos del mecanico es: " + this.getApellidos());
}
    
//metodo de ingreso de datos por teclado
public void ingresarDatos(){
Scanner datos = new Scanner(System.in);
System.out.println("Digite los nombres del mecanico: ");
this.setNombres(datos.nextLine());
System.out.println("Digite los apellidos del mecanico: ");
this.setApellidos(datos.nextLine());
}

}//fin de la clase mecanico
