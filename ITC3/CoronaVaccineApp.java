package com.mustafa.Aug04;



public class CoronaVaccineApp {
    public static void main(String[] args) {
        User user1 = new User("Ramesh", 45, false);
        User user2 = new User("Suresh", 16, false);

        Thread thread1 = new Thread(() -> {
            try {
                user1.bookDose();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                user2.bookDose();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        });

        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
