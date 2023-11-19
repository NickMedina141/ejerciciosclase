
package modelo;

import java.util.ArrayList;


public class BaseDatos1 {
    ArrayList<Usuario> listaUsuario = new ArrayList<>();

    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
    public void agregarUsuarios(Usuario usuario1){
        listaUsuario.add(usuario1);
        
    }
}
