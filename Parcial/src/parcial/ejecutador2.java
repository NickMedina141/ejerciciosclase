package parcial;
public class ejecutador2 {
    public static void main(String[] args) {
        Voltaje rango = new Voltaje();
        System.out.println(rango.display());
        rango.up();
        rango.down();
        rango.down();
        rango.up();
        System.out.println(rango.display());
        
        
    }
}
