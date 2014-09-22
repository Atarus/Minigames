package com.CaseySinglehurst.spacegame;



import com.kilobolt.framework.Screen;
import com.kilobolt.framework.implementation.AndroidGame;

public class SampleGame extends AndroidGame {

    boolean firstTimeCreate = true;

    @Override
    public Screen getInitScreen() {
        return new SplashLoadingScreen(this);

    }

    @Override
    public void onBackPressed() {
        getCurrentScreen().backButton();
    }

    

    @Override
    public void onResume() {
        super.onResume();


    }

    @Override
    public void onPause() {
        super.onPause();

    }
}