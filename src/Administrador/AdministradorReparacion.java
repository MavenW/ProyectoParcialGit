package Administrador;

import entidades.Reparacion;
import entidades.Repuestos;
import interfaces.InterfasAdminReparacion;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministradorReparacion implements InterfasAdminReparacion{

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

//    @Override
//    public void agregarRepuesto() {
//       
//    }
    
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
            System.out.println("1.Agregar reparacion \n2.Eliminar reparacion "
                    + "\n3.Mostrar lista \n4.Buscar por descripcion \n0.Salir");
            opcion = Integer.parseInt(in.nextLine());
            switch (opcion) {
                case 1:
                    Reparacion reparacion = new Reparacion();
                    reparacion.ingresarDatos(in);
                    this.agregarReparacion(reparacion);
                    break;
                case 2:
                    System.out.println("Listas de Reparaciones");
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
                                ORepuestos.ingresarDatos(in);
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
                case 5:
                    System.out.println("Busqueda por Codigo de factura, ingrese el codigo:");
                    String codigoFactura = in.nextLine();
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
