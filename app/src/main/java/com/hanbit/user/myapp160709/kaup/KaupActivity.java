package com.hanbit.user.myapp160709.kaup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160709.MainActivity;
import com.hanbit.user.myapp160709.R;

public class KaupActivity extends Activity implements View.OnClickListener {
    EditText name, height, weight;
    Button btResult, btHome;
    TextView tvResult;
    /* 인터페이스 변수이름 = new 클래스이름 */
    KaupService service = new KaupServiceImpl();
    KaupBean bean = new KaupBean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaup);
        name = (EditText) findViewById(R.id.name);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        btResult = (Button) findViewById(R.id.btResult);
        btHome = (Button) findViewById(R.id.btHome);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btResult.setOnClickListener(this);
        btHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //String inputName = name.getText().toString();     보안이 약함
        //int inputHeight = Integer.parseInt(height.getText().toString());
        //int inputWeight = Integer.parseInt(weight.getText().toString());
        //Log.d("inputName", inputName);
        //Log.d("inputHeight", );

        bean.setName(name.getText().toString());
        bean.setHeight(Integer.parseInt(height.getText().toString()));
        bean.setWeight(Integer.parseInt(weight.getText().toString()));

        switch (v.getId()) {
            case R.id.btResult:
                String result = service.execute(bean);
                tvResult.setText(result);
                break;

            case R.id.btHome:
                this.startActivity(new Intent(this, MainActivity.class));
                break;

            default:
                break;
        }

    }
}
