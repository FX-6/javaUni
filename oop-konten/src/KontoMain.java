public class KontoMain {
   public static void main(String[] args) {
      Konto konto1 = new Konto("Hugo");
      Konto konto2 = new Konto("Hugeline");
      Girokonto girokonto1 = new Girokonto("Fred");
      Jugendkonto jugendkonto1 = new Jugendkonto("Frida", 17);

      konto1.ausgabe();
      konto2.ausgabe();
      girokonto1.ausgabe();
      jugendkonto1.ausgabe();

      konto1.einzahlen(1000.0);
      konto2.einzahlen(2000.0);
      girokonto1.einzahlen(1500.0);
      jugendkonto1.einzahlen(500.0);

      konto2.ueberweisen(1000.0, konto1);
      konto2.ueberweisen(2000.0, konto1);
      konto2.ueberweisen(2000.0, konto2);
      girokonto1.ueberweisen(150.0, jugendkonto1);
      girokonto1.einzahlen(300.0);
      girokonto1.gebuehren();
      jugendkonto1.auszahlen(250.0);
      jugendkonto1.neuesAlter(19);

      konto1.ausgabe();
      konto2.ausgabe();
      girokonto1.ausgabe();
      jugendkonto1.ausgabe();
   }
}
