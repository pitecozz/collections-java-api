package map.Ordenacao;

import java.util.Map;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.TreeMap;

public class AgendaEvento {
    
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEvento() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        this.eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
          LocalDate dataEvento = entry.getKey();
          Evento evento = entry.getValue();
          System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    public void obterProximoEvento() {

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento.getNome() + " acontecerá no dia: " + proximaData);
                break;
            }
        } 
    }

    public static void main(String[] args) {
        AgendaEvento agendaEventos = new AgendaEvento();

        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 10), "Show do Gustavo Lima", "Gustavo Lima");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 11), "Show do Gustavo Lima", "Gustavo Lima");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 12), "Show do Gustavo Lima", "Gustavo Lima");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

        
    }
}
