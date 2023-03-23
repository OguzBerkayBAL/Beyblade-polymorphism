public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beybladeTuru) {
        if (beybladeTuru.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "Mavi ejderha", "kutsal canavarla konusma");

        } else if (beybladeTuru.equals("Dranza")) {
            return new Dranza("Kai", 600, 400, "kirmizi anka kusu");

        } else if (beybladeTuru.equals("Drayga")) {
            return new Drayga("Rei", 000, 250, "beyaz kaplan");

        } else if (beybladeTuru.equals("Draciel")) {
            return new Draciel("Max", 400, 1000, "kara kaplumbaga");

        } else {
            return null;

        }
    }
}