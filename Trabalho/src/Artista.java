import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nome;
    private final List<Musica> discos = new ArrayList<>();
    private final List<Tipo> generos = new ArrayList<>();

    public Artista() {}

    public Artista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarDisco(Musica disco) {
        discos.add(disco);
    }

    public void adicionarGenero(Tipo genero) {
        generos.add(genero);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Artista: ").append(nome).append("\nDiscos: ");
        for (Musica disco : discos) {
            info.append(disco.getTitulo()).append(", ");
        }
        info.append("\nGêneros: ");
        for (Tipo genero : generos) {
            info.append(genero.getNome()).append(", ");
        }
        return info.toString().trim();
    }
}