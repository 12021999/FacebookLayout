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
    ImageButton buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        fieldPass = (EditText) findViewById(R.id.editText2);
        fieldLogin = (EditText) findViewById(R.id.editText);
        ButtonLogin = (ImageButton) findViewById(R.id.imageButton);
        buttonRegister = (ImageButton) findViewById(R.id.imageButton3);
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

        ButtonLogin.setVisibility(View.GONE);
        buttonRegister.setVisibility(View.VISIBLE);
        fieldConfirmPass.setVisibility(View.VISIBLE);
    }

    public void ButtomRegister(View v)
    {
        if (confirmPass.equals(pass) && fieldConfirmPass.getText().toString() != "" && fieldPass.getText().toString() != "")
        {
            ButtonLogin.setVisibility(View.VISIBLE);
            buttonRegister.setVisibility(View.GONE);
            fieldConfirmPass.setVisibility(View.GONE);
        }
        else
        {
            ButtonLogin.setVisibility(View.GONE);
            buttonRegister.setVisibility(View.VISIBLE);
            fieldConfirmPass.setVisibility(View.VISIBLE);
            Toast.makeText(v.getContext(), "As senhas não correspondem", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
    }

    }

