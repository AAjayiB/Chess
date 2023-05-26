import Board.Board;
import Board.Square;
import Pieces.Color;
import Pieces.King;
import Pieces.Piece;

public class Main {
    public static void main(String[] args) {
        Square square = new Square('A',1);
        King king = new King(Color.B);
        square.setPiece(king);
        Board board = new Board();
        System.out.println(board);


//        String[] list= {"a","b","c","d","e","f","g","h"};
////        for(String x:list){
//            for (int z=0;z<8;z++){
//                System.out.println("a"+(z+1)+".setRight(b"+(z+1)+");\n" +
//                        "b"+(z+1)+".setRight(c"+(z+1)+");\n" +
//                        "c"+(z+1)+".setRight(d"+(z+1)+");\n" +
//                        "d"+(z+1)+".setRight(e"+(z+1)+");\n" +
//                        "e"+(z+1)+".setRight(f"+(z+1)+");\n" +
//                        "f"+(z+1)+".setRight(g"+(z+1)+");\n" +
//                        "g"+(z+1)+".setRight(h"+(z+1)+");");
//            }
//        }
    }
}