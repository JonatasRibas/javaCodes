public class Musica{
    private long codigo;
    private int duracao;
    private String link;
    private Cantor interprete;

    //Construtor Vazio
    public Musica(){

    }

    //Getters e Setters
    public void setCodigo(long value) throws Exception{
        if (value < 0)
            throw new Exception("Codigo inválido!");
        
        this.codigo = value;
    }

    public long getCodigo(){
        return this.codigo;
    }

    public void setDuracao(int value) throws Exception{
        if (value <= 0)
            throw new Exception("Duração inválida!");
        
        this.duracao = value;
    }

    public int getDuracao(){
        return  this.duracao;
    }

    public void setLink(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Link inválido!");

        //Ideia: validar URL

        this.link = value;
    }

    public String getLink(){
        return this.link;
    }

    public void setInterprete(Cantor obj) throws Exception{
        if (obj == null)
            throw new Exception("Interprete não fornecido!");
        
        this.interprete = obj;
    }

    public Cantor getInterprete(){
        return this.interprete;
    }

    public boolean equals(Object outro){
        if (outro == null)
            return false;
        
        if (outro == this)
            return true;

        if (this.getClass() != outro.getClass())
            return false;
        
        Musica objOutro = (Musica) outro;

        if (this.codigo != objOutro.codigo)
            return false;
        
        if (this.duracao != objOutro.duracao)
            return false;

        if (!this.link.equals(objOutro.link))
            return false;
        
        if (!this.interprete.equals(objOutro.interprete))
            return false;
        
        return true;
    }

    public String toString(){
        return "Código: " + this.codigo +
                " Duração: " + this.duracao +
                " Link: " + this.link + 
                " Interprete: " + this.interprete.toString();
    }

}