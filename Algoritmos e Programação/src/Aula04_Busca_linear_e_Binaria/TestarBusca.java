
package Aula04_Busca_linear_e_Binaria;
public class TestarBusca {
  
   public static int comparacoes = 0; // variavel global - NAO USEM
   public static void main(String args[]){
      //int v[] = {3,7,1,8,6,8,2,4};
      int v[]= new int [10];
      for( int i=0;i<v.length;i++)
         v[i]=i;
      System.out.println("resposta Busca Linear:"+buscaLinear(v,v.length));
      System.out.println("tamanho vetor="+v.length+" comparacoes:"+comparacoes);
   }
   public static int buscaLinear(int v[], int x) {
       for( int k=0; k < v.length; k++ ){
          comparacoes++;
          if( v[k] == x )
           return k;
       }
       return -1;
   }
}  

