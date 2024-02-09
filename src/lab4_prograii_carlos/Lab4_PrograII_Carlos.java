/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_prograii_carlos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cd507
 */
public class Lab4_PrograII_Carlos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Personas> personas=new ArrayList();
        personas.add(new Usuario("odioariotgames@gmail.com","SuTilin","mantecahn",5.65));
        personas.add(new Usuario("britanycarrasco@gmail.com","SuTilina","awadeuwu",500.00));
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
       
        int menu;
        do{
            System.out.println("Inicio de sesion");
            System.out.println("Ingrese su nombre de usuario o correo electronico");
            int usuario=verificarUsuario(input.nextLine(),personas);
            String name=input.nextLine();
            if (usuario<0) {
                System.out.println("inicio de sesion erroneo");
            }else{
                System.out.println("bienvenido/a, "+((Usuario)personas.get(usuario)).getNombreDeUsu());
            }
            
                    System.out.println("1: Ejercicio 1");
                    System.out.println("2: Ejercicio 2");
                    System.out.println("3: Ejercicio 3");
                    System.out.println("4: Salir");
                    menu = sc.nextInt();
            switch (menu){
                case (1):

                    break;
                case (2):

                    break;
                case (3):

                    break;
                default:
            }

        } while (menu != 0);
        System.out.println("Saliendo del programa");
    }

    private static int verificarUsuario(String inicioSesion, ArrayList<Personas> usuarios) {
        int usuarioEncontrado=-1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (inicioSesion.equals(((Usuario)usuarios.get(i)).getCorreo())||inicioSesion.equals(((Usuario)usuarios.get(i)).getNombreDeUsu())) {
               usuarioEncontrado=i;
            }
        }
        return usuarioEncontrado;
    }

}
