package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Auto;
import modelo.BaseDatos2;
import vista.Vista2;
public class Controlador2 implements ActionListener{
    Auto auto;
    BaseDatos2 baseDatos2;
    Vista2 vista2;

    
    DefaultTableModel modelo2 = new DefaultTableModel();
    public Controlador2(){
        
    }
    
    public Controlador2(Auto auto,BaseDatos2 baseDatos2, Vista2 vista2) {
        this.auto = auto;
        this.baseDatos2 = baseDatos2;
        this.vista2 = vista2;
        this.vista2.setVisible(true);
        this.vista2.setLocationRelativeTo(null);
        this.vista2.setTitle("Parking");
        this.modelo2.addColumn("Nombre usuario");
        this.modelo2.addColumn("Matricula");
        this.modelo2.addColumn("Plaza");
        this.modelo2.addColumn("Marca");
        this.vista2.getBtnAgregar().addActionListener(this);
        this.vista2.getBtnSalir().addActionListener(this);
        refrescar();
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista2.getBtnAgregar()){
            agregarAutos();
        }
        if(ae.getSource() == vista2.getBtnSalir()){
            JOptionPane.showMessageDialog(null, "Sistema cerrado");
            System.exit(0);
        }
    }
    
    public void refrescar(){
        //Limpiar los datos de la tabla cada vez que se repita
        while(modelo2.getRowCount()> 0){
            modelo2.removeRow(0);
        }
        
        //Recorrer listaAlumnos y agregar cada objeto a una fila
        for (Auto auto: baseDatos2.getListaAutos()){
            Object a[] = new Object[4];
            a[0] = auto.getNombreUsuario();
            a[1] = auto.getMatricula();
            a[2] = auto.getPlaza();
            a[3] = auto.getMarca();
            modelo2.addRow(a);
        }
        vista2.getTblParking().setModel(modelo2);
      
    }
    
    public void agregarAutos(){
        Auto autos = new Auto(vista2.getTxtNombreUsuario().getText().toString(),vista2.getTxtMatricula().getText().toString(),
                Integer.parseInt(vista2.getTxtPlaza().getText().toString()),vista2.getCmbMarca().getSelectedItem().toString());
  
        baseDatos2.agregarAuto(autos);  
        refrescar();
        
        
    }

}
