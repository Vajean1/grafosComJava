import matrizAdjacencia.GrafoMatrizAdjacencia;
import matrizAdjacencia.Vertices;

public class Main {
    public static void main(String[] args) {
        try {
            GrafoMatrizAdjacencia redeAmigos = new GrafoMatrizAdjacencia(6);

            Vertices p1 = new Vertices("Pessoa1");
            Vertices p2 = new Vertices("Pessoa2");
            Vertices p3 = new Vertices("Pessoa3");
            Vertices p4 = new Vertices("Pessoa4");
            Vertices p5 = new Vertices("Pessoa5");
            Vertices p6 = new Vertices("Pessoa6");

            redeAmigos.adicionarVertice(p1); // Índice 0
            redeAmigos.adicionarVertice(p2); // Índice 1
            redeAmigos.adicionarVertice(p3); // Índice 2
            redeAmigos.adicionarVertice(p4); // Índice 3
            redeAmigos.adicionarVertice(p5); // Índice 4
            redeAmigos.adicionarVertice(p6); // Índice 5

            redeAmigos.adicionarAresta(0, 1, 1, 5);
            redeAmigos.adicionarAresta(0, 2, 1, 3);
            redeAmigos.adicionarAresta(0, 5, 1, 2);
            redeAmigos.adicionarAresta(1, 2, 1, 4);
            redeAmigos.adicionarAresta(1, 3, 1, 6);
            redeAmigos.adicionarAresta(1, 4, 1, 1);
            redeAmigos.adicionarAresta(2, 3, 1, 7);
            redeAmigos.adicionarAresta(3, 4, 1, 8);
            redeAmigos.adicionarAresta(4, 5, 1, 3);

            System.out.println("Grafo Rede de Amigos");
            redeAmigos.imprimirMatriz();

            System.out.println("\nGrau de vertices:");
            System.out.println("Grau Pessoa3: " + p3.getGrau());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
