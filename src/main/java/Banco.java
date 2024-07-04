import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String name;
    private List<Conta> contas;

    public Banco(String name){
        this.name = name;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public void removerConta(String nomeCliente){
        List<Conta> contasFiltradas = this.contas.stream().filter(conta -> {
            Cliente cliente = conta.getCliente();
            return !cliente.getNome().equals(nomeCliente);
        }).toList();
        this.contas = contasFiltradas;
    }

    public void listarContas(){
        for(Conta conta: contas){
            conta.imprimirExtrato();
        }
    }
}
