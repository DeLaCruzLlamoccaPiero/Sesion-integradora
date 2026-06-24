/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SESIONINTEGRADORA.Modelo;

/**
 *
 * @author Administrador
 */
public class Grupo {
    
    private Pais pais1;
    private Pais pais2;
    private Pais pais3;
    private Pais pais4;

    public Grupo(Pais pais1, Pais pais2, Pais pais3, Pais pais4) {
        this.pais1 = pais1;
        this.pais2 = pais2;
        this.pais3 = pais3;
        this.pais4 = pais4;
    }

    @Override
    public String toString() {
        return "\n--- GRUPO ---\n" +
               pais1 + "\n\n" +
               pais2 + "\n\n" +
               pais3 + "\n\n" +
               pais4;
    }
}