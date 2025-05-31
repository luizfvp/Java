/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/16
 */

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 0, totalM = 0, totalF = 0;
        double alturaTotalF = 0, mediaAlturaF, maiorAltura = 0, menorAltura = 10;

        while (i<50){
            System.out.println("Qual o seu sexo? (Digite 'M' para masculino ou 'F' para feminino.)");
            String sexo = leia.nextLine();

            while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                System.out.println("O VALOR DIGITADO É INCORRETO!");
                System.out.println("Digite 'M' para masculino ou 'F' para feminino: ");
                sexo = leia.nextLine();
            }

            System.out.println("Qual a sua altura (em metros)? ");
            double altura = leia.nextDouble();
            leia.nextLine(); // para tirar o '\n' que sobra após o nextDouble

            if (altura > maiorAltura){
                maiorAltura = altura;
            }

            if (altura < menorAltura){
                menorAltura = altura;
            }

            if (sexo.equalsIgnoreCase("m")) {
                totalM++;
            }

            if (sexo.equalsIgnoreCase("f")) {
                alturaTotalF += altura;
                totalF++;
            }

            i++;
        }

        mediaAlturaF = alturaTotalF / totalF;

        System.out.printf("A maior altura do grupo é: %.2fm \n", maiorAltura);
        System.out.printf("A menor altura do grupo é: %.2fm \n", menorAltura);
        System.out.printf("A média de altura das mulheres é: %.2fm \n", mediaAlturaF);
        System.out.println("O número de homens é " + totalM + ", com um percentual de " + (totalM * 100)/i + "%");

        leia.close();
    }
}
