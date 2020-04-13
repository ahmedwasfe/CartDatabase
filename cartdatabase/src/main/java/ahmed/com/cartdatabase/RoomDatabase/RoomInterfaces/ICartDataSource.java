package ahmed.com.cartdatabase.RoomDatabase.RoomInterfaces;


import java.util.List;

import ahmed.com.cartdatabase.RoomDatabase.Model.Cart;

public interface ICartDataSource {

    List<Cart> getAllCartItems();

    List<Cart> getCartItemById(int cartItemId);

    int getCountCartItems();

    float sumPrice();

    void clearCart();

    void addItemToCart(Cart... carts);

    void updateItemFromCart(Cart... carts);

    void deleteItemById(Cart cart);
}
