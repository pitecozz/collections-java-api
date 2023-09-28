package map.OperacoesBasicas;

import java.util.Map;
import java.util.HashMap;


public class AgendaContatos {
    
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        if(!agendaContatoMap.isEmpty()) {
            for(Map.Entry<String, Integer> contato : agendaContatoMap.entrySet()) {
                System.out.println("Nome: " + contato.getKey() + " - Telefone: " + contato.getValue());
            }
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            return agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("João", 987654321);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("José", 123456789);
        agendaContatos.adicionarContato("Lucas", 987654321);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("João");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    }

}
