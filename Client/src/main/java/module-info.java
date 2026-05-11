module cz.vse.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.vse.client to javafx.fxml;
    exports cz.vse.client;
}