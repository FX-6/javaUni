public class Jugendkonto extends Konto {
   private int alter;

   public Jugendkonto(String name, int alter) {
      super(name);
      this.alter = alter;
   }

   protected double neuesAlter(int alter) {
      if (alter < 21) {
         this.kontostand += 100;
      }

      if (alter <= this.alter) {
         System.out.println("Fehler: neues Alter <= altem Alter");
      }

      return this.kontostand;
   }
}
