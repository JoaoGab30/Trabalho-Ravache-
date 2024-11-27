public class Tipo {
    private String nomeG;

    public Tipo() {}

    public Tipo(String nomeG) {
        this.nomeG = nomeG;
    }

    public String getNome() {
        return nomeG;
    }

    public void setNome(String nomeG) {
        this.nomeG = nomeG;
    }

    @Override
    public String toString() {
        return "Gênero: " + nomeG;
    }
}