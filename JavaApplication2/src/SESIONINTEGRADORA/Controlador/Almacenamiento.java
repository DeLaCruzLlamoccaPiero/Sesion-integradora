/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SESIONINTEGRADORA.Controlador;

import SESIONINTEGRADORA.Modelo.Grupo;

public class Almacenamiento {
    private Grupo[] listaGrupos;
    private int nroGrupos;

    public Almacenamiento(int nroGrupos) {
        this.nroGrupos = nroGrupos;
        this.listaGrupos = new Grupo[nroGrupos]; 
    }

    public void setGrupo(int indice, Grupo grupo) {
        this.listaGrupos[indice] = grupo;
    }

    public Grupo[] getListaGrupos() {
        return this.listaGrupos;
    }

    public void imprimirReporte(Grupo[] listaGrupos) {
        boolean hayGrupos = false; 
        
        for (int i = 0; i < listaGrupos.length; i++) {
            if (listaGrupos[i] != null) {
                System.out.println(listaGrupos[i].toString());
                hayGrupos = true; 
            }
        }
        
        
        if (!hayGrupos) {
            System.out.println("No hay grupos completos registrados todavia.");
        }
    }
}
