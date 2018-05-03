package example.com.databindingdemo;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * @author Richard_Y_Wang
 * @version $Rev$
 * @des 2018/5/3
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class ImageUtil {
    /**
     * 使用ImageLoader显示图片
     * @param imageView
     * @param url
     */
    @BindingAdapter({"image"})
    public static void imageLoader(ImageView imageView, String url) {
        ImageLoader.getInstance().displayImage(url, imageView);
    }
    /**
     * 使用ImageLoader显示图片
     * @param view
     * @param b
     */
    @BindingAdapter({"isVisibleOrGone"})
    public static void isVisibleOrGone(View view, boolean b) {
        int visiable;
        if (b) {
            visiable = View.VISIBLE;
        } else {
            visiable = View.GONE;
        }
        view.setVisibility(visiable);
    }
    /**
     * 使用ImageLoader显示图片
     * @param textView
     * @param text
     */
    @BindingAdapter({"setText"})
    public static void setText(TextView textView, String text) {
        textView.setText(text);
    }
}

