import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import GerenciadorTarefas; //importa a classe gerenciadortarefas pra poder usar os metodos dela aqui

public class Usuarios {
    private Map<String, GerenciadorTarefas> usuarios;

    public Usuarios() {
        usuarios = new HashMap<>();
    }

    public void adicionarUsuario(String nomeArquivo) throws IOException {
        if (usuarios.containsKey(nomeArquivo)) {
            System.out.println("Usuário já existe.");
        } else {
            GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas(nomeArquivo);
            gerenciadorTarefas.lerTarefas();
            usuarios.put(nomeArquivo, gerenciadorTarefas);
            System.out.println("Usuário adicionado com sucesso.");
        }
    }

    public void exibirTarefasPendentes(String nomeArquivo) {
        if (usuarios.containsKey(nomeArquivo)) {
            usuarios.get(nomeArquivo).exibirTarefasPendentes();
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public void exibirTarefasConcluidas(String nomeArquivo) {
        if (usuarios.containsKey(nomeArquivo)) {
            usuarios.get(nomeArquivo).exibirTarefasConcluidas();
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public void criarNovaTarefa(String nomeArquivo, String titulo, String descricao) {
        if (usuarios.containsKey(nomeArquivo)) {
            usuarios.get(nomeArquivo).criarNovaTarefa(titulo, descricao);
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public void concluirTarefa(String nomeArquivo, int indice) {
        if (usuarios.containsKey(nomeArquivo)) {
            usuarios.get(nomeArquivo).concluirTarefa(indice);
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
