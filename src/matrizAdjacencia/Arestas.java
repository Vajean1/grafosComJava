package matrizAdjacencia;

public class Arestas {
    private Vertices origem;
    private Vertices destino;
    private int tipoDeAmizade;
    private int tempoAmizade;

    public Arestas(Vertices origem, Vertices destino, int tipoDeAmizade, int tempoAmizade) {

        if (origem == null || destino == null) {
            throw new IllegalArgumentException("Os vértices de origem e destino não podem ser nulos.");
        }
        if (tipoDeAmizade < 1 || tipoDeAmizade > 3) {
            throw new IllegalArgumentException("Tipo de amizade inválido. Deve ser 1, 2 ou 3.");
        }
        if (tempoAmizade < 0) {
            throw new IllegalArgumentException("O tempo de amizade não pode ser negativo.");
        }
        this.origem = origem;
        this.destino = destino;
        this.tipoDeAmizade = tipoDeAmizade;
        this.tempoAmizade = tempoAmizade;
    }
}
