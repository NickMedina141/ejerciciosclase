package parcial;

public class Cine {
    // Atributos
    private String nombre;
    private String director;
    private String genero;
    private int duracion;
    private int año;
    private double calificacion;

    
    // constructor
    public Cine(String nombre, String director, String genero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;

    }
    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

      
    public double getCalificacion() {
        return calificacion;
    }
    
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // metodos
    public String mostrarDatos() {
        return "\nel nombre:" + nombre
                + "\nel director: " + director
                + "\nel genero: " + genero
                + "\nla duracción: " + duracion
                + "\nel ano:" + año
                + "\nLa calificacion: " + calificacion;
        
                
    }

    public boolean PeliculaEpica(int duracion) {
        boolean valor;
        if (duracion * 1 / 60 >= 3) {
            valor = true;
        } else {
            valor = false;

        }
        return valor;
    }

    public String calcularValoración(double calificacion) {
        String valoracion = null;
        if (calificacion <= 2) {
            valoracion = "muy mala";
        } else if (calificacion <= 5) {
            valoracion = "mala";
        } else if (calificacion <= 7) {
            valoracion = "regular";
        } else if (calificacion <= 8) {
            valoracion = "buena";
        } else if (calificacion <= 10) {
            valoracion = "excelente";

        }
        return valoracion;
    }
    
    public boolean esSimilar(String genero1,  String genero2, double valoracion1, double valoracion2){
        boolean valor; 
        if(genero1.equals(genero2) && valoracion1 == valoracion2){
            valor = true;
        }
        else{
            valor = false;
        }
        return valor;
    }

}
