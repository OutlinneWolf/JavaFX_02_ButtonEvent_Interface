package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

/* * Butões e eventos pelo método interface
 * -Para apanhar os eventos dos butões há duas formas:
 * 1	-metodo da interface (esta aula)
 * 2	-metodo inline por classes anonimas
 * 
 * Interface é uma classe totalmente abstract (metodos e atributos)
 * 	significa qe nao é nstaciavel. Significa qe os seus metodos têm de ser implementados.
 * */

//Notas finais - A interface eventhandler é uma interface com metodos por implementar, que define o
//					tipo de ação nos seus parenteses retos: mouseEvent, KeybordEvent, ActionEvent
//			   - Interface é uma classe com todos od metodos abstract. Têm de ser
//				 implementados na classe que implementar. As interface sao implementadas

public class Main extends Application implements EventHandler<ActionEvent>{
	
	Button btn;
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {			//metodo criado pela superclasse Application
		try {
			
			//Código
			
			btn = new Button("Press me");
			btn.setOnAction(this);					//settOnAction - Ativa a captura que eventos do tipo click 
													//e informa que deve procurar o metodo handler() 
													//algures nesta classe
										
			StackPane layoutRoot = new StackPane();
			layoutRoot.getChildren().add(btn);
			Scene scene = new Scene(layoutRoot,400,400);
			primaryStage.setScene(scene);			//Define a janela stage com a scene incluida
			primaryStage.show();					//Executa a janela
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == btn){
			System.out.println("I have been press");
		}
	}
	
	
}
