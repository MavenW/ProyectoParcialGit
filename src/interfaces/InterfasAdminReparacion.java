package interfaces;

import entidades.Reparacion;
import entidades.Repuestos;


public interface InterfasAdminReparacion {
    public void agregar(Repuestos r);
    public void eliminar (Repuestos r);
    public void mostrar();
    public Repuestos buscarxNombre(String nombRepuestos);
    //public void agregarRepuesto();
    public void menuDeOpciones();
    public void agregarReparacion(Reparacion r);
    public void eliminarReparacion(Reparacion r);
    public void mostrarReparacion();
    public Reparacion buscarPorDescripcion(String descripcion);
    public Reparacion buscarPorCodigoFactura(String codigoFactura);
}
