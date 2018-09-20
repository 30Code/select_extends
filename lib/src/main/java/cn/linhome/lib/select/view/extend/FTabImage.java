package cn.linhome.lib.select.view.extend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import cn.linhome.lib.R;
import cn.linhome.lib.select.view.FSelectView;

public class FTabImage extends FSelectView
{
    public FTabImage(Context context)
    {
        super(context);
        init();
    }

    public FTabImage(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public FTabImage(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    public ImageView iv_image;

    protected void init()
    {
        setContentView(R.layout.lib_view_tab_image);
        iv_image = findViewById(R.id.iv_image);
    }
}
