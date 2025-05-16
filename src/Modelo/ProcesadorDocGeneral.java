/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */

public class ProcesadorDocGeneral implements ProcesadorDocumento {
    private LectorDocumento lector;

    public ProcesadorDocGeneral(LectorDocumento lector) {
        this.lector = lector;
    }

    @Override
    public void procesarDocumento() {
        lector.procesar(); // template method
    }
}

