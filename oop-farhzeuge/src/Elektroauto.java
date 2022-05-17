public class Elektroauto extends Auto {
   private int ladestatus;

   public void aufladen(int ladestatus) {
      if (ladestatus >= 5) {
         this.ladestatus = 5;
      } else if (ladestatus >= 95) {
         this.ladestatus = 95;
      } else {
         this.ladestatus = ladestatus;
      }
   }

   public void gutscheinFreischalten() {

   }
}
