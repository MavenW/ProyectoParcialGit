//Clase realizada por Gustavo
package entidades;

// Clase Motocicleta (Clase Hija)
public class Motocicleta extends vehiculo {
    private int cilindrada;
    private String tipoMotor;
    
    //contructor parametriza
    public Motocicleta(String marca, String modelo, int año, String tipo, int cilindrada, String tipoMotor) {
        super(marca, modelo, año, tipo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
