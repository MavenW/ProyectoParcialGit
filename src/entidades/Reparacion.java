//clase creada por Gustavo Garcia
package entidades;

// Clase Reparación

import interfaces.Imprimible;
import java.util.Scanner;
import java.util.UUID;

public class Reparacion implements Imprimible {
    private Vehiculo ovehiculo;
    private Mecanico mecanico;
    private Clientes cliente;
    private String descripcion;
    private double costo;
    private String codigoFactura;
    
    public Reparacion(){
    }

    public Reparacion(Mecanico mecanico, Clientes cliente, String descripcion, double costo) {
        this.mecanico = mecanico;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.costo = costo;
    }
    
    public Vehiculo getVehiculo() {
        return ovehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.ovehiculo = vehiculo;
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
    
    public String getCodigoFactura() {
        return codigoFactura;
    }
    
    public void generarFactura() {
        // Genera un código único para la factura
        this.codigoFactura = UUID.randomUUID().toString();
        System.out.println("Factura de Reparación");
        System.out.println("---------------------");
        System.out.println("Código de Factura: " + getCodigoFactura());
        System.out.println("Detalles del Vehículo:");
        System.out.println("Marca: " + ovehiculo.getMarca());
        System.out.println("Modelo: " + ovehiculo.getModelo());
        System.out.println("\nDetalles del Mecánico:");
        System.out.println("Nombres: " + mecanico.getNombres());
        System.out.println("Apellidos: " + mecanico.getApellidos());
        System.out.println("\nDetalles del Cliente:");
        System.out.println("Nombres: " + cliente.getNombres());
        System.out.println("Apellidos: " + cliente.getApellidos());
        System.out.println("\nDescripción de la Reparación: " + getDescripcion());
        System.out.println("\nCosto de la Reparación: " + getCosto());
        System.out.println("---------------------");
        System.out.println("Gracias por su negocio!");
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
    System.out.println("Ingrese la descripcion de la reparacion:");
    this.setDescripcion(scan.nextLine());
    System.out.println("Ingrese el costo de la reparacion:");
    float precio = Float.parseFloat(scan.nextLine());
    this.setCosto(precio);
    }
    
}
