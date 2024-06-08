//Clase realizada por Gustavo Garcia
package entidades;

import interfaces.Imprimible;

public abstract class vehiculo implements Imprimible{
    //Parametros aplicando el encapulamiento
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private float kilometraje;
    
    //contructor por defecto
    public vehiculo(){}
    
    //Contructor Parametrizado
    public vehiculo(String marca, String modelo, int año, String tipo, float okilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.kilometraje = okilometraje;
    }
    
    //Metodos Getter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        boolean valido = true;
        char[] arreglo = marca.toCharArray();//convertir nombres en un arreglo de char
        for (char c : arreglo) { // revisar cada caracter del arreglo
            if (!Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                //si hay un caracter que no se alfabetico o que no sea espacio en blanco
                System.out.println("Marca no valida");
                valido = false;
                break; //salir del lazo for
            }
        }
        if (valido==true) {// si valido es verdadero
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }
    
    //Metodo setter
    public void setModelo(String modelo) {
        boolean valido = true;
        char[] arreglo = modelo.toCharArray();//convertir nombres en un arreglo de char
        for (char c : arreglo) { // revisar cada caracter del arreglo
            if (!Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                //si hay un caracter que no se alfabetico o que no sea espacio en blanco
                System.out.println("Nombre no valido");
                valido = false;
                break; //salir del lazo for
            }
        }
        if (valido==true) {// si valido es verdadero
            this.modelo = modelo;
        }
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
    public float getKilometraje(){
        return this.kilometraje; 
    }
    
    public void setKilometraje(float km){
        if(km <= 0){
            System.out.println("Kilometrage invalido");
        }else{
            this.kilometraje = km;
        }
    }
    
    @Override
    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Tipo: " + tipo);
    }
    
    
}
