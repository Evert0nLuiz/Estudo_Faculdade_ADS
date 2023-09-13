package pizzaria;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Cliente cliente = new Cliente();

        Pedido pedido = new Pedido();

        Item item = new Item();
        int quantItens;

        ui.apresentarPrograma();

       cliente.setNome(ui.pedirTexto("Informe o nome do cliente: "));
       ui.pularLinha();
       cliente.setEndereco(ui.pedirTexto("Informe o endereço do cliente: "));
       ui.pularLinha();
       cliente.setTelefone(ui.pedirTexto("Informe o telefone do cliente: "));


    }





}
