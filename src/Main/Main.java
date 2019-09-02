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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada
        /*
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite um valor para A: ");
        double a=teclado.nextDouble();
        System.out.println("Digite um valor para B: ");
        double b=teclado.nextDouble();
        */
        
        Entrada entrada=new Entrada();
        double a=entrada.lerNumeroDouble("Digite um valor para a ");
        double b=entrada.lerNumeroDouble("Digite um valor para b ");
        
        
        
        //Processamento
        Processamento processamento=new Processamento();
        double x=processamento.getDiv(a,b);
        //Saida
        Saida saida = new Saida();
        if (processamento.getConseguiu()) {
            saida.imprimirNumeroDouble("Resultado", x);
        } else{
            saida.imprimirRotuloEString("Nao conseguiu", "divisao por zero");
        }
        
        
        
    }
    
}
