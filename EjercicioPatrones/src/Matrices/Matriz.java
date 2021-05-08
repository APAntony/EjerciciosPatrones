/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

/**
 *
 * @author Antony Artavia
 */
public class Matriz {
    private int columnas;
    private int filas;
    private int[][] matriz;

    public Matriz(int columnas, int filas, int[][] matriz) {
        this.columnas = columnas;
        this.filas = filas;
        this.matriz = matriz;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getFilas() {
        return filas;
    }

    public int[][] getMatriz() {
        return matriz;
    }
}
