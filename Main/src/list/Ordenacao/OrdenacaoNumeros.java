package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    
    private List<Integer> numerosList;

    
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public void ordenarAscendente() {
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosList);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void ordenarDescendente() {
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosList, Collections.reverseOrder());
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        
        numeros.exibirNumeros();

        
        numeros.ordenarAscendente();

        
        numeros.exibirNumeros();

        
        numeros.ordenarDescendente();

        
        numeros.exibirNumeros();
    }
}