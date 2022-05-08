public class Main {
   public static void main(String[] args) {
      Kreis k = new Kreis(5, 10, 10);
      Rechteck r = new Rechteck(5, 10, 30, 50);
      Quadrat q = new Quadrat(7, 15, 20);

      k.printType("k");
      r.printType("r");
      q.printType("q");

      Figur h = r;

      h.printType("h");

      Figur[] figuren = new Figur[10];

      figuren[0] = k;
      figuren[1] = r;
      figuren[2] = q;
      figuren[3] = new Rechteck(3, 5, 40, 100);

      for (int i = 0; i < figuren.length; i++) {
         if (figuren[i] != null) {
            figuren[i].printType(Integer.toString(i), (": " + figuren[i].toString()));
            System.out.println("Umfang: " + figuren[i].umfang());
            System.out.println("Flaecheninhalt: " + figuren[i].flaecheninhalt());

            if (figuren[i] instanceof Kreis) {
               System.out.println("Durchmesser des Kreises: " + ((Kreis) figuren[i]).durchmesserBerechnen());
            } else if (figuren[i] instanceof Rechteck) {
               System.out.println("Diagonale des Rechtecks: " + ((Rechteck) figuren[i]).berechneDiagonale());
            } else if (figuren[i] instanceof Quadrat) {
               System.out.println("Diagonale des Quadrats: " + ((Quadrat) figuren[i]).berechneDiagonale());
            }
         }
      }
   }
}
