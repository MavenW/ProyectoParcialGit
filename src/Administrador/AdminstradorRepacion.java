package Administrador;

import entidades.Repuestos;
import interfaces.InterfasAdminReparacion;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminstradorRepacion implements InterfasAdminReparacion{

    //coleccion para almacenar los repuestos
    public static ArrayList<Repuestos> listaRepuestos = new ArrayList();

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
    public void menuOpciones() {
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Menu de Repuestos");
            System.out.println("1.Registrar repuesto \n 2. Mostrar lista de repuesto "
                    + "\n3. Buscar repuesto por nombre \n0. Salir");
            opc = Integer.parseInt(scan.nextLine());
            switch (opc) {
                case 1:
                    Repuestos ORepuestos = new Repuestos();
                    ORepuestos.ingresarDatos(scan);
                    this.agregar(ORepuestos);
                    break;
                case 2:
                    System.out.println("Mostrando llsta de los repuestos");
                    this.mostrar();
                    break;
                case 3:
                    System.out.println("Busqueda por nombre, ingrese el nombre del repuesto: ");
                    String nomb = scan.nextLine();
                    //falta implementar
                    break;
                case 4:
            }
        } while (opc != 0);
    }

}
