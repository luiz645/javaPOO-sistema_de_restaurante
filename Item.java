package pasta7;

public class Item {
    String nome;
    double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibir() {
        System.out.println(nome + " - R$ " + preco);
    }
}
