/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SESIONINTEGRADORA.Modelo;

public class Pais {
    private String nombre;
    private int copasGanadas;
    private int nroParticipaciones;

    public Pais(String nombre, int copasGanadas, int nroParticipaciones) {
        this.nombre = nombre;
        this.copasGanadas = copasGanadas;
        this.nroParticipaciones = nroParticipaciones;
    }

    @Override
    public String toString() {
        
        return "Pais: " + nombre + " | Copas ganadas: " + copasGanadas + " | Participaciones: " + nroParticipaciones;
    }
}
