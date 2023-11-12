
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class javaFX_p11 extends Application{
    RadioButton rb1,rb2,rb3,rb4;
    Label la1;
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage1){
        VBox vb=new VBox(15);
        Font fnt3=Font.font("ink free",FontWeight.BOLD,15);
        
        Label la=new Label("Select you major");
        la1=new Label();
        rb1=new RadioButton("Computer Science");
        rb2=new RadioButton("Computer Information Science");
        rb3=new RadioButton("Software Engineering");
        rb4=new RadioButton("Computer Graphics and Animation");
        Button b1=new Button("اضغط لمعرفة موعد الامتحان");
        la.setFont(fnt3);   la.setTextFill(Color.RED);
        la1.setFont(fnt3);   la1.setTextFill(Color.RED);
        b1.setFont(fnt3);   b1.setTextFill(Color.RED);
        rb1.setFont(fnt3);  rb2.setFont(fnt3);
        rb3.setFont(fnt3);  rb4.setFont(fnt3);
        rb1.setTextFill(Color.BLUE);    rb2.setTextFill(Color.GREEN);
        rb3.setTextFill(Color.YELLOW);  rb4.setTextFill(Color.BROWN);
        
        ToggleGroup tg1=new ToggleGroup();
        rb1.setToggleGroup(tg1);
        rb2.setToggleGroup(tg1);
        rb3.setToggleGroup(tg1);
        rb4.setToggleGroup(tg1);
        
        vb.getChildren().addAll(la,rb1,rb2,rb3,rb4,b1,la1);
        
        /*
        //Inner class:
        HandlerSub handler1=new HandlerSub();
        b1.setOnAction(handler1);
        */
        
        /*
        //Anonymous class:
        b1.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle (ActionEvent e){
            JOptionPane.showMessageDialog(null, "We Will Start Soon...");
        }
        });
        */
        
        //Lambds expression
        b1.setOnAction(e->{
            JOptionPane.showMessageDialog(null, "HI!");
        });
        
        Scene scene=new Scene(vb,500,600);
        stage1.setTitle("Firts Window");
        stage1.setScene(scene);
        stage1.show();
        
    }
    
    class HandlerSub implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            if(rb1.isSelected())
                la1.setText("Your major is: "+rb1.getText()+"and your is on 1/11/2023");
            else if(rb2.isSelected())
                la1.setText("Your major is: "+rb2.getText()+"and your is on 2/11/2023");
            else if(rb3.isSelected())
                la1.setText("Your major is: "+rb3.getText()+"and your is on 3/11/2023");
            else if(rb4.isSelected())
                la1.setText("Your major is: "+rb4.getText()+"and your is on 4/11/2023");
            else
                la1.setText("يجب ان تختار التخصص قبل الضغط على الزر");
        }
    }
}
