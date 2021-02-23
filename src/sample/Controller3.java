package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller3 implements Initializable {

    @FXML
    public PieChart PieChart;
    @FXML
    public BarChart BarChart;

    public static double damagePokemonAmigo = 0;
    public static double damagePokemonEnemigo = 0;

    //public Controller controller;

    public void initialize(URL url, ResourceBundle resourceBundle){
        double auxiliar = damagePokemonAmigo;
        Stage stage = new Stage();
        Scene scene = new Scene(new Group());
        stage.setTitle("Daño total");
        stage.setWidth(200);
        stage.setHeight(200);

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                    new PieChart.Data("Pokemon Amigo", auxiliar),
                    new PieChart.Data("Pokemon Enemigo",damagePokemonEnemigo));

        PieChart.setData(pieChartData);
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Daño total");
        chart.setLabelLineLength(10);
        chart.setLegendSide(Side.RIGHT);

        final Label caption = new Label("");
        caption.setTextFill(Color.DARKMAGENTA);
        caption.setStyle("-fx-font: 20 arial;");

        for (final PieChart.Data data : chart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
                    e -> {
                        caption.setTranslateX(e.getSceneX());
                        caption.setTranslateY(e.getSceneY());
                        caption.setText(data.getPieValue() + "%");
                    });
        }
        PieChart.setData(pieChartData);
        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();

    }
    public void graficoBarras(Controller controller){

        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Nº veces");
        xAxis.setLabel("Pokemon");
        yAxis.setLabel("Cantidad");

        XYChart.Series series1 = new XYChart.Series<>();
        series1.setName(controller.pokemon1.nombre);
        series1.getData().add(new XYChart.Data(controller.nombre1,controller.cont1));
        BarChart.getData().addAll(series1);

        XYChart.Series series2 = new XYChart.Series<>();
        series1.setName(controller.pokemon2.nombre);
        series1.getData().add(new XYChart.Data(controller.nombre2,controller.cont2));
        BarChart.getData().addAll(series2);

        XYChart.Series series3 = new XYChart.Series<>();
        series1.setName(controller.pokemon3.nombre);
        series1.getData().add(new XYChart.Data(controller.nombre3,controller.cont3));
        BarChart.getData().addAll(series3);

        XYChart.Series series4 = new XYChart.Series<>();
        series1.setName(controller.pokemon4.nombre);
        series1.getData().add(new XYChart.Data(controller.nombre4,controller.cont4));
        BarChart.getData().addAll(series4);

        XYChart.Series series5 = new XYChart.Series<>();
        series1.setName(controller.pokemon5.nombre);
        series1.getData().add(new XYChart.Data(controller.nombre5,controller.cont5));
        BarChart.getData().addAll(series5);

        XYChart.Series series6 = new XYChart.Series<>();
        series1.setName(controller.pokemon1.nombre);
        series1.getData().add(new XYChart.Data(controller.nombre6,controller.cont6));
        BarChart.getData().addAll(series6);

        /*
        Scene scene2  = new Scene(bc,300,300);
        bc.getData().addAll(series1);
        stage.setScene(scene2);
        stage.show();
        */
    }


}
