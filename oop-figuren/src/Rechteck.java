public class Rechteck extends Figur {
   private int laenge, breite;

   public Rechteck(int l, int b, int x, int y) {
      super(x, y, "Rechteck");
      this.laenge = l;
      this.breite = b;
   }

   public String toString() {
      return laenge + " x " + breite + " at (" + getX() + "," + getY() + ")";
   }

   public double berechneDiagonale() {
      return Math.sqrt(laenge * laenge + breite * breite);
   }

   public double umfang() {
      return 2 * this.breite + 2 * this.laenge;
   }

   public double flaecheninhalt() {
      return this.breite * this.laenge;
   }
}
