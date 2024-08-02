package Introdução;
import java.util.Scanner;

public class funcionarios{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double sal_total=0, sal_liquido=0;
        int funcionario=1, contador=0, contador1=0;

        do {
            System.out.println("\n*******************************");
            System.out.println("FUNCIONÁRIO " + funcionario + "\n");
            System.out.println("Digite sua salário bruto");
            double sal_bruto = scan.nextDouble();

            System.out.println("Informe a quantidade de dependentes da sua familía");
            int dependentes = scan.nextInt();
           

            System.out.println("Você é um vendedor?");
            System.out.println("1- SIM\t2- NÃO");
            int vendedor = scan.nextInt();

            if(contador<2){
                if (vendedor == 1) {
                    sal_bruto = 1412;
                    sal_total = ((0.02 * sal_bruto) * dependentes) + sal_bruto;
                    contador++;
                    if (dependentes > 5) {
                        sal_total = ((0.02 * sal_bruto) * 5) + sal_bruto;
                        contador++;
                    }
                } else{
                    sal_total = ((0.02 * sal_bruto) * dependentes) + sal_bruto;

                    if (dependentes > 5) {
                    sal_total = ((0.02 * sal_bruto) * 5) + sal_bruto;}
                }
            }else{
                sal_total = ((0.02 * sal_bruto) * dependentes) + sal_bruto;

                if (dependentes > 5) {
                sal_total = ((0.02 * sal_bruto) * 5) + sal_bruto;}
            }


            System.out.println("Você recebe pensão?");
            System.out.println("1- SIM\t2- NÃO");
            int pensao = scan.nextInt();

           if (contador1<1 && pensao==1){
                   sal_total -= (sal_bruto*0.2);
                   contador1++;
                }

            if (contador<2 && vendedor == 1) {
                sal_liquido = ((4*(5.20 * 2) * 6)) + (4*(15 * 6)) + sal_total;
            } else {
                sal_liquido = ((4*(5.20 * 2) * 5)) + (4*(15 * 5)) + sal_total;
            }

            System.out.println("\nO salário liquido do funcionário " + funcionario + " é R$" + sal_liquido);

            funcionario++;

        }while (funcionario<=4);

        System.out.println("\nPROGRAMA ENCERRADO");

        scan.close();
    }
}



