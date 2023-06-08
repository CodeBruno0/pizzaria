package aplicacao;

import model.Pizza;

public class App {

    public static void main(String[] args) {
        Pizza pedido = new Pizza("Queijo", 30, 'p');

        System.out.println("Pizza criada!!");
        System.out.println(pedido.PedidoIfood());
    }
}
