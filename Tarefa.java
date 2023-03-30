// essa classe possui atributos e metodos de acesso get() e modificacao das listas de tarefas
// título, descrição, data de criação, data de conclusão (opcional) e status (pendente ou concluída).
import java.util.Date;

public class Tarefa {
    private String titulo;
    private String descricao;
    private Date dataCriacao;
    private Date dataConclusao;
    private boolean concluida;
    
    // construtor da classe Tarefa
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = new Date(); // a data ja e criada com a data do sistema no momento em que e criada
        this.dataConclusao = null; // a data e definida como nula pq nesse momento, ela acabou de ser criada, entao n tem como ja ter data de conclusao
        this.concluida = false;
    }
    
    // métodos de acesso e modificação dos atributos da classe Tarefa
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Date getDataCriacao() {
        return dataCriacao;
    }
    
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public Date getDataConclusao() {
        return dataConclusao;
    }
    
    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
    
    public boolean isConcluida() {
        return concluida;
    }
    
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
