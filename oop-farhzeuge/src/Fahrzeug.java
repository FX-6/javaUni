public class Fahrzeug {
   private String marke, farbe;
   private int id;

   //constructors
   public Fahrzeug() {

   }

   public Fahrzeug(String marke, String farbe, int id) {
      this.marke = marke;
      this.farbe = farbe;
      this.id = id;
   }

   //getter
   public String getMarke() {return this.marke;}

   public String getFarbe() {return this.farbe;}

   //methods
   public void umlackieren(String farbe) {
      this.farbe = farbe;
   }

   public boolean equals(Fahrzeug that) {
      //if (this.marke.equals(that.marke) && this.farbe.equals(that.farbe) && this.id == that.id) {
      if (this.marke == that.marke && this.farbe == that.farbe && this.id == that.id) {
         return true;
      } else {
         return false;
      }
   }

   public void ausgeben() {
      System.out.println("---" + this.id + "---");
      System.out.println("Marke: " + this.marke);
      System.out.println("Farbe: " + this.farbe);
      System.out.println("Id: " + this.id);
   }
}
