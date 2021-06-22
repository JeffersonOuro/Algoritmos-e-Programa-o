package Trabalho;

/*
Entrega do Trabalho 3- Algoritmos e Programação II
Eu,
nome: Jefferson alves do ouro
ID: 1141922278
declaro que
todas as respostas são fruto do meu próprio trabalho,
não copiei as respostas de colegas,
não disponibilizei as minhas respostas para outros colegas, e
não realizeis quaisquer outras atividades desonestas para me beneficiar ou
prejudicar outros.
 */
public class ExecuçãoMergesortQuicksort {

    public static void main(String[] args) {
        int v[] = {2, 2, 2, 7, 8};
        System.out.println("\nVetor Inicial:");
        Print(v);

        QuickSort(v, 0, v.length - 1);
        MergeSort(v, 0, v.length);

        System.out.println("\nVetor Final:");
        Print(v);

    }

    public static void MergeSort(int v[], int p, int n) {
        if (p < n - 1) {
            int q = (p + n) / 2;
            MergeSort(v, p, q);
            MergeSort(v, q, n);
            intercala(v, p, q, n);
        }
    }

    public static void QuickSort(int v[], int p, int r) {
        if (p < r) {
            int j = particao(v, p, r);
            QuickSort(v, p, j - 1);
            QuickSort(v, j + 1, r);
        }
    }

    public static int intercala(int v[], int p, int q, int n) {
        int w[] = new int[n - p];
        int i = p, j = q, k = 0;
        while (i < q && j < n) {
            if (v[i] < v[j]) {
                w[k++] = v[i++];
            } else {
                w[k++] = v[j++];
            }
        }
        while (i < q) {
            w[k++] = v[i++];
        }
        while (j < n) {
            w[k++] = v[j++];
        }
        for (i = p, k = 0; k < w.length; i++, k++) {
            v[i] = w[k];
        }
        return 0;
    }

    public static int particao(int v[], int p, int r) {
        int c = v[p];
        int i = p + 1, j = r;
        while (i <= j) {
            if (v[i] <= c) {
                i++;
            } else if (v[j] > c) {
                j--;
            } else {
                int temp;
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;

                i++;
                j--;
            }
        }
        v[p] = v[j];
        v[j] = c;
        return j;

    }

    public static void Print(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
