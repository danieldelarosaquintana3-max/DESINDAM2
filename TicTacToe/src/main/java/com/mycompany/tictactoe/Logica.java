/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author danie
 */
public class Logica {
    private JButton[] botones = new JButton[9];
    private  int[][] x = new int[3][3];
    ImageIcon iconoCirculo;
    ImageIcon iconoCruz ;
    int resultado ;
    public Logica(JButton[] b,ImageIcon iconoCirculo,ImageIcon iconoCruz) {
        this.botones = b;
        this.iconoCirculo = iconoCirculo;
        this.iconoCruz = iconoCruz;
    }

    public int actualizarDatos() {
    

    for (int i = 0; i < botones.length; i++) {
        Icon icono = botones[i].getIcon();

        int fila = i / 3;
        int columna = i % 3;

        if (icono != null && icono instanceof ImageIcon) {
            ImageIcon imgIcon = (ImageIcon) icono;

            if (imgIcon.getImage() == iconoCirculo.getImage()) {
                x[fila][columna] = 1;
                System.out.println("CIRCULO");
            } else if (imgIcon.getImage() == iconoCruz.getImage()) {
                x[fila][columna] = 2;
                System.out.println("CRUZ");
            }
        }
        
    }
        return comprobarGanadorRecursivo(x);
}
    
    public int[][] getX() {
        return x;
    }
    
    public boolean comprobarLinea(int[][] tablero, int fila, int col, int df, int dc, int jugador, int contador) {
        // Fuera de límites
        if (fila < 0 || fila >= 3 || col < 0 || col >= 3) return false;

        // No coincide
        if (tablero[fila][col] != jugador) return false;

        // Si ya llevamos 3 seguidas
        if (contador == 3) return true;

        // Avanzar en la dirección
        return comprobarLinea(tablero, fila + df, col + dc, df, dc, jugador, contador + 1);
    }
    public int comprobarGanadorRecursivo(int[][] tablero) {
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int jugador = tablero[i][j];
                if (jugador == 0) continue;

                // Comprobar en 4 direcciones: derecha, abajo, diagonal derecha, diagonal izquierda
                if (comprobarLinea(tablero, i, j, 0, 1, jugador, 1) ||  // Horizontal
                    comprobarLinea(tablero, i, j, 1, 0, jugador, 1) ||  // Vertical
                    comprobarLinea(tablero, i, j, 1, 1, jugador, 1) ||  // Diagonal principal
                    comprobarLinea(tablero, i, j, 1, -1, jugador, 1))   // Diagonal secundaria
                {
                    return jugador;
                }
            }
        }
        return 0; // No hay ganador
    }
    

    
    
    public void reset() {
        x = new int[3][3];
        for(JButton b : botones) {
            b.setIcon(null);
            b.setEnabled(true);
        }
    }
}