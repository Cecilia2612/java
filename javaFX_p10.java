
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

public class javaFX_p10 extends Application{
    TextField txt1,txt2;
    TextField txt3,txt4,txt5;
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage1){
        
        HBox hb= new HBox(15);
        Font fnt=Font.font("ink free",FontWeight.THIN,15);
        
        /*
        Label la1=new Label("Enter a number");
        Label la2=new Label("Result: ");
        txt1=new TextField();
        txt2=new TextField();
        Button b=new Button("Square");
        
        la1.setFont(fnt);   la1.setTextFill(Color.RED);
        la2.setFont(fnt);   la1.setTextFill(Color.RED);
        txt1.setFont(fnt);  txt2.setFont(fnt);
        b.setFont(fnt);     b.setTextFill(Color.RED);
        
        HandlerClass handler1=new HandlerClass();
        b.setOnAction(handler1);
        */
        
        
        Label la3=new Label("First Number");
        Label la4=new Label("Second Number");
        Label la5=new Label("Result");
        txt3=new TextField();
        txt4=new TextField();
        txt5=new TextField();
        Button b1=new Button("ADD");
        Button b2=new Button("SUB");
        
        la3.setFont(fnt);   la3.setTextFill(Color.RED);
        la4.setFont(fnt);   la4.setTextFill(Color.RED);
        la5.setFont(fnt);   la5.setTextFill(Color.RED);
        txt3.setFont(fnt);  txt4.setFont(fnt);  txt5.setFont(fnt);
        b1.setFont(fnt);   b1.setTextFill(Color.RED);
        b2.setFont(fnt);   b2.setTextFill(Color.RED);
        
        HandlerAdd handler2=new HandlerAdd();
        b1.setOnAction(handler2);
        HandlerSub handler3=new HandlerSub();
        b2.setOnAction(handler3);
        
        hb.getChildren().addAll(la3,txt3,la4,txt4,b1,b2,la5,txt5);
        Scene scene=new Scene(hb,900,300);
        
        stage1.setTitle("Firts Window");
        stage1.setScene(scene);
        stage1.show();
        
    }
    
    class HandlerClass implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            String a=txt1.getText();
            int x=Integer.parseInt(a);
            int y=x*x;
            String t=String.valueOf(y);
            txt2.setText(t);
            //txt2.setText(Integer.toString(y));//other way
        }
    }
    
    class HandlerAdd implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            String s1=txt3.getText();
            String s2=txt4.getText();
            int z1=Integer.parseInt(s1);
            int z2=Integer.parseInt(s2);
            int v=z1+z2;
            txt5.setText(Integer.toString(v));
        }
    }   
    
    class HandlerSub implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            String s1=txt3.getText();
            String s2=txt4.getText();
            int z1=Integer.parseInt(s1);
            int z2=Integer.parseInt(s2);
            int v=z1-z2;
            txt5.setText(Integer.toString(v));
        }
    }
    
}
