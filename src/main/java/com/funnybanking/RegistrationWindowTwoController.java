package com.funnybanking;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import static com.funnybanking.NewUser.getUser;

public class RegistrationWindowTwoController implements Initializable {
    

        // Buttons
        @FXML
        private Button cancel;
        @FXML
        private Button back;
        @FXML
        private Button forward;

        @FXML
        private Button okay;

        @FXML
        private Text name, warnings;

        @FXML AnchorPane completionPopUp;

        @FXML
        private TextField username;

        @FXML
        private PasswordField password, confirmPassword;
    
        @FXML
        private void goBack() throws IOException{
            App.setRoot("RegistrationWindowOne");  
        }

        @FXML
        private void cancelRegistration() throws IOException{
            App.setRoot("StartupWindow");  
        }

        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
           name.setText(getUser().getAnrede()+" "+ getUser().getFirstname() + " " + getUser().getLastname());
        }



        public void CompleteRegistration() throws NoSuchAlgorithmException{
            
            if(password.getText().toString().length() > 6){
               
                if (password.getText().toString().equals(confirmPassword.getText().toString()) ) {
                   
                    MessageDigest md = MessageDigest.getInstance("MD5");
                        byte[] messageDigest = md.digest(password.getText().getBytes());
                        BigInteger no = new BigInteger(1, messageDigest);
                        String hashtext = no.toString(16);
                        while (hashtext.length() < 32){
                            hashtext = "0"+ hashtext;
                        }

                        if(username.getText().toString().length() > 6){
                           NewUser.getUser().setUsername(username.getText().toString());
                            NewUser.getUser().setPasswordHash(hashtext); 
                        } else{
                            warnings.setText("Der Benutzername ist zu kurz. Mindestens 6 Zeichen");
                        }
                        


                       /*
                       DB Verbidnung
                       Password Warunungen
                       */ 

                        completionPopUp.setVisible(true);
                        
                } else{
                     // Warnung as Passwörter nicht übereinstimmen
                     warnings.setText("Die Passwörter stimmen nicht überein!");
                }
            } else{
                 // Warnung, das Password zu kurz
                 warnings.setText("Das Passwort ist zu kurz. Mindestens 6 Zeichen");
            }
        }
}
