package exapi;

public class ApiQuantidade {

    private Double desconto;

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double checkDesconto(Integer quantidade){

        if(quantidade > 12){
            this.setDesconto(15.00);
        }else{
            this.setDesconto(0.00);
        }
        return this.getDesconto();
    }
}
