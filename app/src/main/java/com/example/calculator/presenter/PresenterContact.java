package com.example.calculator.presenter;

public class PresenterContact {
    public interface ResultView{
        void print(String a);


    }
    public interface ResultPresenter{
        void increment();
        void onResult();
        void attach(ResultView resultView);
        void checkNumber(String number , String numeral);
        void numberOh(String number);
        void numberOne(String number);
        void numberTwo(String number);
        void numberThree(String number);
        void numberFour(String number);
        void numberFive(String number);
        void numberSix(String number);
        void numberSeven(String number);
        void numberEight(String number);
        void numberNine(String number);
        void clear();
        void decrement();
        void division();
        void multiplication();
    }
}
