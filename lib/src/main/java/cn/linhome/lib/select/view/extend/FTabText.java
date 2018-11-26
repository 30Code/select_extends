package cn.linhome.lib.select.view.extend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import cn.linhome.lib.select.R;
import cn.linhome.lib.select.view.FSelectView;

public class FTabText extends FSelectView
{
    public FTabText(Context context)
    {
        super(context);
        init();
    }

    public FTabText(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public FTabText(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    public TextView tv_text;

    protected void init()
    {
        setContentView(R.layout.lib_view_tab_text);
        tv_text = (TextView) findViewById(R.id.tv_text);
    }
}
