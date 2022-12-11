package com.butterknife;


import androidx.annotation.UiThread;

/**
 * description:
 * author: Darren on 2017/9/6 11:57
 * email: 240336124@qq.com
 * version: 1.0
 */
public interface Unbinder {
    @UiThread
    void unbind();

    Unbinder EMPTY = new Unbinder() {
        @Override
        public void unbind() {
        }
    };
}
