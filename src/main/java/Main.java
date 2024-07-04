
public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Itaú");

        Cliente alefe = new Cliente("Alefe", "Bispo");
        Cliente joao = new Cliente("João", "Bispo");

        Conta cc = new ContaCorrente(alefe);
        Conta poupanca = new ContaPoupanca(joao);

        cc.depositar(250.50);
        poupanca.depositar(300);

        poupanca.tranferir(50, cc);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        banco.removerConta("João");
        banco.listarContas();

    }

}