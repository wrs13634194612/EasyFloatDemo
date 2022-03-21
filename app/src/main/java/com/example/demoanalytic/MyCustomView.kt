package com.example.demoanalytic


import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout


/**
 * @author: Liuzhenfeng
 * @date: 2021/7/14  20:19
 * @Package: com.lzf.easyfloat.example.widget
 * @Description:
 */
class MyCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater?)
            ?.inflate(R.layout.float_down_layout, this)
    }
}

