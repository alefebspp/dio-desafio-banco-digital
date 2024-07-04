public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void imprimirExtrato();
    void tranferir(double valor, Conta conta);
}
