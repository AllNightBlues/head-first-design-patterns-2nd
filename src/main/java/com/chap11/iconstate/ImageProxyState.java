/**
 * @(#) ImageProxy.java 1.0 2022-09-04
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap11.iconstate;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @ClassName ImageProxy
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/04 14:07
 * @Version 1.0
 **/
public class ImageProxyState implements Icon {

    ImageState imageLoaded;
    ImageState imageNotLoaded;
    ImageState currentState;

    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxyState(URL url) {
        imageURL = url;
    }


    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        currentState.paintIcon(c, g, x, y);
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public int getIconWidth() {
        return currentState.getIconWidth();
    }

    public int getIconHeight() {
        return currentState.getIconHeight();
    }

    public void setCurrentState(ImageState currentState) {
        this.currentState = currentState;
    }

    public boolean isRetrieving() {
        return retrieving;
    }

    public void setRetrieving(boolean retrieving) {
        this.retrieving = retrieving;
    }

    public void setRetrievalThread(Thread retrievalThread) {
        this.retrievalThread = retrievalThread;
    }
}
