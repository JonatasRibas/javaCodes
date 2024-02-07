public class Aviao{
    private String prefixoAparelho;
    private int altitudeAtual;
    private int altitudeMaxima;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Aviao(){
        this.altitudeMaxima = 0;
        this.velocidadeMaxima = 0;
    }

    public Aviao(String prefix){
        this.setPrefixoAparelho(prefix);
        this.altitudeMaxima = 0;
        this.velocidadeMaxima = 0;
    }

    public Aviao(String prefix, int velMax, int altMax){
        this.setPrefixaAprelho(prefix);
        this.setVelocidadeMaxima(velMax);
        this.setAltitudeMaxima(altMax);
    }

    public void setPrefixoAparelho(String v){
        if (v == null)   // if (v == "")
            throw new Exception("Prefixo nunlo!");
        

        this.prefixoAparelho = v;
    }

    public String getPrefixoAparelho(){
        return this.prefixoAparelho;
    }

    public void setAltitudeAtual(int v){
        if (this.altitudeMaxima == 0)
            throw new Exception("Altitude máxima precisa ser definida!");

        if ((v > this.altitudeMaxima) || (v < 0))
            throw new Exception("Altitude inválida!");

        this.altitudeAtual = v;
    }

    public int getAltitudeAtual(){
        return this.altitudeAtual;
    }

    public void setAltitudeMaxima(int v){
        if ((v < 0) || (v > 40000))
            throw new Exception("Altitude máxima inválida!");

        this.altitudeMaxima = v;
    }

    public int getAltitudeMaxima(){
        return this.altitudeMaxima;
    }

    public void setVelocidadeAtual(int v){
        if (this.velocidadeMaxima == 0)
            throw new Exception("Velocidade máxima não definida!");

        if ((v > this.velocidadeMaxima) || (v < 0))
            throw new Exception("Velocidade inválida!");

        this.velocidadeAtual = v;
    }

    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    public void setVelocidadeMaxima(int v){
        if ((v < 0) || (v > 950))
            throw new Exception("Velocidade máxima inválida");

        this.velocidadeMaxima = v;
    }

    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
}