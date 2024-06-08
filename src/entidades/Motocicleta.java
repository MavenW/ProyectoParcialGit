//Clase realizada por Gustavo
package entidades;

// Clase Motocicleta (Clase Hija) que hereda de Vehiculo
public class Motocicleta extends vehiculo {
    private int cilindrada;
    private String tipoMotor;
    
    //Contructor Parametrizado que hereda atributos de la clase padre
    public Motocicleta(String marca, String modelo, int año, String tipo, float km, int cilindrada, String tipoMotor) {
        super(marca, modelo, año, tipo, km);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }
    
    //Metodo Getter para el atributo Cilindrada
    public int getCilindrada() {
        return cilindrada;
    }
    
    //Metodo Setter para el atributo Cilindrada
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    //Metodo Getter para el atributo TipoMotor
    public String getTipoMotor() {
        return tipoMotor;
    }
    
    //Metodo Setter para el atributo TipoMotor
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tipo de motor: " + tipoMotor);
    }

    @Override
    public void reparar(Mecanico mecanico) {
        System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " está siendo reparada por ");
    }
}
