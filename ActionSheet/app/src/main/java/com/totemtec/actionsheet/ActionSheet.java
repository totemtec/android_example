package com.totemtec.actionsheet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;

public class ActionSheet extends Dialog {

    private Context mContext;


    public ActionSheet(@NonNull Context context) {
        super(context, R.style.ActionSheet);
        mContext = context;
        View view = LayoutInflater.from(context).inflate(R.layout.demo, null);

        setContentView(view);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window dialogWindow = getWindow();
        dialogWindow.setGravity(Gravity.BOTTOM);
        dialogWindow.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);//去掉阴影层
        dialogWindow.setWindowAnimations(R.style.DialogBottomTranslate); //设置窗口弹出动画
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        int heightPixels = Resources.getSystem().getDisplayMetrics().heightPixels;
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = (int)(heightPixels * 0.6);
        dialogWindow.setAttributes(lp);
    }

}