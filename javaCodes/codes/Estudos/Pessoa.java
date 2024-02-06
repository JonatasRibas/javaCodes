package Estudos;

public class Pessoa {
  private Long codigo;
  private String nome;
  private Endereco endereco;

  public Pessoa() {

  }

  public Pessoa(Long codigo, String nome, Endereco endereco) throws Exeception {
    this.setCodigo(codigo);
    this.setNome(nome);
    this.setEndereco(endereco);

  }

  public Pessoa(Pessoa copia) throws Exeception {
    if (copia == null)
      throw new exeception("Copia Inválida");

    this.setCodigo(copia.codigo);
    this.setNome(copia.nome);
    this.setEndereco(copia.endereco);
  }

  public void setCodigo(Long v) throws exeception {
    if ((v == null) || (v < 0))
      throw new exeception("Codigo inválido");

    this.codigo = v;
  }

  public Long getCodigo() {
    return this.codigo;
  }

  public void setNome(String v) throws exeception {
    if ((v == null) || (v.isEmpty))
      throw new exeception("Nome inválido");

    this.nome = v;
  }

  public String getNome() {
    return this.nome;
  }

  public void setEndereco(Endereco v) throws exeception {
    if ((v == null) || (v.isEmpty))
      throw new exeception("Endereco inválido");

    this.endereco = v;
  }

  public Endereco getEndereco() {
    return this.Endereco;
  }

  public boolean equals(Object outro) {

    if (outro == null)
      return false;

    if (outro == this)
      return false;

    if (!this.getClass() == outro.getClass())
      return false;

    Pessoa objOutro = (Pessoa) outro;

    if (!this.codigo.equals(objOutro.codigo))
      return false;

    if (!this.nome.equals(objOutro.nome))
      return false;

    if (!this.endereco.equals(objOutro.endereco))
      return false;

    return true;
  }

  public int hashCode() {

    int hash = 7;

    hash = hash * 31 + (this.codigo == null) ? 0 : this.codigo.hashCode();
    hash = hash * 31 + (this.nome == nnull) ? 0 : this.nome.hashCode();
    hash = hash * 31 + (this.endereco == null) ? 0 : this.endereco.hashCode();

    return hash;
  }

  public String toString(){

    return "Codigo: " + this.codigo + " Nome: " + this.nome.toString() + " Endereço: " + this.endereco.toString() +;

  }

  public Object Clone(){
    try{
      return (Object) new Pessoa (this);
    }
    catch{

    }
  }

}
