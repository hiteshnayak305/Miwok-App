package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created custom word adapter to dynamically change two TextView from item_list
 */

public class wordAdapter extends ArrayAdapter<word> {

    /**
     * constructor for custom adapter
     *
     * @param context takes context
     * @param objects takes list of objects to view in list
     */
    public wordAdapter(Context context, List<word> objects) {
        super(context, 0, objects);
    }

    /**
     * getView overloaded to handle change of text_views in item_list
     *
     * @param position    gets form layout position of item to show
     * @param convertView get any recycled view from item_list.LinearLayout view
     * @param parent      parent layout in item_list layout
     * @return view to root view so added as child view in item_list's LinearLayout
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check if existing view is reused otherwise inflate the view
        //listItemView referencing root linear layout   i.e. LinearLayout from item_list
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        //get word object from ArrayAdapter
        word currentWord = getItem(position);
        //set first TextView of item_list
        TextView mi = (TextView) listItemView.findViewById(R.id.miwok_text);
        mi.setText(currentWord.getMiwok());
        //set second TextView of item_list
        TextView eng = (TextView) listItemView.findViewById(R.id.english_text);
        eng.setText(currentWord.getEnglish());
        //set image view source and visibility of ImageView
        ImageView img = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentWord.hasImage()) {
            img.setVisibility(View.VISIBLE);
            img.setImageResource(currentWord.getImageId());
        } else {
            img.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
