/**Universidad del Valle de Guatemala
 * Programacion orientada a objetos
 * Laboratorio 4
 * @author Diego Recinos @author Pablo Alvarez
*/
import java.util.Scanner;

public abstract class Menu{
    public static void main(String args[])
    {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        boolean encendido;
        try (Scanner sc = new Scanner(System.in)) {
        }
        switch(a)
        {
            case 1:
            while(encendido){
            System.out.println("1. Modo Radio");
            System.out.println("2. Modo Telefono");
            System.out.println("3. Modo Reproduccion");
            System.out.println("4. Modo Productividad");
            System.out.println("5. Cambiar volumen");
            System.out.println("6. Cambiar estado del carro");

            b = sc.nextInt();

            switch(b){
                case 1:{
                    boolean modoradio = false;
                    while(modoradio){
                        System.out.println("1.Cambiar a FM o AM");
                        System.out.println("2.Escoger Emisora");
                        System.out.println("3.Cambiar Emisora");
                        System.out.println("4.Guardar Emisora");
                        int c;
                        c = sc.nextInt();
                        switch (c){
                            case 1:{
                            Radio.cambiarFMAM();
                            break;
                            }
                        
                            case 2:{
                                Radio.getEmisora();
                                break;
                            }
                            case 3:{
                                Radio.cambiarEmisora()
                                break;
                            }
                            case 4:{
                                Radio.guardarEmisora();
                                break;
                            }
                            default:{
                                System.out.println("La opcion que escogio no esta disponible. Porfavor intente de nuevo");
                                break;
                            }
                                
                            

                        }
                    }
                    break;
                        
                }
                case 2:{
                    boolean modotelefono = false;
                    while (modotelefono);{
                        System.out.println("1. Conectar o desconectar telefono");
                        System.out.println("2. Mostrar Contactos");
                        System.out.println("3. Llamar contacto");
                        System.out.println("4. Finalizar llamada");
                        System.out.println("5. Cambiar a speaker");
                        c = sc.nextInt();
                        switch(b){
                            case 1:{
                               Radio.ConectDesconectTelefono();
                               break; 
                            }
                            case 2:{
                                Radio.LlamarContactos();
                                break;
                            }
                            case 3:{
                                Radio.FinalizarLlamada();
                                break;
                            }
                            case 4:{
                                Radio.CambiarSpeaker();
                            }
                            default:{
                                System.out.println("La opcion que escogio no esta disponible. Porfavor intente de nuevo");
                            }
                        }
                    }
                    break;}
                    case 3:{
                        boolean modoreproduccion = false;
                        while (modoreproduccion);{
                            System.out.println("1. Seleccionar Lista");
                            System.out.println("2. Cambiar Cancion");
                            System.out.println("3. Esuchar cancion");
                            d = sc.nextInt();
                            switch(d){
                                case 1:{
                                    Radio.seleccionarLista();
                                    break;
                                }
                                case 2:{
                                    Radio.cambiarCancion();
                                    break;
                                }
                                case 3:{
                                    Radio.esucharCancion();
                                    break;
                                }
                                default:{
                                    System.out.println("La opcion que escogio no esta disponible. Porfavor intente de nuevo");
                                }
                            }

                        }
                        break;
                    }
                    case 4:{
                        boolean modoproductividad = false;
                        while (modoproductividad);{
                            System.out.println("1.Planificar Viaje");
                            e = sc.nextInt();
                            switch(e){
                                case 1:{
                                    Radio.PlanificarViajes();
                                    break;
                                }
                                default:{
                                    System.out.println("La opcion que escogio no esta disponible. Porfavor intente de nuevo");
                                }
                            }
                        }
                        break;
                    }
                    case 5:{
                    boolean cambiarVolumen = false;
                    while (cambiarVolumen);{
                        System.out.println("1. Ingrese el nivel de volumen al que quiere cambiar");
                        f= sc.nextInt();
                        switch(f){
                            case 1:{
                                Radio.cambiarVolumen();
                                break;
                            }
                            default:{
                                System.out.println("La opcion que escogio no esta disponible. Porfavor intente de nuevo");
                            }
                        }
                }
                break;
            }
            case 6:{
                boolean apagarcarro = false;
                while(apagarcarro);{
                    System.out.println("Desea apagar el carro?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    g = sc.nextInt();
                    switch(g){
                        case 1:{
                            Radio.Apagar();
                            break;
                        }
                        case 2:{
                            Radio.encenderApagar();
                            encendido = false;
                        }
                        default:{
                            System.out.println("La opcion que escogio no esta disponible. Porfavor intente de nuevo");
                        }
                    }
                }
                }
            }
        }
    }        
}             
}

    
