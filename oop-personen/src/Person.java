public class Person {
   private String name, addresse;
   private int telefon;

   //Constructors
   public Person(String name) {
      this.name = name;
   }

   public Person(String name, String addresse, int telefon) {
      this.name = name;
      this.addresse = addresse;
      this.telefon = telefon;
   }

   //verify
   private static boolean verifyAdress(String adress) {
      return true;
   }

   private static boolean verifyPhoneNumber(int phoneNumber) {
      return true;
   }

   //getter
   public String getName() {
      return this.name;
   }

   public String getAddresse() {
      return this.addresse;
   }

   public int getTelefon() {
      return this.telefon;
   }

   //equals
   public boolean equals(Person that) {
      if (this.name.equals(that.name) && this.addresse.equals(that.addresse)) {
         return true;
      } else {
         return false;
      }
   }

   //edit
   public boolean umziehen(String addresse) {
      if (Person.verifyAdress(addresse)) {
         this.addresse = addresse;
         return true;
      } else {
         return false;
      }
   }

   public boolean telefonAendern(int telefon) {
      if (Person.verifyPhoneNumber(telefon)) {
         this.telefon = telefon;
         return true;
      } else {
         return false;
      }
   }

   //print
   public void ausgabe() {
      System.out.println("--------------------------");
      System.out.println("Name: " + this.name);
      System.out.println("Addresse: " + this.addresse);
      System.out.println("Telefon: " + this.telefon);
   }
}
