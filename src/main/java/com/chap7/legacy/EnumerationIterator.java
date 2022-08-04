/**
 * @(#) EnumerationIterator.java 1.0 2022-08-04
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap7.legacy;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @ClassName EnumerationIterator
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/08/04 22:43
 * @Version 1.0
 **/
public class EnumerationIterator implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
