package com.lesson9.tms.task1.worker;

import com.lesson9.tms.task1.IMethod;

/**
 * Create class worker.
 */

public class Worker implements IMethod {
    @Override
    public void post() {
        System.out.println("Worker");
    }
}
