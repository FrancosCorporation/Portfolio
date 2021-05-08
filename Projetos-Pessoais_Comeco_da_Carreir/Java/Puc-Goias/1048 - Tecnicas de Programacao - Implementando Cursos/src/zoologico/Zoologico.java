/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author japa
 */
public class Zoologico {
    private String nome;
    
    private Animais bichos[];

    public Zoologico(String nome) {
        this.nome = nome;
        this.bichos = new Animais[5];

    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animais[] getBichos() {
        return bichos;
    }

    public void setBichos(Animais[] bichos) {
        this.bichos = bichos;
    }
    
    public void imprimeBichos()
    {
        for (int i=0;i<5;i++)
        {
            System.out.print("bicho " + (i+1) + ": ");
            System.out.println(bichos[i].getEspecie());
        }
    }  
    
}
