/**
 * @(#) ImageNotLoaded.java 1.0 2022-09-04
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap11.iconstate;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ImageNotLoaded
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/04 16:54
 * @Version 1.0
 **/
public class ImageNotLoaded implements ImageState {

    ImageProxyState imageProxyState;

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("Loading album cover, please wait...", x + 300, y + 190);
        if (!imageProxyState.isRetrieving()) {
            imageProxyState.setRetrieving(true);
            Thread retrievalThread = new Thread(() -> {
                try {
                    imageProxyState.setImageIcon(new ImageIcon(imageProxyState.imageURL, "Album Cover"));
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            imageProxyState.setRetrievalThread(retrievalThread);
            retrievalThread.start();
        }
        imageProxyState.setCurrentState(imageProxyState.imageLoaded);
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
