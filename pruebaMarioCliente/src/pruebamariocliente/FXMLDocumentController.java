/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamariocliente;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import ws.EWS;
import ws.EWS_Service;
import ws.Equipo;

/**
 * FXML Controller class
 *
 * @author mario
 */
public class FXMLDocumentController implements Initializable {
    EWS_Service wsService = new EWS_Service();
    EWS pws;

    @FXML
    private JFXTextField txtA;
    @FXML
    private JFXTextField txtB;
    Integer result;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      pws = wsService.getEWSPort();
      
    }    

    @FXML
    private void sumar(ActionEvent event) {
        Equipo ob = pws.operation(Long.valueOf(txtA.getText()));
        System.out.print(ob.getEquNombre());
        System.out.print(ob.getEquNombre());
        
    }
    @FXML
    private void restar(ActionEvent event) {

    }
    
}
