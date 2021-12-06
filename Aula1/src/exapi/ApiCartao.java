package exapi;

public class ApiCartao {

    private Double desconto;

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double checkDesconto(String banco){

        if(banco.equals("Star Bank")){
            this.setDesconto(20.00);
        }else{
            this.setDesconto(0.00);
        }

        return this.getDesconto();
    }
}
