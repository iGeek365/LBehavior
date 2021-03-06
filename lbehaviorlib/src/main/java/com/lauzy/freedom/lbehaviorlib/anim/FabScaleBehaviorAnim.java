package com.lauzy.freedom.lbehaviorlib.anim;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;

import com.lauzy.freedom.lbehaviorlib.IBehaviorAnim;

/**
 * FloatingActionBar 缩放动画
 * Created by Lauzy on 2017/3/15.
 */

public class FabScaleBehaviorAnim extends AbsBehaviorAnim implements IBehaviorAnim {

    private View mFabView;

    public FabScaleBehaviorAnim(View fabView) {
        mFabView = fabView;
    }

    @Override
    public void show() {
        ViewCompat.animate(mFabView).scaleX(1f).scaleY(1f)
                .setDuration(getDuration())
                .setInterpolator(getInterpolator())
                .setListener(new ViewPropertyAnimatorListener() {
                    @Override
                    public void onAnimationStart(View view) {
                        view.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(View view) {
                    }

                    @Override
                    public void onAnimationCancel(View view) {

                    }
                }).start();
    }

    @Override
    public void hide() {
        ViewCompat.animate(mFabView).scaleX(0f).scaleY(0f)
                .setDuration(getDuration())
                .setInterpolator(getInterpolator())
                .setListener(new ViewPropertyAnimatorListener() {
                    @Override
                    public void onAnimationStart(View view) {

                    }

                    @Override
                    public void onAnimationEnd(View view) {
                        view.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onAnimationCancel(View view) {

                    }
                }).start();
    }
}
