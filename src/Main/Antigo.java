/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author a2020947
 */
public class Antigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Entrada
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite um valor para A: ");
        double a=teclado.nextDouble();
        System.out.println("Digite um valor para B: ");
        double b=teclado.nextDouble();
        
        //Processamento
        double x=a/b;
        //Saida
        System.out.println("Resultado:"+x);
    }
    
}
