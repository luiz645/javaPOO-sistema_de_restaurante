package pasta7;

import java.util.ArrayList;

public class Login {

    String usuario;
    int senha;

    public static ArrayList<Login> lista = new ArrayList<>();

    public Login(String usuario, int senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public void cadastrar() {
        if (senha < 1 || senha > 50) {
            System.out.println("Senha inválida! (1 a 50)");
            return;
        }

        for (Login l : lista) {
            if (l.usuario.equals(this.usuario)) {
                System.out.println("Usuário já cadastrado!");
                return;
            }
        }

        lista.add(this);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static boolean autenticar(String usuario, int senha) {
        for (Login l : lista) {
            if (l.usuario.equals(usuario) && l.senha == senha) {
                return true;
            }
        }
        return false;
    }
}
