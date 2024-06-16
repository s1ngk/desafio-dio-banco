import java.util.List;

public class Banco {
    protected static String nome = "Banco X";
    private List<Conta> contas;
    public String getNome() {
        return nome;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    public Banco(String nome, List<Conta> contas) {
        Banco.nome = nome;
        this.contas = contas;
    }
    public void listarContas(List<Conta> contas) {
        contas.stream().forEach(System.out::println);
    }
}
