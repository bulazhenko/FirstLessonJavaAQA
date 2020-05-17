package com.customertimes;

import com.customertimes.tasks.Task1;
import com.customertimes.tasks.Task7;
import com.customertimes.tasks.Task8;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1 result:");
        Task1.run();

        System.out.println("Task 7 result:");
        Task7.run();

        System.out.println("Task 8 result:");
        Task8.run();
    }
}