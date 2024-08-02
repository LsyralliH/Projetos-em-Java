package Listas.Aula;
/* */
class NumeroWrapper {
    int valor;

    NumeroWrapper(int valor) {
        this.valor = valor;
    }
}

public class atv1 {
    static int x = 20;
    

  static void Teste1 (int  numero){
    numero = numero + x;
    x++;
 }


  static int Teste2 (NumeroWrapper numero){
    int valor = 100;
    numero.valor = numero.valor + valor;
    x++;

    return numero.valor;
    
 }


  static int Teste3 (NumeroWrapper n){
    int valor = 200;
    n.valor =n.valor + valor;
    x--;

    return n.valor;
 }

 public static void main(String[] args) {
    int outroNumero, y =10, d;
    NumeroWrapper numero = new NumeroWrapper(10);

    Teste1(y);
    System.out.println("Valor de Número(após Teste1) = " + y);
    System.out.println("X = " + x);

    d = Teste2(numero);

    System.out.println("Valor de Número(após Teste2) = " + d);
    System.out.println("X = " + x);
    
    outroNumero = Teste3(numero);
    System.out.println("Valor de Número(após Teste3) = " + outroNumero);
    System.out.println("X = " + x);

    }
}
