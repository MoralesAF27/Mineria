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
        System.out.println("Extrayendo datos relevantes...");
    }

    protected void analizar() {
        System.out.println("Analizando contenido...");
    }

    protected void exportar() {
        System.out.println("Exportando resultados en formato uniforme.");
    }
}

