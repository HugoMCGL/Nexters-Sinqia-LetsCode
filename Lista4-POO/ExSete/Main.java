package ExSete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[5];

        String nome, nomeNovo=null, nomeVelho=null;
        int idadeNovo=0, idadeVelho=0, inicio = 0,idadetotal=0,idade;
        double media;

        Scanner sc = new Scanner(System.in);

        for(int i=0;i< p.length;i++) {
            System.out.println("\nDigite o nome: ");
            nome = sc.next();
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();

            if(inicio ==0) {
                nomeNovo = nome;
                idadeNovo = idade;
                nomeVelho = nome;
                idadeVelho = idade;
                p[i] = new Pessoa(nome,idade);
                idadetotal = idade;
                inicio++;
            }else{
                if(idade<idadeNovo){
                    idadeNovo=idade;
                    nomeNovo = nome;
                }else if(idade>idadeVelho){
                    idadeVelho = idade;
                    nomeVelho = nome;
                }
            }
            idadetotal += idade;
            p[i] = new Pessoa(nome,idade);
        }
        media = (double)idadetotal/p.length;

        System.out.println("O mais novo é: "+nomeNovo+" e o mais velho é: "+nomeVelho+
                "\na média de idade é igual a "+media);

        for(int i = 0;i< p.length;i++){
            System.out.println(p[i].toString());
        }
    }
}