package avaliacao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.id = 23;
        musica1.titulo = "Contramão";
        musica1.artista = "Gustavo Mioto";
        musica1.duracaoSeg = 180;
        musica1.genero = "Sertanejo";

        Musica musica2 = new Musica(98, "Geladeira", "Gustavo Mioto", 190, "Sertanejo");

        Musica musica3 = new Musica(30, "Brechó", "Gustavo Mioto", 200, "Sertanejo");

        List<Musica> musicas = new ArrayList<>();
        musicas.add(musica1);
        musicas.add(musica2);
        musicas.add(musica3);

        Playlist playlist = new Playlist();

        playlist.id = 999;
        playlist.nome = "AS MELHORES: Gustavo Mioto";
        playlist.publica = true;
        playlist.totalMusicas = 3;
        playlist.duracaoTotalSeg = 570;
        playlist.dataCriacao = LocalDateTime.now();
        playlist.musicas = musicas;

        System.out.println("\n---------- Playlist ----------");
        System.out.println("\nID da Playlist: " + playlist.id);
        System.out.println("Estado da Playlist:" + playlist.publica);
        System.out.println("Total de músicas: " + playlist.totalMusicas);
        System.out.println("Data de criação: " + LocalDateTime.now());
        System.out.println("Duração total:" + playlist.duracaoTotalSeg);

        System.out.println("\n---------- Músicas ----------\n");

        for (Musica musica : playlist.musicas) {
            System.out.println("ID: " + musica.id);
            System.out.println("Título: " + musica.titulo);
            System.out.println("Artista: " + musica.artista);
            System.out.println("Duração em segundos: " + musica.duracaoSeg);
            System.out.println("Gênero: " + musica.genero + "\n");
        }

    }

}
