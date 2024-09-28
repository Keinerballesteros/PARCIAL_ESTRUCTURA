
package com.mycompany.proyecto.ejerciciouno.ejerciciodos;

import javax.swing.JOptionPane;


public class TeatroBellasArtes {
    
    
    Nodo inicio;
    TeatroBellasArtes(){
        inicio = null;
    }
    
    public void insertarPeliculasYNumBoletas(int numeroDePeliculas){
        String peliculas[][] = new String[numeroDePeliculas][2];
        for (int i = 0; i < numeroDePeliculas; i++) {
            for (int j = 0; j < 2; j++) {
                peliculas[i][0] = JOptionPane.showInputDialog("Ingrese el nombre de la pelicula");
                peliculas[i][1] = JOptionPane.showInputDialog("Ingrese el numero de boletas v");
            }
        }
    }
    
}
