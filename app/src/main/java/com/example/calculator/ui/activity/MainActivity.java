package com.example.calculator.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.calculator.R;
import com.example.calculator.databinding.ActivityMainBinding;
import com.example.calculator.presenter.Injector;
import com.example.calculator.presenter.PresenterCalculator;
import com.example.calculator.presenter.PresenterContact;

public class MainActivity extends AppCompatActivity implements PresenterContact.ResultView {
    ActivityMainBinding binding;
    PresenterCalculator presenterCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenterCalculator = Injector.getInstance();
        presenterCalculator.attach(this);
        iniClick();
    }

    private void iniClick() {
        binding.oh.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberOh(textToCalculate);
        });
        binding.one.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberOne(textToCalculate);
        });
        binding.two.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberTwo(textToCalculate);
        });
        binding.three.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberThree(textToCalculate);
        });
        binding.four.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberFour(textToCalculate);
        });
        binding.five.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberFive(textToCalculate);
        });
        binding.six.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberSix(textToCalculate);
        });
        binding.seven.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberSeven(textToCalculate);
        });
        binding.eight.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberEight(textToCalculate);
        });
        binding.nine.setOnClickListener(view -> {
            String textToCalculate = binding.txtPrint.getText().toString();
            presenterCalculator.numberNine(textToCalculate);
        });
        binding.plus.setOnClickListener(view -> presenterCalculator.increment());
        binding.is.setOnClickListener(view -> presenterCalculator.onResult());
        binding.minus.setOnClickListener(view -> presenterCalculator.decrement());
        binding.Ac.setOnClickListener(view -> presenterCalculator.clear());
        binding.division.setOnClickListener(view -> presenterCalculator.division());
        binding.multiplication.setOnClickListener(view -> presenterCalculator.multiplication());
    }



    @Override
    public void print(String a) {
        binding.txtPrint.setText(a);
    }


}