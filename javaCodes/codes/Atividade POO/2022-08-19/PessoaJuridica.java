public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(){

    }

    public PessoaJuridica(Long codigo, String nome, Endereco endereco, String cnpj) throws Exception{
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEndereco(endereco);
        //ou
        super(codigo, nome, endereco);
        //continua
        this.setCnpj(cnpj);
    }

    public PessoaJuridica(PessoaJuridica outra) throws Exception{
        if (outra == null)
            throw new Exception("Cópia nula!");
        
        super(outra.codigo, outra.nome, outra.endereco);

        this.setCnpj(outra.cnpj);
    }

    public void setCnpj(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("CNPJ inválido!");

        this.cnpj = value;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public boolean equals(Object outro){
        if (! super.equals(outro))
            return false;
        
        if (! this.getClass() == outro.getClass())
            return false;

        PessoaJuridica objOutro = (PessoaJuridica) outro;

        if (! this.cnpj.equals(objOutro.cnpj))
            return false;
        
        return true;
    }

    public int hashCode(){
        int hash = super.hashCode();

        hash = hash * 31 + (this.cnpj == null) ? 0 : this.cnpj.hashCode();

        return hash;
    }

    public String toString(){
        return super.toString() + " PessoaJuridica [Cnpj: " + this.cnpj + "]";
    }

    public Object clone(){
        try{
            return (Object) new PessoaJuridica(this);
        }
        catch Exception ex{

        }
    }
}