package matrizAdjacencia;

import java.util.ArrayList;
import java.util.List;

public class GrafoMatrizAdjacencia {
    private List<Vertices> vertices = new ArrayList<>();

    private Arestas[][] matrizAdjacencia;

    public GrafoMatrizAdjacencia(int qtdVertices) {
        if (qtdVertices <= 0) {
            throw new IllegalArgumentException("A capacidade do grafo deve ser maior que zero.");
        }
        this.matrizAdjacencia = new Arestas[qtdVertices][qtdVertices];
    }

    public void adicionarVertice(Vertices vertice) throws Exception {
        if (vertice == null) {
            throw new IllegalArgumentException("O vértice não pode ser nulo.");
        }
        if (vertices.size() >= matrizAdjacencia.length) {
            throw new Exception("Capacidade máxima de vértices atingida.");
        }
        vertices.add(vertice);
    }

    public void adicionarAresta(int indiceOrigem, int indiceDestino, int tipoDeAmizade, int tempoAmizade) {
        try {

            boolean novaAmizade = matrizAdjacencia[indiceOrigem][indiceDestino] == null;

            Vertices verticeUm = vertices.get(indiceOrigem);
            Vertices verticeDois = vertices.get(indiceDestino);

            Arestas aresta = new Arestas(verticeUm, verticeDois, tipoDeAmizade, tempoAmizade);

            matrizAdjacencia[indiceOrigem][indiceDestino] = aresta;

            Arestas arestaInversa = new Arestas(verticeDois, verticeUm, tipoDeAmizade, tempoAmizade);

            matrizAdjacencia[indiceDestino][indiceOrigem] = arestaInversa;

            if (novaAmizade) {
                verticeUm.incrementarGrau();
                verticeDois.incrementarGrau();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void imprimirMatriz() {
        System.out.println("\nMatriz de Adjacência");

        System.out.print("      ");
        for (Vertices v : vertices) {
            System.out.printf("%-6s ", v.getNome_vertice());
        }
        System.out.println();

        for (int i = 0; i < vertices.size(); i++) {
            System.out.printf("%-6s ", vertices.get(i).getNome_vertice());
            for (int j = 0; j < vertices.size(); j++) {
                if (matrizAdjacencia[i][j] != null) {
                    System.out.print("    1   ");
                } else {
                    System.out.print("    0   ");
                }
            }
            System.out.println();
        }
    }
}
