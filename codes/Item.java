package codes;

public class Item implements Cloneable {
    private Long codigo;
    private String descricao;
    private Categoria categoria;
    private Double preco;

    public Item(){

    }

    public Item(Long codigo, String descricao, Categoria categoria, Double preco) throws Exception{
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setCategoria(categoria);
        this.setPreco(preco);
    }

    public Item(Item outro)throws Exception{
        if (outro == null)
            throw new Exception("Instância nula fornecida!");
        
        this.setCodigo(copia.codigo);
        this.setDescricao(copia.descricao);
        this.setCategoria(copia.categoria);
        this.setPreco(copia.preco);
    }

    public void setCodigo(Long v) throws Exception{
        if ((v == null) || (v < 0))
            throw new Exception("Código inválido!");

        this.codigo = v;
    }

    public Long getCodigo(){
        return this.codigo;
    }

    public void setDescricao(String v) throws Exception{
        if ((v == null) || (v.isEmpty()))
            throw new Exception("Descrição inválida!");
        
        this.descricao = v;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setCategoria(Categoria v) throws Exception{
        if ((v == null))
            throw new Exception("codes.Categoria inválida!");

        this.categoria = v;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    public void setPreco(Double v) throws Exception{
        if ((v == null) || (v < 0))
            throw new Exception("Preço inválido!");

        this.preco = v;
    }

    public Double getPreco(){
        return this.preco;
    }

    public boolean equals(Object outro){
        if (outro == null)
            return false;
        
        if (outro == this)
            return true;
        
        if (this.getClass() != outro.getClass())
            return false;
        
        Item objOutro = (Item) outro;

        if (!this.codigo.equals(objOutro.codigo))
            return false;
    
        if (!this.descricao.equals(objOutro.descricao))
            return false;

        if (!this.categoria.equals(objOutro.categoria))
            return false;
    
        if (!this.preco.equals(objOutro.preco))
            return false;

        return true;
    }

    public int hashCode(){
        int hash = 7;

        hash = hash * 31 + (this.codigo == null) ? 0 : this.codigo.hashCode();
        hash = hash * 31 + (this.descricao == null) ? 0 : this.descricao.hashCode();
        hash = hash * 31 + (this.categoria == null) ? 0 : this.categoria.hashCode();
        hash = hash * 31 + (this.preco == null) ? 0 : this.preco.hashCode();

        return hash;
    }

    public String toString(){
        return "Codigo: " + this.codigo.toString() + "; Descrição: " + this.descricao + "; codes.Categoria: " + this.categoria + "; Preço: " + this.preco + "; ";
    }

    public Object clone(){
        try{
            return (Object) new Item(this);
        catch Exception ex{
            
        }
    }

}