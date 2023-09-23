package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionar(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTarefas() {
        return tarefaList.size();
    }
    

    public void obterDescricoesTarefas(){
        System.out.println("Tarefas:" + tarefaList.toString());
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionar("Estudar Java");
        listaTarefa.adicionar("Estudar Spring");
        listaTarefa.adicionar("Estudar Angular");
        listaTarefa.adicionar("Estudar Angular");


        System.out.println("Número de tarefas: " + listaTarefa.obterNumeroTarefas());
        listaTarefa.removerTarefa("Estudar Angular");
        System.out.println("Número de tarefas: " + listaTarefa.obterNumeroTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
