package Introdução;

//GRUPO I

/*
//1
import java.util.Scanner;
public class Lista2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x;
        System.out.println("Digite um valor em metros:");
        x = scan.nextDouble();


        System.out.println("Valor em decimetros: " + (x*10) +"dm");
        System.out.println("Valor em centimetros: " + (x*100) +"cm");
        System.out.println("Valor em milimetros: " + (x*1000) +"mm");

    }
}
*/


/* 
//2
public class Lista2 {
    public static void main(String[] args) {
       
        for (int i = 1; i <= 9; i++){
            System.out.println("\nTABUADA DO " + i);
            for(int j = 0; j<=10; j++){
                System.out.println(i +"x"+ j + "=" + i*j);
            }
        }

    }
}
*/


/* 
//3
import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        double n;
        int[] resto = new int[10];
        int i =0;
        System.out.println("Digite um número");
        n = scann.nextDouble();

        while (n != 0) {
            resto[i] = (int) (n % 16);
            
            n = n / 16;

            if ((int) n == 0) {
                break;
            }

            i++;
        }


        System.out.print("Hexadecimal:");
        for(int j = i; j>=0; j--){

                System.out.print(resto[j]);
            }
            

            System.out.println("\n");
            
            i = 0;
            System.out.println("Digite um número");
            n = scann.nextDouble();

            while (n != 0) {
                    resto[i] = (int) (n % 8);
                    
                    n = n / 8;
        
                    if ((int) n == 0) {
                        break;
                    }
        
                    i++;
                }

                System.out.print("Octadecimal:");
                for(int j = i; j>=0; j--){
    
                    System.out.print(resto[j]);
                }
            }
            
            

    }

*/

/*
//4
import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double fah, cel;

        System.out.println("Qual a temperatura em Fahrenheit?");
        fah = scan.nextDouble();

        cel = (int) ((int)(fah-32.0)*(5.0/9.0));
        System.out.println("Temperatura em Celsius: " + cel + "°C");


    }
}

*/


/* 

//5
import java.util.Scanner;


public class Lista2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            double n1, n2, raiz, seno, mod;
            System.out.println("Digite um numero:");
            n1=scan.nextDouble();

        System.out.println("Digite outro numero:");
        n2=scan.nextDouble();

            //A
            System.out.println("A soma dos numeros: "+ (n1+n2));

            //B
            System.out.println("O produto do primeiro numero pelo quadrado do segundo: "+ (n1*(n2*n2)));

            //C
            System.out.println("O quadrado do primeiro numero: "+ (n1*n1));

            raiz = Math.sqrt((n1*n1)+(n2*n2));

            //D
            System.out.println("A raiz quadrada da soma dos quadrados: " + raiz);

            seno = Math.sin(n1-n2);

            //E
            System.out.println("O seno da diferença do primeiro numero pelo segundo: " + seno);

            mod = Math.abs(n1);

            //F
            System.out.println("O modulo do primeiro numero: " + mod);


        }
    }

*/


//GRUPO II

/* 
//1
import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        double v1, v2;

        System.out.println("Digite um valor:");
        v1 = scann.nextDouble();

        System.out.println("Digite um valor:");
        v2 = scann.nextDouble();

        if(v1>v2){
            System.out.println("\n" + v1);
            System.out.println(v2);
        }
        else if(v1<v2){
            System.out.println("\n" + v2);
            System.out.println(v1);
        }
        else{
            System.out.println("Valores iguais");
        }

    }
}
*/

/*
//3
import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        double preco;

        System.out.println("Digite o preço de um produto:");
        preco = scann.nextDouble();

        if (preco<100) {
            System.out.println("Preço inflacionado: R$" + ((preco*0.1)+preco));
        }
        else if (preco>=100) {
            System.out.println("Preço inflacionado: R$" + ((preco*0.2)+preco));
            
        }
        else{
            System.out.println("Preço: R$" );
        }

    }
}
*/


/* 
//4
import java.util.Scanner;
public class Lista2 {
    public static void main(String[] args) {
        double v1=0, v2=0;
        char operador;
        Scanner scan = new Scanner(System.in);

        System.out.println("MENU DOS OPERADORES:");
        System.out.println(" '+' - Soma");
        System.out.println(" '-' - Subtração");
        System.out.println(" '*' - Multiplicação");
        System.out.println(" '/' - Divisão\n");

        System.out.println("Escolha um desses operadores:");
        operador = scan.next().charAt(0);

        System.out.println("Digite um número: ");
        v1= scan.nextDouble();
        System.out.println("Digite um segundo número:");
        v2= scan.nextDouble();

        switch (operador) {
            case '+':
                System.out.println(v1 + " + " + v2 + " = " + (v1+v2));
                break;

            case '-':
            System.out.println(v1 +  " - " + v2 + "=" + (v1-v2));
                break;

            case '*':
            System.out.println(v1 +  " * " + v2+ " = " + (v1*v2));
                break;

            case '/':
            System.out.println(v1 +  " / " + v2 + " = " + (v1/v2));
                break;
        
            default:
                break;
        }
    }
}
*/


//5
/* 
import java.util.Scanner;
public class Lista2 {
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

/*
import java.util.Scanner;
public class Lista2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x = 0, y=0;

        System.out.println("Digite um número:");
        x = scan.nextDouble();

        System.out.println("Digite o valor da potência do número:");
        y = scan.nextInt();

        double resultado = potência(x, y);
        

        System.out.println(x + " elevado a potência de " + y + " é: " +resultado);

        scan.close();
    }


    //FUNÇÃO DE POTÊNCIA
    public static double potência (double x , double y){

        double p = 1;
        for (int i= 1; i<=y; i++){
            p*=x;

        }
        return p;

    }
}*/



//2
/*
import java.util.Scanner;
public class Lista2 {
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



//4
/* 
import java.util.Scanner;

public class Lista2{
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




