import java.util.List;
import java.util.Vector;

public class EstoqueProdutos {

    private List<ProdutoEstoque> produtos;

    public EstoqueProdutos() {
        this.produtos = new Vector<ProdutoEstoque>();
    }

    public void adicionaProduto(ProdutoEstoque produtoEstoque) {
        this.produtos.add(produtoEstoque);
    }

    public List<ProdutoEstoque> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<ProdutoEstoque> produtos) {
        this.produtos = produtos;
    }

}
