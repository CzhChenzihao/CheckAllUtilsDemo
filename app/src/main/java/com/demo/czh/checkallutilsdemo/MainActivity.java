package com.demo.czh.checkallutilsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utils.CheckForAllUtils;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.et1)
    EditText et1;
    @Bind(R.id.et2)
    EditText et2;
    @Bind(R.id.tv1)
    TextView tv1;
    @Bind(R.id.btn1)
    Button btn1;
    @Bind(R.id.btn2)
    Button btn2;
    @Bind(R.id.btn3)
    Button btn3;
    @Bind(R.id.btn4)
    Button btn4;
    @Bind(R.id.btn5)
    Button btn5;
    @Bind(R.id.btn6)
    Button btn6;
    @Bind(R.id.btn7)
    Button btn7;
    @Bind(R.id.btn8)
    Button btn8;
    @Bind(R.id.btn9)
    Button btn9;
    @Bind(R.id.btn10)
    Button btn10;
    @Bind(R.id.btn11)
    Button btn11;
    @Bind(R.id.btn12)
    Button btn12;
    @Bind(R.id.tv2)
    TextView tv2;
    @Bind(R.id.activity_main)
    LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    private void setResultText(String text) {
        tv1.setText(text);
        tv2.setText(text);
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12})
    public void onClick(View view) {
        switch (view.getId()) {
            //判断字符串是否为空
            case R.id.btn1:
                if (CheckForAllUtils.isNotNull(et1.getText().toString()))
                    setResultText("字符串不为空");
                else
                    setResultText("字符串为空");
                break;
            //判断手机格式
            case R.id.btn2:
                if (CheckForAllUtils.isMobileNO(et1.getText().toString()))
                    setResultText("格式正确");
                else
                    setResultText("格式错误");
                break;
            //判断邮箱格式
            case R.id.btn3:
                if (CheckForAllUtils.isEmailAdd(et1.getText().toString()))
                    setResultText("格式正确");
                else
                    setResultText("格式错误");
                break;
            case R.id.btn4:
                if (CheckForAllUtils.startWithMytext(et1.getText().toString(), et2.getText().toString()))
                    setResultText("以" + et2.getText().toString() + "开头");
                else
                    setResultText("没有以" + et2.getText().toString() + "开头");
                break;
            case R.id.btn5:
                if (CheckForAllUtils.hasMytext(et1.getText().toString(), et2.getText().toString()))
                    setResultText("包含" + et2.getText().toString());
                else
                    setResultText("没有包含" + et2.getText().toString());
                break;
            case R.id.btn6:
                if (CheckForAllUtils.endWithMytext(et1.getText().toString(), et2.getText().toString()))
                    setResultText("以" + et2.getText().toString() + "结尾");
                else
                    setResultText("没有以" + et2.getText().toString() + "结尾");
                break;
            //字符串为数字
            case R.id.btn7:
                if (CheckForAllUtils.isNumber(et1.getText().toString()))
                    setResultText("数字");
                else
                    setResultText("不是数字");
                break;
            //字符串为小数
            case R.id.btn8:
                if (CheckForAllUtils.isDecimal(et1.getText().toString()))
                    setResultText("小数");
                else
                    setResultText("不是小数");
                break;
            //含有汉字
            case R.id.btn9:
                if (CheckForAllUtils.hasChinese(et1.getText().toString()))
                    setResultText("汉字");
                else
                    setResultText("不是汉字");
                break;
            //字母
            case R.id.btn10:
                if (CheckForAllUtils.isLetter(et1.getText().toString()))
                    setResultText("字母");
                else
                    setResultText("不是字母");
                break;
            //奇数偶数
            case R.id.btn11:
                if (CheckForAllUtils.isEvenNumbers(et1.getText().toString()) == 2)
                    setResultText("偶数");
                else if (CheckForAllUtils.isEvenNumbers(et1.getText().toString()) == 1)
                    setResultText("奇数");
                else if (CheckForAllUtils.isEvenNumbers(et1.getText().toString()) == 0)
                    setResultText("不是奇数也不是偶数");
                break;
            //字母开头
            case R.id.btn12:
                if (CheckForAllUtils.isLetterBegin(et1.getText().toString()))
                    setResultText("字母开头");
                else
                    setResultText("不是字母开头");
                break;
        }
    }
}
