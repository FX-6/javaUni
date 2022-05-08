public class Girokonto extends Konto {
   private static double gebuehr = 1;
   private int anzahlBuchungen = 0;
   private double dispoLimit = 100;

   public Girokonto(String name) {
      super(name);
   }

   public void einzahlen(double betrag) {
      this.anzahlBuchungen++;
      super.einzahlen(betrag);
   }

   public boolean auszahlungMoeglich(double betrag) {
      if (this.kontostand + this.dispoLimit >= betrag) {
         return true;
      } else {
         return false;
      }
   }

   public void auszahlen(double betrag) {
      this.anzahlBuchungen++;

      if (auszahlungMoeglich(betrag)) {
         this.kontostand -= betrag;
      } else {
         System.out.println("Fehler beim Auszahlen: Kontostand zu niedrig du Geringverdiener");
      }
   }

   public boolean ueberweisen(double betrag, Konto zielkonto) {
      this.anzahlBuchungen++;

      if (this.auszahlungMoeglich(betrag) && this != zielkonto && zielkonto != null) {
         this.kontostand -= betrag;
         zielkonto.einzahlen(betrag);
         return true;
      } else {
         if (!this.auszahlungMoeglich(betrag)) {
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

   protected double gebuehren() {
      double abgezogeneGebuehren = Girokonto.gebuehr * this.anzahlBuchungen;

      if (this.auszahlungMoeglich(abgezogeneGebuehren)) {
         this.kontostand -= abgezogeneGebuehren;
         this.anzahlBuchungen = 0;
         return abgezogeneGebuehren;
      } else {
         return -1;
      }
   }
}
