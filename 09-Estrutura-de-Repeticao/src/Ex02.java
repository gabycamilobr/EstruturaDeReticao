import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, cont = 0, resultado;
        int resposta = 1;

        while (resposta == 1){
            System.out.println("Valor -- > ");
            cont = 0;
            valor = sc.nextInt();
            while(cont <= 10){
                resultado = valor * cont;
                System.out.println(valor + " x " + cont + " = " + resultado);
                cont = cont + 1;
            }
            System.out.println("Digite 1 para nova tabuada ou 0 para finalizar");
            resposta = sc.nextInt();
        }

    }
}
