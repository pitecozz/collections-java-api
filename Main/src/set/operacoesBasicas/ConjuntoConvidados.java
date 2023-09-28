package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoRemover = null;
        for(Convidado c : convidadosSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }
     public static void main(String[] args) {
            
            ConjuntoConvidados convidados = new ConjuntoConvidados();
            
            convidados.adicionarConvidado("convidado 3", 1);
            convidados.adicionarConvidado("convidado 2", 2);
            convidados.adicionarConvidado("convidado 1", 3);
            convidados.adicionarConvidado("convidado 1", 4);
            convidados.adicionarConvidado("convidado 4", 5);
            
            convidados.exibirConvidados();
            
            convidados.removerConvidado(3);
            
            convidados.exibirConvidados();
            
            System.out.println("Quantidade de convidados: " + convidados.contarConvidados());
     }
}
