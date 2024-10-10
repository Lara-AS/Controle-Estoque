package classes_conexao;

public class Produto {

	private String nome;
    private int quantidade;
    private double valor;
    private String dataEntrada;

    public Produto(String nome, int quantidade, double valor, String dataEntrada) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dataEntrada = dataEntrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor: " + valor);
        System.out.println("Data de Entrada: " + dataEntrada);
    }
}
