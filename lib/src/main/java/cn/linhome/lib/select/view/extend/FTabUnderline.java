package cn.linhome.lib.select.view.extend;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import cn.linhome.lib.R;
import cn.linhome.lib.select.view.FSelectView;

public class FTabUnderline extends FSelectView
{
    public FTabUnderline(Context context)
    {
        super(context);
        init();
    }

    public FTabUnderline(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public FTabUnderline(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    public TextView tv_text;
    public View view_underline;

    protected void init()
    {
        setContentView(R.layout.lib_view_tab_underline);
        tv_text = findViewById(R.id.tv_text);
        view_underline = findViewById(R.id.view_underline);
    }
}
