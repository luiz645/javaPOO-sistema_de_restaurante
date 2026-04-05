package pasta7;

import java.util.ArrayList;

public class Carrinho {

    ArrayList<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
        System.out.println("Item adicionado!");
    }

    public void listar() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio!");
            return;
        }

        for (int i = 0; i < itens.size(); i++) {
            System.out.print(i + " - ");
            itens.get(i).exibir();
        }
    }

    public void remover(int index) {
        if (index >= 0 && index < itens.size()) {
            itens.remove(index);
            System.out.println("Item removido!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void editar(int index, Item novo) {
        if (index >= 0 && index < itens.size()) {
            itens.set(index, novo);
            System.out.println("Item atualizado!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public double total() {
        double soma = 0;
        for (Item i : itens) {
            soma += i.preco;
        }
        return soma;
    }
}
