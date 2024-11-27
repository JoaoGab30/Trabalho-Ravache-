import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListT {
    private final List<Tipo> generos = new ArrayList<>();

    public List<Tipo> getGeneros() {
        return generos;
    }

    public void adicionarGeneros(Tipo genero) {
        generos.add(genero);
        System.out.println("Gênero adicionado: " + genero.getNome());
    }

    public void removerGenero(String nome) {
        Iterator<Tipo> iterator = generos.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Tipo genero = iterator.next();
            if (genero.getNome().equalsIgnoreCase(nome.trim())) {
                iterator.remove();
                System.out.println("Gênero removido: " + genero.getNome());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Gênero não encontrado.");
        }
    }

    public void exibirListaGenero() {
        if (generos.isEmpty()) {
            System.out.println("Nenhum gênero cadastrado.");
        } else {
            System.out.println("Lista de Gêneros:");
            generos.forEach(System.out::println);
        }
    }
}