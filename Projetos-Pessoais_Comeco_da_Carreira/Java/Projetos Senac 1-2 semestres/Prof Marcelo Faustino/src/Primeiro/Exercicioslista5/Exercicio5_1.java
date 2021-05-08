package Exercicioslista5;
import java.util.Scanner;

public class Exercicio5_1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String nome, ender, cidade, uf, cep, tel, cpf, data_nascimento, grau_escolar, formacao, rg;
        int i, quant_cad;

        System.out.print("Informe a quantidade de professores que deseja cadastrar: ");
        quant_cad = in.nextInt();

        i=0;
        //Cadastra os professores e imprimi
        while(i < quant_cad){
            i++;
            //CADASTRA
            System.out.print("\nInforme o nome: ");
            nome = in.next();
            System.out.print("Informe o endereco: ");
            ender = in.next();
            System.out.print("Informe a cidade: ");
            cidade = in.next();
            System.out.print("Informe o UF: ");
            uf = in.next();
            System.out.print("Informe o CEP: ");
            cep = in.next();
            System.out.print("Informe o telefone: ");
            tel = in.next();
            System.out.print("Informe o CPF: ");
            cpf = in.next();
            System.out.print("Informe o RG: ");
            rg = in.next();
            System.out.print("Informe a data de nascimento (xx/xx/xxxx): ");
            data_nascimento = in.next();
            System.out.print("Informe o grau de escolaridade: ");
            grau_escolar = in.next();
            System.out.print("Informe o curso formado: ");
            formacao = in.next();   
            
            //IMPRIMI
            System.out.println("\nNome: "+nome);
            System.out.println("Endereco: "+ender);
            System.out.println("Cidade: "+cidade);
            System.out.println("UF: "+uf);
            System.out.println("CEP: "+cep);
            System.out.println("Telefone: "+tel);
            System.out.println("CPF: "+cpf);
            System.out.println("RG: "+rg);
            System.out.println("Data de nascimento: "+data_nascimento);
            System.out.println("Grau de escolaridade: "+grau_escolar);
            System.out.println("Curso formado: "+formacao);
            
        }

    }
}