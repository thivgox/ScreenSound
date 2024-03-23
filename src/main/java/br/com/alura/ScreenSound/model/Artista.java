package br.com.alura.ScreenSound.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="artistas")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String nome;
    @Enumerated(EnumType.STRING)
    private tipoArtista tipo;


    @OneToMany(mappedBy = "artista")
    private List<Musica> musicas = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public tipoArtista getTipo() {
        return tipo;
    }

    public void setTipo(tipoArtista tipo) {
        this.tipo = tipo;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return " Artista = "+ nome + '\'' +
                ", tipo = " + tipo +
                ", musicas = " + musicas;
    }
}
