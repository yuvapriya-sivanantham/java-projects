import board.QueenBoard;
import game.NQueenGame;

public class app {
    public static void main(String[] args) throws Exception {
     
      QueenBoard b=new QueenBoard(5);
      NQueenGame game=new NQueenGame(b);
      
      game.play();


      
    }
}
