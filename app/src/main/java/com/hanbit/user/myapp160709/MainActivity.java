package com.hanbit.user.myapp160709;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hanbit.user.myapp160709.calc.CalcActivity;
import com.hanbit.user.myapp160709.kaup.KaupActivity;
import com.hanbit.user.myapp160709.member.JoinActivity;
import com.hanbit.user.myapp160709.member.LoginActivity;

/* extends 상속, implements 구현 */
public class MainActivity extends Activity implements View.OnClickListener {
    Button btCalc, btCalendar, btImageView, btConnectWeb, btKaup, btJoin, btLogin;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalc = (Button) findViewById(R.id.btCalc);
        btCalc.setOnClickListener(this);

        btCalendar = (Button) findViewById(R.id.btCalendar);
        btCalendar.setOnClickListener(this);

        btImageView = (Button) findViewById(R.id.btImageView);
        btImageView.setOnClickListener(this);

        btConnectWeb = (Button) findViewById(R.id.btConnectWeb);
        btConnectWeb.setOnClickListener(this);

        btKaup = (Button) findViewById(R.id.btKaup);
        btKaup.setOnClickListener(this);

        btJoin = (Button) findViewById(R.id.btJoin);
        btJoin.setOnClickListener(this);

        btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btCalc:
                this.startActivity(new Intent(this, CalcActivity.class));
                break;
            case R.id.btCalendar:
                this.startActivity(new Intent(this, CalendarActivity.class));
                break;
            case R.id.btImageView:
                this.startActivity(new Intent(this, ImageActivity.class));
                break;
            case R.id.btKaup:
                this.startActivity(new Intent(this, KaupActivity.class));
                break;
            case R.id.btJoin:
                this.startActivity(new Intent(this, JoinActivity.class));
                break;
            case R.id.btLogin:
                this.startActivity(new Intent(this, LoginActivity.class));
                break;

            default:
                break;
        }

        switch (v.getId()) {
            case R.id.btConnectWeb:
                intent = new Intent(intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                break;
        }
    }
}
