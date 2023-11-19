package parcial;
public class Voltaje {
    private double frecuencia;

    public Voltaje() {
        this.frecuencia = 80;
    } 
    public Voltaje(double frecuencia){
        this.frecuencia = frecuencia;
    }
    
    public void setFrecuencia(double frecuencia){
        this.frecuencia = frecuencia;
    }
    public double getFrecuencia(){
        return frecuencia; 
    }
    public void up(){
        frecuencia += 0.5;
        evaluador();
         
    }
    public void down(){
        frecuencia -= 0.5;
        evaluador();
    }
    
    public void evaluador(){
        if(frecuencia < 80){
            frecuencia = 108;
        }
        else if(frecuencia > 108){
            frecuencia = 80;
        }
    }
    
    
    
    public String display(){
        return "La frecuencia es: "+ frecuencia;
    }
    
     
    
    
}
