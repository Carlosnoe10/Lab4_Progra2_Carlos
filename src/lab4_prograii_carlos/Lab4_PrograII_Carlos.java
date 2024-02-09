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

                        break;
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
                                    System.out.println(""+((Usuario) personas.get(usuario)).getAgentes().get(i));
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

}
