//Elaborado por Daniel Fernando Castillo Mera - Grupo 2 - Curso: 2-2
package entidades;

import java.util.Scanner;

public class Clientes extends Persona{
    //atributos con metodos de accesos privados
    //atributos propios de la clase hija Clientes
    private String telefono;
    private String correoElectronico;
    
    public Clientes(){
        super(); //llamando al cosntructor por defecto de la clase Padre
    }
    
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
   
    @Override
    public String toString(){
        return "Cliente: " + super.toString() + "telefono: " + this.getTelefono() + "correo electronico: " + this.getCorreoElectronico();
    }
    
    public void mostrarDatos(){
        System.out.println("Mostrando cliente: ");
        super.mostrarInfo();//llama a metodo mostrarInfo de la clase padre(super)
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Correo Electronico: " + this.getCorreoElectronico());
    }
    
    @Override
    public void ingresarDatos(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresando cliente: ");
        super.ingresarDatos();
        System.out.println("Digite su telefono: ");
        this.setTelefono(datos.nextLine());
        System.out.println("Digite su correo electronico: ");
        this.setCorreoElectronico(datos.nextLine());
    }

    @Override
    public void agregar(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarVehiculo(Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarvehiculo(Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vehiculo buscarVehiculoxCodigo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarReparacion(Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarMecanico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarVehiculosEspecificos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona buscarPersonaxCedula(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Reparacion buscarReparacionPorCodigoFactura(String codigoFactura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarReparacion(Reparacion r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void menuDeOpciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}