module ru.gb.demojavafxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.demojavafxapp to javafx.fxml;
    exports ru.gb.demojavafxapp;
}