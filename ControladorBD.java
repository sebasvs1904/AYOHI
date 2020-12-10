package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import Vista.VistaPanel;
import Modelo.OperacionBD;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ControladorBD implements ActionListener{
    OperacionBD modeloE = new OperacionBD();
    VistaPanel vistaE= new VistaPanel();
    JFileChooser selecArchivo = new JFileChooser();
    File archivo;
    int contAccion=0;
    
    public ControladorBD(VistaPanel vistaE, OperacionBD modeloE){
        this.vistaE= vistaE;
        this.modeloE=modeloE;
        this.vistaE.btnImportar.addActionListener(this);

    }
    
    public void AgregarFiltro(){
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        contAccion++;
        if(contAccion==1)AgregarFiltro();
        
        if(e.getSource() == vistaE.btnImportar){
            if(selecArchivo.showDialog(null, "Seleccionar archivo")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
                    JOptionPane.showMessageDialog(null, 
                            modeloE.Importar(archivo, vistaE.jtDatos) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1), 
                            "IMPORTAR EXCEL", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Elija un formato valido.");
                }
            }
        }
        
        
    }
    
}
