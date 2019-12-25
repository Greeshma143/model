package com.arun.storingdatausingmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1;
    String getName,getRollno,getAdmno,getCollege;
    StudentModel studentModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentModel=new StudentModel();
        e1=(EditText)findViewById(R.id.edt1);
        e2=(EditText)findViewById(R.id.edt2);
        e3=(EditText)findViewById(R.id.edt3);
        e4=(EditText)findViewById(R.id.edt4);
        b1=(Button)findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getName=e1.getText().toString();
                getRollno=e2.getText().toString();
                getAdmno=e3.getText().toString();
                getCollege=e4.getText().toString();

                studentModel.setName(getName);;
                studentModel.setRoll(getRollno);
                studentModel.setAdmno(getAdmno);
                studentModel.setCollege(getCollege);

                String nameValue=studentModel.getName();
                String rollnoValue=studentModel.getRoll();
                String admnoValue=studentModel.getAdmno();
                String collegeValue=studentModel.getCollege();

                Toast.makeText(getApplicationContext(),nameValue+"\n"+rollnoValue+"\n"+admnoValue+"\n"+collegeValue,Toast.LENGTH_LONG).show();

            }
        });
    }
}
