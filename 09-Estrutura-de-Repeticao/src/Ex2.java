/*
 * progarama para ler dois números inteiros (o segundo valor
 * deve ser obrigatoriamente maior que o primeiro). O programa deve
 *  imprimir todos os números dentro do intervalo (inclusive os extremos)
 * */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Primeiro valor --> ");
        valor1 = sc.nextInt();
        System.out.println("Segundo valor (maior que o primeiro) --> ");
        valor2 = sc.nextInt();

        if(valor2 > valor1){
            while(valor1 <= valor2){
                System.out.print(valor1 + "");
                valor1 = valor1+1;
            }
        }
        else{
            System.out.println("Valor Inválido");
        }

    }
}
