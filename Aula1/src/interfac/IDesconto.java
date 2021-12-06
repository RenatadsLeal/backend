package interfac;

import modal.Cartao;
import modal.Produto;

public interface IDesconto {

    public Double calcularDesconto(Cartao cartao, Produto produto, Integer quantidade);
}
