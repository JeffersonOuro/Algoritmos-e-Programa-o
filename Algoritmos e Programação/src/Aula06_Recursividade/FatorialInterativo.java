package Aula06_Recursividade;

public class FatorialInterativo {
    
public static void  main( String args[] ){
  
    
    int resposta = fatorial( 3 );
   
    System.out.println("Fatorial calculado:"+resposta);
  
  }
  public static int fatorial( int n )
  {
    int fat = 1; 
    for( int termo = 1; termo <= n; termo++ ){
      fat = fat * termo;
    }
    return fat;

  }
  
}
