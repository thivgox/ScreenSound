package br.com.alura.ScreenSound.principal;

import br.com.alura.ScreenSound.model.Artista;
import br.com.alura.ScreenSound.model.Musica;
import br.com.alura.ScreenSound.model.TipoArtista;
import br.com.alura.ScreenSound.model.repository.ArtistaRepository;

import java.util.Optional;
import java.util.Scanner;



public class Principal {


    private final ArtistaRepository respositorio;
    private Scanner leitura = new Scanner(System.in);
    public Principal(ArtistaRepository repositorio){
        this.respositorio = repositorio;
    }

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
                    System.out.println("Encerrando a aplicação ");
                    break;

                default:
                    System.out.println("Opções Invalida");
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
        System.out.println("Cadastrar musica de qual artirsta");
        var nome = leitura.nextLine();
        Optional<Artista> artista = respositorio.findByNomeContainingIgnoreCase(nome);
        if (artista.isPresent()){
            System.out.println("informe a musica");
            var nomeMusica = leitura.nextLine();
            Musica musica = new Musica(nomeMusica);
            musica.setArtista(artista.get());
            respositorio.save(artista.get());
        } else {
            System.out.println("Artista não encontrado");
        }
    }

    private void cadastroArtista() {
        var cadastrarNovo = "S";

        while (cadastrarNovo.equalsIgnoreCase("S")) {
            System.out.println("inforeme o nome do artista");
            var nome = leitura.next();
            System.out.println("informe o tipo (solo, duplo ou banda)");
            var tipo = leitura.next();
            TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());
            Artista artista = new Artista(nome, tipoArtista);
            respositorio.save(artista);
            System.out.println("Cadastrar novo artista (S/N)");
            cadastrarNovo = leitura.nextLine();

        }
    }


}
