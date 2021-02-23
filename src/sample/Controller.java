package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {

    @FXML
    public Button Siguiente;
    @FXML
    public Button Estadisticas;

    @FXML
    public ImageView imagen1;
    @FXML
    public ImageView imagen2;
    @FXML
    public ImageView imagen3;
    @FXML
    public ImageView imagen4;
    @FXML
    public ImageView imagen5;
    @FXML
    public ImageView imagen6;


    @FXML
    public Label nombre1;
    @FXML
    public Label nivel1;
    @FXML
    public Label vida1;

    @FXML
    public Label nombre2;
    @FXML
    public Label nivel2;
    @FXML
    public Label vida2;

    @FXML
    public Label nombre3;
    @FXML
    public Label nivel3;
    @FXML
    public Label vida3;

    @FXML
    public Label nombre4;
    @FXML
    public Label nivel4;
    @FXML
    public Label vida4;

    @FXML
    public Label nombre5;
    @FXML
    public Label nivel5;
    @FXML
    public Label vida5;

    @FXML
    public Label nombre6;
    @FXML
    public Label nivel6;
    @FXML
    public Label vida6;

    @FXML
    public CheckBox cb1;
    @FXML
    public CheckBox cb2;
    @FXML
    public CheckBox cb3;
    @FXML
    public CheckBox cb4;
    @FXML
    public CheckBox cb5;
    @FXML
    public CheckBox cb6;

    @FXML
    public Pane p1;
    @FXML
    public Pane p2;
    @FXML
    public Pane p3;
    @FXML
    public Pane p4;
    @FXML
    public Pane p5;
    @FXML
    public Pane p6;

    @FXML
    public ProgressBar pb1;
    @FXML
    public ProgressBar pb2;
    @FXML
    public ProgressBar pb3;
    @FXML
    public ProgressBar pb4;
    @FXML
    public ProgressBar pb5;
    @FXML
    public ProgressBar pb6;

    ClasePokemon pokemon1 = new ClasePokemon("Dragonite",65,270,"\\Imagenes\\dragonite.gif");
    ClasePokemon pokemon2 = new ClasePokemon("Absol",45,145,"\\Imagenes\\absol.gif");
    ClasePokemon pokemon3 = new ClasePokemon("Raichu",53,234,"\\Imagenes\\raichu.gif");
    ClasePokemon pokemon4 = new ClasePokemon("Squirtle",35,130,"\\Imagenes\\squirtle.gif");
    ClasePokemon pokemon5 = new ClasePokemon("Vaporeon",58,290,"\\Imagenes\\vaporeon.gif");
    ClasePokemon pokemon6 = new ClasePokemon("Talonflame",50,190,"\\Imagenes\\talonflame.gif");
    ClasePokemon auxiliar;
    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;
    int cont4 = 0;
    int cont5 = 0;
    int cont6 = 0;

    @FXML
    public void initialize(){
        pokedex(nombre1,nivel1,vida1,imagen1,pokemon1);
        pokedex(nombre2,nivel2,vida2,imagen2,pokemon2);
        pokedex(nombre3,nivel3,vida3,imagen3,pokemon3);
        pokedex(nombre4,nivel4,vida4,imagen4,pokemon4);
        pokedex(nombre5,nivel5,vida5,imagen5,pokemon5);
        pokedex(nombre6,nivel6,vida6,imagen6,pokemon6);
    }
    
    public void clickImagen1(){
        cambiar(nombre1,nivel1,vida1,cb1,p1);
        pokemon1.imagen = "\\Imagenes\\dragoniteespalda.gif";
        auxiliar = pokemon1;
        estatico(nombre2,nivel2,vida2,cb2,p2);
        estatico(nombre3,nivel3,vida3,cb3,p3);
        estatico(nombre4,nivel4,vida4,cb4,p4);
        estatico(nombre5,nivel6,vida5,cb5,p5);
        estatico(nombre6,nivel2,vida6,cb6,p6);
        cont1 += 1;
    }
    public void clickImagen2(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        cambiar(nombre2,nivel2,vida2,cb2,p2);
        pokemon2.imagen = "\\Imagenes\\absolespalda.gif";
        auxiliar = pokemon2;
        estatico(nombre3,nivel3,vida3,cb3,p3);
        estatico(nombre4,nivel4,vida4,cb4,p4);
        estatico(nombre5,nivel6,vida5,cb5,p5);
        estatico(nombre6,nivel2,vida6,cb6,p6);
        cont2 += 1;
    }
    public void clickImagen3(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        estatico(nombre2,nivel2,vida2,cb2,p2);
        cambiar(nombre3,nivel3,vida3,cb3,p3);
        pokemon3.imagen = "\\Imagenes\\raichuespalda.gif";
        auxiliar = pokemon3;
        estatico(nombre4,nivel4,vida4,cb4,p4);
        estatico(nombre5,nivel6,vida5,cb5,p5);
        estatico(nombre6,nivel2,vida6,cb6,p6);
        cont3 += 1;
    }
    public void clickImagen4(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        estatico(nombre2,nivel2,vida2,cb2,p2);
        estatico(nombre3,nivel3,vida3,cb3,p3);
        cambiar(nombre4,nivel4,vida4,cb4,p4);
        pokemon4.imagen = "\\Imagenes\\squirtleespalda.gif";
        auxiliar = pokemon4;
        estatico(nombre5,nivel6,vida5,cb5,p5);
        estatico(nombre6,nivel2,vida6,cb6,p6);
        cont4 += 1;
    }
    public void clickImagen5(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        estatico(nombre2,nivel2,vida2,cb2,p2);
        estatico(nombre3,nivel3,vida3,cb3,p3);
        estatico(nombre4,nivel4,vida4,cb4,p4);
        cambiar(nombre5,nivel6,vida5,cb5,p5);
        pokemon5.imagen = "\\Imagenes\\vaporeonespalda.gif";
        auxiliar = pokemon5;
        estatico(nombre6,nivel2,vida6,cb6,p6);
        cont5 += 1;
    }
    public void clickImagen6(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        estatico(nombre2,nivel2,vida2,cb2,p2);
        estatico(nombre3,nivel3,vida3,cb3,p3);
        estatico(nombre4,nivel4,vida4,cb4,p4);
        estatico(nombre5,nivel6,vida5,cb5,p5);
        cambiar(nombre6,nivel2,vida6,cb6,p6);
        pokemon6.imagen = "\\Imagenes\\talonflameespalda.gif";
        auxiliar = pokemon6;
        cont6 += 1;
    }


    public static void pokedex(Label nombre, Label nivel, Label vida, ImageView imagen, ClasePokemon pokemon) {
        nombre.setText(pokemon.nombre);
        nivel.setText("Nv. "+pokemon.nivel);
        vida.setText(pokemon.vida+"/"+pokemon.vida);
        Image image = new Image(pokemon.imagen);
        imagen.setImage(image);
    }

    public static void cambiar(Label nombre, Label nivel, Label vida, CheckBox checkbox, Pane pane) {
        nombre.setStyle("-fx-text-fill: blue;");
        nivel.setStyle("-fx-text-fill: blue;");
        vida.setStyle("-fx-text-fill: blue;");
        checkbox.setSelected(true);
        pane.setStyle("-fx-background-color: #85C1E9");

    }

    public static void estatico(Label nombre, Label nivel, Label vida, CheckBox checkbox, Pane pane) {
        nombre.setStyle("-fx-text-fill: #ffffff;");
        nivel.setStyle("-fx-text-fill: #ffffff;");
        vida.setStyle("-fx-text-fill: #ffffff;");
        checkbox.setSelected(false);
        pane.setStyle("-fx-background-color: #8E44AD");
    }

    public void clickSiguiente() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample2.fxml"));
        GridPane root = loader.load();
        Scene scene = new Scene(root,600,500);
        stage.setScene(scene);
        stage.show();

        Controller2 controller2 = loader.getController();
        controller2.auxiliar(auxiliar);
        controller2.setVentana(this);
    }

    public void entrada(ClasePokemon pokemon, Double progressbar){
        if (pokemon.nombre.equals(pokemon1.nombre)){
            vida1.setText(pokemon.vida+"/"+pokemon1.vida);
            pb1.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon2.nombre)){
            vida2.setText(pokemon.vida+"/"+pokemon2.vida);
            pb2.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon3.nombre)){
            vida3.setText(pokemon.vida+"/"+pokemon3.vida);
            pb3.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon4.nombre)){
            vida4.setText(pokemon.vida+"/"+pokemon4.vida);
            pb4.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon5.nombre)){
            vida5.setText(pokemon.vida+"/"+pokemon5.vida);
            pb5.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon6.nombre)){
            vida6.setText(pokemon.vida+"/"+pokemon6.vida);
            pb6.setProgress(progressbar);
        }
    }

    public void clickEstadisticas() throws IOException {
        Stage stage2 = new Stage();
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("sample3.fxml"));
        GridPane root2 = loader2.load();
        Scene scene2 = new Scene(root2,600,600);
        stage2.setScene(scene2);
        stage2.show();

        Controller3 controller3 = loader2.getController();
        controller3.graficoBarras(this);
    }
}
