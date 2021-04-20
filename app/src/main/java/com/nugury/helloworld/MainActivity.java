package com.nugury.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button BtnAdd,BtnSub,BtnMul,BtnDiv,BtnRem,check;
    TextView textResult;
    String num1,num2;
    Float result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초-간단 계산기");

        edit1=(EditText) findViewById(R.id.edit1);
        edit2=(EditText) findViewById(R.id.edit2);
        BtnAdd=(Button) findViewById(R.id.BtnAdd);
        BtnSub=(Button) findViewById(R.id.BtnSub);
        BtnMul=(Button) findViewById(R.id.BtnMul);
        BtnDiv=(Button) findViewById(R.id.BtnDiv);
        BtnRem=(Button) findViewById(R.id.BtnRem);
        check=(Button) findViewById(R.id.check);

        textResult=(TextView) findViewById(R.id.textResult);

        check.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                    Toast.makeText(MainActivity.this, "값이 입력 되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        BtnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }catch (Exception e) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BtnSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try{
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Float.parseFloat(num1)-Float.parseFloat(num2);
                textResult.setText("계산 결과 : "+result.toString());
                }catch (Exception e) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try{
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Float.parseFloat(num1)*Float.parseFloat(num2);
                textResult.setText("계산 결과 : "+result.toString());
                }catch (Exception e) {
                Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String zero="0";
                try{
                    if(num2.equals(zero)){
                        Toast.makeText(MainActivity.this, "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        result = Float.parseFloat(num1) / Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }catch (Exception e) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BtnRem.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try{
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Float.parseFloat(num1)%Float.parseFloat(num2);
                textResult.setText("계산 결과 : "+result.toString());
                }catch (Exception e) {
                Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                 }
            }
        });
    }
}