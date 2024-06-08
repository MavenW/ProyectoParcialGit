package interfaces;
//INTERFACES: posibilidad de tener herencia multiple
import entidades.Persona;
import entidades.Reparacion;
import entidades.Vehiculo;
import java.util.Scanner;

public interface InterfasAdminPersona {
    
    public abstract void agregar(Persona p);
    public abstract void eliminar (Persona p);
    public abstract void mostrar();
    public abstract void agregarVehiculo(Vehiculo v);
    public abstract void eliminarvehiculo(Vehiculo v);
    public abstract void mostrarVehiculo();
    public Vehiculo buscarVehiculoxCodigo(String tipo);
    public abstract void agregarReparacion(Scanner in);
    public abstract void mostrarCliente();
    public abstract void mostrarMecanico();
    public Persona buscarPersonaxCedula(String cedula);
    public void agregarReparacion(Reparacion r);
    public abstract void menuDeOpciones();
    
}
