package com.example.android.miwok;

import android.app.Activity;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter <Word>{
    private int mColorResourceId;


    public WordAdapter(Activity context, ArrayList<Word> words, int mColorResourceId){
        super(context, 0, words);
        this.mColorResourceId = mColorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getmDefaultTranslation());
        ImageView miwokImageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            miwokImageView.setImageResource(currentWord.getImageResourceId());
            miwokImageView.setVisibility(View.VISIBLE);
        }
        else {
            miwokImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
