import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class GUIDesign extends Application{
  String gender,height,weight,bf,activityLevel,steps,bpm,lifts; //this part needs to be integrated with the calculations
  Scene scene1,scene2,scene3,scene4,scene5,scene6,scene7;
  String basalMetabolicRate,fatFreeMassIndex,fatFreeMaxIndexRange,vo2Max,vo2MaxRange,bmi,bmiRange,lb;
  String amountLifted;

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Fitness App");

    //Scene1
    VBox layout1 = new VBox();
    Label label1 = new Label("Welcome to Fitness App!");
    Button button1 = new Button("New User");
    button1.setOnAction(e -> primaryStage.setScene(scene2));
    Button button2 = new Button("Current User");
    button2.setOnAction(e -> primaryStage.setScene(scene3));
    layout1.getChildren().addAll(label1,button1,button2);
    scene1 = new Scene(layout1,300,250);

    //Scene 2
    GridPane layout2 = new GridPane();
    layout2.add(new Label("Create profile:"),0,0);
    layout2.add(new Label("Gender"),0,1);
    MenuButton menuButton = new MenuButton("Select");
    menuButton.getItems().addAll(new MenuItem("Female"),new MenuItem("Male"));
    layout2.add(menuButton,1,1);
    layout2.add(new Label("Height"),0,2);
    TextField newHeight = new TextField();
    height = newHeight.getText();
    layout2.add(newHeight,1,2);
    height = newHeight.getText();
    layout2.add(new Label("Weight"),0,3);
    TextField newWeight = new TextField();
    layout2.add(newWeight,1,3);
    weight = newWeight.getText();
    layout2.add(new Label("BF%"),0,4);
    TextField newBF = new TextField();
    layout2.add(newBF,1,4);
    bf = newBF.getText();
    layout2.add(new Label("Activity Level"),0,5);
    TextField newActivityLevel = new TextField();
    layout2.add(newActivityLevel,1,5);
    activityLevel = newActivityLevel.getText();
    layout2.add(new Label("Steps"),0,6);
    TextField newSteps = new TextField();
    layout2.add(new TextField(),1,6);
    steps = newSteps.getText();
    layout2.add(new Label("Resting BPM"),0,7);
    TextField newBpm = new TextField();
    layout2.add(newBpm,1,7);
    bpm = newBpm.getText();
    layout2.add(new Label("Lifts"),0,8);
    TextField newLifts = new TextField();
    layout2.add(new TextField(),1,8);
    lifts = newLifts.getText();
    Button button3 = new Button("Complete profile");
    button3.setOnAction(e -> primaryStage.setScene(scene3));
    layout2.add(button3,0,9);
    Button button8 = new Button("Go Back");
    button8.setOnAction(e -> primaryStage.setScene(scene1));
    layout2.add(button8,1,9);


    scene2 = new Scene(layout2,300,250);

    //scene 3
    VBox layout3 = new VBox();
    Button button4 = new Button("Track Fitness");
    button4.setOnAction(e -> primaryStage.setScene(scene4));
    Button button5 = new Button("View Insights");
    button5.setOnAction(e -> primaryStage.setScene(scene5));
    Button button9 = new Button("Go Back");
    button9.setOnAction(e -> primaryStage.setScene(scene1));
    layout3.getChildren().addAll(button4,button5,button9);
    scene3 = new Scene(layout3, 300,250);

    //scene 4
    VBox layout4 = new VBox();
    Button button6 = new Button("Track lifts");
    button6.setOnAction(e -> primaryStage.setScene(scene6));
    Button button7 = new Button("Track weight");
    button7.setOnAction(e -> primaryStage.setScene(scene7));
    Button button10 = new Button("Go Back");
    button10.setOnAction(e -> primaryStage.setScene(scene1));
    layout4.getChildren().addAll(button6,button7,button10);
    scene4 = new Scene(layout4,300,250);

    //scene 5
    GridPane layout5 = new GridPane();

    layout5.add(new Label("Fitness Dashboard"),0,0);
    layout5.add(new Label("Gender"),0,1);
    layout5.add(new Label(gender),1,1);
    layout5.add(new Label("Height"),0,2);
    height = newHeight.getText();
    layout5.add(new Label(height),1,2);
    layout5.add(new Label("Weight"),0,3);
    layout5.add(new Label(weight),1,3);
    layout5.add(new Label("BF%"),0,4);
    layout5.add(new Label(bf),1,4);
    layout5.add(new Label("Activity Level"),0,5);
    layout5.add(new Label(activityLevel),1,5);
    layout5.add(new Label("Steps"),0,6);
    layout5.add(new Label(steps),1,6);
    layout5.add(new Label("Resting BPM"),0,7);
    layout5.add(new Label(bpm),1,7);
    layout5.add(new Label("Lifts"),0,8);
    layout5.add(new Label(lifts),1,8);
    layout5.add(new Label("Daily Caloric Requirements"),0,10);
    layout5.add(new Label("Basal Metabolic Rate: "),0,11);
    layout5.add(new Label(basalMetabolicRate),1,11);
    layout5.add(new Label("Fat Free Mass Index:"),0,12);
    layout5.add(new Label(fatFreeMassIndex),1,12);
    layout5.add(new Label("Range: "),3,12);
    layout5.add(new Label(fatFreeMaxIndexRange),4,12);
    layout5.add(new Label("VO2 Max:"),0,13);
    layout5.add(new Label(vo2Max),1,13);
    layout5.add(new Label("Range: "),3,13);
    layout5.add(new Label(vo2MaxRange),4,13);
    layout5.add(new Label("BMI:"),0,14);
    layout5.add(new Label(bmi),1,14);
    layout5.add(new Label("Range: "),3,14);
    layout5.add(new Label(bmiRange),4,14);
    layout5.add(new Label(lb),0,15);
    layout5.add(new Label("       lb more to reach next bracket"),0,15);
    Button button11 = new Button("Go Back");
    button11.setOnAction(e -> primaryStage.setScene(scene4));
    layout5.add(button11,4,16);
    scene5 = new Scene(layout5,500,400);

    //scene6
    GridPane layout6 = new GridPane();
    layout6.add(new Label("Lift: "),0,0);
    layout6.add(new TextField(),1,0);
    layout6.add(new Label("Amount lifted: "),0,1);
    layout6.add(new Label(amountLifted),1,1);
    Button button12 = new Button("Go Back");
    button12.setOnAction(e -> primaryStage.setScene(scene4));
    layout6.add(button12,1,4);
    scene6 = new Scene(layout6,300,250);

    //scene 7
    GridPane layout7 = new GridPane();
    layout7.add(new Label("Weight: "),0,0);
    layout7.add(new TextField(),1,0);
    layout7.add(new Label("Date: "),0,1);
    layout7.add(new TextField(),1,1);
    layout7.add(new Label("Weight graph over time:"),0,2);
    //add weight graph
    Button button13 = new Button("Go Back");
    button13.setOnAction(e -> primaryStage.setScene(scene4));
    layout7.add(button13,1,4);
    scene7 = new Scene(layout7,300,250);

    primaryStage.setScene(scene1);
    primaryStage.show();

  }


  public static void main(String[] args) {
    launch(args);
  }
}
