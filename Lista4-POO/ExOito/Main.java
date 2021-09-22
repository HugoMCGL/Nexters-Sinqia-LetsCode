package ExOito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[5];
        String nome;
        double altura, peso,imc;

        Scanner sc = new Scanner(System.in);

        for (int i=0; i< pessoa.length; i++){

            System.out.println("\nDigite o nome: ");
            nome = sc.next();

            System.out.println("Digite a altura: ");
            altura = sc.nextDouble();

            System.out.println("Digite o peso");
            peso = sc.nextDouble();

            imc = peso/(altura*altura);

            pessoa[i] = new Pessoa(nome, altura, peso, imc);
        }
        for(int i=0; i < pessoa.length;i++){
            if((pessoa[i].getImc()<18.5)||(pessoa[i].getImc()>25)) {
                System.out.println(pessoa[i].getNome()+" está fora do peso");
            }
        }
    }
}