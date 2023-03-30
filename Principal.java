//precisa ter loop de menu de interacao 
// criar tarefa
// concluir tarefa
// exibir tarefas pendentes
// exibir tarefas concluidas

import java.util.Scanner;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas(); // instancia da classe pra gerenciar as tarefas
        gerenciador.login();
        //menu de interacao de login de usuario
        while (true) {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Login");
        System.out.println("2. Criar conta");
        System.out.println("0. Sair");

        Scanner scanner = new Scanner(System.in); 
        int opcao = scanner.nextInt();
        
         switch (opcao) {
            case 1:
                System.out.println("\nDigite seu nome de usuário:");
                String nomeUsuario = scanner.next();
                Usuario usuario = new Usuario(nomeUsuario);
                String caminhoDiretorio = usuario.getCaminhoDiretorio();
                File diretorioUsuario = new File(caminhoDiretorio);

                if (!diretorioUsuario.exists()) {
                    System.out.println("Usuário não encontrado."); //caso o usuario errar o login, ou tentar entrar sem ter criado um login
                } else {
                    File[] arquivos = diretorioUsuario.listFiles();
                    System.out.println("\nTarefas do usuário " + nomeUsuario + ":");
                    for (File arquivo : arquivos) {
                        System.out.println("- " + arquivo.getName());
                    }
                }

                break;
                
                 case 2:
                System.out.println("\nDigite o nome de usuário desejado:");
                String novoNomeUsuario = scanner.next();
                gerenciador.verificarDiretorioDoUsuario(novoNomeUsuario);
                System.out.println("Usuário criado com sucesso!");

                break;
            case 0:
                System.out.println("\nObrigado por utilizar o gerenciador de tarefas!");
                return;
            default:
                System.out.println("\nOpção invalida!");
                break;
            }
            
                
        
        Scanner scanner = new Scanner(System.in); // instancia que vai ler o que o usuario digitar
        int opcao = 0;
        // mostrar o menu de interacao do usuario e ler a entrada em opcao
        while (opcao != 5) { // o loop será executado ate o usuario escolher a opcao 5 (sair do programa)
            System.out.println("Selecione uma opção:");
            System.out.println("1. Criar nova tarefa");
            System.out.println("2. Concluir tarefa");
            System.out.println("3. Exibir tarefas pendentes");
            System.out.println("4. Exibir tarefas concluídas");
            System.out.println("5. Sair");
            
            opcao = scanner.nextInt(); // lendo a opção selecionada pelo usuário
            
            switch (opcao) {
                case 1:   
                  
                    // como a dataConclusao e passada depois, pode usar como vazia, null
                    System.out.println("Digite o título da tarefa:");
                    String titulo = scanner.next();
                    
                    System.out.println("Digite a descrição da tarefa:");
                    String descricao = scanner.next();
                    
                    Tarefa novaTarefa = new Tarefa(titulo, descricao);               
                    gerenciador.adicionarTarefa(novaTarefa); // criando e adicionando a tarefa ao gerenciador
                    
                    System.out.println("Tarefa adicionada com sucesso!");
                    
                    break;
                case 2:
                    System.out.println("Selecione uma tarefa pendente para concluir:");
                    gerenciador.exibirTarefasPendentes(); // exibindo as tarefas pendentes para o usuário escolher
                    int indice = scanner.nextInt();
                    
                    //gerenciador.concluirTarefa(indice); // concluindo a tarefa selecionada
                    System.out.println("Tarefa concluída com sucesso!");
                    break;
                case 3:
                    System.out.println("Tarefas pendentes:");
                    gerenciador.exibirTarefasPendentes(); // exibindo as tarefas pendentes
                    break;
                case 4:
                    System.out.println("Tarefas concluídas:");
                    gerenciador.exibirTarefasConcluidas(); // exibindo as tarefas concluídas
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        
        scanner.close(); // fechando o scanner

}
}
}
// gitbash gitcommit gitpush 3 comandos q vou usar mais 
// baixar o vscode pra usar vscode, jgrasp e o github pra ta sempre atualizando o codigo 