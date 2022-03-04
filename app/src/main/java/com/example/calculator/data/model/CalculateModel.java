package com.example.calculator.data.model;

import android.util.Log;

public class CalculateModel {
    private double a = 0;
    private double b = 0;
    private double result = 0;
    private String first = "";
    private String second = "";
    private boolean isOperation = false;
    private String resultToString;
    private String temp = "0";

    public void clear() {
        first = "";
        second = "";
        a = 0;
        b = 0;
        isOperation = false;
        resultToString = "";
        temp = "0";
    }

    public void multiplication() {
        if (!first.equals("")) {
            a = Double.parseDouble(first);
            isOperation = true;
            resultToString = "x";
        }
    }

    public void division() {
        if (!first.equals("")) {
            a = Double.parseDouble(first);
            isOperation = true;
            resultToString = "/";
        }
    }


    public void decrement() {
        if (!first.equals("")) {
            a = Double.parseDouble(first);
            isOperation = true;
            resultToString = "-";
        }
    }

    public void increment() {
        if (!first.equals("")) {
            a = Double.parseDouble(first);
            isOperation = true;
            resultToString = "+";
        }
    }

    public void result() {
        if (!second.equals("")) {
            b = Double.parseDouble(second);
            Log.d("ABOBA", "a = " + a + "|| b =" + b);
            if (resultToString.equals("")) return;
            switch (resultToString) {
                case "+":
                    result = a + b;
                    temp = String.valueOf(result);
                    break;
                case "-":
                    result = a - b;
                    temp = String.valueOf(result);
                    break;
                case "x":
                    result = a * b;
                    temp = String.valueOf(result);
                    break;
                case "/":
                    if (a != 0) {
                        result = a / b;
                        temp = String.valueOf(result);
                    } else {
                        temp = "0";
                    }
                    break;
            }
            fastClear();
        }
    }

    private void fastClear() {
        first = temp;
        second = "";
        isOperation = false;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        if (second.equals("0")) {
            second = "0";
        }
        this.second = second;
    }

    public boolean isOperation() {
        return isOperation;
    }

    public void setOperation(boolean operation) {
        isOperation = operation;
    }

    public String getResultToString() {
        return resultToString;
    }

    public String getTemp() {
        return temp;
    }

}
