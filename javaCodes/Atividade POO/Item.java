public class Item {
  private Long codigo;
  private String descricao;
  private Categoria categoria;
  private double preco;

  public Item() {
  }

  public Item(Item copia) throws Exception {
    if (copia == null)
      throw new Exception("Cópia é nula!");

    this.setCodigo(copia.codigo);
    this.setDescricao(copia.descricao);
    this.setCategoria(copia.categoria);
    this.setPreco(copia.preco);
  }

  public Item(Long codigo, String descrcao, Categoria categoria, Double preco) throws Exception {
    this.setCodigo(codigo);
    this.setDescricao(descricao);
    this.setCategoria(categoria);
    this.setPreco(preco);
  }

  public void setCodigo(Long value) throws Exception {
    if ((value == null) || (value < 0))
      throw new Exception("Código inválido!");

    this.codigo = value;
  }

  public Long getCodigo() {
    return this.codigo;
  }

  public void setDescricao(String v) throws Exeception {
    if ((v == null) || (v == isEmpty()))
      throw new exception("Descrição inválida!");

    this.descricao = v;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setCategoria(Categoria value) throws Exeception {
    if ((value == null) || (value == isEmpty()))
      throw new exeception("Categoria invalida!");

    return this.categoria;
  }

  public categoria getCategoria() {
    return this.categoria;
  }

  public void setPreco(double v) throws Exeception {
    if ((v < 0) || (v == null))
      throw new exeception("Preco invalida!");

    return this.preco;
  }

  public double Preco() {
    return this.preco;
  }

  public boolean equals(Object outro) {
    if (outro == null)
      return false;

    if (outro == this)
      return true;

    if (!this.getClass() == outro.getClass())
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

  public int hashCode() {
    int hash = 7;

    hash = hash * 31 + (this.codigo == null) ? 0 : this.codigo.hashCode();
    hash = hash * 31 + (this.descricao == null) ? 0 : this.descricao.hashCode();
    hash = hash * 31 + (this.categoria == null) ? 0 : this.categoria.hashCode();
    hash = hash * 31 + (this.preco == null) ? 0 : this.preco.hashCode();

    return hash;
  }

  public String toString() {
    return "Pessoa = [Codigo: " + this.codigo.toString() + " Nome: " + this.nome + " Endereço: "
        + this.endereco.toString() + "]";
  }

  public Object clone(){
      try{
          return (Object) new Pessoa(this);
      catch Exception ex{
          
      }
  }

}