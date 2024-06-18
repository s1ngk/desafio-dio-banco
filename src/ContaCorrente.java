public class ContaCorrente extends Conta {

    // double credito = 1000.0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void consultarSaldo(){
        System.out.println("Banco: " + Banco.nome);
        System.out.println("--- Saldo Conta Corrente ---");
        imprimirInfoComum();
    }

    public void pagarBoleto(String codigo, double valor){
        if (saldo > valor) {
            saldo -= valor;
            String valorPago = ("Boleto " + codigo + " de valor " + valor + " pago.");
            System.out.println(valorPago);
            extrato.put(horaFormatada, valorPago);
            contador++;
        } else {
            throw new RuntimeException("Saldo insuficiente.");
        }
    }

}
