/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author andre
 */

import Modelo.*;
import Modelo.LectorDocumento;

public class Main {
    public static void main(String[] args) {
        LectorDocumento lectorDOC = new LectorDOC();
        LectorDocumento lectorCSV = new LectorCSV();
        LectorDocumento lectorPDF = new LectorPDF();

        ProcesadorDocumento procesador = new ProcesadorDocGeneral(lectorDOC);
        procesador.procesarDocumento();

        System.out.println("\n\n\n");

        procesador = new ProcesadorDocGeneral(lectorCSV);
        procesador.procesarDocumento();

        System.out.println("\n\n\n");

        procesador = new ProcesadorDocGeneral(lectorPDF);
        procesador.procesarDocumento();
    }
}

