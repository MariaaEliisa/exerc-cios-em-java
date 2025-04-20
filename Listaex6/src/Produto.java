public class Produto {
    private int id;
    private String descricao;
    private String fabricante;
    private double preco;

    public Produto(int id, String descricao, String fabricante, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto {" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", preco=" + preco +
                '}';
    }
}
