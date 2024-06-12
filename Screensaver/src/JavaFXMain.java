
// JavaFXMain.java

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

import java.awt.*;
import java.util.Random;

public class JavaFXMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Random r = new Random();
        Group root = new Group();
        Scene scene = new Scene(root, 500, 450);
        scene.setFill(Color.BLACK);

        primaryStage.setScene(scene);
        Rectangle r1 = new Rectangle();
        r1.setX(10);
        r1.setY(10);
        r1.setHeight(80);
        r1.setWidth(80);
        r1.setFill(Color.CYAN);
        root.getChildren().add(r1);



        final long startNanoTime = System.nanoTime();

        new AnimationTimer() {
            double speedX = 5;
            double speedY = 5;

            int red = 230;
            int green = 30;
            int blue = 68;

            @Override
            public void handle (long currentNanoTime) {
                double timer = (currentNanoTime - startNanoTime) / 10000000000.0;
                // ANIMATION

                if (red > 255 || green > 255 || blue > 255) {
                    red = 0;
                    green = 0;
                    blue = 0;
                }

                if(r1.getX() > scene.getWidth() - r1.getWidth() || r1.getX() < 0) {
                    speedX*= -1;
                    r1.setFill(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                }

                if(r1.getY() > scene.getHeight() - r1.getHeight() || r1.getY() < 0) {
                    speedY *= -1;
                    r1.setFill(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                }

                r1.setX(r1.getX() + speedX); // movimentação
                r1.setY(r1.getY() + speedY);









                //ANIMATION
            }
        }.start();

        if(r1.getX() > 300) {
            System.out.println("entrou");
            return;
        }



        primaryStage.show();
    }
}
