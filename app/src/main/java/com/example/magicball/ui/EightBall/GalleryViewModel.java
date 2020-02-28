package com.example.magicball.ui.EightBall;

import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("Magic 8 ball");
    }

    public LiveData<String> getText() {
        return mText;
    }


}