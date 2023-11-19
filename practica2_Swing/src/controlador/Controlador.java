
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.BaseDatos;
import modelo.Paciente;
import vista.Vista;

public class Controlador implements ActionListener{
    Paciente paciente;
    BaseDatos baseDatos;
    Vista vista;
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Controlador(Paciente paciente, BaseDatos baseDatos, Vista vista) {
        this.paciente = paciente;
        this.baseDatos = baseDatos;
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        this.vista.getBtnAgregar().addActionListener(this);
        this.vista.getBtnSalir().addActionListener(this);
        this.vista.getBtnLimpiar().addActionListener(this);
        this.modelo.addColumn("Nombre");
        this.modelo.addColumn("Edad");
        this.modelo.addColumn("Genero");
        this.modelo.addColumn("Enfermedad");
        this.modelo.addColumn("Seguro");
        refrescarTable();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()== vista.getBtnAgregar()){
              agregarPaciente();
          }
          if(e.getSource()== vista.getBtnSalir()){
              System.exit(0);
          }
          if(e.getSource()== vista.getBtnLimpiar()){
              limpiar();
          }
    }
    
    
    public void refrescarTable(){
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        
        for(Paciente paciente: baseDatos.getPacientes()){
            Object a[] = new Object[5];
            a[0] = paciente.getNombre();
            a[1] = paciente.getEdad();
            a[2] = paciente.getGenero();
            a[3] = paciente.getEnfermedad();
            a[4] = paciente.getSeguro();
            modelo.addRow(a);
        }
        vista.getTblPacientes().setModel(modelo);
    }
    public void agregarPaciente(){
        Paciente paciente = new Paciente(vista.getTxtNombre().getText().toString(),Integer.parseInt(vista.getTxtEdad().getText().toString()),
                vista.getCmbGenero().getSelectedItem().toString(), vista.getTxtEnfermedad().getText().toString(), vista.getCmbSeguro().getSelectedItem().toString());
        
        baseDatos.agregarPaciente(paciente);
        refrescarTable();
    }
    
    public void limpiar(){
        vista.getTxtNombre().setText(" ");
        vista.getTxtEdad().select(0, 0);
        vista.getCmbGenero().setSelectedIndex(0);
        vista.getTxtEnfermedad().setText(" ");
        vista.getCmbSeguro().setSelectedIndex(0);
    }
    
    
}
