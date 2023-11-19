
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Auto;
import modelo.BaseDatos1;
import modelo.BaseDatos2;
import modelo.Usuario;
import vista.Vista1;
import vista.Vista2;
public class Controlador1 implements ActionListener {
    
    Usuario usuario1;
    BaseDatos1 baseDatos1;
    Vista1 vista1;
    Vista2 vista2;
    Controlador2 controlador2;
    

    public Controlador1(Usuario usuario1, BaseDatos1 baseDatos1, Vista1 vista1) {
        this.usuario1 = usuario1;
        this.baseDatos1 = baseDatos1;
        this.vista1 = vista1;
        this.vista1.setVisible(true);
        this.vista1.setLocationRelativeTo(null);
        this.vista1.setTitle("inicio de usuario");
        this.vista1.getBtnIngresar().addActionListener(this);
        
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==  vista1.getBtnIngresar()){
            JOptionPane.showMessageDialog(vista1, "Espichaste el boton agregar usuario");
                    Auto auto1 = new Auto();
                    BaseDatos2 baseDatos2 = new BaseDatos2();
                    Vista2 vista2 = new Vista2();
                    Controlador2 controlador2 = new Controlador2(auto1, baseDatos2, vista2);
                    
                    
            
//            if(revisarUsuario() == true){
//               vista2.setVisible(true);
//            }
//            else if(revisarUsuario() == false){
//                agregarUsuario();
//            }
            
        }
    }
    
    
    public void agregarUsuario(){
        usuario1 = new Usuario(vista1.getTxtUsuario().getText().toString(),vista1.getTxtContraseña().getPassword().toString());
        baseDatos1.agregarUsuarios(usuario1);
        JOptionPane.showMessageDialog(null, baseDatos1.getListaUsuario());
    }
    
    public boolean revisarUsuario(){
        for(Usuario usuario: baseDatos1.getListaUsuario()){
            System.out.println("revisa "+usuario);
            if(vista1.getTxtUsuario().getText().toString() == usuario.getUsuario()){
                if(vista1.getTxtContraseña().getPassword().toString() == usuario.getContraseña()){
                    System.out.println("Hola nicolas");
                    return true;
                }
                else{
                    
                }
            }
            else{
                
            }
        }
        System.out.println("Hola andres");
        
        return false;
    }
    
    
}
