package ab05;

public class Aufgabe14 {
    public static void main(String[] args) {
        // Kanister = 50
        Apfelpresse apresse = new Apfelpresse(50);
        // Gewicht=200g, Flüssigkeitsanteil=60%
        apresse.presse(new Apfel(200, 0.6));
        apresse.presse(new Apfel(50, 0.7));
        // Liefert die gesamte bisher produzierte Apfelsaftmenge
        double saftMenge = apresse.getTotalApfelsaft();
        // Menge ist hier 0.155 Liter
        System.out.println("Apfelsaftproduktion gesamt: " + saftMenge);
        apresse.presse(new Apfel(70000, 0.8));
        saftMenge = apresse.getTotalApfelsaft();
        // Menge ist hier 50.0 Liter
        System.out.println("Apfelsaftproduktion gesamt: " + saftMenge);
        // Kanister wird geleert
        double apfelSaftMenge = apresse.leereKanister();
        saftMenge = apresse.getTotalApfelsaft();
        // Menge ist hier 0.0 Liter
        System.out.println("Apfelsaftproduktion gesamt: " + saftMenge);
    }
}

class Apfel {
    double weight;
    double liquid;

    public Apfel(double weight, double liquid) {
        this.weight = weight;
        this.liquid = liquid;
    }

    public double presse() {
        return weight * liquid;
    }
}

class Apfelpresse {
    private int kanister;
    private double gepresst;

    public Apfelpresse(int kanister) {
        this.kanister = kanister * 1000;
    }

    public void presse(Apfel apfel) {
        double apfelGepresst = apfel.presse();
        if(gepresst + apfelGepresst <= kanister) {
            gepresst += apfelGepresst;
        } else {
            gepresst = kanister;
        }
    }

    public double getTotalApfelsaft() {
        return gepresst/1000;
    }

    public double leereKanister() {
        this.gepresst = 0;
        return this.gepresst;
    }
}