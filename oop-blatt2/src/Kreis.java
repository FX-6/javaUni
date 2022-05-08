public class Kreis extends Figur {
   private int radius;

   public Kreis(int r, int x, int y) {
      super(x, y, "Kreis");
      this.radius = r;
   }

   public String toString() {
      return "r: " + radius + " at (" + getX() + "," + getY() + ")";
   }

   public double durchmesserBerechnen() {
      return this.radius * 2;
   }

   public double umfang() {
      return 2 * Math.PI * this.radius;
   }

   public double flaecheninhalt() {
      return Math.PI * Math.pow(this.radius, 2);
   }
}
