package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javax.swing.text.html.ImageView;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Controller {

    @FXML
    public Button Salir;
    @FXML
    public Button Siguiente;

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
    public void initialize(){

        ClasePokemon pokemon1 = new ClasePokemon("Dragonite","Nv 65","270/270");
        ClasePokemon pokemon2 = new ClasePokemon("Absol","Nv 45","50/145");
        ClasePokemon pokemon3 = new ClasePokemon("Raichu","Nv 53","234/234");
        ClasePokemon pokemon4 = new ClasePokemon("Squirtle","Nv 35","120/130");
        ClasePokemon pokemon5 = new ClasePokemon("Vaporeon","Nv 58","290/290");
        ClasePokemon pokemon6 = new ClasePokemon("Talonflame","Nv 50","110/190");

        nombre1.setText(pokemon1.nombre);
        nivel1.setText(pokemon1.nivel);
        vida1.setText(pokemon1.vida);

        nombre2.setText(pokemon2.nombre);
        nivel2.setText(pokemon2.nivel);
        vida2.setText(pokemon2.vida);

        nombre3.setText(pokemon3.nombre);
        nivel3.setText(pokemon3.nivel);
        vida3.setText(pokemon3.vida);

        nombre4.setText(pokemon4.nombre);
        nivel4.setText(pokemon4.nivel);
        vida4.setText(pokemon4.vida);

        nombre5.setText(pokemon5.nombre);
        nivel5.setText(pokemon5.nivel);
        vida5.setText(pokemon5.vida);

        nombre6.setText(pokemon6.nombre);
        nivel6.setText(pokemon6.nivel);
        vida6.setText(pokemon6.vida);

    }

    @FXML
    public void selecDragonite(ActionEvent event){
        Siguiente.setText("Siguiente");
        nombre1.setTextFill(Color.BLUE);
        nivel1.setTextFill(Color.BLUE);
        vida1.setTextFill(Color.BLUE);
    }
    @FXML
    public void selecAbsol(ActionEvent event){
        Siguiente.setText("Siguiente");
        nombre1.setTextFill(Color.BLUE);
        nivel1.setTextFill(Color.BLUE);
        vida1.setTextFill(Color.BLUE);
    }
    @FXML
    public void selecRaichu(ActionEvent event){
        Siguiente.setText("Siguiente");
        nombre1.setTextFill(Color.BLUE);
        nivel1.setTextFill(Color.BLUE);
        vida1.setTextFill(Color.BLUE);
    }
    @FXML
    public void selecSquirtle(ActionEvent event){
        Siguiente.setText("Siguiente");
        nombre1.setTextFill(Color.BLUE);
        nivel1.setTextFill(Color.BLUE);
        vida1.setTextFill(Color.BLUE);
    }
    @FXML
    public void selecVaporeon(ActionEvent event){
        Salir.setText("Siguiente");
        nombre1.setTextFill(Color.BLUE);
        nivel1.setTextFill(Color.BLUE);
        vida1.setTextFill(Color.BLUE);
    }
    @FXML
    public void selecTalonflame(ActionEvent event){
        Siguiente.setText("Siguiente");
        nombre1.setTextFill(Color.BLUE);
        nivel1.setTextFill(Color.BLUE);
        vida1.setTextFill(Color.BLUE);
    }
}
