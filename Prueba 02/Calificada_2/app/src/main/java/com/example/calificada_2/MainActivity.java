package com.example.calificada_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt1, edt2;
    private CheckBox check1, check2, check3, check4, check5;
    private String in1="" , in2="", in3="", in4="", in5="";
    private RadioButton rb1, rb2, rb3, rb4, rb5;
    private String om1="" , om2="", om3="", om4="", om5="";
    private TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.txt_nombre);
        edt2 = findViewById(R.id.txt_apellido);
        check1 = findViewById(R.id.check_java);
        check2 = findViewById(R.id.check_php);
        check3 = findViewById(R.id.check_python);
        check4 = findViewById(R.id.check_c);
        check5 = findViewById(R.id.check_cc);
        rb1 = findViewById(R.id.rb_java);
        rb2 = findViewById(R.id.rb_php);
        rb3 = findViewById(R.id.rb_python);
        rb4 = findViewById(R.id.rb_c);
        rb5 = findViewById(R.id.rb_cc);
        tv1 = findViewById(R.id.tv_resultado);
        tv2 = findViewById(R.id.tv_resultado2);
        tv3 = findViewById(R.id.tv_resultado3);

    }

    public void Informacion (View view){
        String nombre_String = edt1.getText().toString();
        String apellido_String = edt2.getText().toString();

        String informacion = " ";
        String info = nombre_String + apellido_String;
        informacion = "  " + info;
        tv1.setText(informacion);


    }

    public void check1(View view){
        if(check1.isChecked() == true){
            in1= " java ";

        }
        tv2.setText(in1+in2+in3+in4+in5);
    }

    public void check2(View view){
        if(check2.isChecked()==true){
            in2=" php ";
        }
        else{
            in2=" ";
        }
        tv2.setText(in1+in2+in3+in4+in5);
    }

    public void check3(View view){

        if(check3.isChecked()==true){
            in3 = " python ";
        }
        else{
            in3=" ";
        }
        tv2.setText(in1+in2+in3+in4+in5);
    }

    public void check4(View view){
        if(check4.isChecked()==true){
            in4 = " C# ";
        }
        else{
            in4=" ";
        }
        tv2.setText(in1+in2+in3+in4+in5);
    }

    public void check5(View view){
        if(check5.isChecked()==true){
            in5 = " C++ ";

        }
        else{
            in5=" ";
        }
        tv2.setText(in1+in2+in3+in4+in5);
    }

    public void rb1(View view){

        if(rb1.isChecked()==true){
            om1=" java ";

        }
        tv3.setText(om1);
    }

    public void rb2(View view){
        if(rb2.isChecked()==true){
            om2=" php ";

        }
        tv3.setText(om2);
    }

    public void rb3(View view){
        if(rb3.isChecked()==true){
            om3=" python ";

        }
        tv3.setText(om3);
    }

    public void rb4(View view){
        if(rb4.isChecked()==true){
            om4=" C# ";

        }
        tv3.setText(om4);
    }

    public void rb5(View view){
        if(rb5.isChecked()==true){
            om5=" C++ ";

        }
        tv3.setText(om5);

    }


}