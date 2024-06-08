package Administrador;

import static Administrador.AdministradorReparacion.listaReparaciones;
import entidades.Autobus;
import entidades.Clientes;
import entidades.Mecanico;
import entidades.Persona;
import entidades.Vehiculo;
import interfaces.InterfasAdminPersona;
import java.util.ArrayList;
import java.util.Scanner;
import entidades.Automovil;
import entidades.Camion;
import entidades.Motocicleta;
import entidades.Reparacion;
        
public class AdministradorPersona implements InterfasAdminPersona{
    
    public static ArrayList<Persona> listaPersonas = new ArrayList();
    public static ArrayList<Vehiculo> listaVehiculo = new ArrayList();

    @Override
    public void agregar(Persona p) {
        listaPersonas.add(p);
    }

    @Override
    public void eliminar(Persona p) {
        listaPersonas.remove(p);
    }
    
    @Override
    public void mostrar() {
        //por cada persona referenciada por p que existe en la listaPersona
        for (Persona p : this.listaPersonas) {//metodo que mue4stra los objetos refenciados en ella
            p.mostrarInfo();
        }
    }
    
    @Override
    public void mostrarCliente() {
        for (Persona per : listaPersonas) {
            if (per instanceof Clientes) {
               per.mostrarInfo();//enlace dinamico de metodos
                
            }
        }
    }

    @Override
    public void mostrarMecanico() {
        for (Persona per : listaPersonas) {
            if (per instanceof Mecanico) {
                per.mostrarInfo();
            }
        }
    }
    
    @Override
    public Persona buscarPersonaxCedula(String cedula) { //metodo que busca dentro de la coleccion 
        for (Persona p : this.listaPersonas) {
            if (p.getCedula().equalsIgnoreCase(cedula)) { //condición de búsqueda
                return p;
            }
        }
        return null;
    }
    
    @Override
    public void agregarVehiculo(Vehiculo v){
        listaVehiculo.add(v);
    }
    
    @Override
    public void eliminarvehiculo(Vehiculo v){
        listaVehiculo.remove(v);
    }
    
    @Override
    public void mostrarVehiculo(){
        for (Vehiculo v : this.listaVehiculo) {//metodo que mue4stra los objetos refenciados en ella
            v.imprimir();
        }
    }
    
    @Override
    public Vehiculo buscarVehiculoxCodigo(String codigo){
        for (Vehiculo v : this.listaVehiculo) {
            if (v.getCodigoUnico().equalsIgnoreCase(codigo)) { //condición de búsqueda
                return v;
            }
        }
        return null;
    }
    
    @Override
    public void agregarReparacion(Reparacion r) {
        listaReparaciones.add(r);
    }
    
    @Override
    public Reparacion buscarReparacionPorCodigoFactura(String codigoFactura) {
        for (Reparacion r : listaReparaciones) {
            if (r.getCodigoFactura().equals(codigoFactura)) {
                return r;
            }
        }
        return null;
    }
    
    @Override
    public void agregarReparacion(Scanner in) {
        if(AdministradorPersona.listaPersonas.isEmpty() || AdministradorPersona.listaVehiculo.isEmpty()){
            System.out.println("Lista vacias");
            return;
        }
    // seleccionar el vehiculo
    Vehiculo veh;
    boolean seguir = true;
        do{
            System.out.println("Ingrese el codigo del vehiculo");
            String cod = in.nextLine();
            veh = this.buscarVehiculoxCodigo(cod);
            if(veh != null){
                System.out.println("Vehiculo encontrado");
                seguir = false;
            }else{
                System.out.println("Vehiculo no encontrado");
            }
        }while (seguir);

    // seleccionar el mecanico
    Persona per;
    seguir = true;
        do{
            System.out.println("Ingrese cedula del mecanico");
            String ced = in.nextLine();
            per = this.buscarPersonaxCedula(ced);
            if(per != null){
                if(per instanceof Mecanico){
                    System.out.println("Mecanico Encontrado");
                    seguir = false;
                }else{
                    System.out.println("Persona no es un mecanico");
                }
            }else{
                System.out.println("No se encontro el mecanico");
            }
        }while (seguir);

    // seleccionar el cliente
    Persona cli;
    seguir = true;
        do{
            System.out.println("Ingrese cedula del cliente");
            String ced = in.nextLine();
            cli = this.buscarPersonaxCedula(ced);
            if(cli != null){
                if(cli instanceof Clientes){
                    System.out.println("Cliente Encontrado");
                    seguir = false;
                }else{
                    System.out.println("Persona no es un cliente");
                }
            }else{
                System.out.println("No se encontro el cliente");
            }
        }while (seguir);

        // crear la reparacion
        Reparacion rep = new Reparacion((Mecanico)per, (Clientes)cli, "", 0.0, "");
        rep.setVehiculo(veh);
        rep.ingresarDatos(in);
        System.out.println("Factura generada con el código: " + rep.getCodigoFactura());
        this.agregarReparacion(rep);
    }
    
    @Override
    public void menuDeOpciones() {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n**Menu de Persona**");
            System.out.println("1.Registrar Mecanico \n2. Regsitrar Cliente "
                    + "\n3.Mostrar lista \n4.buscar x cedula \n5.Lista de vehiculos \n0.Salir");
            opcion = Integer.parseInt(in.nextLine());
            switch (opcion) {
                case 1:
                    Mecanico oMecanico = new Mecanico();
                    oMecanico.ingresarDatos();
                    this.agregar(oMecanico);// guardar en la coleccion
                    break;
                case 2:
                    Clientes oCliente = new Clientes();
                    oCliente.ingresarDatos();
                    this.agregar(oCliente);// guardar en la coleccion
                    System.out.println("Ingrese el vehiculo del cliente.");
                    System.out.println("1.-Automovil \n2.-Motocicleta \n 3.-Autobus \n 4.-Camion");
                    opcion = Integer.parseInt(in.nextLine());
                    if(opcion == 1){
                        Automovil oAutomovil = new Automovil();
                        oAutomovil.ingresarDatos();
                        this.agregarVehiculo(oAutomovil);
                    }else if(opcion == 2){
                        Motocicleta oMotocicleta = new Motocicleta();
                        oMotocicleta.ingresarDatos();
                        this.agregarVehiculo(oMotocicleta);
                    }else if(opcion == 3){
                        Autobus oAutobus = new Autobus();
                        oAutobus.ingresarDatos();
                        this.agregarVehiculo(oAutobus);
                    }else if(opcion == 4){
                        Camion oCamion = new Camion();
                        oCamion.ingresarDatos();
                        this.agregarVehiculo(oCamion);
                    }else{
                        System.out.println("Opcion incorrecta");
                    }
                    break;
                case 3:
                    System.out.println("Mostrando Lista de Personas registradas");
                    this.mostrar();
                    break;
                case 4:
                    System.out.println("Busqueda por cedula, Ingrese cedula:");
                    String ced = in.nextLine();
                    Persona persona = this.buscarPersonaxCedula(ced);
                    if (persona != null) {
                        System.out.println("Persona encontrada: ");
                        persona.mostrarInfo();
                    } else {
                        System.out.println("No existe persona con esa cedula");
                    }
                    break;
                case 5:
                    System.out.println("Mostrar Vehiculos:");
                    this.mostrarVehiculo();
                case 0:
                    System.out.println("Saliendo de menu de Persona");
                    break;
            }
        } while (opcion != 0);
    }
    
}
