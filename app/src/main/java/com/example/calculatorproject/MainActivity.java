package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    public void render(String str){
        TextView txtText = findViewById(R.id.txtText);
        String result = txtText.getText().toString();
        result += str;
        txtText.setText(result);
    }

    public void tinh(String str,String dau){
        String[] num = str.split(dau);
        double num1= Double.parseDouble(num[0]);
        double num2= Double.parseDouble(num[1]);
        double ketQua;
        if(dau=="\\+")
        {
            ketQua = num1 + num2;
            render ("=" + ketQua);
        }else if (dau=="\\-"){
            ketQua = num1 - num2;
            render ("=" + ketQua);
        }else if(dau=="\\*"){
            ketQua = num1 * num2;
            render ("=" + ketQua);
        }else if(dau=="\\/"){
            ketQua = num1 / num2;
            render ("=" + ketQua);
        }

    }

    public void btn_click(View view) {
        switch(view.getId()){
            case R.id.btn0:{
                render("0");
                break;
            }
            case R.id.btn1:{
                render("1");
                break;
            }
            case R.id.btn2:{
                render("2");
                break;
            }
            case R.id.btn3:{
                render("3");
                break;
            }
            case R.id.btn4:{
                render("4");
                break;
            }
            case R.id.btn5:{
                render("5");
                break;
            }
            case R.id.btn6:{
                render("6");
                break;
            }
            case R.id.btn7:{
                render("7");
                break;
            }
            case R.id.btn8:{
                render("8");
                break;
            }
            case R.id.btn9:{
                render("9");
                break;
            }
            case R.id.btnCham:{
                render(".");
                break;
            }
            case R.id.btnCong:{
                render("+");
                break;
            }
            case R.id.btnTru:{
                render("-");
                break;
            }
            case R.id.btnNhan:{
                render("*");
                break;
            }
            case R.id.btnChia:{
                render("/");
                break;
            }
            case R.id.btnClear:{
                TextView txtText = findViewById(R.id.txtText);
                txtText.setText("");
                break;
            }
            case R.id.btnBang:{
                TextView txtText = findViewById(R.id.txtText);
                String str = txtText.getText().toString();
                if(str.contains("+")){
                    tinh(str, "\\+");
                }else if(str.contains("-")){
                    tinh(str, "\\-");
                }else if(str.contains("*")){
                    tinh(str, "\\*");
                }else if(str.contains("/")){
                    tinh(str, "\\/");
                }
                break;
            }
        }
    }
}