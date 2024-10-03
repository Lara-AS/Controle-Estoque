package classes_conexao;

public class Produto {
    String nome;
    int quantidade;
    double valor;
    String dataEntrada;

    public Produto(String nome, int quantidade, double valor, String dataEntrada) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dataEntrada = dataEntrada;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor: " + valor);
        System.out.println("Data de Entrada: " + dataEntrada);
    }
}
