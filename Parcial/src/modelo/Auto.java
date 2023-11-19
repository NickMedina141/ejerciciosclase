package modelo;

public class Auto {
    private String nombreUsuario;
    private String matricula;
    private int plaza;
    private String marca;
    
    
    public Auto(){
        
    }
    public Auto(String nombreUsuario, String matricula, int plaza, String marca) {
        this.nombreUsuario = nombreUsuario;
        this.matricula = matricula;
        this.plaza = plaza;
        this.marca = marca;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombreUsuario=" + nombreUsuario + ", matricula=" + matricula + ", plaza=" + plaza + ", marca=" + marca + '}';
    }
    
    
}
