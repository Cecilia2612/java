
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class javaFX_p4 extends Application{
    
    public void start(Stage stage1){
        Button bt1=new Button("Button 1");
        Button bt2=new Button("Button 2");
        Button bt3=new Button("Button 3");
        Button bt4=new Button("Button 4");
        
        HBox hb=new HBox(40);
        
        //Color class:
        Color c1=new Color(0.9, 0.1, 0.1, 1);
        Color c2= Color.color(0.2, 0.4, 0.3,1);
        Color c3=Color.rgb(250, 100, 180);
        Color c4=Color.CORAL;
        
        //setTextFill() : [we use it to change the color of a button]
        bt1.setTextFill(c1);
        bt2.setTextFill(c2);
        bt3.setTextFill(c3);
        bt4.setTextFill(c4);
        
        //Font class
        System.out.println(Font.getFamilies());
        Font f1= new Font (25);
        Font f2=new Font("Agency FB",20);
        Font f3=Font.font("MV Boli");
        Font f4=Font.font("MV Boli",30);
        Font f5=Font.font(40);
        Font f6=Font.font("Ink free",FontPosture.ITALIC,40);
        Font f7=Font.font("",FontWeight.EXTRA_BOLD,35);
        Font f8=Font.font("Comics Sans Ms",FontWeight.LIGHT,25);
        
        //setFont() : [we use it to change the text's font and size]
        bt1.setFont(f1);
        bt2.setFont(f2);
        bt3.setFont(f3);
        bt1.setFont(f4);
        bt4.setFont(f5);
        bt3.setFont(f6);
        bt2.setFont(f7);
        bt4.setFont(f8);
        
        hb.getChildren().addAll(bt1,bt2,bt3,bt4);
        Scene scene1=new Scene(hb);
        
        stage1.setTitle("Third Window");
        stage1.setScene(scene1);
        stage1.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
