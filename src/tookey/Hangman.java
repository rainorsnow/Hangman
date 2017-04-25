package tookey;

import java.util.*;
import java.io.*;
import javafx.animation.TranslateTransition;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.control.Label;
import javafx.util.Duration;
import javafx.scene.control.TextField;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.Scanner;



public class Hangman extends Application{

	public Stage primaryStage;		
	GridPane GP = new GridPane();
	 
	public FileReader myfilereader;
	public BufferedReader mybuffer;
	public FileWriter myfilewriter;
	public PrintWriter myprintwriter;
	private String inFile,outFile;
	private TextField tfLoad = new TextField();
	private TextField tfLoad2 = new TextField();
	private TextField tfLoad3 = new TextField();
	private TextField tfLoad4 = new TextField();
	public FadeTransition fade = new FadeTransition();
	 
	public void start(Stage primaryStage)
	{
		 GP.setAlignment(Pos.CENTER);
		 GP.setHgap(2);
		 GP.setVgap(2);
		 primaryStage.resizableProperty();
		 // primaryStage.setFullScreen(true);
		 
		 GP.setVisible(true);
		 int row = 10;
		 int col = 10;
		  
		 Scene scene = new Scene(GP,600,600);
		 primaryStage.setTitle("This one");
		 primaryStage.setScene(scene);
		 moveCircleOnKeyPress(scene, primaryStage);
		 primaryStage.show();
		  
		 GP.add(new Label("__________"),0,30);
		 GP.add(new Label("__________"),5,30);
		 GP.add(new Label("__________"),10,30);
		 GP.add(new Label("__________"),15,30);
		 GP.add(new Label("_________"
		  		+"\n"+    "|		|" +"\n" +
		  		"|		|" +"\n"
		  		+ 		  "		|"+"\n"
		  		+ 		  "		|" +"\n"
		  		+ 		  "		|			" +"\n"
		  		+ 		  "		|			" +"\n"
		  		+		  "_________________"),20,35);
		   
		 GP.add(tfLoad,30,50);
		  
	}

private void moveCircleOnKeyPress(Scene scene, Stage stage) 
 { 
	scene.setOnKeyPressed(new EventHandler<KeyEvent>() {        
	  @Override public void handle(KeyEvent event) { 
	   switch (event.getCode()) 
	    { 
	    	case ENTER:    
	    		doEnter(stage); 
	    		break;
	    
	    } 
	   } 
	  }); 
 } 


private void doEnter(Stage stage)
 {
	try {
		fade.start(stage);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
	
	public static void main(String args[])
	{
		
		Application.launch(args);
	}
}