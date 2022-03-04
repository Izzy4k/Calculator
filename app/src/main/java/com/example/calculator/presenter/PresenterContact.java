package com.example.calculator.presenter;

public class PresenterContact {
    public interface ResultView{
        void print(String a);


    }

    public interface Action{
        void clear();
        void decrement();
        void division();
        void multiplication();
        void increment();
    }
    public interface Result{
        void onResult();
        void attach(ResultView resultView);
        void checkNumber(String number , String numeral);
    }
    public interface NumberAtOhToFour{
        void numberOh(String number);
        void numberOne(String number);
        void numberTwo(String number);
        void numberThree(String number);
        void numberFour(String number);
    }
    public interface NumberAtFiveToNine{
        void numberFive(String number);
        void numberSix(String number);
        void numberSeven(String number);
        void numberEight(String number);
        void numberNine(String number);
    }
    public interface Dop{
        void percent(String number);
        void checkPlusOrMinus(String number);
        void dot(String number);
    }

}
