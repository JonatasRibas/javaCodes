public class EscalaDeVoo{
    private String numeroVoo;
    private Aeroporto partida;
    private Aeroporto chegada;
    private Voo voo;
    private Pessoa piloto;
    private Pessoa copiloto;

    public EscalaDeVoo(){
        
    }

    public EscalaDeVoo(String numeroVoo, Aeroporto partida, Aeroporto chegada, Voo voo, Pessoa piloto, Pessoa copiloto) throws Exception{
        this.setNumeroVoo(numeroVoo);
        this.setPartida(partida);
        this.setChegada(chegada);
        this.setVoo(voo);
        this.setPiloto(piloto);
        this.setCopiloto(copiloto);
    }

    public EscalaDeVoo(EscalaDeVoo objOutro){
        if (objOutro == null)
            throw new Exception("Forneça uma instância para ser criada uma cópia");

        this.numeroVoo = objOutro.numeroVoo;
        this.partida = objOutro.partida;
        this.chegada = objOutro.chegada;
        this.voo = objOutro.voo;
        this.piloto = objOutro.piloto;
        this.copiloto = objOutro.copiloto;
    }

    public void setNumeroVoo(String value) throws Exception{
        if ((value == null) || (value.isEmpty()))
            throw new Exception("Numero de Voo não pode ser nulo ou vazio!");
        
        this.numeroVoo = value;
    }

    public String getNumeroVoo(){
        return this.numeroVoo;
    }

    public void setPartida(Aeroporto value) throws Exception{
        if (value == null)
            throw new Exception("Partida não informada!");
        
        this.partida = value;
    }

    public Aeroporto getPartida(){
        return this.partida.clone();
    }

    public void setChegada(Aeroporto value) throws Exception{
        if (value == null)
            throw new Exception("Chegada não informada!");
        
        this.chegada = value;
    }

    public Aeroporto getChegada(){
        return this.chegada.clone();
    }

    public void setVoo(Voo value) throws Exception{
        if (value == null)
            throw new Exception("Voo não informada!");
        
        this.voo = value;
    }

    public Voo getVoo(){
        return this.voo.clone();
    }

    public void setPiloto(Pessoa value) throws Exception{
        if (value == null)
            throw new Exception("Piloto não informada!");
        
        this.piloto = value;
    }

    public Pessoa getPiloto(){
        return this.piloto.clone();
    }

    public void setCopiloto(Pessoa value) throws Exception{
        if (value == null)
            throw new Exception("Copiloto não informada!");
        
        this.copiloto = value;
    }

    public Pessoa getCopiloto(){
        return this.copiloto.clone();
    }

    public double calcularDuracao(){
        if (this.voo == null)
            throw new Exception("Não é possível calcular a duração, pois o voo não foi informado!");

        return this.voo.getPartida().menos(this.voo.getChegada());
    }

    public boolean equals(Object outro){
        if (outro == null)
            return false;
        
        if (outro == this)
            return true;
        
        if (outro.getClass() != this.getClass())
            return false;
        
        EscalaDeVoo objOutro = (EscalaDeVoo) outro;

        if (!this.numeroVoo.equals(objOutro.numeroVoo))
            return false;

        if (!this.partida.equals(objOutro.partida))
            return false;

        if (!this.chegada.equals(objOutro.chegada))
            return false;
        
        if (!this.voo.equals(objOutro.voo))
            return false;

        if (!this.piloto.equals(objOutro.piloto))
            return false;

        if (!this.copiloto.equals(objOutro.copiloto))
            return false;
        
        return true;
    }

    public String toString(){
        return "Numero do Voo: " + this.numeroVoo + ", Partida: " + this.partida.toString() + ", Chegada: " + this.chegada.toString() + ", Voo: " + this.voo.toString() + ", Piloto: " + this.piloto.toString() + ", Copiloto: " + this.copiloto.toString();
    }

    public int hashCode(){
        int hash = 7;

        hash = 31 * hash + (this.numeroVoo == null) ? 0 : this.numeroVoo.hashCode();
        hash = 31 * hash + (this.partida == null) ? 0 : this.partida.hashCode();
        hash = 31 * hash + (this.chegada == null) ? 0 : this.chegada.hashCode();
        hash = 31 * hash + (this.voo == null) ? 0 : this.voo.hashCode();
        hash = 31 * hash + (this.piloto == null) ? 0 : this.piloto.hashCode();
        hash = 31 * hash + (this.copiloto == null) ? 0 : this.copiloto.hashCode();

        return hash;
    }

    public Object clone(){
        try{
            return (Object) new EscalaDeVoo(this);
        }
        catch (Exception ex){
            return null;
        }
    }
}