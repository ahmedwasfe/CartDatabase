# CartDatabase
 Add the following configuration in your build.gradle file.
 
	allprojects {
	      repositories {
		...
		maven { url 'https://jitpack.io' }
	      }
	    }
    
    dependencies {
	        implementation 'com.github.ahmedwasfe:CartDatabase:1.0'
	}


Description
	RoomDatabase mRoomDatabase = RoomDatabase.getInstance(this);
        CartRepository mCartRepository = CartRepository.getInstance(CartDataSource.getInstance(Common.mRoomDatabase.cartDAO()));
        
