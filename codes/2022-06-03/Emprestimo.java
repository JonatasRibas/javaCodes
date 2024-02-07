public class Emprestimo{
    private int codigo;
    private Pessoa aluno;
    private Livro livro;
    
    public Emprestimo(){

    }

    public Emprestimo(Emprestimo objOutro) throws Exception{
        if (outro == null)
            throw new Exception("Forneça uma instância para ser criada uma cópia");
    
        this.codigo = objOutro.codigo;
        this.aluno = objOutro.aluno.clone();
        this.livro = objOutro.livro.clone();
    }

    public void setCodigo(int value) throws Exception{
        if (value <= 0)
            throw new Exception("Código inválido!");

        this.codigo = value;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setAluno(Pessoa obj) throws Exception{
        if (obj == null)
            throw new Exception("Aluno informado é inválido pois é nulo!");

        this.aluno = obj;
    }

    public Pessoa getAluno(){
        return this.aluno;
    }

    public void setLivro(Livro obj) throws Exception{
        if (obj == null)
            throw new Exception("Livro informado é inválido pois é nulo!");

        this.livro = obj;
    }

    public Livro getLivro(){
        return this.livro;
    }

    public boolean equals(Object outro){
        if (outro == null) 
            return false;
        
        if (outro == this)
            return true;

        if (outro.getClass() != this.getClass())
            return false;
        
        Emprestimo objOutro = (Emprestimo) outro;

        if (this.codigo != objOutro.codigo)
            return false;
        
        if (!this.aluno.equals(objOutro.aluno))
            return false;
        
        if (!this.livro.equals(objOutro.livro))
            return false;
        
        return true;
    }

    public String toString(){
        return "Código: " + this.codigo + ", Aluno: " + this.aluno.toString() + ", Livro: " + this.livro.toString();
    }

    public int hashCode(){
        int hash = 7;

        hash = 31 * hash + this.codigo;
        hash = 31 * hash + (this.aluno == null) ? 0 : this.aluno.hashCode();
        hash = 31 * hash + (this.livro == null) ? 0 : this.livro.hashCode();

        return hash;
    }

    public Object clone(){
        try{
            return (Object) new Emprestimo(this);
        }
        catch (Exception ex){
            return null;
        }
    }

}