package ahmed.com.cartdatabase.RoomDatabase.LocalDatabase;


import java.util.List;

import ahmed.com.cartdatabase.RoomDatabase.Model.Cart;
import ahmed.com.cartdatabase.RoomDatabase.RoomInterfaces.CartDAO;
import ahmed.com.cartdatabase.RoomDatabase.RoomInterfaces.ICartDataSource;

public class CartDataSource implements ICartDataSource {

    private CartDAO cartDAO;
    private static CartDataSource instance;

    public CartDataSource(CartDAO cartDAO) {
        this.cartDAO = cartDAO;
    }

    public static CartDataSource getInstance(CartDAO cartDAO){
        if (instance == null)
            instance = new CartDataSource(cartDAO);
        return instance;
    }

    @Override
    public List<Cart> getAllCartItems() {
        return cartDAO.getAllCartItems();
    }

    @Override
    public List<Cart> getCartItemById(int cartItemId) {
        return cartDAO.getCartItemById(cartItemId);
    }

    @Override
    public int getCountCartItems() {
        return cartDAO.getCountCartItems();
    }

    @Override
    public float sumPrice() {
        return cartDAO.sumPrice();
    }

    @Override
    public void clearCart() {
        cartDAO.clearCart();
    }

    @Override
    public void addItemToCart(Cart... carts) {
        cartDAO.addItemToCart(carts);
    }

    @Override
    public void updateItemFromCart(Cart... carts) {
        cartDAO.updateItemFromCart(carts);
    }

    @Override
    public void deleteItemById(Cart cart) {
        cartDAO.deleteItemById(cart);
    }
}
