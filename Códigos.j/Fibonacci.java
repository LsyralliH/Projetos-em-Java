


public class Fibonacci {
    public static void main(String[] args){

        System.out.println(Fibonacci.fibonacciRecursiva(6));
        
    }

    public static int fibonacciRecursiva(int f) {

            if (f<2) {
                return 1;
            }
            return fibonacciRecursiva(f-1)+ fibonacciRecursiva(f-2);
            
    }
    
}




/*public static int fibonacciNaoRecursiva (int f) {
        int[] soma= new int[20];
        

        for(int i = 1; i<=20; i++){
            
            if(i>=3){
            soma[i] = (f-1)+(f-2);
            }
            soma[i]=f;
            
            System.out.println("1 "+soma);
        }
        return soma[20];
    }*/



    /*public static int fibonacciNaoRecursiva (int f[]) {

        for(int i = f[20]; i<=f.length; i++){
           // int soma=0;
            
            if(i>=3){
            f[i] = (f[i]-1)+(f[i]-2);
            }
            f[i] =f[i];
            
            System.out.println("1 "+f[i]);
        }
        return f[20];
    }*/