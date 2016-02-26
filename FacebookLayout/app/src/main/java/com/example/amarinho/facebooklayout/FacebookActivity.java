package com.example.amarinho.facebooklayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.BufferUnderflowException;

public class FacebookActivity extends AppCompatActivity {

    EditText fieldLogin;
    EditText fieldPass;
    EditText fieldConfirmPass;
    String login;
    String pass;
    String confirmPass;
    ImageButton ButtonLogin;
    boolean confirmedAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        fieldPass = (EditText) findViewById(R.id.editText2);
        fieldLogin = (EditText) findViewById(R.id.editText);
        ButtonLogin = (ImageButton) findViewById(R.id.imageButton);
    }

    public void LoginButtom(View v)
    {
        login = fieldLogin.getText().toString();
        pass = fieldPass.getText().toString();
        if(login.equals("matolisou@gmail.com") && pass.equals("a"))
        {
            Toast.makeText(v.getContext(), "Sucesso ao logar", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(v.getContext(), "Email ou senha incorreta", Toast.LENGTH_SHORT).show();
        }
    }

    public void SignUpButtom(View v)
    {
        fieldConfirmPass = (EditText) findViewById(R.id.editText3);
        pass = fieldPass.getText().toString();
        confirmPass = fieldConfirmPass.getText().toString();
        if(confirmPass.equals(pass))
        {
            confirmedAccess = true;
        }
        else
        {
            Toast.makeText(v.getContext(), "As senhas não correspondem", Toast.LENGTH_SHORT).show();
        }
        if(confirmedAccess)
        {
            Toast.makeText(v.getContext(), "" + confirmedAccess, Toast.LENGTH_SHORT).show();
            ButtonLogin.setVisibility(View.VISIBLE);
            fieldConfirmPass.setVisibility(View.GONE);
        }
        ButtonLogin.setVisibility(View.GONE);
        fieldConfirmPass.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
    }

    }

