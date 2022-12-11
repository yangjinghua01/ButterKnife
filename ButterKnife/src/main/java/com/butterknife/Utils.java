package com.butterknife;

import android.app.Activity;
import android.view.View;

/**
 * description:
 * author: Darren on 2017/9/6 14:17
 * email: 240336124@qq.com
 * version: 1.0
 */
public class Utils {
    public static final <T extends View> T findViewById(Activity activity, int viewId) {
        return (T) activity.findViewById(viewId);
    }
}
