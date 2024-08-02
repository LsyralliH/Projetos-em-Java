package Introdução;
import java.util.Scanner;
public class populacao {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int id = 0, contadorSal = 0, contadorSexo = 0, idMaior =0, idMenor = 150, idSal = 0, pessoa = 1;
        float sal = 0, somaSal = 0, salMenor = 9999;
        char sexo, sexoSal = 0;

        while (true) {
            System.out.println("\nDados da pessoa " + pessoa);
            //IDADE
            System.out.println("Idade:");
            id = scan.nextInt();
            if (id < 0) {
                break;
            }
            if (id < idMenor) {
                idMenor = id;
            } else if (id > idMaior) {
                idMaior = id;
            }


            //SALARIO
            System.out.println("Salário:");
            sal = scan.nextFloat();

            //SEXO
            do {
                System.out.println("Sexo (M/F):");
                sexo = scan.next().charAt(0);
            } while (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M');
            if (sexo == 'f' || sexo == 'F') {
                contadorSexo++;
            }

            //SALARIO
            contadorSal++;
            somaSal += sal;
            if (sal < salMenor) {
                salMenor = sal;
                sexoSal = sexo;
                idSal = id;
            }

            System.out.println("\n*********************************");
            pessoa++;
        }

        //A
        System.out.println("A média dos salários do grupo: R$" + (somaSal / contadorSal));

        //B
        System.out.println("A maior idade do grupo: " + idMaior + " ano(s)");
        System.out.println("A menor idade do grupo: " + idMenor + " ano(s)");

        //C
        System.out.println("A quantidade de mulheres na região: " + contadorSexo + " mulher(es)");

        //D
        System.out.println("A idade da pessoa com o menor salário: " + idSal + " ano(s)");
        System.out.println("O sexo da pessoa com o menor salário: " + sexoSal);
    }
}