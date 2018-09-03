package com.example.t.lightforeveryone;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String st1 = "↓";
    private String st2 = "←";
    private String st3 = "↑";
    private String st4 = "→";

    private String strPosition1;
    private String strPosition2;
    private String strPosition3;
    private String strPosition4;
    private String strPosition5;
    private String strPosition6;
    private String strPosition7;
    private String strPosition8;
    private String strPosition9;
    private String strPosition10;
    private String strPosition11;
    private String strPosition12;
    private String strPosition13;
    private String strPosition14;
    private String strPosition15;
    private String strPosition16;
    private String strPosition17;
    private String strPosition18;
    private String strPosition19;
    private String strPosition20;
    private String strPosition21;
    private String strPosition22;
    private String strPosition23;
    private String strPosition24;
    private String strPosition25;

    private int int1 = 1;
    private int int2 = 2;
    private int int3 = 3;
    private int int4 = 4;
    // private int currentPosition;
    private int mainInt = 1;

    private int positionNum1 = 1;
    private int positionNum2 = 1;
    private int positionNum3 = 1;
    private int positionNum4 = 1;
    private int positionNum5 = 1;
    private int positionNum6 = 1;
    private int positionNum7 = 1;
    private int positionNum8 = 1;
    private int positionNum9 = 1;
    private int positionNum10 = 1;
    private int positionNum11 = 1;
    private int positionNum12 = 1;
    private int positionNum13 = 1;
    private int positionNum14 = 1;
    private int positionNum15 = 1;
    private int positionNum16 = 1;
    private int positionNum17 = 1;
    private int positionNum18 = 1;
    private int positionNum19 = 1;
    private int positionNum20 = 1;
    private int positionNum21 = 1;
    private int positionNum22 = 1;
    private int positionNum23 = 1;
    private int positionNum24 = 1;
    private int positionNum25 = 1;

    private boolean light1 = false;
    private boolean light2 = false;
    private boolean light3 = false;
    private boolean light4 = false;
    private boolean light5 = false;
    private boolean light6 = false;
    private boolean light7 = false;
    private boolean light8 = false;
    private boolean light9 = false;
    private boolean light10 = false;
    private boolean light11 = false;
    private boolean light12 = false;
    private boolean light13 = false;
    private boolean light14 = false;
    private boolean light15 = false;
    private boolean light16 = false;
    private boolean light17 = false;
    private boolean light18 = false;
    private boolean light19 = false;
    private boolean light20 = false;
    private boolean light21 = false;
    private boolean light22 = false;
    private boolean light23 = false;
    private boolean light24 = false;
    private boolean light25 = false;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;
    private Button btn20;
    private Button btn21;
    private Button btn22;
    private Button btn23;
    private Button btn24;
    private Button btn25;
    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        tvText = findViewById(R.id.tvText);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "ttttt", Toast.LENGTH_SHORT).show();
        switch (v.getId()) {
            case R.id.btn1:
                positionNum1 = changeDirectionOfPosition(positionNum1);
                strPosition1 = changeDirectionOfPositionString(positionNum1);
                btn1.setText(strPosition1);
                btn1.setTextColor(Color.RED);
                break;
            case R.id.btn2:
                positionNum2 = changeDirectionOfPosition(positionNum2);
                strPosition2 = changeDirectionOfPositionString(positionNum2);
                btn2.setText(strPosition2);
                break;
            case R.id.btn3:
                positionNum3 = changeDirectionOfPosition(positionNum3);
                strPosition3 = changeDirectionOfPositionString(positionNum3);
                btn3.setText(strPosition3);
                break;
            case R.id.btn4:
                positionNum4 = changeDirectionOfPosition(positionNum4);
                strPosition4 = changeDirectionOfPositionString(positionNum4);
                btn4.setText(strPosition4);
                break;
            case R.id.btn5:
                positionNum5 = changeDirectionOfPosition(positionNum5);
                strPosition5 = changeDirectionOfPositionString(positionNum5);
                btn5.setText(strPosition5);
                break;
            case R.id.btn6:
                positionNum6 = changeDirectionOfPosition(positionNum6);
                strPosition6 = changeDirectionOfPositionString(positionNum6);
                btn6.setText(strPosition6);
                break;
            case R.id.btn7:
                positionNum7 = changeDirectionOfPosition(positionNum7);
                strPosition7 = changeDirectionOfPositionString(positionNum7);
                btn7.setText(strPosition7);
                break;
            case R.id.btn8:
                positionNum8 = changeDirectionOfPosition(positionNum8);
                strPosition8 = changeDirectionOfPositionString(positionNum8);
                btn8.setText(strPosition8);
                break;
            case R.id.btn9:
                positionNum9 = changeDirectionOfPosition(positionNum9);
                strPosition9 = changeDirectionOfPositionString(positionNum9);
                btn9.setText(strPosition9);
                break;
            case R.id.btn10:
                positionNum10 = changeDirectionOfPosition(positionNum10);
                strPosition10 = changeDirectionOfPositionString(positionNum10);
                btn10.setText(strPosition10);
                break;
            case R.id.btn11:
                positionNum11 = changeDirectionOfPosition(positionNum11);
                strPosition11 = changeDirectionOfPositionString(positionNum11);
                btn11.setText(strPosition11);
                break;
            case R.id.btn12:
                positionNum12 = changeDirectionOfPosition(positionNum12);
                strPosition12 = changeDirectionOfPositionString(positionNum12);
                btn12.setText(strPosition12);
                break;
            case R.id.btn13:
                positionNum13 = changeDirectionOfPosition(positionNum13);
                strPosition13 = changeDirectionOfPositionString(positionNum13);
                btn13.setText(strPosition13);
                break;
            case R.id.btn14:
                positionNum14 = changeDirectionOfPosition(positionNum14);
                strPosition14 = changeDirectionOfPositionString(positionNum14);
                btn14.setText(strPosition14);
                break;
            case R.id.btn15:
                positionNum15 = changeDirectionOfPosition(positionNum15);
                strPosition15 = changeDirectionOfPositionString(positionNum15);
                btn15.setText(strPosition15);
                break;
            case R.id.btn16:
                positionNum16 = changeDirectionOfPosition(positionNum16);
                strPosition16 = changeDirectionOfPositionString(positionNum16);
                btn16.setText(strPosition16);
                break;
            case R.id.btn17:
                positionNum17 = changeDirectionOfPosition(positionNum17);
                strPosition17 = changeDirectionOfPositionString(positionNum17);
                btn17.setText(strPosition17);
                break;
            case R.id.btn18:
                positionNum18 = changeDirectionOfPosition(positionNum18);
                strPosition18 = changeDirectionOfPositionString(positionNum18);
                btn18.setText(strPosition18);
                break;
            case R.id.btn19:
                positionNum19 = changeDirectionOfPosition(positionNum19);
                strPosition19 = changeDirectionOfPositionString(positionNum19);
                btn19.setText(strPosition19);
                break;
            case R.id.btn20:
                positionNum20 = changeDirectionOfPosition(positionNum20);
                strPosition20 = changeDirectionOfPositionString(positionNum20);
                btn20.setText(strPosition20);
                break;
            case R.id.btn21:
                positionNum21 = changeDirectionOfPosition(positionNum21);
                strPosition21 = changeDirectionOfPositionString(positionNum21);
                btn21.setText(strPosition21);
                break;
            case R.id.btn22:
                positionNum22 = changeDirectionOfPosition(positionNum22);
                strPosition22 = changeDirectionOfPositionString(positionNum22);
                btn22.setText(strPosition22);
                break;
            case R.id.btn23:
                positionNum23 = changeDirectionOfPosition(positionNum23);
                strPosition23 = changeDirectionOfPositionString(positionNum23);
                btn23.setText(strPosition23);
                break;
            case R.id.btn24:
                positionNum24 = changeDirectionOfPosition(positionNum24);
                strPosition24 = changeDirectionOfPositionString(positionNum24);
                btn24.setText(strPosition24);
                break;
            case R.id.btn25:
                positionNum25 = changeDirectionOfPosition(positionNum25);
                strPosition25 = changeDirectionOfPositionString(positionNum25);
                btn25.setText(strPosition25);
                break;
        }

        changeDirectionOfPosition(1);
        changeDirectionOfPositionString(positionNum1);

    }

    private int changeDirectionOfPosition(int position) {
        if (position == 4) {
            position = 1;
        } else {
            position += 1;
        }
        return position;
    }

    private String changeDirectionOfPositionString(int position) {
        if (position == 1) {
            return st1;
        } else if (position == 2) {
            return st2;
        } else if (position == 3) {
            return st3;
        } else if (position == 4) {
            return st4;
        }
        return "";
    }
}

