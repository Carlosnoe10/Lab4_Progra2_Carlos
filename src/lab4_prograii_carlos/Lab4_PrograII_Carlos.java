/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_prograii_carlos;

import com.sun.source.tree.DoWhileLoopTree;
import java.util.ArrayList;
import java.util.Random;
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
        ArrayList<Personas> personas = new ArrayList();
        personas.add(new Usuario("odioariotgames@gmail.com", "SuTilin", "mantecahn", 50.65));
        personas.add(new Usuario("britanycarrasco@gmail.com", "SuTilina", "awadeuwu", 30000.00));
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int menu;
        do {
            System.out.println("Inicio de sesion");
            System.out.println("Ingrese su nombre de usuario o correo electronico");
            String name = input.nextLine();
            int usuario = verificarUsuario(name, personas);

            if (usuario == 341) {
                System.out.println("inicio de sesion erroneo");
            } else {
                System.out.println("bienvenido/a, " + ((Usuario) personas.get(usuario)).getNombreDeUsu());
                String pw;
                do {
                    System.out.println("Ingrese la contraseña");
                    pw = input.nextLine();
                    if (!(pw.equals(((Usuario) personas.get(usuario)).getContrasenya()))) {
                        System.out.println("ingrese la contraseña verdadera de esta cuenta");
                    }
                } while (!(pw.equals(((Usuario) personas.get(usuario)).getContrasenya())));
            }
            System.out.println("Bienvenido/a a Legacy of Power");
            do {
                System.out.println("1: Ranked");
                System.out.println("2: Ver Agentes");
                System.out.println("3: ");
                System.out.println("4: cerrar sesion");
                System.out.println("0. cerrar el cliente");
                menu = sc.nextInt();
                switch (menu) {
                    case (1):
                        int PermaPOM = 0,
                         PermaPOM2 = 0;
                        Random Num = new Random();
                        int R1i = Num.nextInt(personas.size()) + 0;
                        Agentes AG,
                         AG2;
                        Usuario usu = (Usuario) personas.get(R1i);
                        System.out.println("El Rival es: " + ((Usuario) personas.get(R1i)).getNombreDeUsu());
                        for (int i = 0; i < 1; i++) {
                            if (usuario == R1i) {
                                R1i = Num.nextInt(personas.size()) + 0;
                                i--;
                            } else {
                                i++;
                            }
                        }
                        Usuario zero = (Usuario) personas.get(usuario);
                        ListarPersonajes(zero);

                        for (int i = 0; i < 1; i++) {
                            System.out.println("Ingrese el numero del agente que desea usar");
                            PermaPOM = sc.nextInt();
                            if (zero.getAgentes().size() < PermaPOM && PermaPOM >= 0) {

                                System.out.println("Su agente es: " + zero.getAgentes().get(PermaPOM).toString());
                                i++;
                            } else {
                                System.out.println("Numero Incorrecto");
                                i--;
                            }
                        }
                        ListarPersonajes(usu);
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Ingrese a quien desea atacar");
                            PermaPOM2 = sc.nextInt();
                            if (usu.getAgentes().size() < PermaPOM2 && PermaPOM2 >= 0) {
                                AG2 = usu.getAgentes().get(PermaPOM2);
                                System.out.println("Su agente es: " + usu.getAgentes().get(PermaPOM2).toString());
                                i++;
                            } else {
                                System.out.println("Numero Incorrecto");
                                i--;
                            }
                        }
                        double danio1 = zero.getAgentes().get(PermaPOM).Daño(usu.getAgentes().get(PermaPOM2));
                        System.out.println("El daño es" + danio1);
                        int AtaqueAzul = usu.getAgentes().get(PermaPOM2).getPuntosDeVida();
                        int NuevaVida = Integer.parseInt(Double.toString(danio1));
                        usu.getAgentes().get(PermaPOM2).setPuntosDeVida(AtaqueAzul - NuevaVida);

                        for (int i = 0; i < 1; i++) {

                            int RandomPJ = Num.nextInt(zero.getAgentes().size()) + 0;
                            if (zero.getAgentes().get(RandomPJ).getPuntosDeVida() > 0) {
                                double danio2 = usu.getAgentes().get(PermaPOM2).Daño(zero.getAgentes().get(PermaPOM));
                                int AtaqueRojo = zero.getAgentes().get(PermaPOM).getPuntosDeVida();
                                int Nuevavida2 = Integer.parseInt(Double.toString(danio2));
                                zero.getAgentes().get(PermaPOM).setPuntosDeVida(AtaqueRojo - Nuevavida2);
                                i++;
                            }else{
                                i--;
                            }
                        }

                        break;

                    //usu == Rival
                    //zero == aliado
                    case (2):

                        int elegir = 0;
                        do {
                            System.out.println("1. Comprar Agentes");
                            System.out.println("2. Ver tus agentes");
                            elegir = input.nextInt();
                            if (elegir != 1 && elegir != 2) {
                                System.out.println("Ingrese una opcion valida");
                            }
                        } while (elegir != 1 && elegir != 2);
                        switch (elegir) {
                            case 1:
                                System.out.println("1.  comprar al montapuercos (tipo tierra, 50 paVos)");
                                System.out.println("2.  comprar a Tarnished (tipo fuego, 1000 paVos)");
                                System.out.println("3.  comprar a Jett (tipo viento, 600 paVos)");
                                System.out.println("4.  comprar a Asuka (tipo agua, 200 paVos)");
                                System.out.println("5.  comprar a Malenia (tipo Fuego, 3000 paVos)");
                                System.out.println("6.  comprar a Dante (tipo viento) 2000 paVos");
                                System.out.println("7.  comprar a Godrick (tipo tierra, 800 paVos");
                                System.out.println("8.  comprar a Juan (tipo agua, 100 paVos)");
                                System.out.println("9.  comprar a Kazuya (tipo viento, 1100 paVos)");
                                System.out.println("10. comprar a SOL BADGUY (tipo fuego, 3000 paVos");
                                System.out.println("11. comprar a Goku (tipo tierra, 8000 paVos)");
                                System.out.println("12. comprar a Satoru Gojo (tipo agua, 12000 paVos)");
                                int elegirAgente = sc.nextInt();
                                switch (elegirAgente) {
                                    case 1:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 50) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoTierra(50, 100, 30, "montapuercos"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 500);
                                            System.out.println("Se a añadido el agente con exiito");
                                        }
                                        break;
                                    case 2:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 1000) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoFuego(1000, 1000, 100, "Tarnished"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 1000);
                                            System.out.println("Se a añadido el agente con exiito");
                                        }
                                        break;
                                    case 3:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 600) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoViento(600, 500, 40, "Jett"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 600);
                                            System.out.println("Se a añadido el agente con exiito");
                                        }
                                        break;
                                    case 4:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 500) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoAgua(500, 200, 30, "Asuka"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 500);
                                            System.out.println("Se a añadido el agente con exiito");
                                        }
                                        break;
                                    case 5:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 3000) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoFuego(2000, 200, 30, "Malenia"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 3000);
                                            System.out.println("Se a añadido el agente con exiito");
                                        }
                                        break;
                                    case 6:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 2000) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoViento(2000, 200, 30, "Dante"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 2000);
                                            System.out.println("Se a añadido el agente con exito");
                                        }
                                        break;
                                    case 7:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 800) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoTierra(800, 200, 30, "Godrick"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 800);
                                            System.out.println("Se a añadido el agente con exito");
                                        }
                                        break;
                                    case 8:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 100) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoAgua(100, 200, 30, "Juan"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 100);
                                            System.out.println("Se a añadido el agente con exito");
                                        }
                                        break;
                                    case 9:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 1100) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoViento(1100, 200, 30, "Kazuya"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 1100);
                                            System.out.println("Se a añadido el agente con exito");
                                        }
                                        break;
                                    case 10:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 3000) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoFuego(3000, 200, 30, "SOL BADGUY"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 3000);
                                        }
                                        break;
                                    case 11:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 8000) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoTierra(8000, 200, 30, "Goku"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 8000);
                                            System.out.println("Se a añadido el agente con exito");
                                        }
                                        break;
                                    case 12:
                                        if (((Usuario) personas.get(usuario)).getDinero() < 12000) {
                                            System.out.println("no tienes suficiente dinero para comprar este agente");
                                        } else {
                                            ((Usuario) personas.get(usuario)).getAgentes().add(new AgenteTipoTierra(12000, 200, 30, "Satoru Gojo"));
                                            ((Usuario) personas.get(usuario)).setDinero(((Usuario) personas.get(usuario)).getDinero() - 12000);
                                            System.out.println("Se a añadido el agente con exito");
                                        }
                                        break;

                                }

                                break;
                            case 2:
                                for (int i = 0; i < ((Usuario) personas.get(usuario)).getAgentes().size(); i++) {
                                    System.out.println("" + ((Usuario) personas.get(usuario)).getAgentes().get(i).toString());
                                }
                                break;
                            default:
                                System.out.println("Elija una opcion valida");
                                break;
                        }
                        break;
                    case (3):

                        break;
                    default:
                }
            } while (menu != 4);

        } while (menu != 0);
        System.out.println("Saliendo del programa");
    }

    private static int verificarUsuario(String inicioSesion, ArrayList<Personas> usuarios) {
        int usuarioEncontrado = 341;
        for (int i = 0; i < usuarios.size(); i++) {
            if (inicioSesion.equals(((Usuario) usuarios.get(i)).getCorreo()) || inicioSesion.equals(((Usuario) usuarios.get(i)).getNombreDeUsu())) {
                usuarioEncontrado = i;
            }
        }
        return usuarioEncontrado;
    }

    public static void ListarPersonajes(Usuario nom) {
        for (int i = 0; i < nom.getAgentes().size(); i++) {
            System.out.println(i + nom.getAgentes().get(i).toString());
        }
    }

}
