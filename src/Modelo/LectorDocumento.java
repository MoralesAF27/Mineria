/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */

public abstract class LectorDocumento {
    public final void procesar() {
        leer();
        extraerDatos();
        analizar();
        exportar();
    }

    protected abstract void leer();

    protected void extraerDatos() {
        System.out.println("Extraer datos relevantes del documento seleccionado");
    }

    protected void analizar() {
        System.out.println("Analizar el contenido");
    }

    protected void exportar() {
        System.out.println("Exportando resultado.");
    }
}

