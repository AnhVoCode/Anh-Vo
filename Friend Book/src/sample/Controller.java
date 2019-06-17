package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField textGetName;
    public TextField textGetAge;
    public TextField textGetGender;

    public Label lblName;
    public Label lblAge;
    public Label lblGender;
    public ListView <Friend> friendList = new ListView<Friend>();

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend(textGetName.getText(),Integer.parseInt(textGetAge.getText()),textGetGender.getText());
        friendList.getItems().add(temp);
        textGetName.clear();
        textGetAge.clear();
        textGetGender.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblName.setText(temp.name);
        lblAge.setText(Integer.toString(temp.getAge()));
        lblGender.setText(temp.getGender());

    }

    public void removeFriend(ActionEvent actionEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(temp);
        lblName.setText("");
        lblAge.setText("");
        lblGender.setText("");
    }
}
