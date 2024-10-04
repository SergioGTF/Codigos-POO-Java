import java.util.Arrays;

public class CardGame {
    public static boolean winRound(int[] player, int[] opponent) {
        Arrays.sort(player);
        Arrays.sort(opponent);
        int playerNumber = player[3] * 10 + player[4];
        int opponentNumber = opponent[3] * 10 + opponent[4];
        return playerNumber > opponentNumber;
    }

    public static void main(String[] args) {
        int[] player = {2, 5, 2, 6, 9};
        int[] opponent = {3, 7, 3, 1, 2};
        System.out.println(winRound(player, opponent)); 
    }
}
