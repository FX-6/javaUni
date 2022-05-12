public class BuchhandlungsKunde extends Kunde {
   private int rabatt;

   public BuchhandlungsKunde(String name, String addresse, int telefon) {
      super(name, addresse, telefon);
   }

   public void rabattAktivieren(int rabatt) {
      if (rabatt <= 25 && rabatt <= 50) {
         this.rabatt = rabatt;
      }
   }

   public void gutscheinAktivieren() {}
}
