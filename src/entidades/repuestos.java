package entidades;

public class repuestos {

    //atributos
    private int codRepuesto;
    private String nombRepuesto;
    private String marca;
    private float precio;
    private int stockRepuestos;
    
    //constructor por defecto
     public repuestos () {
    }
     
    //constructor parametrizado 
    public repuestos (int codRepuesto, String nombRepuesto,String marca, float precio, int stockRepuestos){
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
    public void setCodRepuesto(){
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
   
   
   
   
}
