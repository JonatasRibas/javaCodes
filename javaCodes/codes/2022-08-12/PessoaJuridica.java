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

    public PessoaJuridica(PessoaJuridica outra){
        
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

    }

    public int hashCode(){

    }

    public String toString(){

    }

    public Object clone(){

    }
}