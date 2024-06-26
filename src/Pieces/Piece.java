package Pieces;

public abstract class Piece {
    private String name;
    private Color color;

    Piece(String name, Color color){
        this.name=name;
        this.color=color;
    }

    public String getName(){
        return name;
    }
    public Color getColor(){
        return color;
    }

    @Override
    public String toString() {
        return color+name;
    }
}
