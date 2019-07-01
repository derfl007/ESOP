package ab05;

import java.util.Scanner;

public class Aufgabe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hangman game = new Hangman();
        System.out.println("Please enter a word: ");
        String word = scanner.next().toUpperCase();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        game.start(word);
        System.out.println("The game is starting now. When prompted enter a single letter (if you enter more, the first letter will be used).\nYou have 10 wrong guesses, after that the game will end.");
        while(game.isRunning()) {
            game.print();
            System.out.print("Enter letter: ");
            game.guess(scanner.next().charAt(0));
        }
        System.out.println("Thanks for playing");
    }


}

class Hangman {
    private boolean running;
    private int errors;
    private char[] wordChars;
    private boolean[] guessedChars = new boolean[26];
    private String[] stages = {
            "\n\n\n\n",
            "\n\n\n\n┌┴┐",
            "\n│\n│\n│\n┌┴┐",
            " ┌─────\n │\n │\n │\n┌┴┐",
            " ┌─────┐\n │\n │\n │\n┌┴┐",
            " ┌─────┐\n │     ☺\n │\n │\n┌┴┐",
            " ┌─────┐\n │     ☺\n │     │\n │\n┌┴┐",
            " ┌─────┐\n │     ☺\n │    ┌┤\n │\n┌┴┐       ",
            " ┌─────┐\n │     ☺\n │    ┌┼┐\n │\n┌┴┐",
            " ┌─────┐\n │     ☺\n │    ┌┼┐\n │    ┌┘\n┌┴┐",
            " ┌─────┐\n │     ☺\n │    ┌┼┐\n │    ┌┴┐\n┌┴┐"
    };

    void start(String word) {
        this.wordChars = word.toCharArray();
        this.errors = 0;
        this.guessedChars = new boolean[26];
        this.running = true;
    }

    private void end(boolean won) {
        if(won) {
            System.out.println("Congratulations, the word has been found with " + errors + " error" + ((errors == 1) ? "" : "s"));
            if(errors >= 8) {
                System.out.println("That was close!");
            } else if(errors >= 5) {
                System.out.println("Not bad!");
            } else {
                System.out.println("Wow, you're a natural");
            }
        } else {
            System.out.println(stages[errors]);
            System.out.println("Oh no, looks like you took too many tries!");
        }
        this.running = false;
    }

    public void print() {
        StringBuilder wordPrint = new StringBuilder();
        for (char wordChar : wordChars) {
            if (guessedChars[wordChar- 65]) {
                wordPrint.append(wordChar);
            } else {
                wordPrint.append('_');
            }
        }
        System.out.println(wordPrint);
        System.out.println(stages[errors]);
    }

    void guess(char guessed) {
        if(!Character.isLetter(guessed)) {
            System.err.println("Please enter a valid Letter (A-Z)");
            return;
        }
        guessed = Character.toUpperCase(guessed);
        if(guessedChars[guessed-65]) {
            System.err.println("This letter has already been guessed");
            return;
        }
        guessedChars[guessed-65] = true;
        boolean error = true;
        for(char c : wordChars) {
            if(c == guessed) {
                error = false;
                break;
            }
        }
        if(error) {
            errors++;
            if(errors == 10) {
                end(false);
            }
        } else {
            boolean hasWon = true;
            for (char wordChar : wordChars) {
                if (!guessedChars[wordChar- 65]) {
                    hasWon = false;
                }
            }
            if(hasWon) end(true);
        }
    }

    boolean isRunning() {
        return this.running;
    }
}
