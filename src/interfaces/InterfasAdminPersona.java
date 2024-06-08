package interfaces;
//INTERFACES: posibilidad de tener herencia multiple
import entidades.Clientes;
import entidades.Persona;

public interface InterfasAdminPersona {
    
    public abstract void agregar(Persona p);
    public abstract void eliminar (Persona p);
     
    
    
}
