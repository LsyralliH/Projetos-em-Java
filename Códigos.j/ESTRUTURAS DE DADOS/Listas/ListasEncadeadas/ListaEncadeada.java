package Listas.ListasEncadeadas;
import java.util.Scanner;


public class ListaEncadeada<T> { //O uso de generics (<T>) permite que a lista encadeada armazene qualquer tipo de dado.
    
    public class No {
        private T elemento;
        private No proximo =  null;

        No(T elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }      
    }

    private No inicio; //
    private No ultimoNo;
    private int tamanho = 0;

    public void adiciona(T elemento){

        No celula = new  No(elemento);

        if(this.tamanho == 0){
            this.inicio = celula;
        }else{
            this.ultimoNo.proximo = celula;
        }
        this.ultimoNo = celula;
        this.tamanho++;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void imprimeLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.elemento + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        
        int x = 0;

        for(int i = 0; i <10; i++){
            x = scan.nextInt();
            if(i%2!=0){
            lista.adiciona(i);
            }
        }
            System.out.println("LISTA ENCADEADA: ");
            lista.imprimeLista();
            System.out.println("Tamanho = " + lista.getTamanho());
    }
     
}



