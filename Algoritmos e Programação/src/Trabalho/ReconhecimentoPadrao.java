package Trabalho;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 Entrega de trabalho
Nós,
 
Gustavo Henrique Braga
Jeffernson Alves do Ouro
 
declaramos que
 
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos à equipe e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
 */


/**
 *
 * @author Tinho
 */
public class ReconhecimentoPadrao {
    public static void main(String[] args) {
        try{
            FileInputStream arquivo = new FileInputStream("entradaM.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            String linha , mlinha[];
            int a[][] = new int [5][5];
            int linhas = 0, colunas = 0;
            
           
            int ler [] = new int [25];
            
            
            do{
                linha = buffer.readLine();
               
                if( linha != null){
                    String [] palavras = linha.split(" ");
                    
                    System.out.println("nova linha -----------------------");
                    for (int i = 0; i < palavras.length; i++) {
                        ler[i]= Integer.parseInt(palavras[i]);
                        System.out.println(linha);
                        
                        a[linhas][colunas] = ler[i];
                        linhas++; colunas++;
                    }
                    
                    
                }
                
            }while(linha != null);
            
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println("");
            }
            
        }
        catch(Exception e){
            System.out.println("erro de leitura");
        }
        
        
    }
    
}

    

