package com.example.calculator.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
        binding.oh.setOnClickListener(view -> presenterCalculator.numberOh(binding.txtPrint.getText().toString()));
        binding.one.setOnClickListener(view -> presenterCalculator.numberOne(binding.txtPrint.getText().toString()));
        binding.two.setOnClickListener(view -> presenterCalculator.numberTwo(binding.txtPrint.getText().toString()));
        binding.three.setOnClickListener(view -> presenterCalculator.numberThree(binding.txtPrint.getText().toString()));
        binding.four.setOnClickListener(view -> presenterCalculator.numberFour(binding.txtPrint.getText().toString()));
        binding.five.setOnClickListener(view -> presenterCalculator.numberFive(binding.txtPrint.getText().toString()));
        binding.six.setOnClickListener(view -> presenterCalculator.numberSix(binding.txtPrint.getText().toString()));
        binding.seven.setOnClickListener(view -> presenterCalculator.numberSeven(binding.txtPrint.getText().toString()));
        binding.eight.setOnClickListener(view -> presenterCalculator.numberEight(binding.txtPrint.getText().toString()));
        binding.nine.setOnClickListener(view -> presenterCalculator.numberNine(binding.txtPrint.getText().toString()));
        binding.plus.setOnClickListener(view -> presenterCalculator.increment());
        binding.is.setOnClickListener(view -> presenterCalculator.onResult());
        binding.minus.setOnClickListener(view -> presenterCalculator.decrement());
        binding.Ac.setOnClickListener(view -> presenterCalculator.clear());
        binding.division.setOnClickListener(view -> presenterCalculator.division());
        binding.multiplication.setOnClickListener(view -> presenterCalculator.multiplication());
        binding.proth.setOnClickListener(view -> presenterCalculator.percent(binding.txtPrint.getText().toString()));
        binding.plusAndM.setOnClickListener(view -> presenterCalculator.checkPlusOrMinus(binding.txtPrint.getText().toString()));
        binding.point.setOnClickListener(view -> presenterCalculator.dot(binding.txtPrint.getText().toString()));
    }



    @Override
    public void print(String a) {
        binding.txtPrint.setText(a);
    }


}