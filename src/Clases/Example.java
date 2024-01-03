/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Clases;

import java.util.Random;

/**
 *
 * @author jlopez
 */
public class Example {
    //atributos
    int filasMatriz1 = 1000;
    int columnasMatriz1 = 15000;
    
    int filasMatriz2 = 15000;
    int columnasMatriz2 = 1000;
    
    int filasMatrizResultado = filasMatriz1;
    int columnasMatrizResultado = columnasMatriz2;
    
    int matriz1[][] = new int [filasMatriz1][columnasMatriz1];
    int matriz2[][] = new int [filasMatriz2][columnasMatriz2]; 
    int matrizResultadoSecuencial[][] = new int [filasMatrizResultado][columnasMatrizResultado];
    int matrizResultadoConcurrente[][] = new int [filasMatrizResultado][columnasMatrizResultado];
    
    int valorMinimo = -10;
    int valorMaximo = 10;
    int numHilos = 20;
    
    Random random = new Random();
    
    //metodos
    
    
    
    public void llenarMatrices(){
        /*//llenar matriz 1
        for(int i = 0; i < filasMatriz1; i++){
            for (int j = 0; j < columnasMatriz1; j++) {
               matriz1[i][j] = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
            }
        }
        
        //llenar matriz 2
        for (int i = 0; i < filasMatriz2; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                matriz2[i][j] = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
            }
        }*/
       
    }
    
    public void iniciar(){
        
        llenarMatrices();
        
        ModeloSecuencial secuencial = new ModeloSecuencial(matriz1,matriz2,matrizResultadoSecuencial);
        ModeloConcurrente concurrente = new ModeloConcurrente(matriz1,matriz2,matrizResultadoConcurrente,numHilos);
        

        long inicioSecuencial = System.nanoTime();
        secuencial.multiplicacionMatrices();
        long terminoSecuencial = System.nanoTime()- inicioSecuencial;
        
        long inicioConcurrente = System.nanoTime();
        concurrente.multiplicacion();
        long terminoConcurrente = System.nanoTime()- inicioConcurrente;
        
        /*
        //m1
        System.out.println("Matriz 1");
        for (int i = 0; i < secuencial.matriz1.length; i++) {
            for (int j = 0; j < secuencial.matriz1[0].length; j++) {
                System.out.print(secuencial.matriz1[i][j] + " ");
            }
            System.out.println();
        }
        
        //m2
        System.out.println("Matriz 2");
        for (int i = 0; i < secuencial.matriz2.length; i++) {
            for (int j = 0; j < secuencial.matriz2[0].length; j++) {
                System.out.print(secuencial.matriz2[i][j] + " ");
            }
            System.out.println();
        }*/
        
        //resultados secuencial
//        System.out.println("Matriz Resultado Secuencial");
//        for (int i = 0; i < secuencial.matrizResultado.length; i++) {
//            for (int j = 0; j < secuencial.matrizResultado[0].length; j++) {
//                System.out.print(secuencial.matrizResultado[i][j] + " ");
//            }
//            System.out.println();
//        }
//        
        System.out.println("Tiempo: " + terminoSecuencial);
        
        //resultados concurrente
//        System.out.println("Matriz Resultado Concurrente");
//        for (int i = 0; i < concurrente.matrizResultado.length; i++) {
//            for (int j = 0; j < concurrente.matrizResultado[0].length; j++) {
//                System.out.print(concurrente.matrizResultado[i][j] + " ");
//            }
//            System.out.println();
//        }
        
        System.out.println("Tiempo: " + terminoConcurrente);
    }
    
    
    public static void main(String args[]) {
        Example ejercicio = new Example();
        ejercicio.iniciar();
       
    }
        
}
