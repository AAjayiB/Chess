package Board;

import Pieces.Piece;

public class Square {
    private char letter;
    private int number;
    private Piece piece = null;
    private Square upperLeft = null;
    private Square upper = null;
    private  Square upperRight = null;
    private Square left = null;
    private Square right = null;
    private Square bottomLeft = null;
    private Square bottom = null;
    private  Square bottomRight = null;


    public Square(char letter,int number){
        this.letter=letter;
        this.number=number;
    }

    public boolean isFree(){
        return piece==null;
    }
    public void setUpperLeft(Square square){
        this.upperLeft=square;
    }
    public void setUpper(Square square){
        this.upper=square;
    }
    public void setUpperRight(Square square){
        this.upperRight=square;
    }
    public void setLeft(Square square){
        this.left=square;
    }
    public void setRight(Square square){
        this.right=square;
    }
    public void setBottomLeft(Square square){
        this.bottomLeft=square;
    }
    public void setBottom(Square square){
        this.bottom=square;
    }
    public void setBottomRight(Square square){
        this.bottomRight=square;
    }
}
