public class PessoaFisica extends Pessoa{
    private String cpf;
    private String cartaoSus;

    public PessoaFisica(){

    }

    public PessoaFisica(Long codigo, String nome, Endereco endereco, String cpf, String cartaoSus) throws Exception{
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEndereco(endereco);
        //ou
        super(codigo,  nome, endereco); //deve ser na primeira linha do construtor
        //continua
        this.setCpf(cpf);
        this.setCartaoSus(cartaoSus); 
    }

    public PessoaFisica(PessoaFisica outra) throws Exception {
        if (outra == null)
            throw new Exception("Cópia nula!!");

        super(outra.codigo, outra.nome, outra.endereco); //ou
        this.setCodigo(outra.codigo);
        this.setNome(outra.nome);
        this.setEndereco(outra.endereco);
        //fim ou
        this.setCpf(outra.cpf);
        this.setCartaoSus(outra.cartaoSus);
    }

    public void setCpf(String value) throws Exception{
        if ((cpf == null) || (cpf.isEmpty()))
            throw new Exception("CPF inválido!");

        this.cpf = value;
    }

    public String getCpf(){
        return this.cpf;
    }

    //CartãoSUS não é obrigatorio nesse cenário
    public void setCartaoSus(String value){
        this.cartaoSus = value;
    }

    public String getCartaoSus(){
        return this.cartaoSus;
    }

    public boolean equals(Object outro){
        if (! super.equals(outro))
            return false;
        
        if (! this.getClass() == outro.getClass())
            return false;
        
        PessoaFisica objOutro = (PessoaFisica) outro;

        if (!this.cpf.equals(objOutro.cpf))
            return false;
        
        if (!this.cartaoSus.equals(objOutro.cartaoSus))
            return false;
        
        return true;
    }

    public int hashCode(){
        int hash = super.hashCode();

        hash = hash * 31 + (this.cpf == null) ? 0 : this.cpf.hashCode();
        hash = hash * 31 + (this.cartaoSus == null) ? 0 : this.cartaoSus.hashCode();

        return hash;

    }

    public String toString(){
        return super.toString() + " PessoaFisica = [Cpf: " + this.cpf + " Cartão Sus: " + this.cartaoSus + "]";
    }

    public Object clone(){
        try{
            return (Object) new PessoaFisica(this);
        }
        catch Exception ex{

        }
    }




}