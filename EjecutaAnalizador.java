
package PrincipalAnalizador;
import Modelo.OperacionBD;
import Vista.VistaPanel;
import Controlador.ControladorBD;

public class EjecutaAnalizador {

    public static void main(String[] args) {
        OperacionBD modeloE = new OperacionBD();
        VistaPanel vistaE = new VistaPanel();
        ControladorBD controlador = new ControladorBD(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);
    }
    
}
