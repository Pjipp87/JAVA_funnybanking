package com.funnybanking;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;

import static com.funnybanking.NewUser.createUser;

/**
 * RegistrationWindowController
 */
public class RegistrationWindowOneController {

    
    // Buttons
    @FXML
    private Button cancel, forward, okay;

    @FXML
    private Pane hinweis;

    @FXML
    private RadioButton radioMale, radioFemale;

    @FXML
    private TextField firstname;
    
    @FXML
    private TextField lastname, email, street, zipcode, streetnumber, city;
    

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private ToggleGroup title;


    @FXML
    private void cancelRegistration() throws IOException{
        App.setRoot("StartupWindow");  
    }

    @FXML
    private void goForward() throws IOException{
        // (anrede,firstname, lastname,  email, dateOfBirth,  street, streetnumber,zipcode, city)
        if(checkForCompletion()){
            if(radioMale.isSelected()){
                createUser("Frau", firstname.getText().toString(), lastname.getText().toString(), email.getText().toString(), dateOfBirth.getValue().toString(), street.getText().toString(), Integer.parseInt(streetnumber.getText().toString()), zipcode.getText().toString(), city.getText().toString() );
            }else{
                createUser("Herr", firstname.getText().toString(), lastname.getText().toString(), email.getText().toString(), dateOfBirth.getValue().toString(), street.getText().toString(), Integer.parseInt(streetnumber.getText().toString()), zipcode.getText().toString(), city.getText().toString() );
            }       
            App.setRoot("RegistrationWindowTwo");
        } else{
            System.out.println(dateOfBirth.getValue());
            hinweis.setVisible(true);
        }
         
    }

    @FXML 
    private void closeHinweis(){
        hinweis.setVisible(false);
    }

    private boolean checkForCompletion(){
        if(title.getSelectedToggle() != null && dateOfBirth.getValue() != null && firstname.getText() != null && lastname.getText() != null && email.getText() != null && street.getText() != null && streetnumber.getText() != null && zipcode.getText() != null && city.getText() != null){
           if(checkForValidEmail() && checkForValidStreetNumber()){
            return true;
           } else{
            return false;
           }
        }
        else{
            return false;
        }
    }

    private boolean checkForValidStreetNumber(){
         try {                
                int streetnumber_int = Integer.parseInt(streetnumber.getText().toString());
                return true;
            } catch (Exception e) {
                streetnumber.setStyle("-fx-border-color: red; -fx-border-width: 2");
            }
            return false;
    }

    private boolean checkForValidEmail(){
        if(email.getText().toString().contains("@") && email.getText().toString().contains(".")){
            return true;
        }
        else{
            email.setStyle("-fx-border-color: red; -fx-border-width: 2");
            return false;
        }
    }

    



}