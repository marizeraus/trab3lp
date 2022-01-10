
public class ProdutoEstoque {

    private String nome;

    private int preco;

    private int quant;

    public ProdutoEstoque(String nome, int preco, int quant) {
        this.quant = quant;
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return this.quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
}
