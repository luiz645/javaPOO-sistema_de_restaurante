package pasta7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        int opcaoLogin;

        
        do {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Login");
            System.out.println("0 - Sair");
            opcaoLogin = sc.nextInt();

            if (opcaoLogin == 1) {
                System.out.print("Usuário: ");
                String user = sc.next();

                System.out.print("Senha (1-50): ");
                int senha = sc.nextInt();

                Login novo = new Login(user, senha);
                novo.cadastrar();
            }

            if (opcaoLogin == 2) {
                System.out.print("Usuário: ");
                String user = sc.next();

                System.out.print("Senha: ");
                int senha = sc.nextInt();

                if (Login.autenticar(user, senha)) {
                    System.out.println("Login realizado!");

                    int opcao;

                    // 🛒 MENU PRINCIPAL
                    do {
                        System.out.println("\n===== MENU =====");
                        System.out.println("1 - Ver cardápio");
                        System.out.println("2 - Adicionar item");
                        System.out.println("3 - Ver carrinho");
                        System.out.println("4 - Editar item");
                        System.out.println("5 - Remover item");
                        System.out.println("6 - Total");
                        System.out.println("0 - Sair");

                        opcao = sc.nextInt();

                        switch (opcao) {

                            case 1:
                                System.out.println(" Cachorro-Quente - R$10");
                                System.out.println(" Sushi - R$30");
                                System.out.println(" Pizza - R$40");
                                System.out.println(" Baguncinha - R$20");
                                break;

                            case 2:
                                System.out.println("Escolha:");
                                System.out.println("1- Cachorro-Quente");
                                System.out.println("2- Sushi");
                                System.out.println("3- Pizza");
                                System.out.println("4- Baguncinha");

                                int escolha = sc.nextInt();

                                switch (escolha) {
                                    case 1: carrinho.adicionar(new Item("Cachorro-Quente", 10)); break;
                                    case 2: carrinho.adicionar(new Item("Sushi", 30)); break;
                                    case 3: carrinho.adicionar(new Item("Pizza", 40)); break;
                                    case 4: carrinho.adicionar(new Item("Baguncinha", 20)); break;
                                }
                                break;

                            case 3:
                                carrinho.listar();
                                break;

                            case 4:
                                carrinho.listar();
                                System.out.print("Índice: ");
                                int i = sc.nextInt();
                                carrinho.editar(i, new Item("Item Editado", 99));
                                break;

                            case 5:
                                carrinho.listar();
                                System.out.print("Índice: ");
                                int r = sc.nextInt();
                                carrinho.remover(r);
                                break;

                            case 6:
                                System.out.println("Total: R$ " + carrinho.total());
                                break;
                        }

                    } while (true); 
                } else {
                    System.out.println("Login inválido!");
                }
            }

        } while (opcaoLogin != 0);

        System.out.println("Sistema encerrado!");
    }
}
