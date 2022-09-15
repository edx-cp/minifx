module edxcp.github.com.minijavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.uclouvain.visualsearchtree;

    opens edxcp.github.com.minifx to javafx.fxml;
    exports edxcp.github.com.minifx;
}