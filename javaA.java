
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class javaA extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage1){
        VBox vb=new VBox (20);
        Label L1=new Label("Java");
        Label L2=new Label("Java");
        Label L3=new Label("Java");
        Label L4=new Label("Java");
        Label L5=new Label("Java");
        
        Font fnt=Font.font("Times Roman",FontWeight.BOLD,FontPosture.ITALIC,22);
        L1.setFont(fnt);    L1.setTextFill(Color.color(1, 0, 0, 0.5));
        L2.setFont(fnt);    L2.setTextFill(Color.color(0, 1, 0, 0.3));
        L3.setFont(fnt);    L3.setTextFill(Color.color(0, 0, 1, 0.8));
        L4.setFont(fnt);    L4.setTextFill(Color.color(0.5, 0.5, 0.5, 1));
        L5.setFont(fnt);    L5.setTextFill(Color.color(1, 0, 1, 0.62));
        
        vb.getChildren().addAll(L1,L2,L3,L4,L5);
        vb.setRotate(90);
        vb.setAlignment(Pos.CENTER);
        
        Scene scene1=new Scene(vb,350,250);
        
        stage1.setTitle("Third Window");
        stage1.setScene(scene1);
        stage1.show();
        
    }
    
}
