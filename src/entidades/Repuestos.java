package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Repuestos {
     //atributos
    private int codRepuesto;
    private String nombRepuesto;
    private String marca;
    private float precio;
    private int stockRepuestos;
    
     private ArrayList<Repuestos> listaRepuestos = new ArrayList();
    
    //constructor por defecto
     public Repuestos () {
    }
     
    //constructor parametrizado 
    public Repuestos (int codRepuesto, String nombRepuesto,String marca, float precio, int stockRepuestos){
        this.codRepuesto = codRepuesto;
        this.nombRepuesto = nombRepuesto;
        this.marca = marca;
        this.precio = precio;
        this.stockRepuestos = stockRepuestos;
    }
    
    //metodos get y set
    public int getCodRepuesto (){
        return codRepuesto;
    }
    public void setCodRepuesto( int codRepuesto){
        if(codRepuesto < 0){
            System.out.println("El codigo del repuesto no puede ser negativo");
        }
        this.codRepuesto = codRepuesto;
    }
    
    public String getNombre(){
        return nombRepuesto;
    }
    //validar para que no este vacio 
    public void setnombRepuesto(String nombRepuesto) {
    if (nombRepuesto == null || nombRepuesto.isEmpty()) {
        System.out.println("No debe estar vacio el nombre del repuesto");
    }
    this.nombRepuesto = nombRepuesto;
   }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
    if (marca == null || marca.isEmpty()) {
        System.out.println("No debe estar vacia la marca del repuesto");
    }
    this.marca = marca;
   }
    
   public float getPrecio (){
       return precio;
   }
   public void setPrecio(float precio){
       if(precio<0){
           System.out.println("El precio no debe ser negativo");
       }
       this.precio = precio;
   }
   
   public int getStockRepuestos(){
       return stockRepuestos;
   }
   
   public void setStockRepuestos(int stockRepuestos){
       if(stockRepuestos < 0){
           System.out.println("El stock no debe tener numeros negativos");
       }
       this.stockRepuestos = stockRepuestos;
   }
   
    public ArrayList<Repuestos> getListaRepuestos() {
        return this.listaRepuestos;
    }

    public void setListaRepuestos(ArrayList<Repuestos> lista) {
        this.listaRepuestos = lista;
    }
   
  //metodo de aplicar descuento
  //se aplicara un descuento del 10% si la compra del repuesto es mayor a 300 dolares
   public float aplicarDescuento(float precio, float desc){
       if(precio > 300){
           precio -= precio * 0.10f;
           System.out.println("Su compra aplica un 10% de descuento");
       }else{
           System.out.println("No aplica descuento");
       }
       return precio;
   }
   
   public void calcularPrecioFinal(float desc) {
        this.precio = this.precio - (this.precio * desc);
    }
    
   //metodo de mostrar info
   public void mostrarInfo(){
       System.out.println("***MOSTRAR REPUESTOS***");
       System.out.println("Codigo del repuesto: " +this.getCodRepuesto());
       System.out.println("Nombre del repuesto: "+this.getNombre());
       System.out.println("Marca: " +this.getMarca());
       System.out.println("Precio: " +this.getPrecio());   
       System.out.println("Stock disponibles: "+this.getStockRepuestos());
       System.out.println("Lista de repuestos");
       if(this.listaRepuestos != null){
            for (int i = 0; i < listaRepuestos.size(); i++) {
                listaRepuestos.get(i).mostrarInfo();    
            }
       }
   }
   //metodo ingresar datos
   public void ingresarDatos(Scanner scan) {
        System.out.println("\nIngresar Repuestos:");
        System.out.println("Codigo del repuestos");
        this.setCodRepuesto(scan.nextInt());
        System.out.println("Nombre del repuestos:");
        this.setnombRepuesto(scan.nextLine());
        System.out.println("Marca del repuesto:");
        this.setMarca( scan.nextLine());
        System.out.print("Precio:");
        this.precio = Float.parseFloat(scan.nextLine());
        System.out.println("Stcok disponibles:");
        this.setStockRepuestos( scan.nextInt());
    }
}

