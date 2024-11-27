import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListD discos = new ListD();
        ListA artistas = new ListA();
        ListT generos = new ListT();
        int escolha;

        do {
            mostrarMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 : cadastrarDisco(scanner, discos); break;
                case 2 : cadastrarGenero(scanner, generos); break;
                case 3 : cadastrarArtista(scanner, discos, generos, artistas); break;
                case 4 : removerGenero(scanner, generos); break;
                case 5 : removerArtista(scanner, artistas); break;
                case 6 : removerDisco(scanner, discos); break;
                case 7 : discos.exibirListaDisco(); break;
                case 8 : artistas.exibirListaArtista(); break;
                case 9 : generos.exibirListaGenero(); break;
                case 10 : System.out.println("Encerrando programa..."); break;
                default : System.out.println("Opção inválida. Tente novamente."); break;
            }
        } while (escolha != 10);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Cadastrar Disco");
        System.out.println("2. Cadastrar Gênero");
        System.out.println("3. Cadastrar Artista");
        System.out.println("4. Remover Gênero");
        System.out.println("5. Remover Artista");
        System.out.println("6. Remover Disco");
        System.out.println("7. Exibir Discos");
        System.out.println("8. Exibir Artistas");
        System.out.println("9. Exibir Gêneros");
        System.out.println("10. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarDisco(Scanner scanner, ListD discos) {
        scanner.nextLine(); // limpar buffer
        Musica novoDisco = new Musica();
        System.out.print("Título do Disco: ");
        novoDisco.setTitulo(scanner.nextLine());
        System.out.print("Ano de Lançamento: ");
        novoDisco.setAnoLancamento(scanner.nextDouble());
        System.out.print("Quantidade de Faixas: ");
        novoDisco.setListaFaixas(scanner.nextDouble());
        discos.adicionarDisco(novoDisco);
    }

    private static void cadastrarGenero(Scanner scanner, ListT generos) {
        scanner.nextLine(); // limpar buffer
        Tipo novoGenero = new Tipo();
        System.out.print("Nome do Gênero: ");
        novoGenero.setNome(scanner.nextLine());
        generos.adicionarGeneros(novoGenero);
    }

    private static void cadastrarArtista(Scanner scanner, ListD discos, ListT generos, ListA artistas) {
        scanner.nextLine(); // limpar buffer
        Artista novoArtista = new Artista();
        System.out.print("Nome do Artista: ");
        novoArtista.setNome(scanner.nextLine());

        if (discos.getDiscos().isEmpty()) {
            System.out.println("Nenhum disco cadastrado. Cadastre discos antes de associar ao artista.");
            return;
        }

        System.out.println("Escolha um disco para o artista:");
        for (int i = 0; i < discos.getDiscos().size(); i++) {
            System.out.println((i + 1) + ". " + discos.getDiscos().get(i).getTitulo());
        }
        int escolhaDisco = scanner.nextInt();
        if (escolhaDisco < 1 || escolhaDisco > discos.getDiscos().size()) {
            System.out.println("Opção inválida.");
            return;
        }
        novoArtista.adicionarDisco(discos.getDiscos().get(escolhaDisco - 1));

        if (generos.getGeneros().isEmpty()) {
            System.out.println("Nenhum gênero cadastrado. Cadastre gêneros antes de associar ao artista.");
            return;
        }

        System.out.println("Escolha um gênero para o artista:");
        for (int i = 0; i < generos.getGeneros().size(); i++) {
            System.out.println((i + 1) + ". " + generos.getGeneros().get(i).getNome());
        }
        int escolhaGenero = scanner.nextInt();
        if (escolhaGenero < 1 || escolhaGenero > generos.getGeneros().size()) {
            System.out.println("Opção inválida.");
            return;
        }
        novoArtista.adicionarGenero(generos.getGeneros().get(escolhaGenero - 1));

        artistas.adicionarArtista(novoArtista);
    }

    private static void removerGenero(Scanner scanner, ListT generos) {
        scanner.nextLine(); // limpar buffer
        System.out.print("Nome do Gênero a ser removido: ");
        generos.removerGenero(scanner.nextLine());
    }

    private static void removerArtista(Scanner scanner, ListA artistas) {
        scanner.nextLine(); // limpar buffer
        System.out.print("Nome do Artista a ser removido: ");
        artistas.removerArtista(scanner.nextLine());
    }

    private static void removerDisco(Scanner scanner, ListD discos) {
        scanner.nextLine(); // limpar buffer
        System.out.print("Título do Disco a ser removido: ");
        discos.removerDisco(scanner.nextLine());
    }
}