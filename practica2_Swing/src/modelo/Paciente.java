
package modelo;

public class Paciente {
    private String nombre;
    private int edad;
    private String genero;
    private String enfermedad;
    private String seguro;
    
    
    public Paciente(){
        
    }

    public Paciente(String nombre, int edad, String genero, String enfermedad, String seguro) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.enfermedad = enfermedad;
        this.seguro = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", enfermedad=" + enfermedad + ", seguro=" + seguro + '}';
    }
    
    
    
}
