package ab05;

import java.util.Scanner;

public class Aufgabe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        do {
            TicTacToe game = new TicTacToe();
            int won = 0;
            int currentPlayer = 10;
            do {
                game.update(currentPlayer, scanner.nextInt());
                won = game.isWinner(currentPlayer);
                game.printField();
                currentPlayer = currentPlayer == 10 ? 11 : 10;
            } while(won == 0);
            System.out.println("Player " + won + "wins!");
            running = (scanner.next().toLowerCase().equals("y"));
        } while (running);
    }
}

class TicTacToe {
    private int[] field; //0 = empty, 1 = player1, 2 = player2
    private char[] playerMark = {'X', 'O'};

    public TicTacToe() {
        this.field = new int[9];
    }

    public void update(int player, int index) throws IllegalArgumentException {
        index--;
        try {
            if (player != 10 && player != 11) throw new IllegalArgumentException("Player has to be either 1 or 2");
            field[index] = player;
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("field has to be between 1 and 9");
        }
    }

    /**
     * checks if there is a winner
     * @return the player who won, if no one won it returns 0
     */
    public int isWinner(int player) {
        return (
                (field[0] == player &&
                        (field[1] == player && field[2] == player) ||
                        (field[4] == player && field[8] == player) ||
                        (field[3] == player && field[6] == player)
                ) ||
                (field[1] == player && field[4] == player && field[7] == player) ||
                (field[2] == player &&
                        (field[5] == player && field[8] == player) ||
                        (field[4] == player && field[6] == player)
                ) ||
                (field[3] == player && field[4] == player && field[5] == player) ||
                (field[6] == player && field[7] == player && field[8] == player)
        ) ? player : 0;
    }

    public void printField() {
        for (int i = 0; i <= 6; i+=3) {
            for (int j = 1; j <= 3; j++) {
                if(field[(i+j)-1] == 0) {
                    System.out.print(i+j + " ");
                } else {
                    System.out.print(playerMark[field[(i + j) - 1]-10] + " ");
                }
            }
            System.out.println();
        }
    }
}