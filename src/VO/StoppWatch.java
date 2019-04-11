package VO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StopWatch {
    private static final byte
            OFF = 0,    // Uhr ist aus, elapsed() liefert Wert der letzten Stoppung
                        // bei start() beginnt die Uhr (wieder) von neuem
            PAUSED = 1, // Uhr ist pausiert, elapsed() liefert Wert der letzten Stoppung
                        // bei start() setzt die Uhr fort
            ON = 2;     // Uhr läuft, elapsed() liefert die aktuell genommene Zeit
    private long start; // Startzeit der aktuellen Stoppung
    private long previous = 0; // bisherige Dauer nach pause() bzw. stop()
    private byte state = OFF; // Status der Uhr - anfangs: "aus"

    private static long time () { return System.nanoTime() / 1000; } // kleinere Zahlen...

    // public StopWatch () {} dzt. unnötig

    /**
     * returns time since starting the timer
     * @return elapsed time in ms
     */
    long elapsed() {
        long e = 0;
        switch (state) {
            case ON: e = time() - start; break;

            case OFF:
            case PAUSED:
                e = previous;  // Wert der letzten Stoppung
                break;
            default:
                System.err.println("State can only be ON, OFF or PAUSED");
        }
        return e;
    }

    /**
     * starts timer
     */
    void start() {
        switch (state) {
            case OFF: // Neustart
                start = time();
                break;
            case PAUSED: // re-start nach pause()
                start = time() - previous; // Bisherige Zeit wird dazugeschlagen
                break;
            // ON: start() wird ignoriert
        }
        previous = 0;
        state = ON;
    }

    /**
     * stops and resets timer
     */
    void stop() {
        previous = elapsed(); // bisherige Dauer abspeichern für
        state = OFF;          // elapsed()-Aufrufe im Status OFF
    }

    /**
     * pauses timer
     */
    void pause() {
        previous = elapsed(); // bisherige Dauer abspeichern als
        state = PAUSED;       // Vorbereitung für nächstes start()
    }
}

class Main {
    static Scanner in = new Scanner(System.in);

    private static void sort (double[] a) {
/*
        for (int i=0; i<a.length-1; i++) {
            for (int j=i+1; j<a.length; j++)
                if (a[j] < a[i]) {
                    double h = a[j];
                    a[j] = a[i];
                    a[i] = h;
                }
        }
*/

        for (int i=0; i<a.length-1; i++)  {
            int posMin = i;   // Erstes (vorläufiges) kleinstes Element an Position i
            for (int j=i+1; j<a.length; j++)
                if (a[j] < a[posMin])
                    posMin = j;  // Neues kleinstes Element
            double h = a[i];    // Austausch via Hilfsvariable
            a[i] = a[posMin];
            a[posMin] = h;
        }
    }

    public static void main (String[] args) {

        StopWatch w = new StopWatch(), wTotal = new StopWatch();
        wTotal.start(); // misst das gesamte Experiment
        for (int n=2; n<=100000; n*=2) {
            double[] a = new double[n];
            for (int i=0; i<n; i++)
                a[i] = Math.random();

            // for (double e: a)
            //    System.out.println(e);

            w.start();
            sort(a);
            w.pause(); // Uhr wird unterbrochen, damit Neubelegung
            // (vgl. unten) nicht mitgemessen wird
            System.out.println("n: " + n + " Dauer: " + w.elapsed());
            for (int i=0; i<n; i++) // neue Belegung
                a[i] = Math.random();

            w.start(); // re-start
            sort(a); // neuerliches Sortieren
            w.stop();

            System.out.println("n: " + n + " Dauer von 2 Durchgängen: " + w.elapsed());

            //for (double e: a)
            //    System.out.println(e);
        }
        wTotal.stop();
        System.out.println("Gesamtdauer brutto: " + wTotal.elapsed());
    }
}







/*
      do {
            System.out.print("Elementanzahl: ");
            int n = in.nextInt();
            if (n <= 0)
                break; // Ende der Schleife
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = Math.random();

            sort(array);
            long duration = System.nanoTime() - start;
            // for (double x: array)
            //    System.out.println(x + " ");
            System.out.println("Dauer: " + duration);
        } while (true);
    }
 */
/*
class StopWatch {
    private long time = System.nanoTime();

    public long elapsed () {
        return System.nanoTime() - time;
    }
}
*/
/* Varianten:
- aus der Schleife nehmen --> start nötig
- evt. stop / reset anbieten
 */

//             StopWatch w = new StopWatch();
