package juarakoding.com.loginproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

    public class LoginActivity extends AppCompatActivity {
        EditText email, password;
        Button btn_login, btn_lupa_pswd;
        ImageView login11;



        @SuppressLint("WrongViewCast")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            email = (EditText)findViewById(R.id.email);
            password =(EditText)findViewById(R.id.password);
            btn_login =(Button)findViewById (R.id.btn_login);
            btn_lupa_pswd =(Button)findViewById(R.id.btn_lupa_pswd);

            Button btnLogin = (Button) findViewById(R.id.btn_login);

            btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String mail = email.getText().toString();
                    String pwd = password.getText().toString();
                    if(mail.equalsIgnoreCase("admin") && pwd.equals("admin")){
                        Intent MainIntent = new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(MainIntent);
                        Toast.makeText(LoginActivity.this,"You are Sign in Successfuly.", Toast.LENGTH_LONG).show();
                    }else
                    {
                        Toast.makeText(LoginActivity.this,"Sorry,User Name or Password is incorrect.", Toast.LENGTH_LONG).show();
                    }
                }
            });

            btnLogin = findViewById(R.id.btn_login);
             btn_lupa_pswd= findViewById(R.id.btn_lupa_pswd);
        }
    }
