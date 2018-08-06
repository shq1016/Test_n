package com.wjiong.testn.test_n;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by SA on 2018-08-06.
 */

public class TestView extends View {
    private Bitmap bitmap;
    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
        bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.zhong);
    }

    public TestView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint=new Paint();
        paint.setTextSize(30);
        paint.setColor(Color.BLUE);
        canvas.drawText("this is odDraw",0,30, paint);

        //画直线：开始的X坐标，开始的Y坐标，直线的长度，最终位置的坐标，样式
        canvas.drawLine(20,60,100,70,paint);

        //画矩形方法一：开始X坐标，开始Y坐标，矩形X坐标长度-X坐标，矩形Y坐标高度-Y坐标，样式
       // canvas.drawRect(0,60,200,290,paint);

        //画矩形方法二：开始X坐标，开始Y坐标，矩形X坐标长度-X坐标，矩形Y坐标高度-Y坐标
      //  Rect r=new Rect(0,60,200,290);//该方法是使用int类型
       // canvas.drawRect(r,paint);

        //画矩形方法三：开始X坐标，开始Y坐标，矩形X坐标长度-X坐标，矩形Y坐标高度-Y坐标
       // RectF r=new RectF(0,60,200,290);//该方法是使用float类型
        // canvas.drawRect(r,paint);

        //画圆角矩形方法：
        RectF rect=new RectF(100,100,200,110);
        canvas.drawRoundRect(rect,10,10,paint);

        //画圆形:圆心离X坐标位置，圆离Y坐标位置，半径，样式
        canvas.drawCircle(100,210,50,paint);

        //绘制图像
        canvas.drawBitmap(bitmap,0,350,paint);


    }
}
