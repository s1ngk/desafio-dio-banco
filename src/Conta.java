import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.time.format.DateTimeFormatter;

public abstract class Conta implements IConta {
    protected String banco;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Map<String, String> extrato;
    private LocalDateTime hora = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    protected String horaFormatada = hora.format(formatter);

    protected static int AGENCIA_PADRAO = 0001;
    protected static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.banco = Banco.nome;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        // this.extrato = new ArrayList<>();
        this.extrato = new HashMap<>();
    }

    public double getSaldo() {
        return saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor){
            saldo -= valor;
            String valorSacado = ("Valor: " + valor + " sacado.");
            System.out.println(valorSacado);
            // this.extrato.add(valorSacado);
            this.extrato.put(horaFormatada, valorSacado);
        } else {
            throw new RuntimeException("Saldo insuficiente.");
        }
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
        String valorDepositado = ("Valor: " + valor + " depositado.");
        this.extrato.put(horaFormatada, valorDepositado);
        System.out.println("Valor: " + valor + " depositado.");
    }
    @Override
    public void transferir(Conta contaDestino, double valor) {
        if ( saldo >= valor ){
            sacar(valor);
            contaDestino.depositar(valor);
            String valorTransferido = ("Valor " + valor + " transferido");
            this.extrato.put(horaFormatada, valorTransferido);
        } else {
            throw new RuntimeException("Saldo insuficiente.");
        }
    }
    public void imprimirInfoComum(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }   
    public void imprimirExtrato(){
        System.out.println(extrato);
    }
}
