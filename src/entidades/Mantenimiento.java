package entidades;


public class Mantenimiento extends Vehiculo {
    //Atributos con encapsulamiento
    
    private double costos;
    private float fechademantenimiento;
    private String cambiodeaceite;
    private String cambioneumatico;
    
    //constructor por defecto
    public Mantenimiento(){
    }
    
    //constructor parametrizado
    
    public Mantenimiento(String marca, String modelo, int año, String tipo, float okilometraje, double costos,float km,float fechademantenimiento,
            String cambiodeaceite,String cambineumatico){
        super(marca, modelo, año, tipo, km);
        this.costos=costos;
        this.fechademantenimiento=fechademantenimiento;
        this.cambiodeaceite=cambiodeaceite;
        this.cambioneumatico=cambioneumatico;
        
    }
    //getters y setters 
    public double getcostos(){
        return costos;
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
    public void imprimir(){
        System.out.println("Costos de mantenimiento:"+getcostos());
        System.out.println("Fecha de mantimiento:"+getfechademantenimiento());
        System.out.println("Cambio de aceite:"+getcambiodeaceite());
        System.out.println("Cambio de neumatico:"+getcambioneumatico());
        
        
        
    }
    public void ingresar_datos(){
        System.out.println("Indique la fecha de mantenimiento"
                +this.fechademantenimiento);
        System.out.println("Elija el tipo de mantenimiento:");
        System.out.println("1. cambio de aceite");
        System.out.println("2. cambio de neumatico");
        int opcion = 2;
        switch(opcion){
            case 1:
                System.out.println("El costo es de 10.99$");
                break;
            case 2:
                System.out.println("El costo es de 49.99");
                break;
            default:
                System.out.println("INCORRECTO");
        }
    }
    


    
    
}
