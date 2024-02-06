public class Pessoa{
    private Long codigo;
    private String nome;
    private Endereco endereco;

    public Pessoa(){

    }

    public Pessoa(Long codigo, String nome, Endereco endereco) throws Exception{
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEndereco(endereco); 
    }

    public Pessoa(Pessoa copia){

    }

    public void setCodigo(Long value) throws Exception{
        if ((value == null) || (value < 0))
            throw new Exception("Código inválido!");

        this.codigo = value;
    }

    public Long getCodigo(){
        return this.codigo;
    }

    public void setNome(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Nome inválido!");
        
        this.nome = value;
    }

    public String getNome(){
        return this.nome;
    }

    //Cenário onde na aplicação, não é obrigatória a inserção de um endereço
    //Por tanto, não validamos se value (ponto de entrada) é nulo ou não
    public void setEndereco(Endereco value){
        this.endereco = value;
    }

    public Endereco getEndereco(){
        return this.endereco;
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