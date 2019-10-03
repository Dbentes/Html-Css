package com.example.diemersondiegoprovaoficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.diemersondiegoprovaoficial.R.id.btLogin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            public void irParaTela2(View view){
                Intent intent1 = new Intent(getApplicationContext(),Tela2.class);
                startActivity(intent1);
            }

            @Override
            public void onClick(View view) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login =tLogin.getText().toString();
                String senha =tSenha.getText().toString();
                if (login.equals("diego")&&senha.equals("84978")){
                    alert("Login realizado com sucesso");
            }else{
                alert("Login ou senha incorretos");
                 }

            }
        });
    }
    public void irParaTela2(View view){
        Intent intent1 = new Intent(getApplicationContext(),Tela2.class);
        startActivity(intent1);
    }

    private void alert(String s) {
        Toast.makeText(this, s,Toast.LENGTH_LONG).show();
    }
}
