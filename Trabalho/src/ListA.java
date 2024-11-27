import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListA {
    private final List<Artista> artistas = new ArrayList<>();

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
        System.out.println("Artista adicionado: " + artista.getNome());
    }

    public void removerArtista(String nome) {
        Iterator<Artista> iterator = artistas.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Artista artista = iterator.next();
            if (artista.getNome().equalsIgnoreCase(nome.trim())) {
                iterator.remove();
                System.out.println("Artista removido: " + artista.getNome());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Artista não encontrado.");
        }
    }

    public void exibirListaArtista() {
        if (artistas.isEmpty()) {
            System.out.println("Nenhum artista cadastrado.");
        } else {
            System.out.println("Lista de Artistas:");
            artistas.forEach(System.out::println);
        }
    }
}