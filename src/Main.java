public class Main {
    public static void main(String[] args) {
        Cliente monique = new Cliente();
        monique.setNome("Monique");
        
        Conta cc = new ContaCorrente(monique);
        Conta poupanca = new ContaPoupanca(monique);

        cc.depositar(100);
        // cc.transferir(poupanca, 110);
        cc.transferir(poupanca, 100);

        cc.consultarSaldo();
        poupanca.consultarSaldo();

        cc.imprimirExtrato();
    }
}
