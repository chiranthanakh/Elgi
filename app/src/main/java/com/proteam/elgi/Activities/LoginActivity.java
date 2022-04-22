package com.proteam.elgi.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.proteam.elgi.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_signup;
    Button btn_signin;
    EditText edt_email_profile,edt_password;
    TextInputLayout til_mail,til_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        makeStatusbarTransparent();
        initialize();
    }

    private void initialize()
    {
        til_pass=findViewById(R.id.til_pass);
        til_mail=findViewById(R.id.til_mail);
        edt_password=findViewById(R.id.edt_password);
        edt_email_profile=findViewById(R.id.edt_email_profile);
        btn_signin=findViewById(R.id.btn_signin);
        btn_signin.setOnClickListener(this);

    }

    private void makeStatusbarTransparent() {

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }


    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {

            case R.id.btn_signin:

               /* String value1 = edt_email_profile.getText().toString() ;
                String value2 = edt_password.getText().toString() ;

           if(isEmpty(value1))
           {
               til_mail.setError("Enter your email address");

           }
           else
           {
               til_mail.setError(null);
           }

           if(isEmpty(value2))
           {
               til_pass.setError("Enter your password");
           }
           else
           {
               til_pass.setError(null);
           }*/

                Intent loginiN = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(loginiN);
                break;


        }
    }
}