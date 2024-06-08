package entidades;

public class Mantenimiento extends vehiculo {
    //Atributos con encapsulamiento
    
    private double costos;
    private float fechademantenimiento;
    private String cambiodeaceite;
    private String cambioneumatico;
    private String kilometraje;
    
    //constructor por defecto
    public Mantenimiento(){
    }
    
    //constructor parametrizado
    
    public Mantenimiento(double costos,float kilometraje,float fechademantenimiento,
            String cambiodeaceite,String cambineumatico){
        this.costos=costos;
        this.fechademantenimiento=fechademantenimiento;
        this.cambiodeaceite=cambiodeaceite;
        this.cambioneumatico=cambioneumatico;
        
    }
    //getters y setters 
    public double getcostos(){
        return costos;
    }
    
    public void setcostos(double costos){
        this.costos=costos;
    }
    
    public float getfechademantenimiento(){
        return fechademantenimiento;
    }
    
    public void setfechademantenimiento(float fechademantenimiento){
        this.fechademantenimiento= fechademantenimiento;
    }
    
    public String getcambiodeaceite(){
        return cambiodeaceite;
    }
    
    public void setcambiodeaceite(String cambiodeaceite){
        this.cambioneumatico=cambiodeaceite;
    }
    
    public String getcambioneumatico(){
        return cambioneumatico;
    }
    
    public void setcambioneumatico(String cambioneumatico){
        this.cambioneumatico=cambioneumatico;
    }
    
    

    @Override
    public void reparar(Mecanico mecanico) {
        throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
