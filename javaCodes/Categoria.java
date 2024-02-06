public class Categoria implements Cloneable{
    private Long codigo;
    private String nome;

    public Categoria(){

    }

    public Categoria(Long codigo, String nome) throws Exception{
        this.setCodigo(codigo);
        this.setNome(nome);
    }

    public Categoria(Categoria copia)throws Exception{
        if (copia == null)
            throw new Exception("Cópia é nula!");
        
        this.setCodigo(copia.codigo);
        this.setNome(copia.nome);
    }

    public void setCodigo(Long v) throws Exception{
        if ((v == null) || (v < 0))
            throw new Exception("Código inválido!");

        this.codigo = v;
    }

    public Long getCodigo(){
        return this.codigo;
    }

    public void setNome(String v) throws Exception{
        if ((v == null) || (v.isEmpty()))
            throw new Exception("Nome inválido!");
        
        this.nome = v;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean equals(Object outro){
        if (outro == null)
            return false;
        
        if (outro == this)
            return true;
        
        if (this.getClass() != outro.getClass())
            return false;
        
        Categoria objOutro = (Categoria) outro;

        if (!this.codigo.equals(objOutro.codigo))
            return false;
    
        if (!this.nome.equals(objOutro.nome))
            return false;

        return true;
    }

    public int hashCode(){
        int hash = 7;

        hash = hash * 31 + (this.codigo == null) ? 0 : this.codigo.hashCode();
        hash = hash * 31 + (this.nome == null) ? 0 : this.nome.hashCode();

        return hash;
    }

    public String toString(){
        return "[Codigo: " + this.codigo.toString() + "; Nome: " + this.nome + "]";
    }

    public Object clone(){
        try{
            return (Object) new Categoria(this);
        catch Exception ex{
            
        }
    }

}