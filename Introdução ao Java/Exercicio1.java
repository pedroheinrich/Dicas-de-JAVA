package Exercicios;
public class Exercicio1 {
    // Faça um programa que leia dois valores numéricos inteiros e apresente
    // o resultado da diferença do maior valor pelo menor valor. Se os valores
    // forem iguais, o programa deve mostrar zero.
    public static void main(String[] args){
        
        int N1, N2;
        System.out.print(":: VERIFICADOR DE NUMEROS ::\n");
        System.out.print("Digite o primeiro numero: \n");
        N1 = Integer.parseInt(System.console().readLine());
        System.out.print("Digite o primeiro numero: \n");
        N2 = Integer.parseInt(System.console().readLine());
        System.out.print("Comparando os numeros recebidos... \n");
            if(N1>N2)
                System.out.print("O primeiro numero é maior!\n");
            else if (N1 == N2)
                System.out.print("0 \n");
            else 
                System.out.print("O segundo numero é o maior! \n");
    }       
    
}
