
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javaFX_p2 extends Application{
    public void start(Stage stage1) {
        /*
        Button btn1=new Button("click me");
        Scene scene=new Scene (btn1);
        
        stage1.setTitle("First Window");
        stage1.setScene(scene);
        stage1.show();
        System.out.println(scene.getWidth());
        System.out.println(scene.getHeight());
        System.out.println(stage1.getWidth());
        System.out.println(stage1.getHeight());
        */
        
        
        /*
        Stage stage2=new Stage();
        Button b1=new Button("Button 1");
        Button b2=new Button("Button 2");
        Button b3=new Button("Button 3");
        
        VBox vb1=new VBox(30);//the number is for the gap
        //It determines the type of layout
        vb1.getChildren().add(b1);
        vb1.getChildren().add(b2);
        vb1.getChildren().add(b3);
        Scene scene2=new Scene(vb1);
        
        stage2.setTitle("Second Window");
        stage2.setScene(scene2);
        stage2.show();
        */
        
        
        Stage stage3=new Stage();
        Button bt1=new Button("Button 1");
        Button bt2=new Button("Button 2");
        Button bt3=new Button("Button 3");
        
        HBox hb=new HBox(40);
        //hb.getChildren().add(bt1);
        //hb.getChildren().add(bt2);
        //hb.getChildren().add(bt3);
        hb.getChildren().addAll(bt1,bt1,bt3);
        Scene scene3=new Scene(hb);
        
        stage3.setTitle("Third Window");
        stage3.setScene(scene3);
        stage3.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
