/**
 * @(#) ImageLoaded.java 1.0 2022-09-04
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap11.iconstate;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ImageLoaded
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/09/04 16:41
 * @Version 1.0
 **/
public class ImageLoaded implements ImageState {

    ImageProxyState imageProxyState;


    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageProxyState.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return imageProxyState.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageProxyState.getIconHeight();
    }
}
