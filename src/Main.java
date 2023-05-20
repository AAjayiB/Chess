import Board.Square;
import Pieces.Color;
import Pieces.King;

public class Main {
    public static void main(String[] args) {
        King king = new King(Color.BLACK);

        Square square=new Square('A', 1);

        System.out.println(square.isFree());
    }
}