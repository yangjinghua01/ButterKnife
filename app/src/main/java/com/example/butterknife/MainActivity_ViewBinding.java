package com.example.butterknife;

/**
 * 模仿黄油刀生成的代码
 */
public class MainActivity_ViewBinding {
    private MainActivity target;

    public MainActivity_ViewBinding(MainActivity target) {
        this.target = target;
//        target.textView = target.findViewById(R.id.tv1);

    }

    public void unbind() {
        MainActivity target = this.target;
        if (target == null) throw new IllegalStateException("Bindings already bleated");
        this.target = null;
//        target.textView = null;
    }
}

