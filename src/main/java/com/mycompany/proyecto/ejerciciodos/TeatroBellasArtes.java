
package com.mycompany.proyecto.ejerciciodos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;


public class TeatroBellasArtes {
    String peliculas[];
    int numeroDeBoletasPorPelicula[];
    
    Nodo inicio;
    TeatroBellasArtes(){
        inicio = null;
    }
    
    public void insertarPeliculas(){
        
        int size =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas peliculas hay:"));
        peliculas = new String[size]; //Deadpool, Cry
        numeroDeBoletasPorPelicula = new int[size]; //2, 5
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i] = JOptionPane.showInputDialog("Ingrese el nombre de la pelicula "+(i+1)); 
        }
        
    }
   
    
    public void atender(String id, String nombre, String fecha, String pelicula, char sexo) {
    Nodo nuevo = new Nodo();
    for (int i = 0; i < peliculas.length; i++) {
        if (peliculas[i].equalsIgnoreCase(pelicula)) {
            nuevo.setId(id);
            nuevo.setNombre(nombre);
            nuevo.setFecha(fecha);
            nuevo.setPelicula(pelicula);
            nuevo.setSexo(sexo);
            numeroDeBoletasPorPelicula[i]++;
            
            if (inicio == null) {
                inicio = nuevo;
                nuevo.setEnlace(null);
                JOptionPane.showMessageDialog(null, "Usuario atendido exitosamente");
            } else {
                Nodo temporal = inicio;
                
                // Verificar si el usuario ya tiene un boleto para esta película
                while (temporal != null) {
                    if (temporal.getId().equalsIgnoreCase(id) && temporal.getPelicula().equalsIgnoreCase(pelicula)) {
                        JOptionPane.showMessageDialog(null, "El usuario ya tiene boleto para esta pelicula");
                        return; // Salir del método
                    }
                    // Avanzar al siguiente nodo
                    if (temporal.getEnlace() == null) {
                        break; 
                    }
                    temporal = temporal.getEnlace();
                }

                // Añadir el nuevo nodo al final
                temporal.setEnlace(nuevo);
                nuevo.setEnlace(null);
                JOptionPane.showMessageDialog(null, "Usuario atendido exitosamente");
            }
            return; 
               }
          }
             JOptionPane.showMessageDialog(null, "La pelicula no esta en funcion");
        }

    public void imprimir(){
        if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        else{
            Nodo temporal = inicio;
            while(temporal != null){
                JOptionPane.showMessageDialog(null, temporal.toString());
                temporal = temporal.getEnlace();
            }
        }
    }
    
    public void buscar(String documento){
         Nodo temporal = inicio;
         boolean encontrado = false;
         if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
         while(temporal != null){
               if(temporal.getId().equalsIgnoreCase(documento)){
                   encontrado = true;
                   JOptionPane.showMessageDialog(null, "El usuario "+temporal.getId() +" ha comprado entradas para ver a "+temporal.getPelicula());
               }
               temporal = temporal.getEnlace();
              }
         if(!encontrado){
             JOptionPane.showMessageDialog(null, "El usuario no ha comprado boletas");
         }
    }
    
    public void adultosMayores(){
         Nodo temporal = inicio;
         int totalPersonas = 0;
         if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
         while(temporal != null){
             int edad = calcularEdad(temporal.getFecha());
             if(edad>65){
                 totalPersonas++;
             }
             temporal = temporal.getEnlace();
         }
         JOptionPane.showMessageDialog(null, "Hay "+totalPersonas+" personas mayores");
    }
    
    public void totalHombresYMujeres(){
        int totalPersonasHombres = 0;
        int totalPersonasMujeres = 0;
        Nodo temporal = inicio;
        if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        while(temporal != null){
            char sexo = temporal.getSexo();
            if(sexo == 'M' || sexo == 'm'){
                totalPersonasHombres++;
            }
            if(sexo == 'F' || sexo == 'f'){
                totalPersonasMujeres++;
            }
            temporal = temporal.getEnlace();
        }
        JOptionPane.showMessageDialog(null,"Hay "+totalPersonasHombres +" hombres y "+totalPersonasMujeres +" mujeres");
    }
    
     public int calcularEdad(String fechaNacimiento) {
        
            try {
            // Crear un objeto LocalDate a partir de la fecha de nacimiento
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);

            // Calcular la diferencia en años entre la fecha de nacimiento y la fecha actual
            LocalDate fechaActual = LocalDate.now();
            long años = ChronoUnit.YEARS.between(fechaNac, fechaActual);

            return (int) años;
        } catch (Exception e) {
            System.err.println("Error al calcular la edad: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Ingreso incorrectamente la edad");
            return -1; // Valor negativo para indicar un error
        }
     }
     
     public void masMujeres(){
         int numMujeresPorPelicula [] = new int [3];
         Nodo temporal = inicio;
         if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
         while(temporal != null){
             for (int i = 0; i < peliculas.length; i++) {
                 if(temporal.getPelicula().equalsIgnoreCase(peliculas[i])){
                    if(temporal.getSexo() == 'F' || temporal.getSexo() == 'f'){
                     numMujeresPorPelicula[i] ++;
                    }
                 }
             }
             temporal = temporal.getEnlace();
         }
         int contador = 0;
         for (int i = 0; i < numMujeresPorPelicula.length; i++) {
             int pivote = numMujeresPorPelicula[0];
            if(pivote<numMujeresPorPelicula[i]){
                contador++;
                pivote =numMujeresPorPelicula[i];
            }
         }
         if(numMujeresPorPelicula[contador] == 0){
             JOptionPane.showMessageDialog(null, "No hay mujeres en ninguna pelicula");
         }
         else{
         JOptionPane.showMessageDialog(null, "La pelicula donde hay mas mujeres es "+peliculas[contador] +" con "+numMujeresPorPelicula[contador] +" mujeres");
         }
     }
     
     public void cartelera(){
         String mensaje = "Cartelera \n";
         for (int i = 0; i < peliculas.length; i++) {
             mensaje += "Pelicula: "+ peliculas[i] +" tiene " +numeroDeBoletasPorPelicula[i] +" boletas vendidas \n";
         }
         JOptionPane.showMessageDialog(null,mensaje);
     }
     
     public void carteleraNombres(){
         String mensaje = "Cartelera \n";
         for (int i = 0; i < peliculas.length; i++) {
             mensaje += "Pelicula: "+ peliculas[i] +"\n";
         }
         JOptionPane.showMessageDialog(null,mensaje);
     }
}
            
         
     
     
     
     
    

