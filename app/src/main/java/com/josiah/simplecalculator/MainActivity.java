package com.josiah.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Path;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String[] op = new String[21];
    String[] optmp = new String[21];
    String valueS;

    String equal;
    int operands = 1;
    int operations = 0;
    boolean EqualFlag = false;
    boolean FirstFlag = true;
    boolean OpFlag = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueS = new String("0");
        PrintText("0");

        Button Calc0 = findViewById(R.id.Calc0);
        Button Calc1 = findViewById(R.id.Calc1);
        Button Calc2 = findViewById(R.id.Calc2);
        Button Calc3 = findViewById(R.id.Calc3);
        Button Calc4 = findViewById(R.id.Calc4);
        Button Calc5 = findViewById(R.id.Calc5);
        Button Calc6 = findViewById(R.id.Calc6);
        Button Calc7 = findViewById(R.id.Calc7);
        Button Calc8 = findViewById(R.id.Calc8);
        Button Calc9 = findViewById(R.id.Calc9);
        Button CalcPlus = findViewById(R.id.CalcPlus);
        Button CalcMinus = findViewById(R.id.CalcMinus);
        Button CalcMultiplication = findViewById(R.id.CalcMultiplication);
        Button CalcClear = findViewById(R.id.CalcClear);
        Button CalcDivision = findViewById(R.id.CalcDivision);
        Button CalcDot = findViewById(R.id.CalcDot);
        Button CalcEqual = findViewById(R.id.CalcEqual);

        Calc0.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            else if(FirstFlag);
            else{
                if (EqualFlag) ClearCalc();
                valueS = valueS + "0";
                CreateOp(valueS);
                PrintText();
            }
        });

        Calc1.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            if(FirstFlag){
                FirstFlag = false;
                valueS = "1";
            }
            else
            valueS = valueS + "1";
            CreateOp(valueS);
            PrintText();
        });

        Calc2.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            if(FirstFlag){
                FirstFlag = false;
                valueS = "2";
            }
            else
            valueS = valueS + "2";
            CreateOp(valueS);
            PrintText();
        });

        Calc3.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            if(FirstFlag){
                FirstFlag = false;
                valueS = "3";
            }
            else
            valueS = valueS + "3";
            CreateOp(valueS);
            PrintText();
        });

        Calc4.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            if(FirstFlag){
                FirstFlag = false;
                valueS = "4";
            }
            else
            valueS = valueS + "4";
            CreateOp(valueS);
            PrintText();
        });

        Calc5.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            if(FirstFlag){
                FirstFlag = false;
                valueS = "5";
            }
            else
            valueS = valueS + "5";
            CreateOp(valueS);
            PrintText();
        });

        Calc6.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            if(FirstFlag){
                FirstFlag = false;
                valueS = "6";
            }
            else
            valueS = valueS + "6";
            CreateOp(valueS);
            PrintText();
        });

        Calc7.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            if(FirstFlag){
                FirstFlag = false;
                valueS = "7";
            }
            else
            valueS = valueS + "7";
            CreateOp(valueS);
            PrintText();
        });

        Calc8.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            if(FirstFlag){
                FirstFlag = false;
                valueS = "8";
            }
            else
            valueS = valueS + "8";
            CreateOp(valueS);
            PrintText();
        });

        Calc9.setOnClickListener(v ->
        {
            if(OpFlag) OpFlag = false;
            if(EqualFlag) ClearCalc();
            if(FirstFlag){
                FirstFlag = false;
                valueS = "9";
            }
            else
            valueS = valueS + "9";
            CreateOp(valueS);
            PrintText();
        });

        CalcPlus.setOnClickListener(v ->
        {
            if(EqualFlag) {
                operands = 1;
                valueS = equal;
                CreateOp(valueS);
                EqualFlag = false;
            }
            else if(FirstFlag){
                FirstFlag = false;
                CreateOp(valueS);
            }
            if(OpFlag){
                FirstFlag = false;
                valueS = "0";
                CreateOp(valueS);
            }
                valueS = "+";
                operands += 1;
                CreateOp(valueS);
                PrintText();
                operands += 1;
                valueS = "";
                CreateOp(valueS);
                OpFlag = true;
        });

        CalcMinus.setOnClickListener(v ->
        {
            if(EqualFlag) {
                operands = 1;
                valueS = equal;
                CreateOp(valueS);
                EqualFlag = false;
            }
            else if(FirstFlag){
                FirstFlag = false;
                CreateOp(valueS);
            }
            if(OpFlag){
                FirstFlag = false;
                valueS = "0";
                CreateOp(valueS);
            }
                valueS = "-";
                operands += 1;
                CreateOp(valueS);
                PrintText();
                operands += 1;
                valueS = "";
                CreateOp(valueS);
                OpFlag = true;
        });

        CalcMultiplication.setOnClickListener(v ->
        {
            if(EqualFlag) {
                operands = 1;
                valueS = equal;
                CreateOp(valueS);
                EqualFlag = false;
            }
            else if(FirstFlag){
                FirstFlag = false;
                CreateOp(valueS);
            }
            if(OpFlag){
                FirstFlag = false;
                valueS = "0";
                CreateOp(valueS);
            }
                valueS = "*";
                operands += 1;
                CreateOp(valueS);
                PrintText();
                operands += 1;
                valueS = "";
                CreateOp(valueS);
                OpFlag = true;
        });

        CalcDivision.setOnClickListener(v ->
        {
            if(EqualFlag) {
                operands = 1;
                valueS = equal;
                CreateOp(valueS);
                EqualFlag = false;
            }
            else if(FirstFlag){
                FirstFlag = false;
                CreateOp(valueS);
            }
            if(OpFlag){
                FirstFlag = false;
                valueS = "0";
                CreateOp(valueS);
            }
                valueS = "/";
                operands += 1;
                CreateOp(valueS);
                PrintText();
                operands += 1;
                valueS = "";
                CreateOp(valueS);
                OpFlag = true;
        });

        CalcDot.setOnClickListener(v ->
        {
            if(!valueS.contains(".")){
                if(EqualFlag) ClearCalc();
                if(FirstFlag) {
                    FirstFlag = false;
                    valueS = "0.";
                }
                else if(OpFlag){
                    valueS = "0.";
                }
                else
                valueS = valueS + ".";
                CreateOp(valueS);
                PrintText();
            }
        });

        CalcClear.setOnClickListener(v ->
        {
            ClearCalc();
        });

        //PEDMAS - P excluded, E excluded, Division>Multiplication>Addition>Subtraction
        CalcEqual.setOnClickListener(v ->
        {
            MakeClean();
            for(int j=1; j<=4; j++){
                if(j==1){
                    operations = 0;
                    int k = 1;
                    for(int i=1; i<=operands; i++){
                        if(op[i].equals("/") || op[i] == "/"){
                               optmp[k] = Float.toString(Float.parseFloat(optmp[k]) / Float.parseFloat(op[i+1])) ;
                               i+=1;
                               operations++;
                        }
                        else{
                            if(i==1){
                                optmp[k] = op[i];
                            }
                            else{
                                k++;
                                optmp[k] = op[i];
                            }
                        }
                    }
                    operands = operands - (2 * operations);
                    Swap();
                }
                else if(j==2){
                    operations = 0;
                    int k = 1;
                    for(int i=1; i<=operands; i++){
                        if(op[i].equals("*") || op[i] == "*"){
                               optmp[k] = Float.toString(Float.parseFloat(optmp[k]) * Float.parseFloat(op[i+1])) ;
                               i+=1;
                               operations++;
                        }
                        else{
                            if(i==1){
                                optmp[k] = op[i];
                            }
                            else{
                                k++;
                                optmp[k] = op[i];
                            }
                        }
                    }
                    operands = operands - (2 * operations);
                    Swap();
                }
                else if(j==3){
                    operations = 0;
                    int k = 1;
                    for(int i=1; i<=operands; i++){
                        if(op[i].equals("+") || op[i] == "+"){
                               optmp[k] = Float.toString(Float.parseFloat(optmp[k]) + Float.parseFloat(op[i+1])) ;
                               i+=1;
                               operations++;
                        }
                        else{
                            if(i==1){
                                optmp[k] = op[i];
                            }
                            else{
                                k++;
                                optmp[k] = op[i];
                            }
                        }
                    }
                    operands = operands - (2 * operations);
                    Swap();
                }
                else if(j==4){
                    operations = 0;
                    int k = 1;
                    for(int i=1; i<=operands; i++){
                        if(op[i].equals("-") || op[i] == "-"){
                               optmp[k] = Float.toString(Float.parseFloat(optmp[k]) - Float.parseFloat(op[i+1])) ;
                               i+=1;
                               operations++;
                        }
                        else{
                            if(i==1){
                                optmp[k] = op[i];
                            }
                            else{
                                k++;
                                optmp[k] = op[i];
                            }
                        }
                    }
                    operands = operands - (2 * operations);
                    Swap();
                }
            }

            equal = op[1];
            PrintText();
            EqualFlag = true;
            FirstFlag = true;
            operands = 1;
        });
    }

    void PrintText(){
        String text = new String("");
        for(int i = 1; i<=operands; i++){
            if(op[i].equals("0.") || op[i].equals(".") || op[i] == "0." || op[i] == "." );
            else if(!(op[i].equals("/") || op[i].equals("*") || op[i].equals("+") || op[i].equals("-") || op[i].equals("") || op[i] == "/" || op[i] == "*" || op[i] == "-" || op[i] == "+" || op[i] == "")){
                if((Float.parseFloat(op[i])-(int)Float.parseFloat(op[i])) == 0.0){
                    op[i] = Integer.toString((int)Float.parseFloat(op[i]));
                }
            }
            text = text + " " + op[i];

        }
       ((TextView)findViewById(R.id.CalcPrint)).setText(text);
    }
    void PrintText(String text){
       ((TextView)findViewById(R.id.CalcPrint)).setText(text);
    }

    void CreateOp(String value){
        op[operands] = value;
    }

    void ClearCalc(){
        valueS = "0";
        operands = 1;
        CreateOp("0");
        PrintText();
        EqualFlag = false;
        FirstFlag = true;
    }

    void MakeClean(){
        for(int i=1; i<=operands; i++){
            if(op[i].equals("") || op[i] == ""){
                op[i] = "0";
            }
        }
    }

    void Swap(){
        for(int i = 0; i<op.length; i++){
            op[i] = optmp[i];
        }
    }

}