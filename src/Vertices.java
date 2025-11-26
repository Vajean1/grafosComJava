public class Vertices {
    private int grau;
    private String nome_vertice;

    public Vertices(String nome_vertice) throws Exception {
        this.grau = 0;
        if (nome_vertice == null || nome_vertice.isEmpty()) {
            throw new IllegalArgumentException("O nome do vértice não pode ser nulo ou vazio.");
        }
        this.nome_vertice = nome_vertice;

    }
}
