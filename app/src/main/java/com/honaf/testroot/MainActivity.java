package com.honaf.testroot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void root(View v){
        ShellUtils.CommandResult commandResult = ShellUtils.execCommand("echo root", true, true);
        Log.e("result==>", commandResult.result+"");
        Log.e("successMsg==>",commandResult.successMsg+"");//参考值：root 授权成功   其余情况失败
        Log.e("errorMsg==>",commandResult.errorMsg+"");
    }
}
