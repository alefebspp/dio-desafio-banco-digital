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

    public void listarContas(){
        for(Conta conta: contas){
            conta.imprimirExtrato();
        }
    }
}
