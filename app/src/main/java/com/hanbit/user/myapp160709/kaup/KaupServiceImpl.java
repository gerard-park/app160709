package com.hanbit.user.myapp160709.kaup;

/**
 * Created by 1027 on 2016-07-09.
 */
public class KaupServiceImpl implements KaupService {
    @Override
    public String execute(KaupBean bean) {
        String name = bean.getName();
        int height = bean.getHeight(), weight = (bean.getWeight()) * 1000; // 선언 및 불러오기
        int index = weight / height * height * 10;
        String result = ""; // ""; 기본값으로 초기화

        if (index >= 20) {
            result = "비만";
        } else if (index >= 18) {
            result = "경도비만";
        } else if (index >= 15) {
            result = "정상";
        } else if (index >= 13) {
            result = "수척";
        } else {
            result = "고도수척";
        }
        return name + " : " + result;
    }
}
