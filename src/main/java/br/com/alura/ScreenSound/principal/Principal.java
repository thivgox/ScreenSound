package br.com.alura.ScreenSound.principal;

import java.util.Scanner;

public class Principal {


    private Scanner leitura = new Scanner(System.in);

    public void exibeMenu(){
    var opcao = -1;
        while (opcao != 9){
            
            var menu = """
                  
                    1-
                    2-
                    3-
                    4-
                    5- 
                                    
                                    
                    9 - Sair       
                    """;
            System.out.println(menu);
        
            opcao = leitura.nextInt();
            leitura.nextLine();
            
            
            switch (opcao){
                
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 9:
                    break;
            }
            
            
            
            
            
            
            
        }
        
        
    }


}
