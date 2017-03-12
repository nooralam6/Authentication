package com.pc.codept.authentication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static Button btn;
    private static EditText uname;
    private static EditText pass;
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        onLogin();
    }
    public void onLogin(){
        btn=(Button)findViewById(R.id.login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname=(EditText)findViewById(R.id.username);
                pass=(EditText)findViewById(R.id.password);
                if(uname.getText().toString().equals("admin")&&pass.getText().toString().equals("admin")) 
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
