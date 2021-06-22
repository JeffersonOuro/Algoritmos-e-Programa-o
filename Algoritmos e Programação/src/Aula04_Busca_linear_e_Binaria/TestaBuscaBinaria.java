
package Aula04_Busca_linear_e_Binaria;


public class TestaBuscaBinaria {
    public static int comparacoes = 0; // variavel global - NAO USEM
   public static void main(String args[]){
      //int v[] = {3,7,8,13,16,19,21,23};
      int v[]= new int [8];
      for( int i=0;i<v.length;i++)
         v[i]=i;
      System.out.println("resposta Busca Binaria:"+buscaBinaria(v,v.length));
      System.out.println("tamanho vetor="+v.length+" comparacoes:"+comparacoes);
   }
   public static int buscaBinaria( int v[], int x ){
       int i, m, f;
       i = 0; f = v.length-1;
       while (i <= f){
         comparacoes++;
         m = (i + f)/2; 
         if (v[m] == x) 
           return m;
         if (x < v[m]) // esquerda
           f = m - 1;
         else // x > v[m] - direita
           i = m + 1;
       }
       return -1;
  }

}
