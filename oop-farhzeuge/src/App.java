public class App {
   public static void main(String[] args) throws Exception {
      Fahrzeug f1 = new Fahrzeug();
      Fahrzeug f2 = new Fahrzeug("A", "schwarz", 1);
      Fahrzeug f21 = new Fahrzeug("A", "schwarz", 1);
      Auto a = new Auto();
      Elektroauto e = new Elektroauto();

      f1.ausgeben();
      f2.ausgeben();
      a.ausgeben();
      e.ausgeben();

      System.out.println(f1.equals(f2));
      System.out.println(f2.equals(f21));

      f1.umlackieren("rot");
      a.umlackieren("orange");
      e.umlackieren("gelb");

      a.tuev(5, 10);
      e.tuev(7, 22);

      e.aufladen(100);

      f1.ausgeben();
      f2.ausgeben();
      a.ausgeben();
      e.ausgeben();
   }
}
