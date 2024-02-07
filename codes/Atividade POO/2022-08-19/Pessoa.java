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

    public Pessoa(Pessoa copia)throws Exception{
        if (copia == null)
            throw new Exception("Cópia é nula!");
        
        this.setCodigo(copia.codigo);
        this.setNome(copia.nome);
        this.setEndereco(copia.endereco);
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
        if (outro == null)
            return false;
        
        if (outro == this)
            return true;
        
        if (! this.getClass() == outro.getClass())
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

    public int hashCode(){
        int hash = 7;

        hash = hash * 31 + (this.codigo == null) ? 0 : this.codigo.hashCode();
        hash = hash * 31 + (this.nome == null) ? 0 : this.nome.hashCode();
        hash = hash * 31 + (this.endereco == null) ? 0 : this.endereco.hashCode();

        return hash;
    }

    public String toString(){
        return "Pessoa = [Codigo: " + this.codigo.toString() + " Nome: " + this.nome + " Endereço: " + this.endereco.toString() + "]";
    }

    public Object clone(){
        try{
            return (Object) new Pessoa(this);
        catch Exception ex{
            
        }
    }

}