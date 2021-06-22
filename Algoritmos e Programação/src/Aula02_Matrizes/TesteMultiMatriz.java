
package Aula02_Matrizes;


public class TesteMultiMatriz {
    public static void  main( String args[] ){
      int A[][] = {{10,20,30},
                   {10,20,30},
                   {10,20,30},
                   {10,20,30}};
      int B[][] = {{1,2},
                   {3,4},
                   {5,6}};
  

      int C[][] = MultMat(A,B);
      printMatrix(C);

   }
  /*
  Calcula a multiplicacao entre duas matriz
  Cmxp =  Amxn * Bnxp
  */
  public static int [ ][ ] MultMat(int A[][], int B[][]){
      int C[][]= new int[A.length][B[0].length];
      for( int i=0; i < A.length; i++){
         for( int j=0; j < B[0].length; j++){
            for( int k=0; k < A[0].length; k++)
               C[i][j] += A[i][k]*B[k][j];
         }
      }
      return C;
  }
  public static void printMatrix(int M[ ][ ]){
    
    for( int i=0; i < M.length; i++ ){
      for(int j=0;j<M[0].length;j++)
        System.out.print(M[i][j] +" ");
      System.out.println();
    }
  }
}
