package com.funnybanking;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AccountOverviewController {
    
    @FXML
    private Button logout;


    @FXML
    private void TEMP_GO_BACK() throws IOException{
        App.setRoot("StartupWindow");
    }

    @FXML
    private void hoverOpenAccoutButton(){
        if (logout.isHover()){
           logout.setStyle("-fx-background-radius: 10; -fx-background-color: #C30000; -fx-border-color: black; -fx-border-radius: 10; -fx-font-size: 18; -fx-font-weight: bold");
           logout.setUnderline(true); 
        }else if(!logout.isHover()){
            logout.setStyle("-fx-background-radius: 10; -fx-background-color: #FF0000; -fx-border-color: black; -fx-border-radius: 10; -fx-font-size: 18; -fx-font-weight: bold");
            logout.setUnderline(false);
        }               
        
    } 
}
