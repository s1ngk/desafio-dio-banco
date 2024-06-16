public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void consultarSaldo(){
        System.out.println("Banco: " + Banco.nome);
        System.out.println("--- Saldo Conta Corrente ---");
        imprimirInfoComum();
    }
}
