package Model;

public class Produto {
    
    private long id;
    private String nome;
    private Double preco;
    private int quantidade;
    
    public Produto() {
        
    }
    
    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /**
     * @return the name
     */
    public String getNome() {
        return nome;
    }
    
    public long getId(){
        return id;
    }
 
    public void setId(long id){
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the price
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param price the price to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * @return the quantity
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
       return "Cadastro de produto{" + "Nome=" + this.nome + ", Preço=" + this.preco + "Quantidade="+ this.quantidade + '}';
    }

}
