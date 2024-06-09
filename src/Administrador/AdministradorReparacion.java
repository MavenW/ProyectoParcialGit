package Administrador;

import entidades.Reparacion;
import entidades.Repuestos;
import interfaces.InterfasAdminReparacion;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministradorReparacion implements InterfasAdminReparacion {

    //coleccion para almacenar los repuestos
    public static ArrayList<Repuestos> listaRepuestos = new ArrayList();

    //coleecion para almacenar las reparaciones
    public static ArrayList<Reparacion> listaReparaciones = new ArrayList<>();

    @Override
    public void agregar(Repuestos r) {
        this.listaRepuestos.add(r);
    }

    @Override
    public void eliminar(Repuestos r) {
        this.listaRepuestos.remove(r);
    }

    @Override
    public void mostrar() {
        for (Repuestos r : listaRepuestos) {
            r.mostrarInfo();
        }
    }

    @Override
    public Repuestos buscarxNombre(String nombRepuestos) {
        for (Repuestos r : listaRepuestos) {
            if (r.getNombre().equalsIgnoreCase(nombRepuestos)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public void agregarRepuesto() {
        boolean seguir = true;
         Repuestos repuesto = null;

        do {  // se le pide al usuario que ingrese el nombre del repuesto
            System.out.println("Ingrese nombre del repuesto: ");
            String nombre = in.nextLine();

            // buscamos el repuesto en la lista de repuestos
            repuesto = this.buscarxNombre(nombre); // línea main
            if(repuesto == null){
            if(AdministradorReparacion.listaRepuestos.isEmpty()){
                System.out.println("La lista de repuestos está vacía.");
            }
            
            System.out.println("Repuesto no encontrado. ¿Desea agregar un nuevo repuesto? (S/N)");
            String respuesta = in.nextLine();
            
            if(respuesta.equalsIgnoreCase("S")){
                repuesto = new Repuesto();
                //si el usuario va a agregar un nuevo repuesto debe poner su descripcion
                System.out.println("Ingrese código del repuesto: ");
                int codigo = in.nextInt();
                repuesto.setCodRepuesto(codigo);
                
                System.out.println("Ingrese nombre del repuesto: ");
                String nomb = in.next();
                repuesto.setnombRepuesto(nomb);
                
                System.out.println("Ingrese marca del repuesto: ");
                String marca = in.next();
                repuesto.setMarca(marca);
                
                System.out.println("Ingrese precio del repuesto: ");
                float precio = in.nextFloat();
                repuesto.setPrecio(precio);
                
                System.out.println("Ingrese stock del repuesto: ");
                int stock = in.nextInt();
                repuesto.setStockRepuestos(stock);
                
                AdministradorReparacion.listaRepuestos.add(repuesto);
                System.out.println("Repuesto agregado con éxito.");
                seguir = false;
            } else {
                System.out.println("No se agregó el repuesto.");
                seguir = false;
            }
        } else {
            System.out.println("El repuesto ya existe en la lista.");
            seguir = false;
        }
    } while (seguir);
}
           
    @Override
    public void agregarReparacion(Reparacion r) {
        listaReparaciones.add(r);
    }

    @Override
    public void eliminarReparacion(Reparacion r) {
        listaReparaciones.remove(r);
    }

    @Override
    public void mostrarReparacion() {
        for (Reparacion r : listaReparaciones) {
            r.imprimir();
        }
    }

    @Override
    public Reparacion buscarPorDescripcion(String descripcion) {
        for (Reparacion r : listaReparaciones) {
            if (r.getDescripcion().equalsIgnoreCase(descripcion)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public Reparacion buscarPorCodigoFactura(String codigoFactura) {
        for (Reparacion r : listaReparaciones) {
            if (r.getCodigoFactura().equals(codigoFactura)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public void menuDeOpciones() {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n**Menu de Reparaciones**");
            System.out.println("1.Agregar reparacion \n2.Lista de Reparaciones "
                    + "\n3.Menu de repuestos \n4.Ver factura completa \n5.Buscar por descripcion \n6.Buscar por codigo de factura \n0.Salir");
            opcion = Integer.parseInt(in.nextLine());
            switch (opcion) {
                case 1:
                    Reparacion reparacion;
                    AdministradorPersona admper = new AdministradorPersona();
                    admper.agregarReparacion(in);
                    break;

                case 2:
                    this.mostrarReparacion();
                    break;
                case 3:
                    System.out.println("Menu de repuestos:\n");
                    do {
                        System.out.println("------------------");
                        System.out.println("1.Registrar repuesto \n 2. Mostrar lista de repuesto "
                                + "\n3. Buscar repuesto por nombre \n0. Salir");
                        opcion = Integer.parseInt(in.nextLine());
                        switch (opcion) {
                            case 1:
                                Repuestos ORepuestos = new Repuestos();
                                this.agregar(ORepuestos);
                                break;
                            case 2:
                                System.out.println("Mostrando llsta de los repuestos");
                                this.mostrar();
                                break;
                            case 3:
                                System.out.println("Busqueda por nombre, ingrese el nombre del repuesto: ");
                                String nomb = in.nextLine();
                                //falta implementar
                                break;
                            case 4:
                        }
                    } while (opcion != 0);
                    break;
                case 4:
                    System.out.println("Ingrese el codigo de la factura para mostrar los datos completos:");
                    String codigoFactura = in.nextLine();
                    reparacion = this.buscarPorCodigoFactura(codigoFactura);
                    if (reparacion != null) {
                        System.out.println("Factura encontrada: ");
                        System.out.println("---------------------");
                        reparacion.generarFactura();
                    } else {
                        System.out.println("No existe la factura con el codigo proporcionado");
                    }
                    break;
                case 5:
                    System.out.println("Busqueda por descripcion, ingrese descripcion:");
                    String descripcion = in.nextLine();
                    reparacion = this.buscarPorDescripcion(descripcion);
                    if (reparacion != null) {
                        System.out.println("Reparacion encontrada: ");
                        reparacion.imprimir();
                    } else {
                        System.out.println("No existe reparacion con esa descripcion");
                    }
                    break;
                case 6:
                    System.out.println("Busqueda por Codigo de factura, ingrese el codigo:");
                    codigoFactura = in.nextLine();
                    reparacion = this.buscarPorCodigoFactura(codigoFactura);
                    if (reparacion != null) {
                        System.out.println("Reparacion encontrada: ");
                        reparacion.imprimir();
                    } else {
                        System.out.println("No existe reparacion con ese codigo de factura");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del menu de reparaciones");
                    break;
            }
        } while (opcion != 0);
    }

}
