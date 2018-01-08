package com.dtdream.amu.conditional;

/**
 * commit
 * Author : amu
 * Date : 2018/1/8 0008.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
