import java.util.Random;
public class TesteAdicaoComRedimensionamento {
    public static void main(String[] args) throws Exception {
        VetorDinamico v = new VetorDinamico();
        Random gerador = new Random();
        while (true) {
            int n = gerador.nextInt(10) + 1;
            v.adicionar(n);
            v.exibir();
            System.out.println("***********************");
            Thread.sleep(2000);
        }
    }
}
