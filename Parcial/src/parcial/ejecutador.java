package parcial;
public class ejecutador {
    public static void main(String[] args) {
        Cine pelicula1 = new Cine("gandhi","richard attenborough", "drama",191, 1982, 8.1);
        Cine pelicula2 = new Cine("thor", "kenneth branagh", "accion", 115, 2011, 7.0);
        

        
        
        System.out.println("Informacion de objeto 1: "
                + "\npelicula epica: "+ pelicula1.PeliculaEpica(191)
                + "\nValoracion: "+pelicula1.calcularValoración(8.1)
                + "\nMostrar datos: "+pelicula1.mostrarDatos()
                + "\n\nInformacion de objeto 2: "
                + "\npelicula epica: "+ pelicula2.PeliculaEpica(115)
                + "\nValoracion: "+pelicula2.calcularValoración(7.0)
                + "\nSimilar:  "+pelicula1.esSimilar("drama","accion", 8.1, 7.0)
        );
        
    }
}
