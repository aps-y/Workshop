package com.example.halwa.workshop;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Users.class},version =1)
public abstract class Mydatabase extends RoomDatabase {

     abstract MyDao myDao();

}
