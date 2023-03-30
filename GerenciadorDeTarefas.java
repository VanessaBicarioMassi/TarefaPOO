//essa classe tera listas de tarefas pendentes e concluidas
   
//adicionarTarefa(Tarefa t): adiciona uma tarefa à lista de tarefas pendentes.
//concluirTarefa(Tarefa t): marca uma tarefa como concluída e a move para a
//lista de tarefas concluídas.
//exibirTarefasPendentes(): exibe a lista de tarefas pendentes.
//exibirTarefasConcluidas(): exibe a lista de tarefas concluídas.

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GerenciadorDeTarefas {
    private List<Tarefa> tarefasPendentes;
    private List<Tarefa> tarefasConcluidas;
    private String nomeUsuario;
    private String arquivoUsuario;
    
    // construtor da classe GerenciadorTarefas
    public GerenciadorDeTarefas() {
        this.tarefasPendentes = new ArrayList<>();
        this.tarefasConcluidas = new ArrayList<>();
    }
    
    public void login(){
      //Pede ao usuario o login
      //percorre a pasta usuarios procurando pelo arquivo com o nome do usuario
      // se usuario nao existe 
      //Se usuario existe entao recupero as tarefas pendentes e concluidas dele para minhas listas da classe
      
    }
    
    // metodo pra verificar se o usuario ja tem login ou se precisa criar
    public void verificarDiretorioDoUsuario(String nomeUsuario) {
    Usuario usuario = new Usuario(nomeUsuario);
    String caminhoDiretorio = usuario.getCaminhoDiretorio();
    File diretorioUsuario = new File(caminhoDiretorio);

    // se o diretorio nao existir, cria um com .mkdirs
    if (!diretorioUsuario.exists()) {
        diretorioUsuario.mkdirs();
    }
}
    
    // método para adicionar tarefas
    public void adicionarTarefa(Tarefa tarefa) {
        tarefasPendentes.add(tarefa);
    }
    
    //método para concluir tarefas - OPCAO 1
    public void concluirTarefa(Tarefa tarefa) {
        System.out.println("Digite o título da tarefa:");
        //String titulo = scanner.next();
        
        System.out.println("Digite a descrição da tarefa:");
        //String descricao = scanner.next();
        
        tarefa.setConcluida(true);
        tarefa.setDataConclusao(new Date()); 
        tarefasPendentes.remove(tarefa);
        tarefasConcluidas.add(tarefa);
        
        System.out.println("Tarefa adicionada com sucesso!");
    }
   
    // método para exibir tarefas pendentes 
    public void exibirTarefasPendentes() {
        System.out.println("Tarefas pendentes:");
        for (Tarefa tarefa : tarefasPendentes) {
            System.out.println(tarefa.getTitulo());
        }
    }
    
    // método para exibir tarefas concluidas
    public void exibirTarefasConcluidas() {
        System.out.println("Tarefas concluídas:");
        for (Tarefa tarefa : tarefasConcluidas) {
            System.out.println(tarefa.getTitulo());
        }
    }
    
    // colocar os metodos dos casos switch pra chamar eles no principal
    
    
   }
    
 



