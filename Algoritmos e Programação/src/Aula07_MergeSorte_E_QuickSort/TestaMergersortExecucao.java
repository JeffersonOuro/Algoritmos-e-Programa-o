
package Aula07_MergeSorte_E_QuickSort;


public class TestaMergersortExecucao {

    public static int intercala(int A[], int B[]) {
        int C[] = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
// para o while quando algum dos dois vetores acabar
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
// se resta algum elemento no vetor A copia para C
        while (i < A.length) {
            C[k++] = A[i++];
        }
// se resta algum elemento no vetor B copia para C
        while (j < B.length) {
            C[k++] = B[j++];
        }
        return 0;
    }

}
