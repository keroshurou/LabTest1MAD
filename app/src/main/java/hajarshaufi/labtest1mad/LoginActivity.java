package hajarshaufi.labtest1mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;


public class LoginActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    Button btnLogin;

    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = edtUsername.getText().toString();
                password = edtPassword.getText().toString();

                if (Objects.equals(username, "Hajar") && password.equals("123")){
                    correctAccount();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                if (TextUtils.isEmpty(username) && TextUtils.isEmpty(password)){
                    emptyField();
                }
                else if (!Objects.equals(username, "Hajar") || !Objects.equals(password, "123")){
                    others();
                }

            }
        });

    }

    protected void correctAccount(){

        Toast.makeText(this, "Welcome Hajar", Toast.LENGTH_LONG).show();
    }

    protected void emptyField (){

        Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_LONG).show();
    }

    protected void others (){

        Toast.makeText(this, "Wrong Username or Password", Toast.LENGTH_LONG).show();
    }


    public void fnLogin (View view){

    }
}