import java.util.Scanner;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Criar nova tarefa");
            System.out.println("2. Concluir tarefa");
            System.out.println("3. Exibir tarefas pendentes");
            System.out.println("4. Exibir tarefas concluídas");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Solicita que o usuário informe o título e a descrição da tarefa
                    System.out.print("Digite o título da tarefa: ");
                    scanner.nextLine(); 
                    String titulo = scanner.nextLine();

                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    // Adiciona a nova tarefa à lista de tarefas pendentes pelo gerenciador de tarefas
                    gerenciador.adicionarTarefa(new Tarefa(titulo, descricao, LocalDate.now()));
                    System.out.println("\nTarefa criada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n===== TAREFAS PENDENTES =====");
                    gerenciador.exibirTarefasPendentes();

                    // Concluir a tarefa e mover para a lista de tarefas concluídas
                    System.out.print("\nDigite o número da tarefa que deseja concluir: ");
                    int indiceTarefa = scanner.nextInt();
                    if (gerenciador.concluirTarefa(indiceTarefa)) {
                        System.out.println("Tarefa concluída com sucesso!");
                    } else {
                        System.out.println("Não foi possível concluir a tarefa.");
                    }
                    break;

                case 3:
                    System.out.println("\n===== TAREFAS PENDENTES =====");
                    gerenciador.exibirTarefasPendentes();
                    break;

                case 4:
                    System.out.println("\n===== TAREFAS CONCLUÍDAS =====");
                    gerenciador.exibirTarefasConcluidas();
                    break;

                case 0:
                    System.out.println("\nSaindo do programa...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("\nOpção inválida. Digite novamente.");
                    break;
            }
        }
    }
}