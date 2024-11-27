import java.util.ArrayList;
import java.util.List;

public class ListD {
    private final List<Musica> discos = new ArrayList<>();

    public List<Musica> getDiscos() {
        return discos;
    }

    public void adicionarDisco(Musica disco) {
        discos.add(disco);
        System.out.println("Disco adicionado: " + disco.getTitulo());
    }

    public void removerDisco(String titulo) {
        discos.removeIf(disco -> disco.getTitulo().equalsIgnoreCase(titulo.trim()));
        System.out.println("Disco removido: " + titulo);
    }

    public void exibirListaDisco() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco cadastrado.");
        } else {
            discos.forEach(System.out::println);
        }
    }
}
