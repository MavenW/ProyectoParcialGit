package proyecto_parcial;

import Administrador.AdministradorPersona;
import Administrador.AdminstradorReparacion;
import java.util.Scanner;

public class Proyecto_Parcial {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        AdminstradorReparacion adminCursos = new AdminstradorReparacion();
        AdministradorPersona adminPersonas = new AdministradorPersona();
         int opcion = 0;
        do {
            System.out.println("\n**Menu Principal**");
            System.out.println("1.Menu Personas \n 2. Menu cursos \n0.Salir");
            opcion = Integer.parseInt(in.nextLine());
            switch (opcion) {
                case 1:
                    //adminPersonas.menuDeOpciones();//llama al menu de administracion de personas
                    break;
                case 2:
                    adminCursos.menuDeOpciones(); //llama al menu de administracion de cursos
                    break;
                case 0:
                    System.out.println("Saliendo de menu principal");
                    break;
                default: 
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }
    
}
