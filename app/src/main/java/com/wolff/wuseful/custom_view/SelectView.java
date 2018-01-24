package com.wolff.wuseful.custom_view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wolff.wuseful.R;


/**
 * Created by wolff on 04.09.2017.
 */

public class SelectView<Ttype> extends LinearLayout {
    private ImageButton btnSelSelect;
    private ImageButton btnSelClear;
    private TextView tvSelDescription;
    private TextView tvSelLabel;

    private Ttype mItem;

    public SelectView(Context context) {
        super(context);
        initComponent();
    }

    public SelectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initComponent();
    }

    public SelectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initComponent();
    }

    public SelectView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initComponent();
    }
    //-------------------------------------------------------------------------------------------------
    public void setItem(Ttype item){
        this.mItem = item;
        updateFields();
        updateVisible();
    }
    public Ttype getItem(){
        return mItem;
    }

    public void setLabel(String label){
        tvSelLabel.setText(label);
    }

    public void setOnClickListener_choose(OnClickListener listener){
        btnSelSelect.setOnClickListener(listener);
    }
    public void setOnClickListener_clear(OnClickListener listener){
        btnSelClear.setOnClickListener(listener);
    }
    //-------------------------------------------------------------------------------------------------

     private void initComponent() {
         LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         inflater.inflate(R.layout.view_select, this);
         btnSelSelect = findViewById(R.id.btnSelSelect);
         btnSelClear = findViewById(R.id.btnSelClear);
         tvSelDescription = findViewById(R.id.tvSelDescription);
         tvSelLabel = findViewById(R.id.tvSelLabel);

         updateFields();
         updateVisible();
     }
    private void updateVisible(){
        if(mItem!=null){
            btnSelClear.setVisibility(VISIBLE);
        }else {
            btnSelClear.setVisibility(INVISIBLE);
        }
    }
    private void updateFields(){
        if(mItem!=null){
            tvSelDescription.setText(mItem.toString());
        }else {
            tvSelDescription.setText("");
        }
    }

}
