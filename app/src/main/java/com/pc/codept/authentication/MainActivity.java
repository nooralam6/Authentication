package com.pc.codept.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openLogin();
        openRegister();
    }
    public void openLogin(){
        button=(Button)findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.pc.codept.authentication.Login");
                startActivity(intent);
            }
        });
    }
    public void openRegister(){
        button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.pc.codept.authentication.Register");
                startActivity(intent);
            }
        });
    }
}
