package Board;

import Pieces.*;

public class Board {
    Square a1 = new Square('A',1, new Rook(Color.W));
    Square b1 = new Square('B',1, new Knight(Color.W));
    Square c1 = new Square('C',1, new Bishop(Color.W));
    Square d1 = new Square('D',1, new Queen(Color.W));
    Square e1 = new Square('E',1, new King(Color.W));
    Square f1 = new Square('F',1, new Bishop(Color.W));
    Square g1 = new Square('G',1, new Knight(Color.W));
    Square h1 = new Square('H',1, new Rook(Color.W));


    Square a2 = new Square('A',2, new Pawn(Color.W));
    Square b2 = new Square('B',2, new Pawn(Color.W));
    Square c2 = new Square('C',2, new Pawn(Color.W));
    Square d2 = new Square('D',2, new Pawn(Color.W));
    Square e2 = new Square('E',2, new Pawn(Color.W));
    Square f2 = new Square('F',2, new Pawn(Color.W));
    Square g2 = new Square('G',2, new Pawn(Color.W));
    Square h2 = new Square('H',2, new Pawn(Color.W));

    Square a3 = new Square('A',3);
    Square b3 = new Square('B',3);
    Square c3 = new Square('C',3);
    Square d3 = new Square('D',3);
    Square e3 = new Square('E',3);
    Square f3 = new Square('F',3);
    Square g3 = new Square('G',3);
    Square h3 = new Square('H',3);

    Square a4 = new Square('A',4);
    Square b4 = new Square('B',4);
    Square c4 = new Square('C',4);
    Square d4 = new Square('D',4);
    Square e4 = new Square('E',4);
    Square f4 = new Square('F',4);
    Square g4 = new Square('G',4);
    Square h4 = new Square('H',4);

    Square a5 = new Square('A',5);
    Square b5 = new Square('B',5);
    Square c5 = new Square('C',5);
    Square d5 = new Square('D',5);
    Square e5 = new Square('E',5);
    Square f5 = new Square('F',5);
    Square g5 = new Square('G',5);
    Square h5 = new Square('H',5);

    Square a6 = new Square('A',6);
    Square b6 = new Square('B',6);
    Square c6 = new Square('C',6);
    Square d6 = new Square('D',6);
    Square e6 = new Square('E',6);
    Square f6 = new Square('F',6);
    Square g6 = new Square('G',6);
    Square h6 = new Square('H',6);

    Square a7 = new Square('A',7, new Pawn(Color.B));
    Square b7 = new Square('B',7, new Pawn(Color.B));
    Square c7 = new Square('C',7, new Pawn(Color.B));
    Square d7 = new Square('D',7, new Pawn(Color.B));
    Square e7 = new Square('E',7, new Pawn(Color.B));
    Square f7 = new Square('F',7, new Pawn(Color.B));
    Square g7 = new Square('G',7, new Pawn(Color.B));
    Square h7 = new Square('H',7, new Pawn(Color.B));

    Square a8 = new Square('A',8, new Rook(Color.B));
    Square b8 = new Square('B',8, new Knight(Color.B));
    Square c8 = new Square('C',8, new Bishop(Color.B));
    Square d8 = new Square('D',8, new Queen(Color.B));
    Square e8 = new Square('E',8, new King(Color.B));
    Square f8 = new Square('F',8, new Bishop(Color.B));
    Square g8 = new Square('G',8, new Knight(Color.B));
    Square h8 = new Square('H',8, new Rook(Color.B));

    public Board(){
    }


    private void setUpperSquares(){
        a1.setUpper(a2);
        a2.setUpper(a3);
        a3.setUpper(a4);
        a4.setUpper(a5);
        a5.setUpper(a6);
        a6.setUpper(a7);
        a7.setUpper(a8);
        b1.setUpper(b2);
        b2.setUpper(b3);
        b3.setUpper(b4);
        b4.setUpper(b5);
        b5.setUpper(b6);
        b6.setUpper(b7);
        b7.setUpper(b8);
        c1.setUpper(c2);
        c2.setUpper(c3);
        c3.setUpper(c4);
        c4.setUpper(c5);
        c5.setUpper(c6);
        c6.setUpper(c7);
        c7.setUpper(c8);
        d1.setUpper(d2);
        d2.setUpper(d3);
        d3.setUpper(d4);
        d4.setUpper(d5);
        d5.setUpper(d6);
        d6.setUpper(d7);
        d7.setUpper(d8);
        e1.setUpper(e2);
        e2.setUpper(e3);
        e3.setUpper(e4);
        e4.setUpper(e5);
        e5.setUpper(e6);
        e6.setUpper(e7);
        e7.setUpper(e8);
        f1.setUpper(f2);
        f2.setUpper(f3);
        f3.setUpper(f4);
        f4.setUpper(f5);
        f5.setUpper(f6);
        f6.setUpper(f7);
        f7.setUpper(f8);
        g1.setUpper(g2);
        g2.setUpper(g3);
        g3.setUpper(g4);
        g4.setUpper(g5);
        g5.setUpper(g6);
        g6.setUpper(g7);
        g7.setUpper(g8);
        h1.setUpper(h2);
        h2.setUpper(h3);
        h3.setUpper(h4);
        h4.setUpper(h5);
        h5.setUpper(h6);
        h6.setUpper(h7);
        h7.setUpper(h8);
    }
    private void setBottomSquares(){
        a2.setBottom(a1);
        a3.setBottom(a2);
        a4.setBottom(a3);
        a5.setBottom(a4);
        a6.setBottom(a5);
        a7.setBottom(a6);
        a8.setBottom(a7);
        b2.setBottom(b1);
        b3.setBottom(b2);
        b4.setBottom(b3);
        b5.setBottom(b4);
        b6.setBottom(b5);
        b7.setBottom(b6);
        b8.setBottom(b7);
        c2.setBottom(c1);
        c3.setBottom(c2);
        c4.setBottom(c3);
        c5.setBottom(c4);
        c6.setBottom(c5);
        c7.setBottom(c6);
        c8.setBottom(c7);
        d2.setBottom(d1);
        d3.setBottom(d2);
        d4.setBottom(d3);
        d5.setBottom(d4);
        d6.setBottom(d5);
        d7.setBottom(d6);
        d8.setBottom(d7);
        e2.setBottom(e1);
        e3.setBottom(e2);
        e4.setBottom(e3);
        e5.setBottom(e4);
        e6.setBottom(e5);
        e7.setBottom(e6);
        e8.setBottom(e7);
        f2.setBottom(f1);
        f3.setBottom(f2);
        f4.setBottom(f3);
        f5.setBottom(f4);
        f6.setBottom(f5);
        f7.setBottom(f6);
        f8.setBottom(f7);
        g2.setBottom(g1);
        g3.setBottom(g2);
        g4.setBottom(g3);
        g5.setBottom(g4);
        g6.setBottom(g5);
        g7.setBottom(g6);
        g8.setBottom(g7);
        h2.setBottom(h1);
        h3.setBottom(h2);
        h4.setBottom(h3);
        h5.setBottom(h4);
        h6.setBottom(h5);
        h7.setBottom(h6);
        h8.setBottom(h7);
    }
    private void setLeftSquares(){
        b1.setLeft(a1);
        c1.setLeft(b1);
        d1.setLeft(c1);
        e1.setLeft(d1);
        f1.setLeft(e1);
        g1.setLeft(f1);
        h1.setLeft(g1);
        b2.setLeft(a2);
        c2.setLeft(b2);
        d2.setLeft(c2);
        e2.setLeft(d2);
        f2.setLeft(e2);
        g2.setLeft(f2);
        h2.setLeft(g2);
        b3.setLeft(a3);
        c3.setLeft(b3);
        d3.setLeft(c3);
        e3.setLeft(d3);
        f3.setLeft(e3);
        g3.setLeft(f3);
        h3.setLeft(g3);
        b4.setLeft(a4);
        c4.setLeft(b4);
        d4.setLeft(c4);
        e4.setLeft(d4);
        f4.setLeft(e4);
        g4.setLeft(f4);
        h4.setLeft(g4);
        b5.setLeft(a5);
        c5.setLeft(b5);
        d5.setLeft(c5);
        e5.setLeft(d5);
        f5.setLeft(e5);
        g5.setLeft(f5);
        h5.setLeft(g5);
        b6.setLeft(a6);
        c6.setLeft(b6);
        d6.setLeft(c6);
        e6.setLeft(d6);
        f6.setLeft(e6);
        g6.setLeft(f6);
        h6.setLeft(g6);
        b7.setLeft(a7);
        c7.setLeft(b7);
        d7.setLeft(c7);
        e7.setLeft(d7);
        f7.setLeft(e7);
        g7.setLeft(f7);
        h7.setLeft(g7);
        b8.setLeft(a8);
        c8.setLeft(b8);
        d8.setLeft(c8);
        e8.setLeft(d8);
        f8.setLeft(e8);
        g8.setLeft(f8);
        h8.setLeft(g8);
    }
    private void setRightSquares(){
        a1.setRight(b1);
        b1.setRight(c1);
        c1.setRight(d1);
        d1.setRight(e1);
        e1.setRight(f1);
        f1.setRight(g1);
        g1.setRight(h1);
        a2.setRight(b2);
        b2.setRight(c2);
        c2.setRight(d2);
        d2.setRight(e2);
        e2.setRight(f2);
        f2.setRight(g2);
        g2.setRight(h2);
        a3.setRight(b3);
        b3.setRight(c3);
        c3.setRight(d3);
        d3.setRight(e3);
        e3.setRight(f3);
        f3.setRight(g3);
        g3.setRight(h3);
        a4.setRight(b4);
        b4.setRight(c4);
        c4.setRight(d4);
        d4.setRight(e4);
        e4.setRight(f4);
        f4.setRight(g4);
        g4.setRight(h4);
        a5.setRight(b5);
        b5.setRight(c5);
        c5.setRight(d5);
        d5.setRight(e5);
        e5.setRight(f5);
        f5.setRight(g5);
        g5.setRight(h5);
        a6.setRight(b6);
        b6.setRight(c6);
        c6.setRight(d6);
        d6.setRight(e6);
        e6.setRight(f6);
        f6.setRight(g6);
        g6.setRight(h6);
        a7.setRight(b7);
        b7.setRight(c7);
        c7.setRight(d7);
        d7.setRight(e7);
        e7.setRight(f7);
        f7.setRight(g7);
        g7.setRight(h7);
        a8.setRight(b8);
        b8.setRight(c8);
        c8.setRight(d8);
        d8.setRight(e8);
        e8.setRight(f8);
        f8.setRight(g8);
        g8.setRight(h8);
    }

    @Override
    public String toString() {
        return a8.toString()+b8+c8+d8+e8+f8+g8+h8+"\n"+
                a7+b7+c7+d7+e7+f7+g7+h7+"\n"+
                a6+b6+c6+d6+e6+f6+g6+h6+"\n"+
                a5+b5+c5+d5+e5+f5+g5+h5+"\n"+
                a4+b4+c4+d4+e4+f4+g4+h4+"\n"+
                a3+b3+c3+d3+e3+f3+g3+h3+"\n"+
                a2+b2+c2+d2+e2+f2+g2+h2+"\n"+
                a1+b1+c1+d1+e1+f1+g1+h1;
    }
}
