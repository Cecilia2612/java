
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class javaFX_p5 extends Application{
    
    @Override
    public void start(Stage stage1){
        Button bt1=new Button("Wlecome");
        //bt1.setStyle("-fx-base: #FF0000");
        
        Image img1=new Image("file:///C:\\Users\\User-Admin\\Desktop\\bau\\images.png");
        Image img2=new Image("file:///C:\\Users\\User-Admin\\Desktop\\bau\\download.jpeg");
        //Image img3=new Image("bau_logo.png");
        
        ImageView mv1=new ImageView(img1);
        ImageView mv2=new ImageView(img2);
        ImageView mv3=new ImageView(new Image("file:///C:\\Users\\User-Admin\\Desktop\\bau\\images (1).jpeg"));
        ImageView mv4=new ImageView("file:///C:\\Users\\User-Admin\\Desktop\\bau\\images.jpeg");
        
        System.out.println(img1.getWidth());//1920.0
        System.out.println(img1.getHeight());//1080.0
        mv1.setFitWidth(400);
        //mv1.setFitHeight(450);
        mv1.setPreserveRatio(true);
        
        HBox hb=new HBox(10);
        hb.getChildren().addAll(bt1, mv1, mv2);
        hb.getChildren().addAll(mv3, mv4);
        Scene scene1=new Scene (hb,1600,500);
        stage1.setTitle("First Window");
        stage1.setScene(scene1);
        stage1.show();

    }
    
    public static void main(String[] args) {
     Application.launch(args);
    }
    
}
