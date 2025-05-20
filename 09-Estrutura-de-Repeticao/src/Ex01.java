import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        int cont = 1;
        int maior = 0;


        while(cont <= 15) {
            System.out.println("Valor --> ");
            valor = sc.nextInt();

            if (cont == 1 || valor > maior) {
                maior = valor;
            }
            cont = cont +1;
        }
        System.out.println("Maior --> "+maior);

    }
}
