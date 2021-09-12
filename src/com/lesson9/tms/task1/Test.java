package com.lesson9.tms.task1;

import com.lesson9.tms.task1.accountant.Accountant;
import com.lesson9.tms.task1.director.Director;
import com.lesson9.tms.task1.worker.Worker;

/**
 * Create class Test.
 */

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        director.post();
        Accountant accountant = new Accountant();
        accountant.post();
        Worker worker = new Worker();
        worker.post();
    }
}
