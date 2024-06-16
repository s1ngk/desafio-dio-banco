public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void consultarSaldo(){
        System.out.println("Banco: " + Banco.nome);
        System.out.println("--- Saldo Conta Poupanca ---");
        imprimirInfoComum();
    }
}
