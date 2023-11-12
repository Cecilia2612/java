import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class javaFX_p3 extends Application{
    
    public void start(Stage stage1){
        Button bt1=new Button("Button 1");
        Button bt2=new Button("Button 2");
        Button bt3=new Button("Button 3");
        Button bt4=new Button("Button 3");
        
        HBox hb=new HBox(40);
        //Controls(Nodes) Methods :
        //1. setText :
        bt1.setText("Hello");
        //2. setVisible :
        bt2.setVisible(true);
        //3. setDisable :
        bt3.setDisable(true);
        //4. getTixt :
        System.out.println(bt2.getText());
        String st=bt1.getText();
        System.out.println(st);
        //5. setWrapText :
        bt3.setText("Helloooooo");
        bt3.setWrapText(true);
        //6. setPrefWidth, setPrefHeight, setPrefSize :
        bt3.setPrefWidth(150);
        bt3.setPrefHeight(130);
        bt2.setPrefSize(120,60);
        //7. setTranslateX, setTranslateY :
        bt1.setTranslateX(30);
        bt1.setTranslateY(45);
        bt2.setTranslateY(-32);
        //8. setScaleX, setScaleY :
        bt3.setScaleX(1.5);
        bt3.setScaleY(2.0);
        //9. setRotate :
        bt1.setRotate(20);
        bt2.setRotate(90);
        
        hb.getChildren().addAll(bt1,bt2,bt3,bt4);
        Scene scene1=new Scene(hb);
        
        String s4=JOptionPane.showInputDialog("Enter your name: ");
        bt4.setText(s4);
        
        stage1.setTitle("Third Window");
        stage1.setScene(scene1);
        stage1.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
        /*
        //JOptionPane.showMessageDialog(null, "Hello");
        String s1=JOptionPane.showInputDialog("Enter your name: ");
        //JOptionPane.showMessageDialog(null, s1);
        String s2=JOptionPane.showInputDialog("Enter your age: ");
        int x=Integer.parseInt(s2);
        int y=Integer.parseInt(JOptionPane.showInputDialog("Your age"));
        JOptionPane.showMessageDialog(null, x);
        */
    }
    
}
