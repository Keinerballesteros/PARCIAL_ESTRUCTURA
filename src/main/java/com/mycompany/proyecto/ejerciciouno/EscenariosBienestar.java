
package com.mycompany.proyecto.ejerciciouno;

import javax.swing.JOptionPane;


public class EscenariosBienestar {
    
    String dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
    String escenarios[] = {"GYM","Teatro Bellas Artes","Canchas Sinteticas","Restaurante Escolar"};
    int datos[][] = new int [escenarios.length][dias.length];
   
    public void insertarDatos(){
        for (int i = 0; i < escenarios.length; i++) {
            for (int j = 0; j < dias.length; j++) {
               datos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de asistentes al "+escenarios[i] +" el dia "+dias[j]+" :"));
            }
        }
    }
    
    public void llenar(){
        int array[] = {23,78,34,23,45,23,67,45,67,45,46,34,89,23,88,66,55,56,54,26,48,19,21,78};
        int contador = 0;
        for (int i = 0; i < escenarios.length; i++) {
            for (int j = 0; j < dias.length; j++) {
               datos[i][j] = array[contador];
               contador++;
            }
        }
    }
    
    public void escenarioMasVisitado(){
        int totalVisitantes[] = new int [escenarios.length];
        for (int i = 0; i < escenarios.length; i++) {
            for (int j = 0; j < dias.length; j++) {
               totalVisitantes[i] += datos[i][j];
            }
        }
        int pivote = totalVisitantes[0];
        int contador = 0;
        for (int i = 0; i < totalVisitantes.length; i++) {
            if(pivote<totalVisitantes[i]){
                pivote = totalVisitantes[i];
                contador = i;
            }
        }
        JOptionPane.showMessageDialog(null, "El escenario mas visitado es "+escenarios[contador] +" con "+totalVisitantes[contador]+ " visitantes");
    }
    
    public void diaMasYMenosVisitadoPorEscenario(String escenario){
        int posicion = 0;
        for (int i = 0; i < escenarios.length; i++) {
            if(escenario.equalsIgnoreCase(escenarios[i])){
             posicion = i;
            }
           
        }
        int totalVisitantes = 0;
        int diaMayor = 0;
        int diaMenor = 0;
        int pivoteMayor =  datos[posicion][0];
        int pivoteMenor =  datos[posicion][0];
        
            for (int j = 0; j < dias.length; j++) {
                totalVisitantes += datos[posicion][j];
                if(pivoteMayor<datos[posicion][j]){
                    pivoteMayor = datos[posicion][j];
                    diaMayor = j;
                }
                if(pivoteMenor>datos[posicion][j]){
                    pivoteMenor = datos[posicion][j];
                    diaMenor = j;
                }
            }
         JOptionPane.showMessageDialog(null, "El escenario "+escenarios[posicion] +" fue mas visitado el dia "+dias[diaMayor] + " y menos visitado el dia "+dias[diaMenor] +" con un promedio de: "+(totalVisitantes/dias.length) +" visitantes");   
        }
        
     public void escenarioMenosVisitado(){
        int totalVisitantes[] = new int [escenarios.length];
        for (int i = 0; i < escenarios.length; i++) {
            for (int j = 0; j < dias.length; j++) {
               totalVisitantes[i] += datos[i][j];
            }
        }
        int pivote = totalVisitantes[0];
        int contador = 0;
        for (int i = 0; i < totalVisitantes.length; i++) {
            if(pivote>totalVisitantes[i]){
                pivote = totalVisitantes[i];
                contador = i;
            }
            
        }
        JOptionPane.showMessageDialog(null, "El escenario menos visitado es "+escenarios[contador] +" con "+totalVisitantes[contador]+ " visitantes");
    }    
     
     public void totalYPromedioDeVisitantes(){
        int totalVisitantes = 0;
        for (int i = 0; i < escenarios.length; i++) {
            for (int j = 0; j < dias.length; j++) {
               totalVisitantes += datos[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "El total de visitantes es de: "+totalVisitantes +" y con un promedio de: "+(totalVisitantes/(dias.length*escenarios.length)));
    }
    
     public void diaMasVisitado(){
        int totalVisitantesPorDia[] = new int [dias.length];
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < escenarios.length; j++) {
               totalVisitantesPorDia[i] += datos[j][i];
            }
        }
        int pivote = totalVisitantesPorDia[0];
        int contador = 0;
        for (int i = 0; i < totalVisitantesPorDia.length; i++) {
            if(pivote<totalVisitantesPorDia[i]){
                pivote = totalVisitantesPorDia[i];
                contador = i;
            }
            
        }
        JOptionPane.showMessageDialog(null, "El dia mas visitado es "+dias[contador] +" con "+totalVisitantesPorDia[contador]+ " visitantes");
    }
     
      public void diaMenosVisitado(){
        int totalVisitantesPorDia[] = new int [dias.length];
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < escenarios.length; j++) {
               totalVisitantesPorDia[i] += datos[j][i];
            }
        }
        int pivote = totalVisitantesPorDia[0];
        int contador = 0;
        for (int i = 0; i < totalVisitantesPorDia.length; i++) {
            if(pivote>totalVisitantesPorDia[i]){
                pivote = totalVisitantesPorDia[i];
                contador = i;
            }
            
        }
        JOptionPane.showMessageDialog(null, "El dia menos visitado es "+dias[contador] +" con "+totalVisitantesPorDia[contador]+ " visitantes");
    }
      
      public String[][] llenarTabla(){
          String [][] matriz = new String[escenarios.length][dias.length+1];
          for (int i = 0; i < escenarios.length; i++) {
              for (int j = 0; j < dias.length+1; j++) {
                  if(j==0){
                      matriz[i][j] = escenarios[i];
                  }
                  else{
                      matriz[i][j] = String.valueOf(datos[i][j-1]);
                  }
              }
          }
          
          return matriz;       
      }
    }

