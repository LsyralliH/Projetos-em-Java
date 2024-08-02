package Listas.Aula;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*2) Considere listas lineares sequenciais não ordenadas de inteiros não nulos. Faça um programa para

a) Construir duas listas sem repetição de dados Para isto, implemente uma função de nome inserirSemRepetir que receba como parámetros: o vetor de dados, o elemento a ser inserido, a quantidade de elementos no vetor e o tamanho maximo definido para o vetor

Note:
 - Deverão ser emitidas mensagens de erro adequadamente.
 - Será preciso fazer uma busca sequencial para evitar repetição de dados.
 - A função devera ser chamada repetidamente para criar cada uma das listas

b) Imprimir as listas criadas no item a, implementando uma função de nome listar (ou percorrer). conforme estudado em aula.

c) Intercalar as listas criadas, gerando uma terceira lista sequencial. Por exemplo, a 1ª lista possui os elementos 10, 34 e 5 e a 2º, lista possui os elementos 4, 7 e 9. A lista resultante será 10, 4,34,7.5
e 9.

d) Gerar uma lista que seja a interseção das listas do item a, como em interseção de conjuntos.

e) Imprimir as listas geradas nos itens ce d, usando a função listar (ou percorrer).

f) Gerar uma lista que seja a união das listas do item a e depois imprimi-la.

g) Remover um elemento da lista gerada no item f atraves do indice passado. Para isto, implemente uma função com o seguinte protótipo: void remover Peloindice(int [], int, int); Parâmetros:
vetor de elementos quantidade de elementos no vetor indice do valor a ser removido.

Após a leitura do indice, verifique sua validade. Caso não seja válido, emita mensagem de erro na main, caso contrário chame a função para realizar a remoção */



import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*
Grupo:
Laís Hillary Santos de Miranda
Gabriel Luiz Barata
João Guilherme Sanches Brito
Paulo Avelino Neves Araujo
 */

public class Q2 {
    static int tamMaximo = 3;

    public static void inserirSemRepetir (List<Integer> list, int valor, int qtdElementos, int tamMaximo){
        if(qtdElementos>tamMaximo){
            System.out.println("Elemento não iserido na lista (Execedeu o tamanho)");
            return;
        }else if(list.contains(valor)){
            System.out.println("Esse elemento já foi inserido.");
            return;
        }else{
            list.add(valor);
        }
    }

    public static void Listar(List<Integer> list){
        for (int elemento : list){
            System.out.println("Elemento: " + elemento);
        }
    }


    public static void Ambas(List<Integer> list1, List<Integer> list2) {
        int maxSize = Math.max(list1.size(), list2.size());
        System.out.println("Elementos de cada lista:");
        for (int i = 0; i < maxSize; i++) {
            String elemento1 = (i < list1.size()) ? String.valueOf(list1.get(i)) : "N/A";
            String elemento2 = (i < list2.size()) ? String.valueOf(list2.get(i)) : "N/A";
            System.out.println("Lista 1: " + elemento1 + " | Lista 2: " + elemento2);
        }
    }

    public static List<Integer> Intersecao(List<Integer> list1, List<Integer> list2){
        List<Integer>intersecao= new ArrayList<>(list1);
        intersecao.retainAll(list2);
        System.out.println("Elementos em comum entre as listas:");
        for (int elemento : intersecao){
            System.out.println("Elemento: " + elemento);
        }
        return intersecao;
    }

    public static List<Integer> concatenarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaConcatenada = new ArrayList<>(lista1);
        listaConcatenada.addAll(lista2);
        return listaConcatenada;
    }

    public static List<Integer> intercalarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaIntercalada = new ArrayList<>();
        int maxSize = Math.max(lista1.size(), lista2.size());
        for (int i = 0; i < maxSize; i++) {
            if (i < lista1.size()) {
                listaIntercalada.add(lista1.get(i));
            }
            if (i < lista2.size()) {
                listaIntercalada.add(lista2.get(i));
            }
        }
        return listaIntercalada;
    }

    public static void removerPeloIndice(List<Integer> list, int i) {
        if (i < 0 || i >= list.size()) {
            System.out.println("Índice inválido.");
        } else {
            list.remove(i);
            System.out.println("Lista Intercalada sem o elemento removido:");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int elemento;
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        System.out.println("LISTA 1");
        System.out.println("Digite os numeros que deseja adicionar a lista: ");
        for(i =0; i<tamMaximo; i++){
            System.out.println("Elemento " + (i+1) + ": ");
            elemento = scan.nextInt();
            inserirSemRepetir(lista1, elemento, i, tamMaximo);

        }

        System.out.println("LISTA 2");
        System.out.println("Digite os numeros que deseja adicionar a lista: ");
        for(i =0; i<tamMaximo; i++){
            System.out.println("Elemento " + (i+1) + ": ");
            elemento = scan.nextInt();
            inserirSemRepetir(lista2, elemento, i, tamMaximo);
        }

        System.out.println("--------------------------------\n");

        System.out.println("LISTA 1:"); //B
        System.out.println(lista1);

        System.out.println("--------------------------------\n");

        System.out.println("LISTA 2:"); //B
        System.out.println(lista2);

        System.out.println("--------------------------------\n");

        System.out.println("LISTAS INTERCALADAS:"); //C
        List<Integer> listaIntercalada = intercalarListas(lista1, lista2);
        Listar(listaIntercalada);

        System.out.println("--------------------------------\n");

        System.out.println("INTERSECÇÃO");//D
        Intersecao(lista1, lista2);

        System.out.println("--------------------------------\n");

        System.out.println("LISTAS INTERCALADAS + INTERSECÇÃO :"); //E
        List<Integer> INTERCALADASINTERSECÇÃO = intercalarListas(listaIntercalada,Intersecao(lista1, lista2));
        Listar(INTERCALADASINTERSECÇÃO);

        System.out.println("------------------------------\n");


        System.out.println("REMOVER ELEMENTO PELO ÍNDICE DA LISTA INTERCALADA:");
        System.out.println("Digite o índice do elemento a ser removido:");
        int indice = scan.nextInt();
        removerPeloIndice(listaIntercalada, indice);
        Listar(listaIntercalada);
    }

}