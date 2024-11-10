package edu.foxyfnaf.thunderos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller {
    @FXML
    private ImageView logoView;

    @FXML
    private AnchorPane pane = new AnchorPane();

    @FXML
    private Button start = new Button();

    @FXML
    protected void initialize() {
        Image logo = new Image(getClass().getResourceAsStream("ThunderOS.png"));
        logoView.setImage(logo);

        AnchorPane.setBottomAnchor(start,1.0);
        AnchorPane.setLeftAnchor(start,1.0);
    }
}