/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SESIONINTEGRADORA.Controlador;

import SESIONINTEGRADORA.Modelo.Grupo;
/**
 *
 * @author Administrador
 */
public class Almacenamiento {
   
    private Grupo[] listaGrupos;
    private int nroGrupos;

    public Almacenamiento(int nroGrupos) {
        this.nroGrupos = nroGrupos;
        listaGrupos = new Grupo[nroGrupos];
    }

    public void setGrupo(int posicion, Grupo grupo) {
        listaGrupos[posicion] = grupo;
    }

    public void imprimirReporte(Grupo[] listaGrupos) {

        System.out.println(" REPORTE DE GRUPOS ");

        for (int i = 0; i < listaGrupos.length; i++) {

            if (listaGrupos[i] != null) {
                System.out.println("\nGrupo " + (i + 1));
                System.out.println(listaGrupos[i]);
            }

        }
    }

    public Grupo[] getListaGrupos() {
        return listaGrupos;
    }
}

