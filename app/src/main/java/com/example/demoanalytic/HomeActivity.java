package com.example.demoanalytic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.lzf.easyfloat.EasyFloat;
import com.lzf.easyfloat.enums.SidePattern;
import com.lzf.easyfloat.interfaces.OnFloatCallbacks;

import org.jetbrains.annotations.NotNull;


public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initFloatView();
    }

    private void initFloatView() {
        MyCustomView mMyCustomView = new MyCustomView(this);
        mMyCustomView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "mMyCustomView");
            }
        });

        EasyFloat.with(this)
                .setSidePattern(SidePattern.RESULT_HORIZONTAL)
                .setImmersionStatusBar(true)
                .setTag(this.toString())
                .setLocation(0, 1160)
                .setLayout(mMyCustomView, null)
                .registerCallbacks(new OnFloatCallbacks() {
                    @Override
                    public void dragEnd(@NotNull View view) {
                    }

                    @Override
                    public void drag(@NotNull View view, @NotNull MotionEvent event) {

                    }

                    @Override
                    public void touchEvent(@NotNull View view, @NotNull MotionEvent event) {

                    }

                    @Override
                    public void dismiss() {

                    }

                    @Override
                    public void hide(@NotNull View view) {

                    }

                    @Override
                    public void show(@NotNull View view) {

                    }

                    @Override
                    public void createdResult(boolean isCreated, @org.jetbrains.annotations.Nullable String msg, @org.jetbrains.annotations.Nullable View view) {

                    }
                }).show();

    }

}
