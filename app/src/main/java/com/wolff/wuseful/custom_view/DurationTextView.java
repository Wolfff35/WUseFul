package com.wolff.wuseful.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.TextView;

import com.wolff.wuseful.R;

/**
 * Created by wolfff on 23.01.18.
 */

public class DurationTextView extends android.support.v7.widget.AppCompatTextView {
    private String template;
    public DurationTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.DurationTextView);
        template = attributes.getString(R.styleable.DurationTextView_template);

        if (template == null || !template.contains("%s")) {
            template = "%s";
        }

        attributes.recycle();

    }
    public void setDuration(float duration) {
        int durationInMinutes = Math.round(duration / 60);
        int hours = durationInMinutes / 60;
        int minutes = durationInMinutes % 60;

        String hourText = "";
        String minuteText = "";

        if (hours > 0) {
            hourText = hours + (hours == 1 ? " час " : " часа ");
        }

        if (minutes > 0) {
            minuteText = minutes + (minutes == 1 ? " минута" : " минут");
        }

        if (hours == 0 && minutes == 0) {
            minuteText = "меньше минуты";
        }

        String durationText = String.format(template, hourText + minuteText);
        setText(Html.fromHtml(durationText), TextView.BufferType.SPANNABLE);
    }
}
