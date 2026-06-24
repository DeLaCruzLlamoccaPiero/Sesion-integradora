/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SESIONINTEGRADORA.Vista;

import SESIONINTEGRADORA.Controlador.Almacenamiento;
import SESIONINTEGRADORA.Modelo.Grupo;
import SESIONINTEGRADORA.Modelo.Pais;
import java.util.Scanner;

public class Futbol {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Almacenamiento almacen = new Almacenamiento(10); 

        Pais[] paisesTemp = new Pais[4];
        int contadorPaises = 0;
        int contadorGrupos = 0;
        int opcion = 0;

        do {
            System.out.println(" MENU DE REGISTRO ");
            System.out.println("1. Ingresar datos de un pais");
            System.out.println("2. Imprimir reporte ");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del pais: ");
                    String nombre = entrada.nextLine();
                    
                    System.out.print("Copas: ");
                    int copas = entrada.nextInt();
                    
                    System.out.print("Participaciones: ");
                    int participaciones = entrada.nextInt();
                    entrada.nextLine(); 
                    
                    paisesTemp[contadorPaises] = new Pais(nombre, copas, participaciones);
                    contadorPaises++;
                    
                    System.out.println("> Pais registrado (" + contadorPaises + "/4 para armar el grupo)");

                    if (contadorPaises == 4) {
                        Grupo nuevoGrupo = new Grupo(paisesTemp[0], paisesTemp[1], paisesTemp[2], paisesTemp[3]);
                        almacen.setGrupo(contadorGrupos, nuevoGrupo);
                        contadorGrupos++;
                        
                        contadorPaises = 0; 
                        paisesTemp = new Pais[4]; 
                        System.out.println("¡Grupo " + contadorGrupos + " completado y guardado ");
                    }
                    break;
                    
                case 2:
                    System.out.println(" REPORTE ENTERO ");
                    almacen.imprimirReporte(almacen.getListaGrupos());
                    break;
                    
                case 3:
                    System.out.println("Cerrando el sistema...");
                    break;
                    
                default:
                    System.out.println("Opción incorrecta. Intenta de nuevo.");
            }
        } while (opcion != 3);
        
        entrada.close();
    }
}