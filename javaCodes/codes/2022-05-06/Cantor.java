public class Cantor{
    private long codigo;
    private String nome;
    private String generoMusical;

    //Construtor Vazio
    public Cantor(){

    }

    //Getters e Setters
    public void setCodigo(long value) throws Exception{
        if (value < 0)
            throw new Exception("Código inválido!");

        this.codigo = value;
    }

    public long getCodigo(){
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

    public void setGeneroMusical(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Genero inválido!");

        this.generoMusical = value;
    }

    public String getGeneroMusical(){
        return this.generoMusical;
    }

    //Equals
    //Utilizado para comparacao do conteudo das instancias
    //Assinatura: publico + retorno: boolean + nome: equals + parametro: Object
    public boolean equals(Object outro){
        if (outro == null)
            return false;
        
        if (this == outro)
            return true;
        
        if (this.getClass() != outro.getClass())
            return false;

        Cantor objOutro = (Cantor) outro;
        
        if (this.codigo != objOutro.codigo)
            return false;

        if (!this.nome.equals(objOutro.nome))
            return false;
        
        if (!this.generoMusical.equals(objOutro.generoMusical))
            return false;

        return true;
    }

    //ToString
    //Utilizado para representar por meio de um String, o conteúdo da sua instancia
    //public + String + toString()
    public String toString(){
        return  "Código: " + this.codigo + 
                " Nome: " + this.nome + 
                " Genero Musical: " + this.generoMusical;
    }






















}