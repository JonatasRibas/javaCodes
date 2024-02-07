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
        super(codigo,  nome, endereco);
        //continua
        this.setCpf(cpf);
        this.setCartaoSus(cartaoSus); 
    }

    public PessoaFisica(PessoaFisica outra) {
    
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

    }

    public int hashCode(){

    }

    public String toString(){

    }

    public Object clone(){

    }




}