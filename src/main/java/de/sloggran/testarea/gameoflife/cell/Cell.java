package de.sloggran.testarea.gameoflife.cell;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cell{

    private boolean isAlive;
    private Rectangle field;

    public Cell(int size){
        field = new Rectangle();
        field.setStroke(Color.DARKBLUE);
        field.setFill(Color.WHEAT);

        isAlive = false;
    }
    public void changeState(){
        field.setFill(isAlive ? Color.WHEAT : Color.DARKGREEN);
        isAlive = !isAlive;
    }
}
