package com.example.kwy2868.boostcamp_2nd.Fragment;

import android.os.Bundle;
import android.util.Log;

import com.example.kwy2868.boostcamp_2nd.Model.DataForTest;

/**
 * Created by kwy2868 on 2017-07-11.
 */

public class PopularityFragment extends BaseFragment {

    // showType에 대한 정보를 프래그먼트 생성할 때 같이 넘겨준다.
    // 넘겨 줬으니까 받아와야겠지?
    public static PopularityFragment newInstance(boolean showType) {
        PopularityFragment fragment = new PopularityFragment();

        Bundle bundle = new Bundle();
        bundle.putBoolean("showType", showType);
        fragment.setArguments(bundle);

        return fragment;
    }

    void init() {
        // 맛집 리스트들에 대한 정보들 세팅해줌.
        FLAG = 1;
        list = new DataForTest(FLAG).getList();
        Log.d("list", "list : " + list);
        super.init();
    }
}
