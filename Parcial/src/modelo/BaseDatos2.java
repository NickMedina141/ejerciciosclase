package modelo;

import java.util.ArrayList;

public class BaseDatos2 {
    ArrayList<Auto> listaAutos = new ArrayList<>();
    
    
    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }
    
    public void agregarAuto(Auto auto){
        this.listaAutos.add(auto);
    }
}
