package Aula05_Ordenacao_BolaEIntercao;
public class TestaDiferença {

   public static void main(String args[]){
      int A[] = { 7, 2, 5, 8, 4},B[]= {4, 2, 9, 5};
      //int A[] = { 3, 9, 11, 2}, B[]= {2, 6, 1};
      boolean teste=true;
      
      System.out.println("resultado da interseccao="+diferenca(A,B));
   }
   public static String diferenca(int A[], int B[]){
      String resp="";
      // anda no vetor A
      for( int j=0; j < A.length;j++){
         // anda no vetor B
         for( int i = 0; i < B.length; i++ ){
            // se achei um elemento de A no vetor    
            if( A[j] != B[i])
               resp+=A[j]+ " ";
         }
      }
      return resp;
   }
}

