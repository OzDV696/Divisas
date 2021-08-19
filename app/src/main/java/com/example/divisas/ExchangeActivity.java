package com.example.divisas;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.divisas.databinding.ActivityExchangeBinding;

public class ExchangeActivity extends Activity {

    private TextView txtIn;
    private TextView txtOut;
    private TextView etxOut;
    private EditText etxIn;
    private String valor1;
    private String valor2;
    private String valuein;
    private int finalvaluein;
    private double finalvalueout;
    private Button btnClose;
    private Button btnSubmit;
    private ActivityExchangeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityExchangeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        txtIn = binding.txtin;
        txtOut = binding.txtout;
        etxIn = binding.etxin;
        etxOut = binding.etxout;
        btnClose = binding.btnclose;
        btnSubmit = binding.btnsubmit;

        Bundle bundle = this.getIntent().getExtras();
        valor1 = bundle.getString("valor1");
        valor2 = bundle.getString("valor2");

        txtIn.setText(valor1);
        txtOut.setText(valor2);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtIn.getText().toString().equals("USD") && txtOut.getText().toString().equals("EUR")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.86;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("USD") && txtOut.getText().toString().equals("CAD")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 1.27;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("USD") && txtOut.getText().toString().equals("MXN")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 20.10;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("USD") && txtOut.getText().toString().equals("JPY")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 110.17;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("EUR") && txtOut.getText().toString().equals("USD")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 1.17;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("EUR") && txtOut.getText().toString().equals("CAD")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 1.48;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("EUR") && txtOut.getText().toString().equals("MXN")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 23.46;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("EUR") && txtOut.getText().toString().equals("JPY")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 128.60;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("CAD") && txtOut.getText().toString().equals("USD")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.7874;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("CAD") && txtOut.getText().toString().equals("EUR")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.6756;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("CAD") && txtOut.getText().toString().equals("MXN")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 15.84;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("CAD") && txtOut.getText().toString().equals("JPY")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 86.79;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("MXN") && txtOut.getText().toString().equals("USD")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.04975;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("MXN") && txtOut.getText().toString().equals("EUR")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.04262;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("MXN") && txtOut.getText().toString().equals("CAD")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.063131;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("MXN") && txtOut.getText().toString().equals("JPY")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 5.48;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("JPY") && txtOut.getText().toString().equals("USD")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.009076;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("JPY") && txtOut.getText().toString().equals("EUR")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.007776;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("JPY") && txtOut.getText().toString().equals("CAD")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.01151;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }
                else if(txtIn.getText().toString().equals("JPY") && txtOut.getText().toString().equals("MXN")) {

                    valuein = etxIn.getText().toString();
                    finalvaluein = Integer.parseInt(valuein);
                    finalvalueout = finalvaluein * 0.18248;
                    String sfv = String.valueOf(Math.round(finalvalueout));
                    Toast.makeText(ExchangeActivity.this, sfv, Toast.LENGTH_SHORT).show();
                    etxOut.setText(sfv);
                }


            }
        });



        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExchangeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}