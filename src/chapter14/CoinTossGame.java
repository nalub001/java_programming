package chapter14;

import java.util.Random;
import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args){
        Player p1 = new Player("Me");
        Player p2 = new Player("me1");

        Coin coin = new Coin();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Heads or Tails");
        p1.setGuess(scanner.next());
        while(!p1.getGuess().equals(Coin.HEADS)&& !p1.getGuess().equals(Coin.TAILS)){
            System.out.println("Choose Heads or Tails");
            p1.setGuess(scanner.next());
        }
        if (p1.getGuess().equals(Coin.HEADS)){
            p2.setGuess(Coin.TAILS);
        }else{
            p2.setGuess(Coin.HEADS);
        }

        String getWinner = coin.flip();
        if(getWinner.equals(p1.getGuess())){
            System.out.println("Player 1 Wins!");
        }else{
            System.out.println("Player 2 Wins!");
        }
    }
}
