module cz.vse.java.checkers.checkers {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.vse.java.checkers.checkers to javafx.fxml;
    exports cz.vse.java.checkers.checkers;
}