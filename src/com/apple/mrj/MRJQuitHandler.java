package com.apple.mrj;

/**
 * A hack to able compile on platforms that doesn't have the Apple JVM
 * 
 * @author daniel.frisk@mojang.com
 */
public interface MRJQuitHandler {

    public void handleQuit() throws IllegalStateException;
}
