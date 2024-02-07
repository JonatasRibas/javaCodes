public class Cantor implements Cloneable{
    private long codigo;
    private String nome;
    private String generoMusical;

    //Construtor Vazio
    public Cantor(){

    }

    //Construtor de Copia
    //Finalidade é construir uma instancia com base em outra
    public Cantor(Cantor outro) throws Exception{
        if (outro == null)
            throw new Exception("Objeto fornecido é nulo!");

        this.codigo = outro.codigo;
        this.nome = outro.nome;
        this.generoMusical = outro.generoMusical;
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

    //HashCode
    //Ultilizado para representar a instancia da classe com um numero inteiro
    //A ser utilizado em ordenações, estrutura de dados e organização da memória
    //public + int + hashCode()
    public int hashCode(){
        int hash = 7; //atribuir um numero primo

        hash = 31 * hash + (int) this.codigo;
        hash = 31 * hash + (this.nome == null ? 0 : this.nome.hashCode());
        hash = 31 * hash + (this.generoMusical == null ? 0 : this.generoMusical.hashCode());

        return hash;
    }

    //Clone
    //Utilizado para realizar um clone (cópia) da instancia atual
    //public + Object + clone()
    public Object clone(){
        try{
            return (Object) new Cantor(this);
        }
        catch (Exception ex){
            return null;
        }
    }

}