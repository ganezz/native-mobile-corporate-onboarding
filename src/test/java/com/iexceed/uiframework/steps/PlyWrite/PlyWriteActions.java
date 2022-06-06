package com.iexceed.uiframework.steps.PlyWrite;


import com.iexceed.uiframework.Playwrite.plywrite2;

public class PlyWriteActions {
    plywrite2 plywrite=new plywrite2();


    public void clickElem() throws Exception {
        plywrite.clickElem();
        plywrite.clickInput();
    }

    public void launchChromium(){
        plywrite.plywrirLogin();
    }


    public void launchChrome() throws InterruptedException {
        plywrite.plywrirLoginC();
    }
    }
