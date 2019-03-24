package com.mme.saif_win10.mcqmasterenglish.abstructClasses;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.mme.saif_win10.mcqmasterenglish.memorizeROOMdatabase.Memorize_Dao;
import com.mme.saif_win10.mcqmasterenglish.memorizeROOMdatabase.Memorize_entity;

@Database(entities = {Memorize_entity.class}, version = 1, exportSchema = false)
public abstract class Memorize_database extends RoomDatabase {
    public abstract Memorize_Dao memorize_dao();
    private static volatile Memorize_database INSTANCE;

    public static Memorize_database getINSTANCE(final Context context){
        if (INSTANCE == null){
            synchronized (Memorize_database.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            Memorize_database.class, "MemorizeDB")
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
