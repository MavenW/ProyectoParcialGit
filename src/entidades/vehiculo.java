//Clase realizada por Gustavo Garcia
package entidades;

public class vehiculo {
    //Parametros aplicando el encapulamiento
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    
    //contructor por defecto
    public vehiculo(){}
    
    //Contructor Parametrizado
    public vehiculo(String marca, String modelo, int año, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
    }
    
    //Metodos Getter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    //Metodo setter
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }
    
    //Metodo Setter
    public void setAño(int año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }
    
    //Metodo Setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
