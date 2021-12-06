import impl.ServiceDesconto;
import modal.Cartao;
import modal.Produto;

public class Main {
    public static void main(String[] args) {
        Cartao cartao = new Cartao("763786347856", "Itau");
        Produto produto = new Produto("Leite", "latas");

        ServiceDesconto service = new ServiceDesconto();

        System.out.println(service.calcularDesconto(cartao, produto, 13));
    }
}
