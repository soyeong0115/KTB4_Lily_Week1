package org.example;

public class TimerThread extends Thread {

    private boolean expired = false;

    @Override
    public void run() {
        System.out.println("결제를 시작합니다. 30초 안에 결제를 완료해주세요.");

        try {
            Thread.sleep(1000);
            expired = true;
        } catch (InterruptedException e) {
        }
    }

    public boolean isExpired() {
        return expired;
    }
}