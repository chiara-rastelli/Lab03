/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Dictionary model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="menuBtn"
    private MenuButton menuBtn; // Value injected by FXMLLoader

    @FXML // fx:id="menuItemItaliano"
    private MenuItem menuItemItaliano; // Value injected by FXMLLoader

    @FXML // fx:id="menuItemEnglish"
    private MenuItem menuItemEnglish; // Value injected by FXMLLoader

    @FXML // fx:id="txtTestoUtente"
    private TextField txtTestoUtente; // Value injected by FXMLLoader

    @FXML // fx:id="btnSpellCheck"
    private Button btnSpellCheck; // Value injected by FXMLLoader

    @FXML // fx:id="txtParoleSbagliate"
    private TextField txtParoleSbagliate; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML // fx:id="labelMessaggioErrori"
    private Label labelMessaggioErrori; // Value injected by FXMLLoader

    @FXML
    void choseEnglish(ActionEvent event) {
    	this.menuBtn.setText("English");
    }

    @FXML
    void choseItaliano(ActionEvent event) {
    	this.menuBtn.setText("Italiano");
    }

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {
    	
    	String inputUtente = this.txtTestoUtente.getText();


    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert menuBtn != null : "fx:id=\"menuBtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert menuItemItaliano != null : "fx:id=\"menuItemItaliano\" was not injected: check your FXML file 'Scene.fxml'.";
        assert menuItemEnglish != null : "fx:id=\"menuItemEnglish\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTestoUtente != null : "fx:id=\"txtTestoUtente\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnSpellCheck != null : "fx:id=\"btnSpellCheck\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParoleSbagliate != null : "fx:id=\"txtParoleSbagliate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
        assert labelMessaggioErrori != null : "fx:id=\"labelMessaggioErrori\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
    public void setModel(Dictionary d) {
    	this.model = d;
    }
    
}
