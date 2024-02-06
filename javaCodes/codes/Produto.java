package codes;

public class Produto extends Item implements Cloneable{
    private String ean;
    private Double estoque;
    private Double aliquotaIcms;

    public Produto(){}

    public Produto(Long codigo, String descricao, Categoria categoria, Double preco, String ean, Double estoque, Double aliquotaIcms) throws Exception{
        super(Long codigo, String descricao, Categoria categoria, Double preco);
        this.setEan(ean);
        this.setEstoque(estoque);
        this.setAliquotaIcms(aliquotaIcms);
    }

    public Produto(Produto outro) throws Exception{
        if(outro==null)
            throw new Exception("Instância inválida fornecida!");

        super(outro.codigo, outro.descricao, outro.categoria, outro.preco);
        this.setEan(outro.ean);
        this.setEstoque(outro.estoque);
        this.aliquotaIcms(outro.aliquotaIcms);
    }

    public void setEan(String v) throws Exception{
        if(v==null||v.isEmpty())
            throw new Exception("EAN inválido!");

        this.ean=v;
    }

    public String getEan(){
        return this.ean;
    }

    public void setEstoque(Double v) throws Exception{
        if(v==null||v<0)
            throw new Exception("Estoque inválido!");

        this.estoque=v;
    }

    public Double getEstoque(){
        return this.estoque;
    }

    public void setAliquotaIcms(Double v) throws Exception{
        if(v==null||v<0)
            throw new Exception("ICMS inválido!");

        this.aliquotaIcms=v;
    }

    public Double getAliquotaIcms(){
        return this.aliquotaIcms;
    }

    public boolean equals(Object outro){
        if(!super.equals(outro))
            return false;

        if(outro.getClass()!=this.getClass())
            return false;

        Produto objOutro = (Produto) outro;

        if(!outro.ean.equals(this.ean))
            return false;

        if(!outro.estoque.equals(this.estoque))
            return false;

        if(!outro.aliquotaIcms.equals(this.aliquotaIcms))
            return false;

        return true;
    }

    public int hashCode(){
        int hash = 7;

        hash = hash * 31 + this.ean==null?0:this.ean.hashCode();
        hash = hash * 31 + this.estoque==null?0:this.estoque.hashCode();
        hash = hash * 31 + this.aliquotaIcms==null?0:this.aliquotaIcms.hashCode();

        return hash;
    }

    public String toString(){
        return "EAN: " + this.ean + "; Estoque: " + this.estoque + "; Aliquota ICMS: " + this.aliquotaIcms + "; ";
    }

    public Object clone(){
        try{
            return (Object) new Produto(this);
        }
        catch(Exception ex){
            return null;
        }
    }

}