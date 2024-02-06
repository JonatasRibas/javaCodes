public class Pessoa{
    private int codigo;
    private String nome;
    private String cpf;

    public Pessoa(){

    }

    public Pessoa(Pessoa objOutro) throws Exception{
        if (objOutro == null)
            throw new Exception("Forneça uma instância para ser criada uma cópia");

        this.codigo = objOutro.codigo;
        this.nome = objOutro.nome;
        this.cpf = objOutro.cpf;
    }

    public void setCodigo(int value) throws Exception{
        if (value <= 0)
            throw new Exception("Código inválido!");

        this.codigo = value;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Nome fornecido é nulo ou vazio!");
        
        this.nome = value;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("CPF fornecido é nulo ou vazio!");
        
        this.cpf = value;
    }

    public String getCpf(){
        return this.cpf;
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
        
        if (!this.cpf.equals(objOutro.cpf))
            return false;
        
        return true;
    }

    public String toString(){
        return "Código: " + this.codigo + ", Nome: " + this.nome + ", CPF: " + this.cpf;
    }

    public int hashCode(){
        int hash = 7;

        hash = 31 * hash + this.codigo;
        hash = 31 * hash + (this.nome == null) ? 0 : this.nome.hashCode();
        hash = 31 * hash + (this.cpf == null) ? 0 : this.cpf.hashCode();

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