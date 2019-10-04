package com.match3.game;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    String user;
    String password;
    Button btnLogin;

    EditText userName;
    EditText passWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );



        btnLogin = (Button) findViewById( R.id.login_but );
        btnLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText chekEmptyName = (EditText) findViewById( R.id.username );
                EditText chekEmptyPassword = (EditText) findViewById( R.id.getpassword );
                Context context = getApplicationContext();

                user = ((EditText) findViewById( R.id.username )).getText().toString();
                password = ((EditText) findViewById( R.id.getpassword )).getText().toString();

                if (TextUtils.isEmpty( user )) {
                    chekEmptyName.setError( "The item Username cannot be empty" );
                    return;
                }
                if ((TextUtils.isEmpty( password ))) {
                    chekEmptyPassword.setError( "The item Password cannot be empty" );
                    return;
                }

                Log.i( " userNameDescription", "onClick: " + user );
                Log.i( " PasswordDescription", "onClick: " + password );

                if(user.equals("a") && password.equals("a")) {
                    Intent intent = new Intent(getApplicationContext(),AndroidLauncher.class);
                    startActivity(intent);

                }else{
                    Toast toast = Toast.makeText(context, "Wrong Input", Toast.LENGTH_SHORT);
                    toast.show();

                }

                /*
                // open a new activity with the parameters "user name" and "password" form user
                Intent intent = new Intent( getApplicationContext(), ChekPassActivit.class ); // TODO: change the parameter " ChekPassActivit.class"
                Bundle bundleuserAndPass = new Bundle();
                bundleuserAndPass.putString( "usname", user );
                bundleuserAndPass.putString( "password", password );

                intent.putExtras( bundleuserAndPass );
                startActivity( intent );
                */

            }
        } );
    }

}
