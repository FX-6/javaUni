public class App {
   public static void main(String[] args) throws Exception {
      Person a = new Person("Albert");
      Person b = new Person("Berta", "Straße 1", 810934201);
      Kunde c = new Kunde("Caesar", "Weg 2", 273849);
      BuchhandlungsKunde d = new BuchhandlungsKunde("Dieter", "Gasse 3", 146187872);

      a.ausgabe();
      b.ausgabe();
      c.ausgabe();
      d.ausgabe();
      System.out.println("--------------------------");
      System.out.println("a == b: " + a.equals(b));
      System.out.println("c == d: " + c.equals(d));
      System.out.println("--------------------------");
      System.out.println("--------------------------");

      a.umziehen("Unter der Brücke");
      a.telefonAendern(1337);
      b.umziehen("An der Autobahn");
      b.telefonAendern(69);
      c.umziehen("Hinterm Aldi");
      c.telefonAendern(420);
      d.umziehen("In deiner Mom");
      d.telefonAendern(80085);

      a.ausgabe();
      b.ausgabe();
      c.ausgabe();
      d.ausgabe();
      System.out.println("--------------------------");
      System.out.println("a == b: " + a.equals(b));
      System.out.println("c == d: " + c.equals(d));
      System.out.println("--------------------------");
      System.out.println("--------------------------");

      c.bestellen();
      c.gutscheinAktivieren();
      d.bestellen();
      d.gutscheinAktivieren();
      d.rabattAktivieren(75);

      a.ausgabe();
      b.ausgabe();
      c.ausgabe();
      d.ausgabe();
      System.out.println("--------------------------");
      System.out.println("a == b: " + a.equals(b));
      System.out.println("c == d: " + c.equals(d));
      System.out.println("--------------------------");
      System.out.println("--------------------------");

      d.rabattAktivieren(30);

      a.ausgabe();
      b.ausgabe();
      c.ausgabe();
      d.ausgabe();
      System.out.println("--------------------------");
      System.out.println("a == b: " + a.equals(b));
      System.out.println("c == d: " + c.equals(d));
      System.out.println("--------------------------");
   }
}
