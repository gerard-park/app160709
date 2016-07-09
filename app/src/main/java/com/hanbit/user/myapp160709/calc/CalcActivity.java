package com.hanbit.user.myapp160709.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160709.MainActivity;
import com.hanbit.user.myapp160709.R;

public class CalcActivity extends Activity implements View.OnClickListener {

    /* 변수 선언 */
    EditText et1, et2;
    Button btPlus, btMinus, btMulti, btDivide, btHome;
    TextView tvResult;
    int num1, num2;

    /* 메소드(인터페이스) = 클래스 객체 생성 */
    CalcService service = new CalcServiceImpl();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        /* 정의 */
        btDivide = (Button) findViewById(R.id.btDivide);
        btDivide.setOnClickListener(this);

        btMinus = (Button) findViewById(R.id.btMinus);
        btMinus.setOnClickListener(this);

        btMulti = (Button) findViewById(R.id.btMulti);
        btMulti.setOnClickListener(this);

        btPlus = (Button) findViewById(R.id.btPlus);
        btPlus.setOnClickListener(this);

        btHome = (Button) findViewById(R.id.btHome);
        btDivide.setOnClickListener(this);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        /*text를 int로 바꾸어주는 문법 Integer.parseInt(et1.getText().toString())*/
        num1 = Integer.parseInt(et1.getText().toString());
        num2 = Integer.parseInt(et2.getText().toString());

        switch (v.getId()) {
            case R.id.btHome:
                this.startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.btPlus:
                                                    /* service 함수안의 plus 로드 */
                tvResult.setText("계산 결과 : " + service.plus(num1, num2));
                break;

            case R.id.btMinus:
                tvResult.setText("계산 결과 : " + service.minus(num1, num2));
                break;

            case R.id.btMulti:
                tvResult.setText("계산 결과 : " + service.multi(num1, num2));
                break;

            case R.id.btDivide:
                tvResult.setText("계산 결과 : 몫" + service.devide(num1, num2) + ", 나머지=" + service.remainder(num1, num2));
                break;

            default:
                tvResult.setText("계산 결과 : " + (num1 + num2));
                break;
        }
    }
}
