public class Konto {
   private static int anzahlkonten = 0;
   private int kontonummer;
   private double kontostand;
   private String inhaberIn;

   public Konto(String name) {
      this.kontostand = 500;
      this.kontonummer = 1000 + anzahlkonten;
      anzahlkonten++;
      this.inhaberIn = name;
   }

   public void einzahlen(double betrag) {
      this.kontostand += betrag;
   }

   public void auszahlen(double betrag) {
      if (this.kontostand >= betrag) {
         this.kontostand -= betrag;
      } else {
         System.out.println("Fehler beim Auszahlen: Kontostand zu niedrig du Geringverdiener");
      }
   }

   public void ausgabe() {
      System.out.println("---" + this.kontonummer + "---");
      System.out.println("Kontonummer: " + this.kontonummer);
      System.out.println("Inhaber:in: " + this.inhaberIn);
      System.out.println("Kontostand: " + this.kontostand);
   }

   public boolean ueberweisen(double betrag, Konto zielkonto) {
      if (this.kontostand >= betrag && this != zielkonto && zielkonto != null) {
         this.kontostand -= betrag;
         zielkonto.einzahlen(betrag);
         return true;
      } else {
         if (this.kontostand < betrag) {
            System.out.println("Fehler beim Überweisen: Kontostand zu niedrig du Geringverdiener");
         } else if (this == zielkonto) {
            System.out.println("Fehler beim Überweisen: Zielkonto und Ursprungskonto sind das selbe");
         } else if (zielkonto == null) {
            System.out.println("Fehler beim Überweisen: Zielkonto existiert nicht");
         } else {
            System.out.println("Fehler beim Überweisen");
         }
      }

      return false;
   }
}
