public class Auto extends Fahrzeug{
   private String kennzeichen;
   private int tuevmonat, tuevjahr;

   public boolean tuev(int monat, int jahr) {
      this.tuevmonat = monat;
      this.tuevjahr = jahr;
      return true;
   }

   public void ausgeben() {
      System.out.println("---[redacted]---");
      System.out.println("Marke: " + this.getMarke());
      System.out.println("Farbe: " + this.getFarbe());
      System.out.println("Id: [redacted]");
      System.out.println("Kennzeichen: " + this.kennzeichen);
      System.out.println("Tuevtermin: " + this.tuevmonat + "/" + this.tuevjahr);
   }
}
