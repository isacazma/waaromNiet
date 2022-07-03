//package almereGym.sporten.tests;
//
//import almereGym.sporten.model.Product;
////import almereGym.sporten.model.Shopper;
//import almereGym.sporten.model.ShoppingList;
//import almereGym.sporten.model.User;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class ProductTest {
//
//    private User p;
//    private ShoppingList il, al;
//
//    @BeforeEach
//    public void setup() {
//        p = new User("Dum-Dum");
//        il = new ShoppingList("initialList", p);
//        al = new ShoppingList("anotherList", p);
//        p.addList(il);
//        p.addList(al);
//        il.addItem(new Product("Cola Zero"), 4);
//        il.addItem(new Product("Cola Zero"), 4);
//        il.addItem(new Product("Toiletpapier 6stk"), 1);
//        al.addItem(new Product("Paracetamol 30stk"), 3);
//    }
//
//    @Test
//    public void shouldBeThreeProducts() {
//        assertEquals(3, Product.getAllProducts().size());
//    }
//}
