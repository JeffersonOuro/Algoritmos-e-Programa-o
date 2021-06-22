
package Aula05_Ordenacao_BolaEIntercao;

public class testeInsereOrdenado {
    public static void main (String []args){
       int []v = {2,5,7,8,9,11,13,17,0};
       InsereOrdenado(v,7);
       imprimeVetor(v);  
    }

    public static void InsereOrdenado(int[] v, int x) {
        int i=v.length-1;
        while (x < v[i-1]){
            v[i]=v[i-1];
            i--;
        }
            v[i]=x;
    }
    public static void imprimeVetor(int [] x){
        
    
    
    }

    
    
    
    
    
}