package ahmed.com.cartdatabase.RoomDatabase.LocalDatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;


import ahmed.com.cartdatabase.RoomDatabase.Model.Cart;
import ahmed.com.cartdatabase.RoomDatabase.RoomInterfaces.CartDAO;

@Database(entities = {Cart.class}, version = 1)
public abstract class RoomDatabase extends androidx.room.RoomDatabase {

    private static RoomDatabase instance;

    public abstract CartDAO cartDAO();


    public static RoomDatabase getInstance(Context mContext){

        if (instance == null)
            instance = Room
                    .databaseBuilder(mContext, RoomDatabase.class,"CartDB")
                    .allowMainThreadQueries()
                    .build();

        return instance;
    }

}
