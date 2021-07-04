package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    public TextField textGetNum;
    int num, total;
    int calculation;
    /*ArrayList<Integer> number = new ArrayList<Integer>();
    ArrayList<String> operation = new ArrayList<String>();*/

    public void print9(ActionEvent actionEvent) {
       textGetNum.setText(textGetNum.getText()+"9");
    }

    public void print8(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+"8");
    }

    public void print7(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+"7");
    }

    public void print6(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+"6");
    }

    public void print5(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+"5");
    }

    public void print4(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+"4");
    }

    public void print3(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+"3");
    }

    public void print2(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+"2");
    }

    public void print1(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+"1");
    }

    public void print0(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+"0");
    }

    public void printDot(ActionEvent actionEvent) {
        textGetNum.setText(textGetNum.getText()+".");
    }

    public void clear(ActionEvent actionEvent) {
        textGetNum.setText("");
    }

    public void printTotal(ActionEvent actionEvent) {
        arithmetic_operation();
    }

    public void arithmetic_operation(){
        switch(calculation){
            case 1: //Addition
                total = num + Integer.parseInt(textGetNum.getText());
                textGetNum.setText(Integer.toString(total));
                break;
            case 2: //Subtraction
                total = num - Integer.parseInt(textGetNum.getText());
                textGetNum.setText(Integer.toString(total));
                break;
            case 3: //Multiplication
                total = num * Integer.parseInt(textGetNum.getText());
                textGetNum.setText(Integer.toString(total));
                break;
        }
    }
    public void Add(ActionEvent actionEvent) {
        num = Integer.parseInt(textGetNum.getText());
        calculation = 1;
        textGetNum.setText("");
    }

    public void Subtract(ActionEvent actionEvent) {
        num = Integer.parseInt(textGetNum.getText());
        calculation = 2;
        textGetNum.setText("");
    }

    public void Multiply(ActionEvent actionEvent) {
        num = Integer.parseInt(textGetNum.getText());
        calculation = 3;
        textGetNum.setText("");
    }







    /*public TextField textAdd;
    public TextField textSubtract;
    public TextField textMultiply;
    public TextField textDivide;
    public Label Total;
    public double total = 0;


    public void Add(ActionEvent actionEvent) {
        double num = Double.parseDouble(textAdd.getText());
        total+=num;
        Total.setText(Double.toString(total));
    }

    public void Subtract(ActionEvent actionEvent) {
        double num = Double.parseDouble(textSubtract.getText());
        total-=num;
        Total.setText(Double.toString(total));
    }

    public void Multiply(ActionEvent actionEvent) {
        double num = Double.parseDouble(textMultiply.getText());
        total*=num;
        Total.setText(Double.toString(total));
    }

    public void Clear(ActionEvent actionEvent) {
        total-=total;
        Total.setText(Double.toString(total));

    }

    public void Divide(ActionEvent actionEvent) {
        double num = Double.parseDouble(textDivide.getText());
        total/=num;
        Total.setText(Double.toString(total));
    }*/
}

