package com.hanbit.user.myapp160709.member;

import android.util.Log;

/**
 * Created by 1027 on 2016-07-09.
 */
public class MemberServiceImpl implements MemberService {
    //String sessionID, sessionPW; //기억 = 세션

    public static String sessionID, sessionPW;

    @Override
    public String join(MemberBean bean) {
        String id = bean.getId();
        String pw = bean.getPw();
        String name = bean.getName();
        String email = bean.getEmail();

        Log.d("넘어온 아이디: ", id);
        Log.d("넘어온 비밀번호: ", pw);
        Log.d("넘어온 이름: ", name);
        Log.d("넘어온 이메일: ", email);

        sessionID = id;
        sessionPW = pw;

        //session.setId(id);
        //session.setPw(pw);

        return name + "님 회원가입을 축하드립니다.";
    }

    @Override
    public boolean login(MemberBean bean) {
        String id = bean.getId();
        String pw = bean.getPw();
        boolean login0K = false;

        Log.d("넘어온 아이디: ", id);
        Log.d("넘어온 비밀번호: ", pw);

        // equals 값 불러오기
        if(sessionID.equals(id) && sessionPW.equals(pw)){
            login0K = true;
        }
        return login0K;
    }
}
