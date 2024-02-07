public class Horario{
    private int hora;
    private int minuto;
    private int segundo;

    public void setHora(int value){
        if ((value < 0) || (value > 23))
           throw new Exception("A hora e inválida!");
 
        this.hora = value;
    }

    public int getHora(){
        return this.hora;
    }

    public void setMinuto(int value){
        if ((value < 0) || (value > 59))
            throw new Exception("O minuto é inválido");

        this.minuto = value;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setSegundo(int value){
        if ((value < 0) || (value > 59))
            throw new Exception("Segundo é inválido!");
   
        this.segundo = value;
    }

    public int getSegundo(){
        return this.segundo;
    }
}


