import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorTarefas {
private List<Tarefa> tarefasPendentes;
private List<Tarefa> tarefasConcluidas;

    public GerenciadorTarefas() {
    this.tarefasPendentes = new ArrayList<>();
    this.tarefasConcluidas = new ArrayList<>();
}

// métodos de acesso às listas de tarefas
public List<Tarefa> getTarefasPendentes() {
    return tarefasPendentes;
}

public List<Tarefa> getTarefasConcluidas() {
    return tarefasConcluidas;
}

public void adicionarTarefa(Tarefa tarefa) {
    tarefasPendentes.add(tarefa);
}

public boolean concluirTarefa(int indice) {
    if (indice < 1 || indice > tarefasPendentes.size()) {
        return false;
    }
    Tarefa tarefa = tarefasPendentes.get(indice - 1);
    tarefa.setConcluida(true);
    tarefa.setDataConclusao(LocalDate.now());
    tarefasConcluidas.add(tarefa);
    tarefasPendentes.remove(tarefa);
    return true;
}

public void exibirTarefasPendentes() {
    if (tarefasPendentes.isEmpty()) {
        System.out.println("Não há tarefas pendentes.");
    } else {
        for (int i = 0; i < tarefasPendentes.size(); i++) {
            Tarefa tarefa = tarefasPendentes.get(i);
            System.out.println((i + 1) + ". " + tarefa.getTitulo() + " - " + tarefa.getDescricao());
        }
    }
}

public void exibirTarefasConcluidas() {
    if (tarefasConcluidas.isEmpty()) {
        System.out.println("Não há tarefas concluídas.");
    } else {
         for (int i = 0; i < tarefasConcluidas.size(); i++) {
            Tarefa tarefa = tarefasConcluidas.get(i);
            System.out.println((i + 1) + ". " + tarefa.getTitulo() + " - " + tarefa.getDescricao());
         }
       } 
   }
}


   

       
