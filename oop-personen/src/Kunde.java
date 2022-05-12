import java.util.Calendar;

public class Kunde extends Person {
   private int bestellJahr;
   private int gutschein = 0;

   public Kunde(String name, String addresse, int telefon) {
      super(name, addresse, telefon);
   }

   public void bestellen() {
      this.bestellJahr = Calendar.getInstance().get(Calendar.YEAR);
   }

   public void gutscheinAktivieren() {
      int timeDiff = Calendar.getInstance().get(Calendar.YEAR) - this.bestellJahr;

      if (timeDiff == 1) {
         this.gutschein = 5;
      } else if (timeDiff > 1 && timeDiff < 6) {
         this.gutschein = 10;
      } else if (timeDiff > 5) {
         this.gutschein = 20;
      }
   }

   public void ausgabe() {
      System.out.println("--------------------------");
      System.out.println("Name: " + this.getName());
      System.out.println("Addresse: " + this.getAddresse());
      System.out.println("Telefon: " + this.getTelefon());
      System.out.println("Bestelljahr: " + this.bestellJahr);
      System.out.println("Gutschein: " + this.gutschein);
   }
}
