package com.example.calculator.presenter;


import com.example.calculator.data.model.CalculateModel;

public class PresenterCalculator implements PresenterContact.Result,
        PresenterContact.Action,
        PresenterContact.NumberAtOhToFour,
        PresenterContact.NumberAtFiveToNine,
        PresenterContact.Dop   {
    private CalculateModel model;
    private PresenterContact.ResultView resultView;

    public PresenterCalculator() {
        model = new CalculateModel();
    }

    @Override
    public void increment() {
        model.increment();
    }

    @Override
    public void onResult() {
        model.result();
        resultView.print(model.getTemp());
    }

    @Override
    public void attach(PresenterContact.ResultView resultView) {
        this.resultView = resultView;
    }

    @Override
    public void checkNumber(String number, String numeral) {
        if (model.isOperation()) {
            if (number.equals("0")) {
                model.setSecond(numeral);
                resultView.print(numeral);
            } else {
                model.setSecond(model.getSecond() + numeral);
                resultView.print(model.getSecond());
            }
        } else {
            if (number.equals("0")) {
                model.setFirst(numeral);
                resultView.print(numeral);
            } else {
                model.setFirst(model.getFirst() + numeral);
                resultView.print(model.getFirst());
            }
        }
    }

    @Override
    public void numberOh(String number) {
        String zero = "0";
        checkNumber(number, zero);
    }

    @Override
    public void numberOne(String number) {
        String one = "1";
        checkNumber(number, one);

    }

    @Override
    public void numberTwo(String number) {
        String two = "2";
        checkNumber(number, two);

    }

    @Override
    public void numberThree(String number) {
        String three = "3";
        checkNumber(number, three);

    }

    @Override
    public void numberFour(String number) {
        String four = "4";
        checkNumber(number, four);

    }

    @Override
    public void numberFive(String number) {
        String five = "5";
        checkNumber(number, five);

    }

    @Override
    public void numberSix(String number) {
        String six = "6";
        checkNumber(number, six);

    }

    @Override
    public void numberSeven(String number) {
        String seven = "7";
        checkNumber(number, seven);

    }

    @Override
    public void numberEight(String number) {
        String eight = "8";
        checkNumber(number, eight);

    }

    @Override
    public void numberNine(String number) {
        String nine = "9";
        checkNumber(number, nine);

    }

    @Override
    public void clear() {
        model.clear();
        resultView.print(model.getTemp());
    }

    @Override
    public void decrement() {
        model.decrement();
    }

    @Override
    public void division() {
        model.division();
    }

    @Override
    public void multiplication() {
        model.multiplication();
    }


    @Override
    public void percent(String number) {
        model.percent(number);
        resultView.print(model.getTemp());
    }

    @Override
    public void checkPlusOrMinus(String number) {
        model.checkPlusOrMinus(number);
        resultView.print(model.getTemp());
    }

    @Override
    public void dot(String number) {
        model.dot(number);
        resultView.print(model.getTemp());
    }


}
