public class Main {
    public static void main(String[] args) {
        Cliente monique = new Cliente();
        monique.setNome("Monique");
        
        Conta cc = new ContaCorrente(monique);
        Conta poupanca = new ContaPoupanca(monique);

        cc.depositar(500);
        // cc.transferir(poupanca, 110);
        cc.transferir(poupanca, 100);

        cc.consultarSaldo();
        poupanca.consultarSaldo();
        cc.pagarBoleto("123456789", 100);

        cc.imprimirExtrato();
    }
}
