import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Scanner;

public class Seats_Booking_Program extends Application {

    public  static Scanner sc = new Scanner(System.in);
    final static int SEATING_CAPACITY = 42;
    public static ArrayList allSeats  =new ArrayList();
    public static ArrayList selectedSeats = new ArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        System.out.println("Welcome to the Seat Booking Program of A/C compartment in  Denuwara Menike train to Badulla.");
        System.out.println("   ");
        selection();
    }
    public static  void viewAllSeat(){
        Stage stage = new Stage();
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 350, 580);
        GridPane Top = new GridPane();
        GridPane Right = new GridPane();
        GridPane Left = new GridPane();
        GridPane Center =new GridPane();

        borderPane.setTop(Top);
        borderPane.setRight(Right);
        borderPane.setLeft(Left);
        borderPane.setCenter(Center);

        //Displaying a text on top
        Label lbl = new Label("Seating Arrangement");
        lbl.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
        Top.add(lbl, 20, 0, 10, 10);

        //Number of total rows
        int rows= 14;


        //create buttons for first column(left side)
        int column1=1;
        while( column1 <= SEATING_CAPACITY)
        {
            for (int i=0;i<rows;i++){
                Button button = new Button("  Seat  " + column1);
                int finalColumn1 = column1;
                column1+=3;
                Left.add(button,1,i);
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        selectedSeats.add(finalColumn1);
                        button.setVisible(true);
                    }
                });
            }
        }

        //create second column(left side)
        int column2=2;
        while( column2 <= 42)
        {

            for (int j=0;j < rows;j++){
                Button button = new Button("  Seat  " + column2);
                int finalColumn2 = column2;
                column2+=3;
                Left.add(button,2,j);
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        selectedSeats.add(finalColumn2);
                        button.setVisible(true);

                    }
                });
            }
        }

        //create third column (right side)
        int column3=3;
        while( column3<= 42)
        {

            for (int k=0; k < rows ;k++){
                Button button = new Button("  Seat   " + column3);
                int finalColumn3 = column3;
                column3 += 3;
                Right.add(button,2,k);
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        selectedSeats.add(finalColumn3);
                        button.setVisible(true);
                    }
                });
            }

        }
        //creating a 'ok' button in center
        Button button = new Button("OK");
        button.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
        Center.add(button, 8, 90, 15, 15);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
              //  details();
            }
        });

        //set padding between buttons
        Top.setHgap(5);
        Top.setVgap(5);
        Center.setVgap(5);
        Center.setHgap(5);
        Right.setVgap(10);
        Left.setHgap(5);
        Left.setVgap(10);

        stage.setTitle("Select Seats");
        stage.setScene(scene);
        stage.showAndWait();


    }
    public static void addCustomer() {

        Stage stage = new Stage();
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 350, 580);
        GridPane Top = new GridPane();
        GridPane Right = new GridPane();
        GridPane Left = new GridPane();
        GridPane Center =new GridPane();

        borderPane.setTop(Top);
        borderPane.setRight(Right);
        borderPane.setLeft(Left);
        borderPane.setCenter(Center);

        //Displaying a text on top
        Label lbl = new Label("Please Select Your seats");
        lbl.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
        Top.add(lbl, 20, 0, 10, 10);

        //Number of total rows
        int rows= 14;

        //create buttons for first column(left side)
        int column1=1;
        while( column1 <= SEATING_CAPACITY)
        {
            for (int i=0;i<rows;i++){
                Button button = new Button("  Seat  " + column1);
                int finalColumn1 = column1;
                column1+=3;
                Left.add(button,1,i);
                allSeats.add(finalColumn1);

                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        selectedSeats.add(finalColumn1);
                        button.setStyle("-fx-color:green");
                        System.out.println("You Choose Seat No "+ finalColumn1);
                        button.setDisable(true);
                    }
                });
            }
        }

        //create second column(left side)
        int column2=2;
        while( column2 <= 42)
        {

            for (int j=0;j < rows;j++){
                Button button = new Button("  Seat  " + column2);
                int finalColumn2 = column2;
                column2+=3;
                Left.add(button,2,j);
                allSeats.add(finalColumn2);
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        selectedSeats.add(finalColumn2);
                        button.setStyle("-fx-color:green");
                        System.out.println("You Choose Seat No "+ finalColumn2);
                        button.setDisable(true);

                    }
                });
            }
        }

        //create third column (right side)
        int column3=3;
        while( column3<= 42)
        {

            for (int k=0; k < rows ;k++){
                Button button = new Button("  Seat   " + column3);
                int finalColumn3 = column3;
                column3 += 3;
                Right.add(button,2,k);
                allSeats.add(finalColumn3);
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        selectedSeats.add(finalColumn3);
                        button.setStyle("-fx-color:green");
                        System.out.println("You Choose Seat No "+ finalColumn3);
                        button.setDisable(true);
                    }
                });
            }

        }
        //creating a 'ok' button in center
        Button button = new Button("OK");
        button.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
        Center.add(button, 8, 90, 15, 15);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
                details();
                selection();
            }
        });

        //set padding between buttons
        Top.setHgap(5);
        Top.setVgap(5);
        Center.setVgap(5);
        Center.setHgap(5);
        Right.setVgap(10);
        Left.setHgap(5);
        Left.setVgap(10);

        stage.setTitle("Select Seats");
        stage.setScene(scene);
        stage.show();



    }

    private static void quit() {
        System.out.println("Thank you.");
    }

    private static void findSeatByCustomer() {
        selection();
    }

    private static void delete() {
        selection();
    }

    public static void viewEmptySeat() {
        Stage stage = new Stage();
        BorderPane borderPane = new BorderPane();
        Scene scene2 = new Scene(borderPane, 350, 580);
        GridPane Top = new GridPane();
        GridPane Right = new GridPane();
        GridPane Left = new GridPane();
        GridPane Center =new GridPane();

        borderPane.setTop(Top);
        borderPane.setRight(Right);
        borderPane.setLeft(Left);
        borderPane.setCenter(Center);

        //Displaying a text on top
        Label lbl = new Label("Seating Arrangement");
        lbl.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
        Top.add(lbl, 20, 0, 10, 10);

        //Number of total rows
        int rows= 14;


        //create buttons for first column(left side)
        int column1=1;
        while( column1 <= SEATING_CAPACITY)
        {
            for (int i=0;i<rows;i++){
                Button button = new Button("  Seat  " + column1);
                int finalColumn1 = column1;
                column1+=3;
                Left.add(button,1,i);


            }
        }

        //create second column(left side)
        int column2=2;
        while( column2 <= SEATING_CAPACITY)
        {

            for (int j=0;j < rows;j++){
                Button button = new Button("  Seat  " + column2);
                int finalColumn2 = column2;
                column2+=3;
                Left.add(button,2,j);
            }
        }

        //create third column (right side)
        int column3=3;
        while( column3<= SEATING_CAPACITY)
        {

            for (int k=0; k < rows ;k++){
                Button button = new Button("  Seat   " + column3);
                int finalColumn3 = column3;
                column3 += 3;
                Right.add(button,2,k);
            }

        }
        //creating a 'ok' button in center
        Button button = new Button("OK");
        button.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
        Center.add(button, 8, 90, 15, 15);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
                selection();

            }
        });

        //set padding between buttons
        Top.setHgap(5);
        Top.setVgap(5);
        Center.setVgap(5);
        Center.setHgap(5);
        Right.setVgap(10);
        Left.setHgap(5);
        Left.setVgap(10);

        stage.setTitle("View All Empty Seats");
        stage.setScene(scene2);
        stage.showAndWait();


    }

    private static void details(){
        //create array to store passenger name
        ArrayList list = new ArrayList();

        System.out.println("Enter Your Name: ");
        String name= sc.nextLine();

        //adding object to the array list
        list.add(name);

        selection();

    }
    private  static void selection(){
        System.out.println("A: Add customer to seats and passenger details");
        System.out.println("V: View all seat");
        System.out.println("E: View empty seat");
        System.out.println("D: Delete a booked seat");
        System.out.println("F: Find seat by customer name");
        System.out.println("Q: Exit program");
        System.out.println(" ");

        System.out.print("Please select a option from above -  ");
        String option = sc.nextLine();
        switch (option) {
            case "A":
            case "a":
                addCustomer();//Calling  add customer method
                break;
            case "V":
            case "v":
                viewAllSeat(); //view seating arrangement
                break;
            case "E":
            case "e":
                viewEmptySeat();
            case "D":
            case "d":
                delete();
                break;
            case "F":
            case "f":
                findSeatByCustomer();
                break;
            case "Q":
            case "q":
                quit();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }


}
