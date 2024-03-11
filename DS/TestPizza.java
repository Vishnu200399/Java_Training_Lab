package DS;




public class TestPizza{
   public static void main(String[] args) {
      Pizza p = new Pizza(Size.MEDIUM);
      p.orderPizza();
   }
}


enum Size {
   SMALL, MEDIUM, EXTRALARGE
}

class Pizza {
   Size PizzaSize;

   public Pizza(Size PizzaSize) {
      this.PizzaSize = PizzaSize;
   }

   public void orderPizza() {
      switch (PizzaSize) {
         case SMALL:
            System.out.println("I ORDERED A SMALL SIZE PIZZA");
            break;
         case MEDIUM:
            System.out.println("I ORDERED A MEDIUM SIZE PIZZA");
            break;
         case EXTRALARGE:
            System.out.println("i ORDERED A EXTRALARGE PIZZA");
            break;
      }
   }

}
