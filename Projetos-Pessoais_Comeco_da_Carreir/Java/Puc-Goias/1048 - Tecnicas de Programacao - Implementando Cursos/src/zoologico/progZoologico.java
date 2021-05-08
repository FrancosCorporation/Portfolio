/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.Scanner;

/**
 *
 * @author japa
 */
public class progZoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=5;
        Scanner sc = new Scanner(System.in);
        Animais vetor[]=new Animais[n];
        Zoologico zooGoiania = new Zoologico("Goiania");
        
        for (int i=0;i<n;i++)
        {
            vetor[i] = new Animais();
            System.out.print("Digite o nome do bicho " + (i+1) + ": ");
            vetor[i].setEspecie(sc.next());
        }
        zooGoiania.setBichos(vetor);
        
        System.out.println("Zoologico: " + zooGoiania.getNome());
        zooGoiania.imprimeBichos();
        
    }
    
}
