
package Aula07_MergeSorte_E_QuickSort;

public class TestaMergesort {
    
  public static int passos=0;
  public static void  main( String args[] ){
     int v[]={4,7,2,3};
    
     //intercala(v,p,q,n);
     MergeSort(v, 0, v.length);

     System.out.print("v[]=");
     imprimeVetor(v);
  }
  public static void MergeSort( int v[], int p, int n){
      // soh chama o MergeSort se tiver mais de um elemento
      if( p<n-1){ // condicao de parada da recursao
         // particiona o vetor
        int q = (p+n)/2;
        // executa recursiva o MergeSort para o subvetor a esquerda
        MergeSort(v,p,q);
        // executa recursiva o MergeSort para o subvetor a direita
        MergeSort(v,q,n);
        // Conquista: faz-se a intercalação dos subvetores ordenados, 
        // produzindo a versão ordenada do vetor v[].
        intercala(v,p,q,n);
      }
  }
  public static void intercala(int v[], int p, int q, int n){
      int w[]=new int[n-p];
      int i=p, j=q, k=0;
      // para o while quando algum dos dois vetores acabar
      while(i < q && j<n){
         passos++;
         if(v[i]<v[j]){
            w[k++]=v[i++];
         }
         else{
            w[k++]=v[j++];
         }
      }
      // se resta algum elemento no vetor A copia para C
      while(i < q ){
         passos++;
         w[k++]=v[i++];
      }
      // se resta algum elemento no vetor B copia para C
      while(j < n){
         passos++;
         w[k++]=v[j++];
      }
      // copiar os elementos de w[] para v[]
      for( i=p,k=0; k<w.length;i++,k++)
         v[i]=w[k];
   }
   
   public static void imprimeVetor( int [] v )
   {
    
      for( int i=0; i < v.length; i++ )
         System.out.print(v[i]+" ");
      System.out.println();
   }

}