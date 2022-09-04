/**
 * @(#) MyRemote.java 1.0 2022-08-27
 * Copyright (c) 2022, AllNightBlues. ALL right reserved.
 * AllNightBlues PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.chap11.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @ClassName MyRemote
 * @description:
 * @AUTHOR AllNightBlues
 * @Date 2022/08/27 15:09
 * @Version 1.0
 **/
public interface MyRemote extends Remote {

    String sayHello() throws RemoteException;
}
