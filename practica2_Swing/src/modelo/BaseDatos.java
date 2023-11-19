
package modelo;

import java.util.ArrayList;

public class BaseDatos {
    ArrayList<Paciente> pacientes = new ArrayList<>();

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public void agregarPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }
}
