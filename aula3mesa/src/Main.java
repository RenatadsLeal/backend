import model.Estagiario;
import model.Funcionario;
import model.Vendedor;

public class Main {
    public static void main(String[] args) {
        Vendedor funcionario = new Funcionario("Lich");
        ((Funcionario)funcionario).setAnosEmpresa(8);
        funcionario.vender();
        funcionario.vender();
        funcionario.vender();

        Vendedor afiliado = ((Funcionario)funcionario).obterAfiliado("BMO");
        afiliado.vender();
        afiliado.vender();

        Vendedor estagiario = new Estagiario("Jake");
        estagiario.vender();

        funcionario.mostrarcategoria();
        afiliado.mostrarcategoria();
        estagiario.mostrarcategoria();
    }
}
