public class Pessoa implements Cloneable{
    private long codigo;
    private String nome;
    private String documento;
    private Momento nascimento;

    public Pessoa(){

    }

    public Pessoa(long codigo, String nome, String documento, Momento nascimento) throws Exception{
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setDocumento(documento);
        this.setNascimento(nascimento);
    }

    public Pessoa(Pessoa objOutro) throws Exception{
        if (objOutro == null)
            throw new Exception("Forneça uma instância para ser criada uma cópia");

        this.codigo = objOutro.codigo;
        this.nome = objOutro.nome;
        this.documento = objOutro.documento;
        this.nascimento = objOutro.nascimento;
    }

    public void setCodigo(long value) throws Exception{
        if (value <= 0)
            throw new Exception("Código não pode ser zero ou negativo");
        
        this.codigo = value;
    }

    public long getCodigo(){
        return this.codigo;
    }

    public void setNome(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Nome não pode ser nulo e nem vazio!");
        
        this.nome = value;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDocumento(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Documento não pode ser nulo e nem vazio!");
        
        this.documento = value;
    }

    public String getDocumento(){
        return this.documento;
    }

    public void setNascimento(Momento value) throws Exception{
        if (value == null)
            throw new Exception("O nascimento não pode ser nulo!");
        
        this.nascimento = value;
    }

    public Momento getNascimento(){
        return this.nascimento.clone();
    }

    public boolean equals(Object outro){
        if (outro == null)
            return false;
        
        if (outro == this)
            return true;
        
        if (outro.getClass() != this.getClass())
            return false;
        
        Pessoa objOutro = (Pessoa) outro;

        if (this.codigo != objOutro.codigo)
            return false;
        
        if (!this.nome.equals(objOutro.nome))
            return false;
        
        if (!this.documento.equals(objOutro.documento))
            return false;
        
        if (!this.nascimento.equals(objOutro.nascimento))
            return false;
        
        return true;
    }

    public String toString(){
        return "Código: " + ((Long) this.codigo).toString() + ", Nome: " + this.nome + ", Documento: " + this.documento + ", Nascimento: " + this.nascimento.toString();
    }

    public int hashCode(){
        int hash = 7;

        hash = 31 * hash + (int) this.codigo;
        hash = 31 * hash + (this.nome == null) ? 0 : this.nome.hashCode();
        hash = 31 * hash + (this.documento == null) ? 0 : this.documento.hashCode();
        hash = 31 * hash + (this.nascimento == null) ? 0 : this.nascimento.hashCode();

        return hash;
    }

    public Object clone(){
        try{
            return (Object) new Pessoa(this);
        }
        catch (Exception ex){
            return null;
        }
    }
}