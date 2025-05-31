/*
 * @author Luiz Felipe Vieira
 * @RA: 12127579
 * @version 1.00 2025/05/17
 */

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i=0, quantOuro, quantPrata, quantBronze;

        String [] paises = new String [3];
        int [] medalhasOuro = new int [3];
        int [] medalhasPrata = new int [3];
        int [] medalhasBronze = new int [3];

        while (i<3){
            System.out.println("Digite o nome do país: ");
            String pais = leia.nextLine();
            paises[i] = pais;

            System.out.println("Digite a quantidade de medalhas de ouro: ");
            quantOuro = leia.nextInt();
            medalhasOuro[i] += quantOuro;

            System.out.println("Digite a quantidade de medalhas de prata: ");
            quantPrata = leia.nextInt();
            medalhasPrata[i] += quantPrata;

            System.out.println("Digite a quantidade de medalhas de bronze: ");
            quantBronze = leia.nextInt();
            leia.nextLine();
            medalhasBronze[i] += quantBronze;

            i++;
        }

        int somaPais1 = ((medalhasOuro[0]*3)+(medalhasPrata[0]*2)+(medalhasBronze[0]));
        int somaPais2 = ((medalhasOuro[1]*3)+(medalhasPrata[1]*2)+(medalhasBronze[1]));
        int somaPais3 = ((medalhasOuro[2]*3)+(medalhasPrata[2]*2)+(medalhasBronze[2]));

        System.out.println("\nCLASSIFICAÇÃO FINAL:");
        if ((somaPais1>somaPais2)&&(somaPais1>somaPais3)&&(somaPais2>somaPais3)){
            System.out.println("1° Lugar: " +paises[0]+ " | Ouro: " +medalhasOuro[0]+ " | Prata: " +medalhasPrata[0]+ " | Bronze: " +medalhasBronze[0]+ " | Total: " +somaPais1);
            System.out.println("2° Lugar: " +paises[1]+ " | Ouro: " +medalhasOuro[1]+ " | Prata: " +medalhasPrata[1]+ " | Bronze: " +medalhasBronze[1]+ " | Total: " +somaPais2);
            System.out.println("3° Lugar: " +paises[2]+ " | Ouro: " +medalhasOuro[2]+ " | Prata: " +medalhasPrata[2]+ " | Bronze: " +medalhasBronze[2]+ " | Total: " +somaPais3);
        } else if ((somaPais1>somaPais2)&&(somaPais1>somaPais3)&&(somaPais3>somaPais2)){
            System.out.println("1° Lugar: " +paises[0]+ " | Ouro: " +medalhasOuro[0]+ " | Prata: " +medalhasPrata[0]+ " | Bronze: " +medalhasBronze[0]+ " | Total: " +somaPais1);
            System.out.println("2° Lugar: " +paises[2]+ " | Ouro: " +medalhasOuro[2]+ " | Prata: " +medalhasPrata[2]+ " | Bronze: " +medalhasBronze[2]+ " | Total: " +somaPais3);
            System.out.println("3° Lugar: " +paises[1]+ " | Ouro: " +medalhasOuro[1]+ " | Prata: " +medalhasPrata[1]+ " | Bronze: " +medalhasBronze[1]+ " | Total: " +somaPais2);
        } else if ((somaPais2>somaPais1)&&(somaPais2>somaPais3)&&(somaPais1>somaPais3)) {
            System.out.println("1° Lugar: " +paises[1]+ " | Ouro: " +medalhasOuro[1]+ " | Prata: " +medalhasPrata[1]+ " | Bronze: " +medalhasBronze[1]+ " | Total: " +somaPais2);
            System.out.println("2° Lugar: " +paises[0]+ " | Ouro: " +medalhasOuro[0]+ " | Prata: " +medalhasPrata[0]+ " | Bronze: " +medalhasBronze[0]+ " | Total: " +somaPais1);
            System.out.println("3° Lugar: " +paises[2]+ " | Ouro: " +medalhasOuro[2]+ " | Prata: " +medalhasPrata[2]+ " | Bronze: " +medalhasBronze[2]+ " | Total: " +somaPais3);
        } else if ((somaPais2>somaPais1)&&(somaPais2>somaPais3)&&(somaPais3>somaPais1)) {
            System.out.println("1° Lugar: " +paises[1]+ " | Ouro: " +medalhasOuro[1]+ " | Prata: " +medalhasPrata[1]+ " | Bronze: " +medalhasBronze[1]+ " | Total: " +somaPais2);
            System.out.println("2° Lugar: " +paises[2]+ " | Ouro: " +medalhasOuro[2]+ " | Prata: " +medalhasPrata[2]+ " | Bronze: " +medalhasBronze[2]+ " | Total: " +somaPais3);
            System.out.println("3° Lugar: " +paises[0]+ " | Ouro: " +medalhasOuro[0]+ " | Prata: " +medalhasPrata[0]+ " | Bronze: " +medalhasBronze[0]+ " | Total: " +somaPais1);
        } else if ((somaPais3>somaPais1)&&(somaPais3>somaPais2)&&(somaPais1>somaPais2)) {
            System.out.println("1° Lugar: " +paises[2]+ " | Ouro: " +medalhasOuro[2]+ " | Prata: " +medalhasPrata[2]+ " | Bronze: " +medalhasBronze[2]+ " | Total: " +somaPais3);
            System.out.println("2° Lugar: " +paises[0]+ " | Ouro: " +medalhasOuro[0]+ " | Prata: " +medalhasPrata[0]+ " | Bronze: " +medalhasBronze[0]+ " | Total: " +somaPais1);
            System.out.println("3° Lugar: " +paises[1]+ " | Ouro: " +medalhasOuro[1]+ " | Prata: " +medalhasPrata[1]+ " | Bronze: " +medalhasBronze[1]+ " | Total: " +somaPais2);
        } else if ((somaPais3>somaPais2)&&(somaPais3>somaPais1)&&(somaPais2>somaPais1)) {
            System.out.println("1° Lugar: " +paises[2]+ " | Ouro: " +medalhasOuro[2]+ " | Prata: " +medalhasPrata[2]+ " | Bronze: " +medalhasBronze[2]+ " | Total: " +somaPais3);
            System.out.println("2° Lugar: " +paises[1]+ " | Ouro: " +medalhasOuro[1]+ " | Prata: " +medalhasPrata[1]+ " | Bronze: " +medalhasBronze[1]+ " | Total: " +somaPais2);
            System.out.println("3° Lugar: " +paises[0]+ " | Ouro: " +medalhasOuro[0]+ " | Prata: " +medalhasPrata[0]+ " | Bronze: " +medalhasBronze[0]+ " | Total: " +somaPais1);
        }

        leia.close();
    }
}
