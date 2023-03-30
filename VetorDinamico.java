public class VetorDinamico {
    private int [] elementos;
    private int quantidade;
    private int capacidade;
    public static final int LIMIAR_REDUCAO = 4;
    public VetorDinamico () {
        //ajustar a capacidade do VetorDinâmico
        capacidade = 4;
        elementos = new int [capacidade];
    }

    //escrever um método que responde se um determinado
    //elemento já existe na coleção
    public boolean existe (int elemento) {
        for(int i = 0; i<quantidade; i++) {
            if (elementos[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public boolean estaCheio () {
        return quantidade >= capacidade;
    }

    public boolean estaVazio () {
        return quantidade <= 0;
    }

    public void remover () {
        if(!estaVazio()) {
            quantidade--;
        }
        if (capacidade > LIMIAR_REDUCAO && quantidade <= capacidade / 4) {
            redimensionar(0.5);
        }
    }

    public void adicionar (int elemento) {
        if (estaCheio()) {
            redimensionar(2);
        }
        elementos[quantidade] = elemento;
        quantidade++;
        }

    private void redimensionar (double fatorRedimensionamento) {
        int [] aux = new int [(int) (capacidade * fatorRedimensionamento)];
        for (int i = 0; i < quantidade;) {
            aux[i] = elementos[i];
        }
        elementos = aux;
        capacidade = (int)(capacidade * fatorRedimensionamento);
    }

    public void exibir () {
        System.out.println("Quantidade: " + quantidade + ", Capacidade: " + capacidade);
        System.out.print("Elementos: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print (elementos[i] + " ");
        }
        System.out.println("");
    }
}