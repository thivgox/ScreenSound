package br.com.alura.ScreenSound.principal;

import java.util.Scanner;

public class Principal {


    private Scanner leitura = new Scanner(System.in);

    public void exibeMenu(){
    var opcao = -1;
        while (opcao != 9){
            
            var menu = """
                  
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                    5- Pesquisar dados sobre um artista
                                    
                                    
                    9 - Sair       
                    """;
            System.out.println(menu);
        
            opcao = leitura.nextInt();
            leitura.nextLine();
            
            
            switch (opcao){
                
                case 1:
                    cadastroArtista();
                    break;

                case 2:
                    cadastroMusica();
                    break;

                case 3:
                    listaMusica();
                    break;

                case 4:
                    buscaMusicaPorArtista();
                    break;

                case 5:
                    dadosArtista();
                    break;

                case 9:
                    break;
            }
            
            
            
            
            
            
            
        }
        
        
    }

    private void dadosArtista() {
    }

    private void buscaMusicaPorArtista() {
        
    }

    private void listaMusica() {
    }

    private void cadastroMusica() {
    }

    private void cadastroArtista() {
        
    }


}
