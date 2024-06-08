//Elaborado por Daniel Fernando Castillo Mera - Grupo 2 - Curso: 2-2
package entidades;

public class Clientes {
    //atributos con metodos de accesos privados
    private String telefono;
    private String correoElectronico;
    
    //contructor por defecto
    public Clientes(){
    }
    
    //contructor con parametros
   
    
    public Clientes(String telefono, String correoElectronico){
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    //metodo getters
    
    
    //metodo setters
   
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        String telefonoRegex = "^[0-9]{10}$";//patron a seguir
        if (telefono.length() != 10) { //manejo de cadenas
            System.out.println("El telefono debe tener 10 digitos");
        } else if (!telefono.matches(telefonoRegex)) {
            System.out.println("El telefono debe tener solo digitos");
        } else {
            this.telefono = telefono;
            System.out.println("Telefono valida");
        }
    }
    
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico){
        String regexcorreoElectronico = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        if(!correoElectronico.matches(regexcorreoElectronico)){ //si el correo electronico no sigue los parametros de regexcorroElectronico
            System.out.println("El correo electronico no valido"); // se muestra este mensaje
        }else{
            this.correoElectronico = correoElectronico;
            System.out.println("Correo electronico valido");
        }
    }
}