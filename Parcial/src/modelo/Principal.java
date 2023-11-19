
package modelo;

import controlador.Controlador1;
import controlador.Controlador2;
import vista.Vista1;
import vista.Vista2;

public class Principal {
    public static void main(String[] args) {
//        Usuario usuario1= new Usuario();
//        BaseDatos1 baseDatos1 = new BaseDatos1();
//        Vista1 vista1 = new Vista1();
//        Controlador1  controlador1 = new Controlador1(usuario1, baseDatos1, vista1);
        Auto auto1 = new Auto();
        BaseDatos2 baseDatos2 = new BaseDatos2();
        Vista2 vista2 = new Vista2();
        Controlador2 controlador2 = new Controlador2(auto1, baseDatos2, vista2);
    }
}
