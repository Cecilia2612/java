
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class javaFx_p7 extends Application{
    @Override
    public void start(Stage stage1){
        
        /*
        //Labels:
        Label L1=new Label("Hello!");
        Button B1=new Button("Click");
        Button B2=new Button("Anothe Click");
        Label L2=new Label();
        L2.setText("How Are You?");
        
        Font fnt=Font.font("ink free",FontWeight.THIN,30);
        L1.setFont(fnt);    L2.setFont(fnt);
        B1.setFont(fnt);    B2.setFont(fnt);
        L1.setTextFill(Color.BLUE);
        L2.setTextFill(Color.RED);
        B1.setTextFill(Color.YELLOW);
        B2.setTextFill(Color.GREEN);
        
        
        //TextField:
        TextField txt1=new TextField();
        Label L1=new Label("Enter a number");
        TextField txt2=new TextField("Type here");
        Font fnt=Font.font("ink free",FontWeight.BOLD,30);
        L1.setFont(fnt);
        txt1.setFont(fnt);  txt2.setFont(fnt);
        L1.setTextFill(Color.RED);
        //txt1.setTextFill(Color.RED);//error
        
        HBox hb=new HBox(10);
        hb.getChildren().addAll(L1,txt2,txt1);
        Scene scene1=new Scene (hb,700,200);
        stage1.setTitle("First Window");
        stage1.setScene(scene1);
        stage1.show();
        */
        
        
        /*
        //RadioButton:
        VBox vb=new VBox(15);
        
        Label L1=new Label("Select your major: ");
        RadioButton rd1=new RadioButton("Computer Sience");
        RadioButton rd2=new RadioButton("Computer Information Sience");
        RadioButton rd3=new RadioButton("Software Engineering");
        RadioButton rd4=new RadioButton("Computer Graphics Animation");
        
        rd4.setSelected(true);
        
        Font fnt=Font.font("ink free",FontWeight.BOLD,15);
        L1.setFont(fnt);
        rd1.setFont(fnt);   rd2.setFont(fnt);
        rd3.setFont(fnt);   rd4.setFont(fnt);
        L1.setTextFill(Color.RED);
        rd1.setTextFill(Color.GREEN);
        rd2.setTextFill(Color.BLUE);
        rd3.setTextFill(Color.GOLD);
        rd4.setTextFill(Color.MAROON);
        
        vb.getChildren().addAll(L1,rd1,rd2,rd3,rd4);
        
        ToggleGroup tg1=new ToggleGroup();
        rd1.setToggleGroup(tg1);
        rd2.setToggleGroup(tg1);
        rd3.setToggleGroup(tg1);
        rd4.setToggleGroup(tg1);
        
        
        Label L2=new Label("Select your year: ");
        RadioButton rd5=new RadioButton("First Year");
        RadioButton rd6=new RadioButton("Second Year");
        RadioButton rd7=new RadioButton("Third Year");
        RadioButton rd8=new RadioButton("Forth Year");
        
        Font fnt2=Font.font("ink free",FontWeight.BOLD,15);
        L2.setFont(fnt2);
        rd5.setFont(fnt2);   rd6.setFont(fnt2);
        rd7.setFont(fnt2);   rd8.setFont(fnt2);
        L2.setTextFill(Color.RED);
        rd5.setTextFill(Color.GREEN);
        rd6.setTextFill(Color.BLUE);
        rd7.setTextFill(Color.GOLD);
        rd8.setTextFill(Color.MAROON);
        
        ToggleGroup tg2=new ToggleGroup();
        rd5.setToggleGroup(tg2);
        rd6.setToggleGroup(tg2);
        rd7.setToggleGroup(tg2);
        rd8.setToggleGroup(tg2);
        
        vb.getChildren().addAll(L2,rd5,rd6,rd7,rd8);
        */
        
        
        //CheckBox
        CheckBox cb1 = new CheckBox("WhatsApp");
        Label L1=new Label("Which social media you have account in?");
        CheckBox cb2 = new CheckBox("Facebook");
        CheckBox cb3 = new CheckBox("Twitter");
        
        Font fnt3=Font.font("ink free",FontWeight.BOLD,15);
        L1.setFont(fnt3);
        cb1.setFont(fnt3);   cb2.setFont(fnt3);
        cb3.setFont(fnt3);
        L1.setTextFill(Color.RED);
        cb1.setTextFill(Color.GREEN);
        cb2.setTextFill(Color.BLUE);
        cb3.setTextFill(Color.GOLD);
        
        
        VBox vb=new VBox(15);
        vb.getChildren().addAll(L1,cb1,cb2,cb3);
        
        Scene scene2=new Scene(vb,700,500);
        stage1.setTitle("Second Window");
        stage1.setScene(scene2);
        stage1.show();
        
    }
    
    public static void main(String[] args) {
     Application.launch(args);
    }
}
