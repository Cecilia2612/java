
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class javaFX_p6 extends Application{
    @Override
    public void start(Stage stage1){
        Pane p1=new Pane();
        
        //The shapes that can add in javaFX:
        /*1*/Line L1=new Line(100,90,200,30);
        L1.setStroke(Color.SLATEBLUE);
        L1.setStrokeWidth(10);
        p1.getChildren().add(L1);
        
        /*2*/Circle C1=new Circle(300,90,80);
        C1.setStroke(Color.DARKORANGE);
        C1.setStrokeWidth(6);
        C1.setFill(Color.ALICEBLUE);
        p1.getChildren().add(C1);
        
        /*3*/Rectangle R1=new Rectangle(200,200,90,200);
        R1.setStroke(Color.OLIVEDRAB);
        R1.setStrokeWidth(12);
        R1.setFill(Color.BROWN);
        p1.getChildren().add(R1);
        
        Rectangle R2=new Rectangle(30,200,100,70);
        R2.setStroke(Color.LAWNGREEN);
        R2.setStrokeWidth(12);
        R2.setFill(Color.KHAKI);
        R2.setArcWidth(50);
        R2.setArcHeight(30);
        p1.getChildren().add(R2);
        
        Scene scene1=new Scene(p1,500,500);
        stage1.setTitle("First Window");
        stage1.setScene(scene1);
        stage1.show();
        
        
    }
    
    public static void main(String[] args) {
     Application.launch(args);
    }
}
