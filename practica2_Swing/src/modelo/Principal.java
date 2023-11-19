
package modelo;

import controlador.Controlador;
import vista.Vista;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        BaseDatos baseDatos = new BaseDatos();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(paciente, baseDatos, vista);
        
    }
}
