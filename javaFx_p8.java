
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class javaFx_p8 extends Application{
    @Override
    public void start(Stage stage1){
        HBox hb=new HBox(10);
        Button b1=new Button("PLAY!");
        Button b2=new Button("START!");
        Button b3=new Button("STOP!");
        MyHandlerClass1 handler1=new MyHandlerClass1();
        MyHandlerClass2 handler2=new MyHandlerClass2();
        b1.setOnAction(handler1);
        b2.setOnAction(handler1);
        b3.setOnAction(handler2);
        hb.getChildren().addAll(b1,b2,b3);
        
        Scene scene1=new Scene (hb,400,200);
        stage1.setTitle("First Window");
        stage1.setScene(scene1);
        stage1.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}

class MyHandlerClass1 implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            JOptionPane.showMessageDialog(null, "The game will start soon...");
            
        }
    }

class MyHandlerClass2 implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            JOptionPane.showMessageDialog(null, "The game is stoped...");
            
        }
    }
