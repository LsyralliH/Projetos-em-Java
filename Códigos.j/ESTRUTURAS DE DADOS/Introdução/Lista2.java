package Introdução;
//GRUPO II
//2
/*public class Lista1004 {
    public static void main(String[] args) {
        
        int x=0;
        while(x<=127){

            int dec = x;
            System.out.println("\nHEXADECIMAL     DECIMAL      CARACTER");
            char xx = (char)x;
            System.out.println("   " + "            " + hexa(x)+ "           "+xx );

                x++;
        }
    }

    public static double hexa(int x) {
        int[] resto = new int[10];
        int i = 0;
        double n = x;
        while (n != 0) {
            resto[i] = (int) (n % 16);
            n = n / 16;
            if ((int) n == 0) {
                break;
            }
            i++;
        }
        for (int j = i; j >= 0; j--) {
            System.out.print(resto[j]);
        }
        return x;
    }
}*/

//5
/* 
import java.util.Scanner;
public class Lista1004 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        
        double x=1, nota1=0, nota2=0, media=0;
        int aluno =1;

        while (nota1 != 50) {
            System.out.println("\nAluno " + aluno);
            
            do{
        
                System.out.println("Digite a nota da prova 1:");
                nota1 = scann.nextDouble();

                if (nota1==50) {
                    break;
                }

                }while(nota1<0 || nota1>10);

                if (nota1==50) {
                    break;
                }

                do{
                System.out.println("Digite a nota da prova 2:");
                nota2 = scann.nextDouble();
                }while(nota2<0 || nota2>10);

                media = (nota1+nota2)/2;
                System.out.println("A média do aluno " + aluno +" é: " + media);
               
                aluno++;
            
        }
        
        System.out.println("\nPROGRAMA ENCERRADO");
    
    }
}*/

//GRUPO III

//1


//GRUPO IV

//1

//2

/*import java.util.Scanner;
public class Lista1004 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 0;

        System.out.println("Digite um número:");
        x = scan.nextInt();

       int resultado = fatorial(x);
       int resultado2 = fatorial2(x);

        System.out.println("O fatorial por Laço de Repetição é: " + x + " é: " + resultado);
        System.out.println("O fatorial por Recursão é: " + x + " é: " + resultado2);
        scan.close();
    }

//FUNÇÃO DE FATORIAL COM LAÇO DE REPETIÇÃO
public static int fatorial (int x){

    int  fac = 1;
    for (int i =1; i<=x; i++){
        fac *= i;
    }
    return fac;
}


//FUNÇÃO DE FATORIAL COM RECURSÃO
public static int fatorial2 (int x){
    if(x==0){
        return 1;
    }
        return x * fatorial2(x-1);
    }

}*/


//3
/* 
import java.util.Scanner;
public class Lista1004 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x = 0, y=0;

        System.out.println("Digite um número para o exponencial:");
        x = scan.nextDouble();

        System.out.println("Digite o valor do termo:");
        y = scan.nextInt();
        

        double resultado = exponencial(x, y);
        

        System.out.println("O exponencial de " + x + "é: "+ resultado);

        scan.close();
    }


    //FUNÇÃO DE EXPONENCIAL
    public static double exponencial (double x , double y){

        double t = 1;
        for (int i= 1; i<=y; i++){
            t*= x/i;
            t+=t;

        }
        return t;

    }
}*/

//4
/* 
import java.util.Scanner;

public class Lista1004{
    public static void main (String[] args){
        double x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o total gasto?");
        x = scan.nextDouble();

        FormasdePagamento(x, scan);

    }
    public static double FormasdePagamento(double x, Scanner scan){
        
        System.out.println("FORMAS DE PAGAMENTO:");

        System.out.println("1 - A vista com 10% de desconto");
        System.out.println("2 - Em duas vezes(preço da etiqueta)");
        System.out.println("3 - De 3 até 10 vezes com 3% de juros ao mês(somente para compras acima de R$100,00)");

        int pagamento=0;

        
        do{
        System.out.println("\nEscola a forma de pagamento (1-2-3):");
        pagamento =  scan.nextInt();
        }while(x<=100 && pagamento==3);

        double opcao=0;

        if (pagamento==1) {
            opcao = opcao1(x);
        }else if (pagamento==2){
            opcao = opcao2(x);
        }else if (pagamento==3) {
            opcao = opcao3(x, scan);        
        }    

        return opcao;
    }


    public static double opcao1 (double x){

        double avista = x - (0.10*x);

        System.out.println("\nValor a ser pago: R$" + avista);
        return avista;
    
    }


    public static double opcao2(double x){
        
        double duasVezes = (x/2);

        System.out.println("\nValor a ser pago:\n2X de R$" + duasVezes);
        return duasVezes;
    
    }


    public static double opcao3 (double x, Scanner scan){

        double parcela =0;
        int vezes=0;

        do{
        System.out.println("\nEscolha a quantidade de vezes que deseja dividir (3 à 10), com 3% de juros a cada mês:");
        vezes = scan.nextInt();
        }while(vezes<3 || vezes>10);

                x= x/vezes;
                parcela = x +(0.03*x);

                System.out.println("\nValor a ser pago:\n" + vezes+"X " + "de R$" + parcela);
                
                return x;
            }
        }
*/