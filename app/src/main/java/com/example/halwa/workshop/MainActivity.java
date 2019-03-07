package com.example.halwa.workshop;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity{
    EditText name,email,number;
    static Mydatabase mydatabase;
   RadioGroup rg;
    RadioButton rbn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydatabase = Room.databaseBuilder(this,Mydatabase.class,"Users").allowMainThreadQueries().build();
       rg =  findViewById(R.id.radioGroup);
    }

    public void saveContact(View view)
    {

        name = findViewById(R.id.Main_name);
        email = findViewById(R.id.Main_mail);
        number = findViewById(R.id.Main_num);

        rbn = findViewById( rg.getCheckedRadioButtonId());

     String Email =email.getText().toString(),
             Name =name.getText().toString();

     long phone = Long.parseLong(number.getText().toString());
        Users users =new Users();
        users.setE_mail(Email);
        users.setName(Name);
        users.setPhone_number(phone);
        users.setGender(rbn.getText().toString());

        mydatabase.myDao().addContact(users);
        email.setText("");
        name.setText("");
        number.setText("");
       rg.clearCheck();

    }
    public void viewContacts(View view)
    {
        String views="";
        List<Users> users= mydatabase.myDao().readContacts();
        for (Users us : users)
        {
            views =views+ "Name - "+us.getName()+"\nGender - "+us.getGender()+"\nPhone - "+us.getPhone_number()+"\nE-mail - "+us.getE_mail()+"\n__________________________\n";
        }
        Intent intent = new Intent(this,ViewAvtivity.class);
        intent.putExtra("details",views);
        startActivity(intent);

    }
    public void clicked(View view)
    {

    }


}
