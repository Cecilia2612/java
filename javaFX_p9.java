
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class javaFX_p9 extends Application{
    TextField txt1,txt2,txt3,txt4;
    //it's a global object so that we can use it is "HandlerClass"
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage1){
        HBox hb=new HBox(10);
        Font fnt=Font.font("ink free",FontWeight.THIN,15);
        /*
        Label L1=new Label("First Name: ");
        Label L2=new Label("Second Name: ");
        txt1=new TextField();
        txt2=new TextField();
        Button b1=new Button("Enter");
        
        
        L1.setFont(fnt);    L1.setTextFill(Color.RED);
        L2.setFont(fnt);    L2.setTextFill(Color.RED);
        txt1.setFont(fnt);  txt2.setFont(fnt);
        b1.setFont(fnt);    b1.setTextFill(Color.RED);
        txt1.setPrefSize(150, 30);  txt2.setPrefSize(150, 30);
        
        HandlerClass handler=new HandlerClass();
        b1.setOnAction(handler);
        
        hb.getChildren().addAll(L1,txt1,L2,txt2,b1);
        */
        
        Label l=new Label("Enter a statement");
        Button b1=new Button ("Copy & Paste");
        Button b2=new Button ("Cut & Paste");
        Button b3=new Button ("Clear");
        txt3=new TextField();
        txt4=new TextField();
        l.setFont(fnt);     l.setTextFill(Color.RED);
        b1.setFont(fnt);    b1.setTextFill(Color.RED);
        b2.setFont(fnt);    b2.setTextFill(Color.RED);
        b3.setFont(fnt);    b3.setTextFill(Color.RED);
        txt3.setFont(fnt);  txt3.setPrefSize(200, 25);
        txt4.setFont(fnt);  txt4.setPrefSize(200, 25);
        
        HandlerClass1 handler1=new HandlerClass1();
        b1.setOnAction(handler1);
        
        HandlerClass2 handler2=new HandlerClass2();
        b2.setOnAction(handler2);
        
        HandlerClass3 handler3=new HandlerClass3();
        b3.setOnAction(handler3);
        
        hb.getChildren().addAll(l,txt3,txt4,b1,b2,b3);
        
        Scene scene1=new Scene (hb,900,200);
        stage1.setTitle("First Window");
        stage1.setScene(scene1);
        stage1.show();
        
    }
    
/*
class HandlerClass implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Hello " + txt1.getText()+" "+txt2.getText());
        }
    }
    */
    
    
    class HandlerClass1 implements EventHandler<ActionEvent>{    
        @Override
        public void handle(ActionEvent e){
            txt4.setText(txt3.getText());
        }
    } 
    class HandlerClass2 implements EventHandler<ActionEvent>{    
        @Override
        public void handle(ActionEvent e){
            txt4.setText(txt3.getText());
            txt3.clear();
        }
    }
    class HandlerClass3 implements EventHandler<ActionEvent>{    
        @Override
        public void handle(ActionEvent e){
            txt3.clear();
            txt4.clear();
        }
    }
   
}
