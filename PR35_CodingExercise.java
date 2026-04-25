/* AIM:
Write a JavaFX program that displays a bar chart to represent the percentage distribution of overall 
grades using Rectangle shapes. 
● Projects: 20%, displayed in Red 
● Quizzes: 10%, displayed in Blue 
● Midterm Exams: 30%, displayed in Green 
● Final Exam: 40%, displayed in Orange 
Requirements: 
1. Each category should be displayed with a labeled bar. 
2. Bars should be proportional in height to the percentage. 
3. Use the Rectangle class to create the bars. 
4. Display the labels (e.g., "Projects — 20%") under each bar. 
5. Arrange the bars horizontally in the scene using an HBox or Pane.
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class PR35_CodingExercise extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        HBox chartContainer = new HBox(30); 
        chartContainer.setAlignment(Pos.BOTTOM_CENTER);
        chartContainer.setStyle("-fx-padding: 50;");

      
        double scale = 5.0; 

        
        VBox projectBar = createBar("Projects — 20%", 20 * scale, Color.RED);
        VBox quizBar = createBar("Quizzes — 10%", 10 * scale, Color.BLUE);
        VBox midtermBar = createBar("Midterm — 30%", 30 * scale, Color.GREEN);
        VBox finalBar = createBar("Final Exam — 40%", 40 * scale, Color.ORANGE);

        
        chartContainer.getChildren().addAll(projectBar, quizBar, midtermBar, finalBar);

      
        Scene scene = new Scene(chartContainer, 600, 400);
        primaryStage.setTitle("Grade Distribution Bar Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private VBox createBar(String label, double height, Color color) {
        Rectangle rect = new Rectangle(80, height); 
        rect.setFill(color);

        Text text = new Text(label);
        text.setStyle("-fx-font-weight: bold;");

        VBox barGroup = new VBox(10); 
        barGroup.setAlignment(Pos.BOTTOM_CENTER);
        barGroup.getChildren().addAll(rect, text);

        return barGroup;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

