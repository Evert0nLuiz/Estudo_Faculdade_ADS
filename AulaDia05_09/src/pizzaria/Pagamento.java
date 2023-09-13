package pizzaria;

public class Pagamento {
    public Comprovante Pagamento(Pedido pedido){
        Comprovante comprovante = new Comprovante();

        comprovante.setCliente(pedido.getCliente());
        comprovante.setItens(pedido.getItens());
        comprovante.setCodigo( gerarCodigo());
        comprovante.setTotal(calcularTotal(pedido));
        return comprovante;


    }

    private double calcularTotal(Pedido pedido){
        double total = 0;
        for(Item itens : pedido.getItens()){
            total += itens.getPreco();

        }
        return total;
    }
    private int gerarCodigo(){

        return (int) Math.random()*999;
    }


}
