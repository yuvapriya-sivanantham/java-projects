import board.Board;
import player.Player;
import game.Game;
//import java.util.Scanner;

class App{
    public static void main(String[] args) throws Exception{
        System.out.println("First Project -> Tic Tac Toe");
        Board b= new Board(3,'-');
        b.printBoardConfig();
     //   Scanner sc=new Scanner(System.in);
       // System.out.print("Enter Player1 Name: ");
        //String name=sc.nextLine();
        //System.out.print("Enter Player1 Symbol: ");
        //char symbol=sc.nextLine().charAt(0);

        Player p1=new Player();
        p1.setPlayerNameSymbol("Ram", 'X');
        p1.getPlayerNameSymbol();
        Player p2=new Player();
        p2.setPlayerNameSymbol("Sam", 'O');
        p2.getPlayerNameSymbol();
        Game game=new Game(new Player[]{p1,p2},b);
        game.printBoardConfig();
        game.play();

    }
}