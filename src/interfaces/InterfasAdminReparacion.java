package interfaces;

import entidades.Repuestos;

public interface InterfasAdminReparacion {
    public void agregar(Repuestos r);
    public void eliminar (Repuestos r);
    public void mostrar();
    public Repuestos buscarxNombre(String nombRepuestos);
    //public void agregarRepuesto();
    public void menuOpciones();
}
