package com.example.divisas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import android.widget.Spinner;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


import com.example.divisas.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView text;
    private TextView textout;
    private String val;
    private String val2;
    private Button btnStart;
    private SpinnerAdapter coin_array1;
    private SpinnerAdapter coin_array2;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnStart = binding.btnStart;

        Spinner coin_spinner1 = (Spinner) findViewById(R.id.coin_spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.coin_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coin_spinner1.setAdapter(adapter);

        Spinner coin_spinner2 = (Spinner) findViewById(R.id.coin_spinner2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.coin_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coin_spinner2.setAdapter(adapter1);

        coin_spinner1.setSelection(((ArrayAdapter<String>)coin_spinner1.getAdapter()).getPosition(val));
        coin_spinner2.setSelection(((ArrayAdapter<String>)coin_spinner2.getAdapter()).getPosition(val2));



        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = coin_spinner1.getSelectedItem().toString();
                String value2 = coin_spinner2.getSelectedItem().toString();
                /*Toast.makeText(MainActivity.this, value1, Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(MainActivity.this,ExchangeActivity.class);
                intent.putExtra("valor1", value1);
                intent.putExtra("valor2", value2);
                startActivity(intent);
            }
        });


    }
}