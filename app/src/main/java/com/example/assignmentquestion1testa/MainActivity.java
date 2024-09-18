package com.example.assignmentquestion1testa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnNumber0;
    Button btnNumber1;
    Button btnNumber2;
    Button btnNumber3;
    Button btnNumber4;
    Button btnNumber5;
    Button btnNumber6;
    Button btnNumber7;
    Button btnNumber8;
    Button btnNumber9;

    TextView txtResult;

    EditText edtInput;

    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;

    Button btnDot;

    Button btnResult;

    double val1=Double.NaN;
    double val2;
    String ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNumber0 = (Button) findViewById(R.id.btnNumber0);
        btnNumber1 = (Button) findViewById(R.id.btnNumber1);
        btnNumber2 = (Button) findViewById(R.id.btnNumber2);
        btnNumber3 = (Button) findViewById(R.id.btnNumber3);
        btnNumber4 = (Button) findViewById(R.id.btnNumber4);
        btnNumber5 = (Button) findViewById(R.id.btnNumber5);
        btnNumber6 = (Button) findViewById(R.id.btnNumber6);
        btnNumber7 = (Button) findViewById(R.id.btnNumber7);
        btnNumber8 = (Button) findViewById(R.id.btnNumber8);
        btnNumber9 = (Button) findViewById(R.id.btnNumber9);

        txtResult = (TextView) findViewById(R.id.txtResult);

        edtInput = (EditText) findViewById(R.id.edtInput);

        btnAdd = (Button) findViewById(R.id.btnNumberAdd);
        btnSub = (Button) findViewById(R.id.btnNumberSub);
        btnMul = (Button) findViewById(R.id.btnNumberMul);
        btnDiv = (Button) findViewById(R.id.btnNumberDiv);

        btnDot = (Button) findViewById(R.id.btnDot);
        btnResult = (Button) findViewById(R.id.btnResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "+";
                if(edtInput.getText().toString().trim().isEmpty()){
                    edtInput.setError("This Field cannot be empty");
                } else {
                    if (!Double.isNaN(val1)) {
                        val2 = Double.parseDouble(edtInput.getText().toString());
                        val1 = val1 + val2;
                        edtInput.setError(null);

                    } else {
                        val1 = Double.parseDouble(edtInput.getText().toString());
                    }
                }

                txtResult.setText(val1 + " + ");
                edtInput.setText(null);

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "-";
                if(edtInput.getText().toString().trim().isEmpty()){
                    edtInput.setError("This Field cannot be empty");
                } else {
                    if (!Double.isNaN(val1)) {
                        val2 = Double.parseDouble(edtInput.getText().toString());
                        val1 = val1 - val2;
                        edtInput.setError(null);

                    } else {
                        val1 = Double.parseDouble(edtInput.getText().toString());
                    }
                }

                txtResult.setText(val1 + " - ");
                edtInput.setText(null);

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "*";
                if(edtInput.getText().toString().trim().isEmpty()){
                    edtInput.setError("This Field cannot be empty");
                } else {
                    if (!Double.isNaN(val1)) {
                        val2 = Double.parseDouble(edtInput.getText().toString());
                        val1 = val1 * val2;
                        edtInput.setError(null);

                    } else {
                        val1 = Double.parseDouble(edtInput.getText().toString());
                    }
                }

                txtResult.setText(val1 + " * ");
                edtInput.setText(null);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "/";
                if(edtInput.getText().toString().trim().isEmpty()){
                    edtInput.setError("This Field cannot be empty");
                } else {
                    if (!Double.isNaN(val1)) {
                        val2 = Double.parseDouble(edtInput.getText().toString());
                        val1 = val1 / val2;
                        edtInput.setError(null);

                    } else {
                        val1 = Double.parseDouble(edtInput.getText().toString());
                    }
                }

                txtResult.setText(val1 + " / ");
                edtInput.setText(null);

            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION != null && ACTION.equals("+")){
                    double result = val1 + Double.parseDouble(edtInput.getText().toString());
                    txtResult.setText(null);
                    edtInput.setError(null);
                    edtInput.setText(String.valueOf(result));
                } else if(ACTION != null && ACTION.equals("-")){
                    double result = val1 - Double.parseDouble(edtInput.getText().toString());
                    txtResult.setText(null);
                    edtInput.setError(null);
                    edtInput.setText(String.valueOf(result));
                } else if(ACTION != null && ACTION.equals("*")){
                    double result = val1 * Double.parseDouble(edtInput.getText().toString());
                    txtResult.setText(null);
                    edtInput.setError(null);
                    edtInput.setText(String.valueOf(result));
                } else if(ACTION != null && ACTION.equals("/")){
                    double result = val1 / Double.parseDouble(edtInput.getText().toString());
                    txtResult.setText(null);
                    edtInput.setError(null);
                    edtInput.setText(String.valueOf(result));
                }

                ACTION = null;
                val1 = Double.NaN;
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "0");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "1");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "2");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "3");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "4");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "5");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "6");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "7");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "8");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + "9");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText() + ".");
                edtInput.setSelection(edtInput.getText().length());
            }
        });

    }
}