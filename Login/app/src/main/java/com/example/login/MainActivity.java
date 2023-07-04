package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //内置账号和密码
                RadioButton rbtnByUserName=(RadioButton) findViewById(R.id.rbtnLoginByUserName);
                String DbUser,DbPassword;
                if(rbtnByUserName.isChecked())
                {
                    DbUser="zhangsan";
                    DbPassword="123456";
                }
                else
                {
                    DbUser="zhangsan@qq.com";
                    DbPassword="123456";
                }
                //获取用户输入的账号和密码
                EditText txtUserName=(EditText)findViewById(R.id.txtUserName);
                EditText txtPassword=(EditText) findViewById(R.id.txtPassword);
                TextView txtResult=(TextView) findViewById(R.id.txtResult);
                if(txtUserName.getText().toString().equals(DbUser)){
                    if(txtPassword.getText().toString().equals(DbPassword)){
                        txtResult.setText("登录成功");
                    }
                    else{
                        txtResult.setText("密码错误");
                    }
                }
                else{
                    txtResult.setText("用户名错误");
                }
            }
        });
    }
}