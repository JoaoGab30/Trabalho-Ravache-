public class Musica {
    private String titulo;
    private double anoLancamento;
    private double listaFaixas;

    public Musica() {}

    public Musica(String titulo, double anoLancamento, double listaFaixas) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.listaFaixas = listaFaixas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(double anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getListaFaixas() {
        return listaFaixas;
    }

    public void setListaFaixas(double listaFaixas) {
        this.listaFaixas = listaFaixas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAno de Lançamento: " + anoLancamento + "\nFaixas: " + listaFaixas;
    }
}
