package com.funnybanking;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
        private Text name;
    
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
           name.setText(getUser().getFirstname());
        }
}
