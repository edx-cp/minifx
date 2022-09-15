package edxcp.github.com.minifx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.uclouvain.visualsearchtree.tree.Tree;
import org.uclouvain.visualsearchtree.tree.TreeVisual;
import org.uclouvain.visualsearchtree.tree.Visualizer;

public class Test extends Application {
    public static void main(String[] args) {
        launch(args);
        System.out.println("\n======================\nRunning the main method\n======================");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Tree t = new Tree(0);
        TreeVisual tv = new TreeVisual(()->{

        },t,true);
        t.createNode(1, 0,Tree.NodeType.INNER,()->{} , "info");
        t.createNode(2, 1,Tree.NodeType.INNER,()->{} , "info");
        Visualizer.show(tv);
    }
}

// COMMAND
// mvn compile exec:java -Dexec.mainClass="edxcp.github.com.minifx.Test"