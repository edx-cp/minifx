module edxcp.github.com.minijavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens edxcp.github.com.minifx to javafx.fxml;
    exports edxcp.github.com.minifx;
}