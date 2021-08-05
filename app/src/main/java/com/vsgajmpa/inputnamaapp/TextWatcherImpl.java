package com.vsgajmpa.inputnamaapp;

import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;

import androidx.annotation.RequiresApi;

import java.util.function.Consumer;

public class TextWatcherImpl implements TextWatcher {

    private final Consumer<Editable> consumer;

    public TextWatcherImpl(Consumer<Editable> consumer){
        this.consumer = consumer;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void afterTextChanged(Editable s) {
        consumer.accept(s);
    }
}
