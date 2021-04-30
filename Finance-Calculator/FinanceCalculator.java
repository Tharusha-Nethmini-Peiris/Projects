import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.security.auth.callback.ConfirmationCallback;

public class FinanceCalculator extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {

        //create the elements
        Label heading = new Label("Finance Calculator");
        heading.setStyle("-fx-font-size: 24");
        heading.setLayoutX(405);
        heading.setLayoutY(100);

        Button loan_button = new Button("Loan-Calculator");
        loan_button.setLayoutX(400);
        loan_button.setLayoutY(220);
        loan_button.setPrefWidth(200);


        Button saving_button = new Button("Saving-Calculator");
        saving_button.setLayoutX(400);
        saving_button.setLayoutY(270);
        saving_button.setPrefWidth(200);

        Button mortgage_button = new Button("Mortgage-Calculator");
        mortgage_button.setLayoutX(400);
        mortgage_button.setLayoutY(320);
        mortgage_button.setPrefWidth(200);

        Button fixedDeposit_button = new Button("Fixed Deposit-Calculator");
        fixedDeposit_button.setLayoutX(400);
        fixedDeposit_button.setLayoutY(370);
        fixedDeposit_button.setPrefWidth(200);


        //create the main menu pane
        Pane mainMenuPane = new Pane();

        //adding elements to the main menu pane
        mainMenuPane.getChildren().addAll(loan_button,saving_button,mortgage_button,fixedDeposit_button,heading);

        //Create a scene for main menu
        Scene mainMenuScene = new Scene(mainMenuPane,1024,728);

        //set the main menu scene for the primary stage
        primaryStage.setScene(mainMenuScene);
        primaryStage.show();


        //=====================loan calculator=====================================
        loan_button.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                //============Creating the loan calculator==================

                Label heading = new Label("Loan Calculator");
                heading.setStyle("-fx-font-size: 24");
                heading.setLayoutX(405);
                heading.setLayoutY(50);

                Button button_back = new Button("Back");
                button_back.setLayoutX(800);
                button_back.setLayoutY(50);
                button_back.setPrefWidth(200);

                Label loan_label_time = new Label("Time in years");
                loan_label_time.setLayoutX(50);
                loan_label_time.setLayoutY(135);

                TextField textField_time = new TextField();
                textField_time.setLayoutX(180);
                textField_time.setLayoutY(130);

                Label loan_label_interest = new Label("Interest");
                loan_label_interest.setLayoutX(50);
                loan_label_interest.setLayoutY(185);

                TextField textField_interest = new TextField();
                textField_interest.setLayoutX(180);
                textField_interest.setLayoutY(180);

                Label loan_label_payment = new Label("Down Payment");
                loan_label_payment.setLayoutX(50);
                loan_label_payment.setLayoutY(235);

                TextField textField_payment = new TextField();
                textField_payment.setLayoutX(180);
                textField_payment.setLayoutY(230);


                Label loan_label_amount = new Label("Amount");
                loan_label_amount.setLayoutX(50);
                loan_label_amount.setLayoutY(285);

                TextField textField_amount = new TextField();
                textField_amount.setLayoutX(180);
                textField_amount.setLayoutY(280);

                Label loan_label_Payment = new Label("Payment\n(Monthly)");
                loan_label_Payment.setLayoutX(50);
                loan_label_Payment.setLayoutY(335);

                TextField textField_TotalPayment = new TextField();
                textField_TotalPayment.setLayoutX(180);
                textField_TotalPayment.setLayoutY(338);

                Button calculate = new Button("Calculate");
                calculate.setLayoutX(100);
                calculate.setLayoutY(380);
                calculate.setPrefWidth(200);

                //creating the onscreen keyboard
                TextField calDisplay = new TextField();
                calDisplay.setLayoutX(650);
                calDisplay.setLayoutY(125);

                Button cal1 = new Button("1");
                cal1.setLayoutX(680);
                cal1.setLayoutY(180);

                Button cal2 = new Button("2");
                cal2.setLayoutX(730);
                cal2.setLayoutY(180);

                Button cal3 = new Button("3");
                cal3.setLayoutX(780);
                cal3.setLayoutY(180);

                Button cal4 = new Button("4");
                cal4.setLayoutX(680);
                cal4.setLayoutY(230);

                Button cal5 = new Button("5");
                cal5.setLayoutX(730);
                cal5.setLayoutY(230);

                Button cal6 = new Button("6");
                cal6.setLayoutX(780);
                cal6.setLayoutY(230);


                Button cal7 = new Button("7");
                cal7.setLayoutX(680);
                cal7.setLayoutY(280);


                Button cal8 = new Button("8");
                cal8.setLayoutX(730);
                cal8.setLayoutY(280);

                Button cal9 = new Button("9");
                cal9.setLayoutX(780);
                cal9.setLayoutY(280);

                Button cal0 = new Button("0");
                cal0.setLayoutX(730);
                cal0.setLayoutY(330);

                Button calDecimal = new Button(".");
                calDecimal.setLayoutX(680);
                calDecimal.setLayoutY(330);

                Button calDel = new Button("Del");
                calDel.setLayoutX(780);
                calDel.setLayoutY(330);

                Button confirm = new Button("Confirm");
                confirm.setLayoutX(710);
                confirm.setLayoutY(370);

                //======================================selecting the text field========================================
                textField_amount.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_amount.setEditable(true);
                        textField_interest.setEditable(false);
                        textField_payment.setEditable(false);
                        textField_time.setEditable(false);
                        textField_TotalPayment.setEditable(false);
                    }
                });

                textField_interest.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_amount.setEditable(false);
                        textField_interest.setEditable(true);
                        textField_payment.setEditable(false);
                        textField_time.setEditable(false);
                        textField_TotalPayment.setEditable(false);
                    }
                });
                textField_payment.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_amount.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_payment.setEditable(true);
                        textField_time.setEditable(false);
                        textField_TotalPayment.setEditable(false);
                    }
                });
                textField_time.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_amount.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_payment.setEditable(false);
                        textField_time.setEditable(true);
                        textField_TotalPayment.setEditable(false);
                    }
                });
                textField_TotalPayment.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_amount.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_payment.setEditable(false);
                        textField_time.setEditable(false);
                        textField_TotalPayment.setEditable(true);
                    }
                });

                confirm.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        if(textField_amount.isEditable())
                        {
                            textField_amount.setText(calDisplay.getText());
                        }
                        else if (textField_interest.isEditable())
                        {
                            textField_interest.setText(calDisplay.getText());
                        }
                        else if (textField_payment.isEditable())
                        {
                            textField_payment.setText(calDisplay.getText());
                        }
                        else  if (textField_time.isEditable())
                        {
                            textField_time.setText(calDisplay.getText());
                        }
                        calDisplay.clear();
                    }
                });
                //======================================================================================================

                //creating the keyboard

                cal0.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("0");
                    }
                });

                cal1.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("1");
                    }
                });

                cal2.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("2");
                    }
                });
                cal3.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("3");
                    }
                });
                cal4.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("4");
                    }
                });
                cal5.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("5");
                    }
                });
                cal6.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("6");
                    }
                });
                cal7.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("7");
                    }
                });
                cal8.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("8");
                    }
                });
                cal9.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("9");
                    }
                });
                calDecimal.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText(".");
                    }
                });
                calDel.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        if(!calDisplay.getText().isEmpty())
                        {
                            calDisplay.setText((calDisplay.getText(0, calDisplay.getLength() - 1)));
                        }
                    }
                });

                //creating the pane for loan calculator
                Pane paneLoan = new Pane();

                //adding elements to the loan pane
                paneLoan.getChildren().addAll(heading,loan_label_time,loan_label_interest,textField_interest,textField_time,button_back,loan_label_payment,textField_payment,
                        loan_label_amount,textField_amount,loan_label_Payment,textField_TotalPayment,calculate,calDisplay,
                        cal0,cal1,cal2,cal3,cal4,cal5,cal6,cal7,cal8,cal9,calDecimal,calDel,confirm);

                //creating the scene for the loan calculator
                Scene sceneLoan = new Scene(paneLoan,1024,768);

                //set scene_loan as the primary stage scene
                primaryStage.setScene(sceneLoan);

                calculate.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        double forwardAmount = Double.parseDouble(String.valueOf(textField_amount.getText())) - Double.parseDouble(String.valueOf(textField_payment.getText()));
                        double interest = Double.parseDouble(String.valueOf(textField_interest.getText()));
                        double time = Double.parseDouble(String.valueOf(textField_time.getText()));
                        double pmt = ((forwardAmount*interest/12) * (1+(interest/12)) * Math.pow(12,time)) / ((1+(interest/12)) * Math.pow(12,time))-1;
                        textField_TotalPayment.setText(String.valueOf(pmt));
                    }
                });

                //this back button will return to the main menu
                button_back.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        primaryStage.setScene(mainMenuScene);
                    }
                });
            }
        });

        //==========================saving calculator==========================================
        saving_button.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                //============Creating the saving calculator==================

                Label heading = new Label("Savings Calculator");
                heading.setStyle("-fx-font-size: 24");
                heading.setLayoutX(405);
                heading.setLayoutY(50);

                Button button_back = new Button("Back");
                button_back.setLayoutX(800);
                button_back.setLayoutY(50);
                button_back.setPrefWidth(200);

                Label saving_label_periods = new Label("Number of periods");
                saving_label_periods.setLayoutX(50);
                saving_label_periods.setLayoutY(135);

                TextField textField_periods = new TextField();
                textField_periods.setLayoutX(180);
                textField_periods.setLayoutY(130);

                Label saving_label_interest = new Label("Interest");
                saving_label_interest.setLayoutX(50);
                saving_label_interest.setLayoutY(185);

                TextField textField_interest = new TextField();
                textField_interest.setLayoutX(180);
                textField_interest.setLayoutY(180);

                Label saving_label_Sprincipale = new Label("Start Principal");
                saving_label_Sprincipale.setLayoutX(50);
                saving_label_Sprincipale.setLayoutY(235);

                TextField textField_Sprincipale = new TextField();
                textField_Sprincipale.setLayoutX(180);
                textField_Sprincipale.setLayoutY(230);

                Label saving_label_payment = new Label("Payment");
                saving_label_payment.setLayoutX(50);
                saving_label_payment.setLayoutY(285);

                TextField textField_payment = new TextField();
                textField_payment.setLayoutX(180);
                textField_payment.setLayoutY(280);

                Label saving_label_futureVal = new Label("Future Value");
                saving_label_futureVal.setLayoutX(50);
                saving_label_futureVal.setLayoutY(335);

                TextField textField_futureVal = new TextField();
                textField_futureVal.setLayoutX(180);
                textField_futureVal.setLayoutY(330);

                Button calculate = new Button("Calculate");
                calculate.setLayoutX(100);
                calculate.setLayoutY(450);
                calculate.setPrefWidth(380);

                //creating the onscreen keyboard
                TextField calDisplay = new TextField();
                calDisplay.setLayoutX(650);
                calDisplay.setLayoutY(125);

                Button cal1 = new Button("1");
                cal1.setLayoutX(680);
                cal1.setLayoutY(180);

                Button cal2 = new Button("2");
                cal2.setLayoutX(730);
                cal2.setLayoutY(180);

                Button cal3 = new Button("3");
                cal3.setLayoutX(780);
                cal3.setLayoutY(180);

                Button cal4 = new Button("4");
                cal4.setLayoutX(680);
                cal4.setLayoutY(230);

                Button cal5 = new Button("5");
                cal5.setLayoutX(730);
                cal5.setLayoutY(230);

                Button cal6 = new Button("6");
                cal6.setLayoutX(780);
                cal6.setLayoutY(230);


                Button cal7 = new Button("7");
                cal7.setLayoutX(680);
                cal7.setLayoutY(280);


                Button cal8 = new Button("8");
                cal8.setLayoutX(730);
                cal8.setLayoutY(280);

                Button cal9 = new Button("9");
                cal9.setLayoutX(780);
                cal9.setLayoutY(280);

                Button cal0 = new Button("0");
                cal0.setLayoutX(730);
                cal0.setLayoutY(330);

                Button calDecimal = new Button(".");
                calDecimal.setLayoutX(680);
                calDecimal.setLayoutY(330);

                Button calDel = new Button("Del");
                calDel.setLayoutX(780);
                calDel.setLayoutY(330);

                Button confirm = new Button("Confirm");
                confirm.setLayoutX(710);
                confirm.setLayoutY(370);

                //======================================selecting the text field========================================
                textField_periods.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_periods.setEditable(true);
                        textField_interest.setEditable(false);
                        textField_Sprincipale.setEditable(false);
                        textField_payment.setEditable(false);
                        textField_futureVal.setEditable(false);
                    }
                });

                textField_interest.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_periods.setEditable(false);
                        textField_interest.setEditable(true);
                        textField_Sprincipale.setEditable(false);
                        textField_payment.setEditable(false);
                        textField_futureVal.setEditable(false);
                    }
                });
                textField_Sprincipale.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_periods.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_Sprincipale.setEditable(true);
                        textField_payment.setEditable(false);
                        textField_futureVal.setEditable(false);
                    }
                });
                textField_payment.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_periods.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_Sprincipale.setEditable(false);
                        textField_payment.setEditable(true);
                        textField_futureVal.setEditable(false);
                    }
                });
                textField_futureVal.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_periods.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_Sprincipale.setEditable(false);
                        textField_payment.setEditable(false);
                        textField_futureVal.setEditable(true);
                    }
                });


                confirm.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event) {
                        if(textField_periods.isEditable()){
                            textField_periods.setText(calDisplay.getText());
                        } else if (textField_interest.isEditable()){
                            textField_interest.setText(calDisplay.getText());
                        } else if (textField_payment.isEditable()){
                            textField_payment.setText(calDisplay.getText());
                        } else  if (textField_Sprincipale.isEditable()){
                            textField_Sprincipale.setText(calDisplay.getText());
                        }
                        calDisplay.clear();
                    }
                });
                //======================================================================================================

                //creating the keyboard

                cal0.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("0");
                    }
                });

                cal1.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("1");
                    }
                });

                cal2.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("2");
                    }
                });
                cal3.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("3");
                    }
                });
                cal4.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("4");
                    }
                });
                cal5.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("5");
                    }
                });
                cal6.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("6");
                    }
                });
                cal7.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("7");
                    }
                });
                cal8.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("8");
                    }
                });
                cal9.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText("9");
                    }
                });
                calDecimal.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        calDisplay.appendText(".");
                    }
                });
                calDel.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        if(!calDisplay.getText().isEmpty())
                        {
                            calDisplay.setText((calDisplay.getText(0, calDisplay.getLength() - 1)));
                        }
                    }
                });

                //creating the pane for saving calculator
                Pane paneSaving = new Pane();

                //adding elements to the saving pane
                paneSaving.getChildren().addAll(heading,saving_label_periods,saving_label_interest,textField_interest,textField_periods,button_back
                        ,saving_label_Sprincipale,textField_Sprincipale,saving_label_payment,textField_payment,saving_label_futureVal,textField_futureVal
                        ,calculate,calDisplay, cal0,cal1,cal2,cal3,cal4,cal5,cal6,cal7,cal8,cal9,calDecimal,calDel,confirm);

                //creating the scene for the saving calculator
                Scene sceneSaving = new Scene(paneSaving,1024,768);

                //set scene_saving as the primary stage scene
                primaryStage.setScene(sceneSaving);

                confirm.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        double compoundInterest = Double.parseDouble(String.valueOf(textField_Sprincipale.getText())) + ((Double.parseDouble(String.valueOf(textField_interest.getText()))) / Double.parseDouble(String.valueOf(textField_periods.getText()))) * Math.pow(Double.parseDouble(String.valueOf(textField_periods.getText())),Double.parseDouble(String.valueOf(textField_periods.getText())));
                    }
                });

                //this back button will return to the main menu
                button_back.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        primaryStage.setScene(mainMenuScene);
                    }
                });
            }
        });

        //==========================mortgage calculator========================================

        mortgage_button.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {

                Label heading = new Label("Mortgage Calculator");
                heading.setStyle("-fx-font-size: 24");
                heading.setLayoutX(405);
                heading.setLayoutY(50);

                Button button_back = new Button("Back");
                button_back.setLayoutX(800);
                button_back.setLayoutY(50);
                button_back.setPrefWidth(200);

                Label mortgage_label_propertyPrice = new Label("Property Price");
                mortgage_label_propertyPrice.setLayoutX(50);
                mortgage_label_propertyPrice.setLayoutY(135);

                TextField textField_propertyPrice = new TextField();
                textField_propertyPrice.setLayoutX(180);
                textField_propertyPrice.setLayoutY(130);

                Label mortgage_label_downPayment = new Label("Down Payment");
                mortgage_label_downPayment.setLayoutX(50);
                mortgage_label_downPayment.setLayoutY(185);

                TextField textField_downPayment = new TextField();
                textField_downPayment.setLayoutX(180);
                textField_downPayment.setLayoutY(180);

                Label mortgage_label_loanTerm = new Label("Loan Term");
                mortgage_label_loanTerm.setLayoutX(50);
                mortgage_label_loanTerm.setLayoutY(235);

                TextField textField_loanTerm = new TextField();
                textField_loanTerm.setLayoutX(180);
                textField_loanTerm.setLayoutY(230);

                Label mortgage_label_interest = new Label("Interest Rate");
                mortgage_label_interest.setLayoutX(50);
                mortgage_label_interest.setLayoutY(285);

                TextField textField_interest = new TextField();
                textField_interest.setLayoutX(180);
                textField_interest.setLayoutY(280);

                Label mortgage_label_mortgagePayments = new Label("Total Mortgage\npayments");
                mortgage_label_mortgagePayments.setLayoutX(50);
                mortgage_label_mortgagePayments.setLayoutY(330);

                TextField textField_mortgagePayment = new TextField();
                textField_mortgagePayment.setLayoutX(180);
                textField_mortgagePayment.setLayoutY(330);

                Label mortgage_label_totalInterest = new Label("Total interest");
                mortgage_label_totalInterest.setLayoutX(50);
                mortgage_label_totalInterest.setLayoutY(385);

                TextField textField_totalInterest = new TextField();
                textField_totalInterest.setLayoutX(180);
                textField_totalInterest.setLayoutY(380);

                Button calculate = new Button("Calculate");
                calculate.setLayoutX(100);
                calculate.setLayoutY(450);
                calculate.setPrefWidth(200);

                //creating the onscreen keyboard
                TextField calDisplay = new TextField();
                calDisplay.setLayoutX(650);
                calDisplay.setLayoutY(125);

                Button cal1 = new Button("1");
                cal1.setLayoutX(680);
                cal1.setLayoutY(180);

                Button cal2 = new Button("2");
                cal2.setLayoutX(730);
                cal2.setLayoutY(180);

                Button cal3 = new Button("3");
                cal3.setLayoutX(780);
                cal3.setLayoutY(180);

                Button cal4 = new Button("4");
                cal4.setLayoutX(680);
                cal4.setLayoutY(230);

                Button cal5 = new Button("5");
                cal5.setLayoutX(730);
                cal5.setLayoutY(230);

                Button cal6 = new Button("6");
                cal6.setLayoutX(780);
                cal6.setLayoutY(230);

                Button cal7 = new Button("7");
                cal7.setLayoutX(680);
                cal7.setLayoutY(280);

                Button cal8 = new Button("8");
                cal8.setLayoutX(730);
                cal8.setLayoutY(280);

                Button cal9 = new Button("9");
                cal9.setLayoutX(780);
                cal9.setLayoutY(280);

                Button cal0 = new Button("0");
                cal0.setLayoutX(730);
                cal0.setLayoutY(330);

                Button calDecimal = new Button(".");
                calDecimal.setLayoutX(680);
                calDecimal.setLayoutY(330);

                Button calDel = new Button("Del");
                calDel.setLayoutX(780);
                calDel.setLayoutY(330);

                Button confirm = new Button("Confirm");
                confirm.setLayoutX(710);
                confirm.setLayoutY(370);

                //======================================selecting the text field========================================
                textField_propertyPrice.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_propertyPrice.setEditable(true);
                        textField_downPayment.setEditable(false);
                        textField_loanTerm.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_mortgagePayment.setEditable(false);
                        textField_totalInterest.setEditable(false);
                    }
                });

                textField_interest.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_propertyPrice.setEditable(false);
                        textField_downPayment.setEditable(false);
                        textField_loanTerm.setEditable(false);
                        textField_interest.setEditable(true);
                        textField_mortgagePayment.setEditable(false);
                        textField_totalInterest.setEditable(false);
                    }
                });
                textField_downPayment.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_propertyPrice.setEditable(false);
                        textField_downPayment.setEditable(true);
                        textField_loanTerm.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_mortgagePayment.setEditable(false);
                        textField_totalInterest.setEditable(false);
                    }
                });
                textField_loanTerm.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_propertyPrice.setEditable(false);
                        textField_downPayment.setEditable(false);
                        textField_loanTerm.setEditable(true);
                        textField_interest.setEditable(false);
                        textField_mortgagePayment.setEditable(false);
                        textField_totalInterest.setEditable(false);
                    }
                });
                textField_mortgagePayment.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_propertyPrice.setEditable(false);
                        textField_downPayment.setEditable(false);
                        textField_loanTerm.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_mortgagePayment.setEditable(true);
                        textField_totalInterest.setEditable(false);
                    }
                });
                textField_totalInterest.setOnMouseClicked(new EventHandler<MouseEvent>()
                {
                    @Override
                    public void handle(MouseEvent event)
                    {
                        textField_propertyPrice.setEditable(false);
                        textField_downPayment.setEditable(false);
                        textField_loanTerm.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_mortgagePayment.setEditable(false);
                        textField_totalInterest.setEditable(true);
                    }
                });

                confirm.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        if(textField_propertyPrice.isEditable())
                        {
                            textField_propertyPrice.setText(calDisplay.getText());
                        } else if (textField_interest.isEditable())
                        {
                            textField_interest.setText(calDisplay.getText());
                        } else if (textField_mortgagePayment.isEditable())
                        {
                            textField_mortgagePayment.setText(calDisplay.getText());
                        } else  if (textField_loanTerm.isEditable()){

                            textField_loanTerm.setText(calDisplay.getText());
                        }
                        calDisplay.clear();
                    }
                });

                //creating keyboard

                cal0.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("0");
                    }
                });

                cal1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("1");
                    }
                });

                cal2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("2");
                    }
                });
                cal3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("3");
                    }
                });
                cal4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("4");
                    }
                });
                cal5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("5");
                    }
                });
                cal6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("6");
                    }
                });
                cal7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("7");
                    }
                });
                cal8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("8");
                    }
                });
                cal9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("9");
                    }
                });
                calDecimal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText(".");
                    }
                });
                calDel.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if(!calDisplay.getText().isEmpty()) {
                            calDisplay.setText((calDisplay.getText(0, calDisplay.getLength() - 1)));
                        }
                    }
                });

                //creating the pane for mortgage calculator
                Pane paneMortgage = new Pane();

                //adding elements to the mortgage pane
                paneMortgage.getChildren().addAll(heading,mortgage_label_propertyPrice,mortgage_label_downPayment,textField_downPayment,textField_propertyPrice,button_back
                        ,mortgage_label_loanTerm,textField_loanTerm,mortgage_label_interest,textField_interest,mortgage_label_mortgagePayments,textField_mortgagePayment,mortgage_label_totalInterest,textField_totalInterest
                        ,calculate,calDisplay,
                        cal0,cal1,cal2,cal3,cal4,cal5,cal6,cal7,cal8,cal9,calDecimal,calDel,confirm);

                //creating the scene for the mortgage calculator
                Scene sceneMortgage = new Scene(paneMortgage,1024,768);

                //set scene_mortgage as the primary stage scene
                primaryStage.setScene(sceneMortgage);

                //this back button will return to the main menu
                button_back.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.setScene(mainMenuScene);
                    }
                });

            }
        });

        //==========================Fixed Deposit calculator===================================
        fixedDeposit_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //============Creating the Fixed Deposit calculator==================

                Label heading = new Label("Fixed Deposit Calculator");
                heading.setStyle("-fx-font-size: 24");
                heading.setLayoutX(405);
                heading.setLayoutY(50);

                Button button_back = new Button("Back");
                button_back.setLayoutX(800);
                button_back.setLayoutY(50);
                button_back.setPrefWidth(200);

                Label fixedDeposit_label_depositAmount = new Label("Deposit Amount");
                fixedDeposit_label_depositAmount.setLayoutX(50);
                fixedDeposit_label_depositAmount.setLayoutY(135);

                TextField textField_depositAmount = new TextField();
                textField_depositAmount.setLayoutX(180);
                textField_depositAmount.setLayoutY(130);

                Label fixedDeposit_label_interest = new Label("Interest");
                fixedDeposit_label_interest.setLayoutX(50);
                fixedDeposit_label_interest.setLayoutY(185);

                TextField textField_interest = new TextField();
                textField_interest.setLayoutX(180);
                textField_interest.setLayoutY(180);

                Label fixedDeposit_label_depositPeriod = new Label("Deposit Period");
                fixedDeposit_label_depositPeriod.setLayoutX(50);
                fixedDeposit_label_depositPeriod.setLayoutY(235);

                TextField textField_depositPeriod = new TextField();
                textField_depositPeriod.setLayoutX(180);
                textField_depositPeriod.setLayoutY(230);

                Label fixedDeposit_label_depositMaturity = new Label( "Deposit Maturity");
                fixedDeposit_label_depositMaturity.setLayoutX(50);
                fixedDeposit_label_depositMaturity.setLayoutY(285);

                TextField textField_depositMaturity = new TextField();
                textField_depositMaturity.setLayoutX(180);
                textField_depositMaturity.setLayoutY(280);


                Button calculate = new Button("Calculate");
                calculate.setLayoutX(100);
                calculate.setLayoutY(450);
                calculate.setPrefWidth(200);

                //creating the onscreen keyboard
                TextField calDisplay = new TextField();
                calDisplay.setLayoutX(650);
                calDisplay.setLayoutY(125);

                Button cal1 = new Button("1");
                cal1.setLayoutX(680);
                cal1.setLayoutY(180);

                Button cal2 = new Button("2");
                cal2.setLayoutX(730);
                cal2.setLayoutY(180);

                Button cal3 = new Button("3");
                cal3.setLayoutX(780);
                cal3.setLayoutY(180);

                Button cal4 = new Button("4");
                cal4.setLayoutX(680);
                cal4.setLayoutY(230);

                Button cal5 = new Button("5");
                cal5.setLayoutX(730);
                cal5.setLayoutY(230);

                Button cal6 = new Button("6");
                cal6.setLayoutX(780);
                cal6.setLayoutY(230);


                Button cal7 = new Button("7");
                cal7.setLayoutX(680);
                cal7.setLayoutY(280);


                Button cal8 = new Button("8");
                cal8.setLayoutX(730);
                cal8.setLayoutY(280);

                Button cal9 = new Button("9");
                cal9.setLayoutX(780);
                cal9.setLayoutY(280);

                Button cal0 = new Button("0");
                cal0.setLayoutX(730);
                cal0.setLayoutY(330);

                Button calDecimal = new Button(".");
                calDecimal.setLayoutX(680);
                calDecimal.setLayoutY(330);

                Button calDel = new Button("Del");
                calDel.setLayoutX(780);
                calDel.setLayoutY(330);

                Button confirm = new Button("Confirm");
                confirm.setLayoutX(710);
                confirm.setLayoutY(370);

                //======================================selecting the text field========================================
                textField_depositAmount.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_depositAmount.setEditable(true);
                        textField_interest.setEditable(false);
                        textField_depositPeriod.setEditable(false);
                        textField_depositMaturity.setEditable(false);
                    }
                });

                textField_interest.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_depositAmount.setEditable(false);
                        textField_interest.setEditable(true);
                        textField_depositPeriod.setEditable(false);
                        textField_depositMaturity.setEditable(false);
                    }
                });
                textField_depositPeriod.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_depositAmount.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_depositPeriod.setEditable(true);
                        textField_depositMaturity.setEditable(false);
                    }
                });
                textField_depositMaturity.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField_depositAmount.setEditable(false);
                        textField_interest.setEditable(false);
                        textField_depositPeriod.setEditable(false);
                        textField_depositMaturity.setEditable(true);
                    }
                });


                confirm.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if(textField_depositAmount.isEditable()){
                            textField_depositAmount.setText(calDisplay.getText());
                        } else if (textField_interest.isEditable()){
                            textField_interest.setText(calDisplay.getText());
                        } else if (textField_depositPeriod.isEditable()){
                            textField_depositPeriod.setText(calDisplay.getText());
                        }
                        calDisplay.clear();
                    }
                });


                //creating keyboard

                cal0.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("0");
                    }
                });

                cal1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("1");
                    }
                });

                cal2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("2");
                    }
                });
                cal3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("3");
                    }
                });
                cal4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("4");
                    }
                });
                cal5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("5");
                    }
                });
                cal6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("6");
                    }
                });
                cal7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("7");
                    }
                });
                cal8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("8");
                    }
                });
                cal9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText("9");
                    }
                });
                calDecimal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        calDisplay.appendText(".");
                    }
                });
                calDel.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if(!calDisplay.getText().isEmpty()) {
                            calDisplay.setText((calDisplay.getText(0, calDisplay.getLength() - 1)));
                        }
                    }
                });

                //creating the pane for fixed deposit calculator
                Pane panefixedDeposit = new Pane();

                //adding elements to the fixed deposit pane
                panefixedDeposit.getChildren().addAll(heading,fixedDeposit_label_depositAmount,textField_depositAmount,fixedDeposit_label_interest,textField_interest,button_back
                        ,fixedDeposit_label_depositPeriod,textField_depositPeriod,fixedDeposit_label_depositMaturity,textField_depositMaturity,calculate,calDisplay,
                        cal0,cal1,cal2,cal3,cal4,cal5,cal6,cal7,cal8,cal9,calDecimal,calDel,confirm);

                //creating the scene for the fixed deposit calculator
                Scene scenefixedDeposit = new Scene(panefixedDeposit,1024,768);

                //set scene_fixedDeposit as the primary stage scene
                primaryStage.setScene(scenefixedDeposit);

                //this back button will return to the main menu
                button_back.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.setScene(mainMenuScene);
                    }
                });
            }
        });
    }
}
