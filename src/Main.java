public class Main {
    public static void main(String[] args) {

        int tage = 1;
        int stunden = 0;
        int minuten = 0;
        int sekunden = 0;
        int millisekunden = 0;

        // Schleifen für Zeitberechnung
        for (tage = 1; tage < 365; tage++) {
            for (stunden = 0; stunden < 24; stunden++) {
                for (minuten = 0; minuten < 60; minuten++) {
                    for (sekunden = 0; sekunden < 60; sekunden++) {
                        for (millisekunden = 0; millisekunden < 1000; millisekunden++) {
                            // Ausgabe der simulierten Zeit
                            System.out.println(tage + " Tage, " + stunden + " Stunden, " + minuten + " Minuten, " + sekunden + " Sekunden, " + millisekunden + " Millisekunden");
                        }
                        // Verzögerung von 1 Millisekunde
                        try {
                            Thread.sleep(1000); // Hier kannst du die Verzögerung anpassen, um die Geschwindigkeit zu ändern
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
