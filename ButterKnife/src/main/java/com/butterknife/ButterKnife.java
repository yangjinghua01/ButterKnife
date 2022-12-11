package com.butterknife;

import android.app.Activity;

import java.lang.reflect.Constructor;

/**
 * description:
 * author: Darren on 2017/9/6 16:52
 * email: 240336124@qq.com
 * version: 1.0
 */
public class ButterKnife {
    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public final static Unbinder bind(Activity activity) {
        String viewBindingClassName = activity.getClass().getName() + "_ViewBinding";
        try {
            Class<? extends Unbinder> viewBindingClass = (Class<? extends Unbinder>) Class.forName(viewBindingClassName);
            Constructor<? extends Unbinder> viewBindingConstructor = viewBindingClass.getDeclaredConstructor(activity.getClass());
            Unbinder unbinder = viewBindingConstructor.newInstance(activity);
            return unbinder;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unbinder.EMPTY;
    }
}
