public class Aparelho{
    private String prefixo;
    private String fabricante;
    private String modelo;

    public Aparelho(){

    }

    public Aparelho(String prefixo, String fabricante, String modelo) throws Exception{
        this.setPrefixo(prefixo);
        this.setFabricante(fabricante);
        this.setModelo(modelo);
    }

    public Aparelho(Aparelho objOutro){
         if (objOutro == null)
            throw new Exception("Forneça uma instância para ser criada uma cópia");

        this.prefixo = objOutro.codigo;
        this.fabricante = objOutro.fabricante;
        this.modelo = objOutro.modelo;
    }

    public void setPrefixo(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Prefixo não pode ser nulo e nem vazio!");
        
        this.prefixo = value;
    }

    public String getPrefixo(){
        return this.prefixo;
    }

    public void setFabricante(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Fabricante não pode ser nulo e nem vazio!");
        
        this.fabricante = value;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public void setModelo(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Modelo não pode ser nulo e nem vazio!");
        
        this.modelo = value;
    }

    public String getModelo(){
        return this.modelo;
    }

    public boolean equals(Object outro){
        if (outro == null)
            return false;
        
        if (outro == this)
            return true;

        if (outro.getClass() != this.getClass())
            return false;

        Aparelho objOutro = (Aparelho) outro;

        if (!this.prefixo.equals(objOutro.prefixo))
            return false;

        if (!this.modelo.equals(objOutro.modelo))    
            return false;
        
        if (!this.fabricante.equals(objOutro.fabricante))
            return false;
        
        return true;
    }

    public String toString(){
        return "Prefixo: " + this.prefixo + ", Fabricante: " + this.fabricante + ", Modelo: " + this.modelo.toString();
    }

    public int hashCode(){
        int hash = 7;

        hash = 31 * hash + (this.prefixo == null) ? 0 : this.prefixo.hashCode();
        hash = 31 * hash + (this.modelo == null) ? 0 : this.modelo.hashCode();
        hash = 31 * hash + (this.fabricante == null) ? 0 : this.fabricante.hashCode();

        return hash;
    }

    public Object clone(){
        try{
            return (Object) new Aparelho(this);
        }
        catch (Exception ex){
            return null;
        }
    }
}