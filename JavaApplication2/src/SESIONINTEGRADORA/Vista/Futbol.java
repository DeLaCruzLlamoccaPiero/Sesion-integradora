/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SESIONINTEGRADORA.Vista;

import SESIONINTEGRADORA.Controlador.Almacenamiento;
import SESIONINTEGRADORA.Modelo.Grupo;
import SESIONINTEGRADORA.Modelo.Pais;

/**
 *
 * @author Administrador
 */
public class Futbol {

    public static void main(String[] args) {

        Pais p1 = new Pais("Peru", 0, 5);
        Pais p2 = new Pais("Brasil", 5, 22);
        Pais p3 = new Pais("Argentina", 3, 18);
        Pais p4 = new Pais("Chile", 0, 9);

        Grupo grupo1 = new Grupo(p1, p2, p3, p4);

        Pais p5 = new Pais("España", 1, 16);
        Pais p6 = new Pais("Alemania", 4, 20);
        Pais p7 = new Pais("Francia", 2, 16);
        Pais p8 = new Pais("Italia", 4, 18);

        Grupo grupo2 = new Grupo(p5, p6, p7, p8);

        Almacenamiento almacen = new Almacenamiento(2);

        almacen.setGrupo(0, grupo1);
        almacen.setGrupo(1, grupo2);

        almacen.imprimirReporte(almacen.getListaGrupos());
    }
}

