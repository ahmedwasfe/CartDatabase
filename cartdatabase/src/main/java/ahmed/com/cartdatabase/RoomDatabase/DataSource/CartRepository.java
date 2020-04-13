package ahmed.com.cartdatabase.RoomDatabase.DataSource;


import java.util.List;

import ahmed.com.cartdatabase.RoomDatabase.Model.Cart;
import ahmed.com.cartdatabase.RoomDatabase.RoomInterfaces.ICartDataSource;

public class CartRepository implements ICartDataSource {

    private ICartDataSource iCartDataSource;

    public CartRepository(ICartDataSource iCartDataSource) {
        this.iCartDataSource = iCartDataSource;
    }

    private static CartRepository instance;

    public static CartRepository getInstance(ICartDataSource iCartDataSource){
        if (instance == null)
            instance = new CartRepository(iCartDataSource);
        return instance;
    }

    @Override
    public List<Cart> getAllCartItems() {
        return iCartDataSource.getAllCartItems();
    }

    @Override
    public List<Cart> getCartItemById(int cartItemId) {
        return iCartDataSource.getCartItemById(cartItemId);
    }

    @Override
    public int getCountCartItems() {
        return iCartDataSource.getCountCartItems();
    }

    @Override
    public float sumPrice() {
        return iCartDataSource.sumPrice();
    }

    @Override
    public void clearCart() {
        iCartDataSource.clearCart();
    }

    @Override
    public void addItemToCart(Cart... carts) {
        iCartDataSource.addItemToCart(carts);
    }

    @Override
    public void updateItemFromCart(Cart... carts) {
        iCartDataSource.updateItemFromCart(carts);
    }

    @Override
    public void deleteItemById(Cart cart) {
        iCartDataSource.deleteItemById(cart);
    }
}
