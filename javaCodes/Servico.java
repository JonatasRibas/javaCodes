public class Servico extends Item implements Cloneable{
    private Integer tempoMedio;
    private Double aliquotaIss;


    public Servico(){}

    public Servico(Long codigo, String descricao, Categoria categoria, Double preco, Integer tempoMedio, Double aliquotaIss) throws Exception{
        super(Long codigo, String descricao, Categoria categoria, Double preco);
        
        this.setTempoMedio(tempoMedio);
        this.setAliquotaIss(aliquotaIss);
    }

    public Servico(Servico outro) throws Exception{
        if(outro==null)
            throw new Exception("Instância inválida fornecida!");

        super(outro.codigo, outro.descricao, outro.categoria, outro.preco);
        
        this.setTempoMedio(tempoMedio);
        this.aliquotaIss(outro.aliquotaIss);
    }

    public void setAliquotaIss(Double v) throws Exception{
        if(v==null||v<0)
            throw new Exception("ICMS inválido!");

        this.aliquotaIss=v;
    }

    public Double getAliquotaIss(){
        return this.aliquotaIss;
    }

    public void setTempoMedio(Integer v) throws Exception{
        if(v==null||v<0)
            throw new Exception("Tempo médio inválido!");

        this.tempoMedio=v;
    }

    public Integer getTempoMedio(){
        return this.tempoMedio;
    }

    public boolean equals(Object outro){
        if(!super.equals(outro))
            return false;

        if(outro.getClass()!=this.getClass())
            return false;

        Servico objOutro = (Servico) outro;

        if(!outro.tempoMedio.equals(this.tempoMedio))
            return false;

        if(!outro.aliquotaIss.equals(this.aliquotaIss))
            return false;

        return true;
    }

    public int hashCode(){
        int hash = 7;

        hash = hash * 31 + this.tempoMedio==null?0:this.tempoMedio.hashCode();
        hash = hash * 31 + this.aliquotaIss==null?0:this.aliquotaIss.hashCode();

        return hash;
    }

    public String toString(){
        return "Tempo médio: " + this.tempoMedio + "; Aliquota ICMS: " + this.aliquotaIss + "; ";
    }

    public Object clone(){
        try{
            return (Object) new Servico(this);
        }
        catch(Exception ex){
            return null;
        }
    }

}