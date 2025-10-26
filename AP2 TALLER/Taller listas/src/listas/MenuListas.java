
package listas;

import java.util.Scanner;


public class MenuListas {


    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        
        int opc,opcionMenus,opcionMenu,opcionMenusD;
        int dato, dato1;
        ListaLigada Lista1 = new ListaLigada();
        ListaSimplementeLigadaCircular Lista2 = new ListaSimplementeLigadaCircular();
        //DoblementeLigada Lista3 = new DoblementeLigada();
        do
        {
            System.out.println("========= Menu Listas =========");
            System.out.println("1. Listas simplemente ligadas");
            System.out.println("2. Listas simplemente ligadas Circular");
            System.out.println("3. Listas doblemente ligadas");
            /*System.out.println("4. Listas doblemente ligadas Circular");*/
            System.out.println("5. Salir.");
            System.out.println("Escriba la opcion ");

            opc = sc.nextInt();
            
            switch (opc){
                case 1://lista simplemente Ligada
                    
                    
                    do
                    {
                        System.out.println("========================================");
                        System.out.println("|      Lista Simplemente Ligada.       |");
                        System.out.println("|--------------------------------------|");
                        System.out.println("|  1. Insertar al inicio.              |");
                        System.out.println("|  2. Insertar al Final.               |");
                        System.out.println("|  3. Insertar despues de valor.       |");
                        System.out.println("|  4. Borrar al inicio.                |");
                        System.out.println("|  5. Borrar al final.                 |");
                        System.out.println("|  6. Borrar medio por valor.          |");
                        System.out.println("|  7. Mostrar lista.                   |");
                        System.out.println("|  8. Salir.                           |");
                        System.out.println("========================================");
                        System.out.println("Escriba la opcion:\n");
                    
                    opcionMenu = sc.nextInt();
                    
                    switch(opcionMenu){
                        case 1://insertar al inicio
                            
                            System.out.println("Ingrese el valor:");
                            dato = sc.nextInt();
                            Lista1.InsertarInicio(dato);
                            break;
                        case 2://insertar al final
                           
                            System.out.println("Ingrese el valor:");
                            dato = sc.nextInt();
                            Lista1.InsertarFinal(dato);
                            break;
                            
                        case 3:     
                            System.out.println("¿Despúes de que valor ingresar?");
                            dato = sc.nextInt();
                            System.out.println("Valor a ingresar:");
                            dato1 = sc.nextInt();
                            
                            Lista1.InsertarpostValor(dato,dato1);
                            break;
                            
                            
                        case 4:
                            Lista1.MostrarDatos();
                            System.out.println("\n");
                            Lista1.BorrarInicio();
                            
                            Lista1.MostrarDatos();
                            break;
                        case 5:
                            Lista1.MostrarDatos();
                            System.out.println("\n");
                            Lista1.BorrarFinal();
                            
                            Lista1.MostrarDatos();
                            break;
                        case 6:
                            Lista1.MostrarDatos();
                            System.out.println("\n");
                            System.out.print("\nIngrese el valor a borrar: ");
                            int valor =sc.nextInt();
                            Lista1.BorrarXValor(valor);
                            
                            Lista1.MostrarDatos();
                            break;     
                        case 7://Mostrar
                            Lista1.MostrarDatos();
                            break;
                        case 8:
                            System.out.println("Saliendo de la lista.");
                            
                            
                    }
                    }while(opcionMenu !=8);{
                        break;
                    }
                     

                case 2:
                    do{
                    
                    
                        System.out.println("========================================");
                        System.out.println("|  Lista Simplemente Ligada circular.  |");
                        System.out.println("|--------------------------------------|");
                        System.out.println("|  1. Insertar al inicio.              |");
                        System.out.println("|  2. Insertar al Final.               |");
                        System.out.println("|  3. Insertar medio por valor.        |");
                        System.out.println("|  4. Borrar al inicio.                |");
                        System.out.println("|  5. Borrar al final.                |");
                        System.out.println("|  6. Borrar medio por valor.          |");
                        System.out.println("|  7. Mostrar lista.                   |");
                        System.out.println("|  8. Salir.                           |");
                        System.out.println("========================================");
                        System.out.println("Escriba la opcion:\n");

                        opcionMenus = sc.nextInt();

                        switch(opcionMenus){
                            case 1://insertar al inicio

                                System.out.println("Ingrese el valor:");
                                dato = sc.nextInt();
                                Lista2.InsertarInicio(dato);
                                break;
                            case 2://insertar al final

                                System.out.println("Ingrese el valor:");
                                dato = sc.nextInt();
                                Lista2.InsertarFinal(dato);
                                break;
                            case 4:
                                Lista2.MostrarDato();
                                System.out.println("\n");
                                Lista2.BorrarInicio();
                            
                                Lista2.MostrarDato();
                                break;
                            case 5:
                                Lista2.MostrarDato();
                                System.out.println("\n");
                                Lista2.BorrarFinal();
                                Lista2.MostrarDato();
                                break;    

                            case 7://Mostrar
                                Lista2.MostrarDato();
                                break;
                    }
                    }while(opcionMenus !=8);
                    
                /*   
                case 3:
                    do{
                    
                    
                        System.out.println("========================================");
                        System.out.println("|       Lista doblemente Ligada.       |");
                        System.out.println("|--------------------------------------|");
                        System.out.println("|  1. Insertar al inicio.              |");
                        System.out.println("|  2. Insertar al Final.               |");
                        System.out.println("|  3. Insertar medio por valor.        |");
                        System.out.println("|  4. Borrar al inicio.                |");
                        System.out.println("|  5. Borrar al final.                |");
                        System.out.println("|  6. Borrar medio por valor.          |");
                        System.out.println("|  7. Mostrar lista.                   |");
                        System.out.println("|  8. Salir.                           |");
                        System.out.println("========================================");
                        System.out.println("Escriba la opcion:\n");

                        opcionMenusD = sc.nextInt();

                        switch(opcionMenusD){
                            case 1://insertar al inicio

                                System.out.println("Ingrese el valor:");
                                dato = sc.nextInt();
                                Lista3.InsertarInicio(dato);
                                break;
                            case 2://insertar al final

                                System.out.println("Ingrese el valor:");
                                dato = sc.nextInt();
                                Lista3.InsertarFinal(dato);
                                break;
                            case 4:
                                Lista3.MostrarDato();
                                System.out.println("\n");
                                Lista3.BorrarInicio();
                            
                                Lista3.MostrarDato();
                                break;
                            case 5:
                                Lista3.MostrarDato();
                                System.out.println("\n");
                                Lista3.BorrarFinal();
                                Lista3.MostrarDato();
                                break;    

                            case 7://Mostrar
                                Lista3.MostrarDato();
                                break;
                    }
                    }while(opcionMenusD !=8);
                case 4:
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
*/



                default:
                    System.out.println("Opcion por defecto");
                    break;
            }    
                
                   
        }while(opc != 5);
    
    }
    
}
