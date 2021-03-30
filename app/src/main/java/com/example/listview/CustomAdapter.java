// I was just playing with this as an alternative to ArrayAdapter
// It is not used in the final lab
package com.example.listview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

class CustomAdapter extends BaseAdapter {

    private final String TAG = "CustomAdapter";

    Context context;
    String[] strings;

    public CustomAdapter(Context context, String[] strings) {
        this.context = context;
        this.strings = strings;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup container) {
        if (convertView == null) {
            Log.i(TAG, "convertView is null");
            LayoutInflater temp = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = temp.inflate(R.layout.list_item, container, false);
        } else Log.i(TAG, "convertView is NOT null");

        // attempt to add String
        if (position < strings.length)
            ((TextView) convertView.findViewById(R.id.list_text)).setText((String) getItem(position));

        // attempt to add image
        return convertView;
    }

    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        return strings[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
