package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSin, btnCos, btnTan, btnCsc, btnSec, btnCot, btnLog;
    private TextView tvHasil;
    private EditText Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSin = findViewById(R.id.btn_sin);
        btnCos = findViewById(R.id.btn_cos);
        btnTan = findViewById(R.id.btn_tan);
        btnCsc = findViewById(R.id.btn_csc);
        btnSec = findViewById(R.id.btn_sec);
        btnCot = findViewById(R.id.btn_cot);
        btnLog = findViewById(R.id.btn_log);
        tvHasil = findViewById(R.id.tv_hasil);
        Input = findViewById(R.id.input);


        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSin = Input.getText().toString();

                    double dSin = Double.parseDouble(sSin);

                    double hasilSin = Math.sin(dSin);
                    String sHasilSin = String.valueOf(hasilSin);
                    tvHasil.setText(sHasilSin);

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCos = Input.getText().toString();

                    double dCos = Double.parseDouble(sCos);

                    double hasilCos = Math.cos(dCos);
                    String sHasilCos = String.valueOf(hasilCos);
                    tvHasil.setText(sHasilCos);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sTan = Input.getText().toString();

                    double dTan = Double.parseDouble(sTan);

                    double hasilTan = Math.tan(dTan);
                    String sHasilTan = String.valueOf(hasilTan);
                    tvHasil.setText(sHasilTan);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCsc = Input.getText().toString();

                    double dCsc = Double.parseDouble(sCsc);

                    double hasilCsc = 1.0/ Math.sin(dCsc);
                    String sHasilCsc = String.valueOf(hasilCsc);
                    tvHasil.setText(sHasilCsc);

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSec = Input.getText().toString();

                    double dSec = Double.parseDouble(sSec);

                    double hasilSec = 1.0/ Math.cos(dSec);
                    String sHasilSec = String.valueOf(hasilSec);
                    tvHasil.setText(sHasilSec);

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCot = Input.getText().toString();

                    double dCot = Double.parseDouble(sCot);

                    double hasilCot = 1.0/ Math.tan(dCot);
                    String sHasilCot = String.valueOf(hasilCot);
                    tvHasil.setText(sHasilCot);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sLog = Input.getText().toString();

                    double dLog = Double.parseDouble(sLog);

                    double hasilLog = Math.log10(dLog);
                    String sHasilLog = String.valueOf(hasilLog);
                    tvHasil.setText(sHasilLog);

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });






    }


}

