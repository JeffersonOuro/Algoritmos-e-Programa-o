package Aula02_Matrizes;

public class ExemploMatriz {
        public static void main(String args[]) {
            int Mat[][];

            Mat = generateMatrix(4, 5);
            printMatrix(Mat);

        }

        /*
  função que receba a quantidade de linhas(lin) e de colunas(col) e devolva uma matriz de 
  dimensão lin x col contendo números inteiros aleatórios entre 0 e 100. 
         */
        public static int[][] generateMatrix(int lin, int col) {

            int M[][] = new int[lin][col];

            for (int i = 0; i < lin; i++) {
                for (int j = 0; j < col; j++) {
                    M[i][j] = (int) (Math.random() * 1000); // gera numeros aleatorios entre 0 e 100
                }
            }
            return M;
        }

        /*
  imprime a matriz
         */
        public static void printMatrix(int M[][]) {

            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[0].length; j++) //System.out.println("M["+i+"]["+j+"]:"+M[i][j]);
                {
                    System.out.printf("%03d  ", M[i][j]);
                }

                System.out.println();
            }
        }
}