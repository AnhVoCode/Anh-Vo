package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    public TextField textGetNum;
    double total;
    int pos = 0;
    ArrayList<Double> number = new ArrayList<>();
    ArrayList<String> operation = new ArrayList<>();

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
        if (!textGetNum.getText().contains(".")){
            textGetNum.setText(textGetNum.getText()+".");
        }
    }
    public void clear(ActionEvent actionEvent) {
        clearOut();
        textGetNum.setText("");
    }
    void clearOut(){
        pos = 0;
        operation.clear();
        number.clear();
    }

    public void printTotal(ActionEvent actionEvent) {
        arithmetic_operation();
    }

    public void arithmetic_operation(){
        number.add(Double.parseDouble(textGetNum.getText()));
        if (number.size()<2){
            return;
        }
        else{
            total = number.get(0);
            for (int i =1; i<number.size();i++){
                if (operation.get(pos).equals("plus")){
                    total+=number.get(i);
                    pos++;
                }
                else if (operation.get(pos).equals("minus")){
                    total-=number.get(i);
                    pos++;
                }
                else if (operation.get(pos).equals("multiply")){
                    total*=number.get(i);
                    pos++;
                }
            }
            textGetNum.setText(Double.toString(total));
            clearOut();
        }
    }
    public void Add(ActionEvent actionEvent) {
        operation.add("plus");
        number.add(Double.parseDouble(textGetNum.getText()));
        textGetNum.setText("");
    }

    public void Subtract(ActionEvent actionEvent) {
        operation.add("minus");
        number.add(Double.parseDouble(textGetNum.getText()));
        textGetNum.setText("");
    }

    public void Multiply(ActionEvent actionEvent) {
        operation.add("multiply");
        number.add(Double.parseDouble(textGetNum.getText()));
        textGetNum.setText("");
    }

    public void Divide(ActionEvent actionEvent) {
        operation.add("divide");
        number.add(Double.parseDouble(textGetNum.getText()));
        textGetNum.setText("");
    }
}

