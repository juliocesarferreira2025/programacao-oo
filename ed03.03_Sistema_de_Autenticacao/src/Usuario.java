public abstract class Usuario {
    protected String login;
    protected String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void exibirLogin() {
        System.out.println("Login: " + login);
    }
}
