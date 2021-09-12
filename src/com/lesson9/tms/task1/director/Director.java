package com.lesson9.tms.task1.director;

import com.lesson9.tms.task1.IMethod;

/**
 * Create class director.
 */

public class Director implements IMethod {
    @Override
    public void post() {
        System.out.println("Director");
    }
}
