
package mvc;

import controlador.Control;
import modelo.Feligres;
import vista.Vista;


public class mvc {
    public static void main(String[] args) {
        
        Vista vistaL = new Vista();
        Feligres modeloL = new Feligres();        
        Control controlL = new Control(modeloL, vistaL);
        
        vistaL.setVisible(true);
        vistaL.setTitle("La Sagrada Familia");
        
    }
    
}
