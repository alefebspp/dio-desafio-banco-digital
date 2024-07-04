public class Conta implements IConta {
    private double saldo = 0;
    private int agencia;
    private int conta;
    private Cliente cliente;
    private static int counter;

    public Conta(Cliente cliente){
        counter++;
        this.agencia = counter + 5;
        this.conta = counter + 10;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }


    public int getConta() {
        return conta;
    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta: " + this.agencia + "-" + this.conta + " ===");
        System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getSobrenome());
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public void tranferir(double valor, Conta conta) {
        this.sacar(valor);
        conta.depositar(valor);
    }


}
