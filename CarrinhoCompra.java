import java.util.HashMap;

public class CarrinhoCompra {

    private EstoqueProdutos estoque;

    private HashMap<String, Integer> produtos;

    private int precoFinal;

    public CarrinhoCompra(EstoqueProdutos estoque) {
        this.estoque = estoque;
        this.produtos = new HashMap<>();
    }

    public EstoqueProdutos getEstoque() {
        return this.estoque;
    }

    public void setEstoque(EstoqueProdutos estoque) {
        this.estoque = estoque;
    }

    public HashMap<String, Integer> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(HashMap<String, Integer> produtos) {
        this.produtos = produtos;
    }

    public void adicionaItem(String nome, int quant) {
        for (ProdutoEstoque produto : this.estoque.getProdutos()) {
            if (produto.getNome().equals(nome)) {
                if (produto.getQuant() >= quant) {
                    produtos.put(nome, quant);
                } else {
                    System.out.println("Produto não disponível nessa quantidade");
                }
                return;
            }
        }
        System.out.println("Produto não encontrado");
    }

    public void finalizaCompra() {
        for (String key : this.produtos.keySet()) {
            for (ProdutoEstoque produto : this.estoque.getProdutos()) {
                if (produto.getNome().equals(key)) {
                    produto.setQuant(produto.getQuant() - this.produtos.get(key));
                }
            }
        }
    }

    public int calculaTotal() {
        for (String key : this.produtos.keySet()) {
            for (ProdutoEstoque produto : this.estoque.getProdutos()) {
                if (produto.getNome().equals(key)) {
                    this.precoFinal += this.produtos.get(key) * produto.getPreco();
                }
            }
        }
        return this.precoFinal;
    }

    public int getPrecoFinal() {
        return this.precoFinal;
    }

    public void setPrecoFinal(int precoFinal) {
        this.precoFinal = precoFinal;
    }

}
