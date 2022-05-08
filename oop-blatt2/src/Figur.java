public abstract class Figur {
   private int x, y;
   protected String type;

   public Figur(int x, int y, String type) {
      this.x = x;
      this.y = y;
      this.type = type;
   }

   //getter
   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }

   //setter
   public void setXY(int x, int y) {
      this.x = x;
      this.y = y;
   }

   //info
   public String getTypeAsString() {
      return this.type;
   }

   public void printType(String varName) {
      System.out.println(varName + " ist vom Typ " + this.type);
   }

   public void printType(String varName, String comment) {
      System.out.println(varName + " ist vom Typ " + this.type + comment);
   }

   public abstract double umfang();

   public abstract double flaecheninhalt();

   //move
   public void bewegen(int deltaX, int deltaY) {
      // Figur entfernen mit entfernen();
      this.x += deltaX;
      this.y += deltaY;
      // Figur neu zeichnen mit zeichnen();
   }

   public void zeichnen() {

   }

   public void entfernen() {

   }
}
