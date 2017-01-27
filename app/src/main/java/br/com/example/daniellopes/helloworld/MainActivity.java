package br.com.example.daniellopes.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button btLogin = (Button) findViewById(R.id.btLogin);
        //btLogin.setOnClickListener(onClickLogin());

    }

    public void onClickBtLogin(View view)
    {

        TextView tLogin = (TextView) findViewById(R.id.tLogin);
        TextView tSenha = (TextView) findViewById(R.id.tSenha);

        String login = tLogin.getText().toString();
        String senha = tSenha.getText().toString();

        if ("Daniel".equals(login) && "123".equals(senha))
        {
            alert("Bem vindo. Login realizado com sucesso.");

        } else
        {
            alert("Falha no login. Tente novamente.");

        }
    }
    private void  alert(String mensagem){

        Toast.makeText(this,mensagem,Toast.LENGTH_SHORT).show();

    }

}
