package com.jontromanob.app.khorchapati.db;

import android.content.Context;

import com.jontromanob.app.khorchapati.R;
import com.jontromanob.app.khorchapati.db.dao.UserModelDao;
import com.jontromanob.app.khorchapati.model.User;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract  class AppDatabase extends RoomDatabase {


    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, context.getString(R.string.khorchapati_db))
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    public abstract UserModelDao userModelDao();

}
