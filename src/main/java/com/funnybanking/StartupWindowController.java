package com.funnybanking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Duration;


public class StartupWindowController implements Initializable {

    

    @FXML
    private Label label;
    

    @FXML
    private ImageView logo;

    @FXML
    private ImageView bankName;

 

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {        
        StartupAnimation();    
           
    }


    private void StartupAnimation(){
        //wait(5);
        FadeTransition visibilityFade = new FadeTransition(Duration.seconds(1), logo);
        TranslateTransition positonFade = new TranslateTransition(Duration.seconds(1),logo);


        visibilityFade.setFromValue(0);
        visibilityFade.setToValue(1.0);
        visibilityFade.play();
        
        

        positonFade.setFromX(496);
        positonFade.setToX(0);
        positonFade.play();
        positonFade.setOnFinished(event -> showBankName());


    }


    private void showBankName(){
        FadeTransition ft = new FadeTransition(Duration.seconds(1), bankName);
        ft.setFromValue(0);
        ft.setToValue(1.0);
        ft.play();
    }




  
    






}
