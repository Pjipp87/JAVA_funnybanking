package com.funnybanking;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RegistrationWindowTwoController {
    

        // Buttons
        @FXML
        private Button cancel;
        @FXML
        private Button back;
        @FXML
        private Button forward;
    
        @FXML
        private void goBack() throws IOException{
            App.setRoot("RegistrationWindowOne");  
        }

        @FXML
        private void cancelRegistration() throws IOException{
            App.setRoot("StartupWindow");  
        }
}
