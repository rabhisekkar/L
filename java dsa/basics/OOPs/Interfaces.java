/*  author: @rabhisekkar
    description: demonstration of interfaces

    An interface in Java is a blueprint for a class.

    Note: Technically, an interface in Java is an abstract type
    that defines a set of methods a class must implement and
    constants, supporting abstraction and multiple inheritance.
*/

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all dirns)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by 1 sq)");
    }
}

// output
// up, down, left, right, diagonal (in all dirns)