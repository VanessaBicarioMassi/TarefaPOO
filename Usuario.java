public class Usuario{
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getCaminhoDiretorio() {
        String caminhoPastaUsuarios = "/caminho/da/pasta/usuarios/"; // Substitua pelo caminho real da pasta de usuários
        return caminhoPastaUsuarios + nome;
    }
}
