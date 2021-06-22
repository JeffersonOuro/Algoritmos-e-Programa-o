
public class Quicksort {

    public static void main(String[] args) {
        int v[] = {2, 2, 2, 7, 8};
        
        System.out.println("\nVetor Inicial ");
        printaVetor(v);
        
        QuickSort(v, 0, v.length - 1); 
       
        System.out.println(" \nvetor rearranjado ");
        printaVetor(v);

    }

    public static void QuickSort(int v[], int p, int r) {     
        if (p < r) {
            int j = particao(v, p, r);
            QuickSort(v, p, j - 1);
            QuickSort(v, j + 1, r);
        }
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

                i++; j--;
            }
        }
        v[p] = v[j];
        v[j] = c;
        return j;

    }
public static void printaVetor(int v[]){
      for(int i=0;i<v.length;i++)
      System.out.print(v[i]+" ");
}

}
