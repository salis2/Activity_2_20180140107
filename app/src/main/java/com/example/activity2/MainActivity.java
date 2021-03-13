package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    //Deklarasi cariabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnLogin denagn componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen edittext email pada layout
        edemail = findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen edittext password pada layout
        edpassword = findViewById(R.id.edPassword);

        //membuat fungsi onlclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Menyimpan input user di edittext email ke dalam variabel nama
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password ke dalam variabel password
                password = edpassword.getText().toString();

                String email = "admin@mail.com";
                String pass = "123";


                //membuat validasi email dam password

                //validasi email dan pasword telah di isi
                if (nama.isEmpty() && password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(), "Masukan Email dan Password", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (nama.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(), "Masukan Email", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(), "Masukan password", Toast.LENGTH_LONG);
                    t.show();
                }
                //validasi Email dan Password yang dimasukan benar
                else if (nama.equals(email)) {
                    Toast t = Toast.makeText(getApplicationContext(), "Password salah", Toast.LENGTH_LONG);
                    t.show();
                }else if (password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(), "Email salah", Toast.LENGTH_LONG);
                    t.show();
                }else if (nama.equals(email) && password.equals(pass)){

                    //membuat variabel toast dan menampilkan pesan "Login Sukses"
                    Toast t = Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_LONG);
                    t.show();
                }else {
                    Toast t = Toast.makeText(getApplicationContext(), "Email dan Password salah", Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });


    }
}