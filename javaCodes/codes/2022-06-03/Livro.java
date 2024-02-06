public class Livro{
    private String tombo;
    private String titulo;
    private Pessoa autor;
    private GeneroLiterario genero;

    public Livro(){

    }

    public Livro(Livro objOutro) trhows Exception{
        if (objOutro == null)
            throw new Exception("Forneça uma instância para ser criada uma cópia");
        
        this.tombo = objOutro.tombo;
        this.titulo = objOutro.titulo;
        this.autor = objOutro.autor.clone();
        this.genero = objOutro.genero.clone();
    }

    public void setTombo(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Tombo fornecido é nulo ou vazio!");
        
        this.tombo = value;
    }

    public Strin getTombo(){
        return this.tombo;
    }

    public void setTitulo(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Título fornecido é nulo ou vazio!");
        
        this.titulo = value;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(Pessoa obj) throws Exception{
        if (obj == null)
            throw new Exception("Autor fornecido é nulo!");
            
        this.autor = obj;
    }

    public Pessoa getAutor(){
        return this.autor;
    }

    public void setGenero(GeneroLiterario obj) throws Exception{
        if (obj == null)
            throw new Exception("Gênero Literário fornecido é nulo!");

        this.genero = obj;
    }

    public GeneroLiterario getGenero(){
        return this.genero;
    }

    public boolean equals(Object outro){
        if (outro == null)
            return false;
        
        if (outro == this)
            return true;

        if (outro.getClass() != this.getClass())
            return false;
        
        Livro objOutro = (Livro) outro;

        if (!this.tombo.equals(objOutro.tombo))
            return false;
        
        if (!this.titulo.equals(objOutro.titulo))
            return false;
        
        if (!this.autor.equals(objOutro.autor))
            return false;
        
        if (!this.genero.equals(objOutro.genero))
            return false;
        
        return true;
    }

    public String toString(){
        return "Tombo: " + this.tombo + ", Título: " + this.titulo + ", Autor: " + this.autor.toString() + ", Gênero Literário: " + this.genero.toString();
    }

    public int hashCode(){
        int hash = 7;

        hash = 31 * hash + (this.tombo == null) ? 0 : this.tombo.hashCode();
        hash = 31 * hash + (this.titulo == null) ? 0 : this.titulo.hashCode();
        hash = 31 * hash + (this.autor == null) ? 0 : this.autor.hashCode();
        hash = 31 * hash + (this.genero == null) ? 0 : this.genero.hashCode();

        return hash;
    }

    public Object clone(){
        try{
            return (Object) new Livro(this);
        }
        catch(Exception ex){
            return null;
        }
    }
}
