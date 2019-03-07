package com.example.halwa.workshop;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    void addContact(Users user);

    @Query("select * from Users")
    List<Users> readContacts();

}
