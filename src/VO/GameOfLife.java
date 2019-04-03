package VO;

import java.io.Console;
import java.util.Arrays;

public class GameOfLife {
    private static final char BLACK = 11035;
    private static final char WHITE = 11036;

    public static void main(String[] args) {
        final char[][] init = {
                { ' ', ' ', ' ', ' ' },
                { ' ', '*', '*', '*' }
        };
        boolean[][][] game = initGen(16, init);
        int currentGen = 0;
        int maxGens = 100;

        for(int i = 0; i < maxGens; i++) {
            printGen(currentGen, game);
            evolve(game);
            game[2] = game[0];
            game[0] = game[1];
            game[1] = game[2];
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentGen++;
        }
    }

    private static boolean[][][] initGen(int size, char[][] init) {
        boolean[][][] game = new boolean[3][size][size];
        for(int i = 0; i < init.length; i++) {
            for(int j = 0; j < init[i].length; j++) {
                game[0][i][j] = (init[i][j] != ' ');
            }
        }
        return game;
    }

    private static void printGen(int currentGen, boolean[][][] game) {
        System.out.print("#CLEAR");
        System.out.println("Gen " + currentGen);
        for(boolean[] row : game[0]) {
            for(boolean cell : row) {
                System.out.print((cell) ? BLACK : WHITE);
            }
            System.out.println();

        }
    }

    private static void evolve(boolean[][][] game) {
        int aliveNeighbors;
        for(int i = 0; i < game[0].length; i++) {
            for(int j = 0; j < game[0][i].length; j++) {
                aliveNeighbors = aliveNeighbors(game[0], i, j);
                game[1][i][j] = ((aliveNeighbors == 2 && game[0][i][j]) || aliveNeighbors == 3);
            }
        }
    }

    private static int aliveNeighbors(boolean[][] game, int row, int col) {
        int alive = 0;
        for (int ii=row-1; ii<=row+1; ii++) {
            for (int jj = col - 1; jj <= col + 1; jj++) {
                if (!(ii == row && jj == col) && (game[(ii + game.length) % game.length][(jj + game[0].length) % game[0].length])) alive++;
            }
        }
        return alive;
    }
}
