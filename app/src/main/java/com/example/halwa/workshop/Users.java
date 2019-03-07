package com.example.halwa.workshop;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Users {

        @PrimaryKey
        long phone_number;

        String Name;

        String E_mail;

        String Gender;

        public long getPhone_number() {
                return phone_number;
        }

        public void setPhone_number(long phone_number) {
                this.phone_number = phone_number;
        }

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                Name = name;
        }

        public String getE_mail() {
                return E_mail;
        }

        public void setE_mail(String e_mail) {
                E_mail = e_mail;
        }

        public String getGender() {
                return Gender;
        }

        public void setGender(String gender) {
                Gender = gender;
        }
}
