package Introdução;
//3     1
import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Digite um nÃºmero entre 1 e 7, que correspondem aos dias da semana:");
        int dia = x.nextInt();

        switch (dia)
    {
        case 1:
            System.out.println("Domingo\n");
            break;
        case 2:
            System.out.println("Segunda-Feira\n");
            break;
        case 3:
            System.out.println("TerÃ§a-Feira\n");
            break;
        case 4:
            System.out.println("Quarta-Feira\n");
            break;
        case 5:
            System.out.println("Quinta-Feira\n");
            break;
        case 6:
            System.out.println("Sexta-Feira\n");
            break;
        case 7:
            System.out.println("SÃ¡bado\n");
            break;
        default:
            System.out.println("Entrada invÃ¡lida\n");
            break;
        }
        x.close();
    }
}


/* 
//6   2
public class Main {
    public static void main(String[] args) {

System.out.println("NÃºmeros pares entre 79 e 201:\n");

for(int i =79;i<=201;i++){
    if( i % 2==0){
        System.out.println(i);
    }
}
    }
}*/

/*
//7  3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

int num=0, resultado=0;

    do{
    Scanner j = new Scanner(System.in);
    System.out.println("Digite um nÃºmero inteiro entre 1 e 10:");
    num = j.nextInt();

    j.close();

    }while (num<1 || num>10);
    
    System.out.println("TABUADA DO " + num);
    for(int y =0; y<=10; y++){
        resultado=num*y;
        System.out.println(num + " x " + y +" = " + resultado);  
    }
}
}*/


/* 
//8   4
public class Main {
    public static void main(String[] args) {

System.out.println("NÃºmeros de 7 atÃ© 61:\n");

for(int i =7;i<=61;i++){
    System.out.println(i);
    
}
    }
}*/



/* 
//10   5
public class Main {
    public static void main(String[] args) {

int k=1;
    while(k<=11)
    {
        System.out.println( k + " - HELLO WORLD!");
        k++;
    }
}
}*/


/* 
//11   6  
public class Main {
    public static void main(String[] args) {

System.out.println("NÃºmeros de 1 atÃ© 50:\n");
    int z=1;
    while(z<=50){
        System.out.println(z);
            z++;
    }

    }
}*/

/* 
//12    7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

float w=1, nota=0, soma=0;
System.out.println("Digite 3 notas:");

while(w<=3){
    Scanner m = new Scanner(System.in);
    nota = m.nextFloat();
    soma+=nota;
    w++;
}

System.out.println("A mÃ©dia das trÃªs notas Ã©:" + soma/3);

    }
}*/



/* 
//13    8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

int num=0, y=0, resultado=0;

Scanner x = new Scanner(System.in);
System.out.println("Digite um nÃºmero:");
num = x.nextInt();

System.out.println("TABUADA DO " + num);
while (y<=10)
{
    resultado=num*y;
    System.out.println(num + " x " + y +" = " + resultado); 
    y++; 
}
    }
}*/




