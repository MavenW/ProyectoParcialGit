//clase creada por Gustavo Garcia
package entidades;

// Clase Reparación

import interfaces.Imprimible;
import java.util.Scanner;

public class Reparacion implements Imprimible {
    private vehiculo ovehiculo;
    private Mecanico mecanico;
    private Clientes cliente;
    private String descripcion;
    private double costo;

    public Reparacion(vehiculo vehiculo, Mecanico mecanico, Clientes cliente, String descripcion, double costo) {
        this.ovehiculo = vehiculo;
        this.mecanico = mecanico;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public vehiculo getVehiculo() {
        return ovehiculo;
    }

    public void setVehiculo(vehiculo ovehiculo) {
        if (ovehiculo != null) {
        this.ovehiculo = ovehiculo;
        } else {
            System.out.println("Vehiculo no válido. No puede ser null.");
        }
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        if (mecanico != null) {
        this.mecanico = mecanico;
        } else {
            System.out.println("Mecanico no válido. No puede ser null.");
        }
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        if (cliente != null) {
        this.cliente = cliente;
        } else {
            System.out.println("Cliente no válido. No puede ser null.");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
        this.descripcion = descripcion;
        } else {
            System.out.println("Descripcion no válida. No puede ser null o vacía.");
        }
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        if (costo >= 0) {
        this.costo = costo;
        } else {
            System.out.println("Costo no válido. Debe ser un número positivo.");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Vehículo: " + ovehiculo.getMarca() + " " + ovehiculo.getModelo());
        System.out.println("Mecánico: " + mecanico.getNombres() + " " + mecanico.getApellidos());
        System.out.println("Cliente: " + cliente.getNombres() + " " + cliente.getApellidos());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Costo: " + getCosto());
    }
    
    public void ingresarDatos(Scanner scan){
    ovehiculo.ingresarDatos(scan);
    cliente.ingresarDatos();
    mecanico.ingresarDatos();
    System.out.println("Ingrese la descripcion de la reparacion:");
    this.setDescripcion(scan.nextLine());
    System.out.println("Ingrese el costo de la reparacion:");
    this.setCosto(scan.nextDouble());

    }
    
}
