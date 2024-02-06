public class Data{
    private int dia;
    private int mes;
    private int ano;

    public void setDia(int value){
        if (this.mes == 0)
            throw new Exception("Informe o mês primeiro!");

        if ( ((this.mes == 1) ||
              (this.mes == 3) ||
              (this.mes == 5) ||
              (this.mes == 7) ||
              (this.mes == 8) ||
              (this.mes == 10) ||
              (this.mes == 12)) && 
              ((value <1) || (value > 31)) )
             throw new Exception("Dia inválido!");

        if ( ((this.mes == 4) ||
              (this.mes == 6) ||
              (this.mes == 9) ||
              (this.mes == 11)) &&
              ((value < 1) || (value > 30)) )
             throw new Exception("Dia invalido!");

        if ( (this.mes == 2) && 
             ((value < 1) || (value > 28)) )
             thorw new Exception("Dia inválido!"); 
    
        this.dia = value;
    }

    public int getDia(){
        return this.dia;
    }

    public void setMes(int value){
        if ((value < 1) || (value > 12))
            thorw new Exception("Mês inválido!");

        this.mes = value;
    }

    public int getMes(){
        return this.mes;
    }

    public void setAno(int value){
        if (value < 0)
            throw new Exception("Ano inválido");
        
        this.ano = value;
    }

    public int getAno(){
        return this.ano;
    }
}