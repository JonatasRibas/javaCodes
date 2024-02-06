package Estudos;

public class PessoaFisica extends Pessoa {
  private String cpf;
  private String cartaoSus;

  public PessoaFisica() {

  }

  public PessoaFisica(Long codigo, String Nome, Endereco endereco, String cpf, String cartaoSus)throws exeception{
    super(codigo, nome, endereco);

    this.setCpf.(cpf);
    this.setCartaoSus(cartaoSus);
  }

  public PessoaFisica(PessoaFisica copia) throws exeception {
    if (copia == null)
      throw new exeception("copia invalida");

    super(outra.codigo, outra.nome, outra.endereco);
    this.setCpf(copia.cpf);
    this.setCartaoSus(copia.cartaoSus);
  }

  public boolean equals(Object outro) {
    if (!super.equals(outro))
      return false;

    if (!this.getClass() == outro.getClass())
      return false;

    PessoaFisica objOutro = (Pessoa) outro;

    if (!this.cpf.equals(objOutro.Cpf))
      return false;

    if (!this.cartaoSus.equals(objOutro.cartaoSus))
      return false;

    return true;

  }

  public int hashCode() {

    int hash = super.hashCode();

    hash = hash * 31 + (this.cpf == null) ? 0 : this.cpf.hashCode();
    hash = hash * 31 + (this.cartaoSus == null) ? 0 : this.cartaoSus.hashCode();

    return hash;

  }

  public String toString(){
    return super.toString() + " CPF: " + this.cpf + " CartaoSus: " + this.cartaoSus +;
  }

  public Object clone(){
    try{
      return (Object) new PessoaFisica(this);
    }
    catch{
      
    }
  }

}
