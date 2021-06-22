
public class mergesort {
    
 public static void main(String[] args) {
        int v[] = {2, 2, 2, 7, 8};
        MergeSort(v, 0, v.length);
        for( int i=0; i < v.length; i++ )
        System.out.print(v[i]+" ");
 }

public static void MergeSort( int v[], int p, int n){
      if( p<n-1){
        int q = (p+n)/2;      
        MergeSort(v,p,q);   
        MergeSort(v,q,n);      
        intercala(v,p,q,n);
      }
  }
  public static int intercala(int v[], int p, int q, int n){
     int w[]=new int[n-p];
      int i=p, j=q, k=0;
      while(i < q && j<n){  
         if(v[i]<v[j]){
            w[k++]=v[i++];
         }
         else{
            w[k++]=v[j++];
         }
      } 
      while(i < q ){
         w[k++]=v[i++];
      }
      while(j < n){
         w[k++]=v[j++];
      }
      for( i=p,k=0; k<w.length;i++,k++)
         v[i]=w[k];
     return q;
   }











}
