package org.example;

import java.util.HashMap;
import java.util.Map;

public class Reservation {
    private Map<Integer, String> theaterMap = new HashMap<>();
    private Map<Integer, Integer> ticketPriceMap = new HashMap<>();

    private String theaterType;
    private int ticketPrice;

    // 생성자
    public Reservation(int inputTheaterType) {
        // 상영관 목록 저장
        theaterMap.put(1, "2D");
        theaterMap.put(2, "IMAX");
        theaterMap.put(3, "4DX");
        theaterMap.put(4, "SCREENX");

        // 티켓 가격 저장
        ticketPriceMap.put(1, 14000);
        ticketPriceMap.put(2, 18000);
        ticketPriceMap.put(3, 18000);
        ticketPriceMap.put(4, 16000);

        setTheaterTypeInfo(inputTheaterType);
    }

    public void setTheaterTypeInfo(int inputTheaterType) {
        theaterType = theaterMap.get(inputTheaterType);
        ticketPrice = ticketPriceMap.get(inputTheaterType);
    }

    public String getTheaterType() {
        return theaterType;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void showReservationInfo(String movieTitle, String date, String startTime, String endTime, int peopleCount, String theaterType) {
        System.out.println("\n============ 예매 정보 ============");
        System.out.println("[ " + movieTitle + " ]");
        System.out.println("상영 날짜 : " + date);
        System.out.println("영화 시작 시간 : " + startTime + " - " + endTime);
        System.out.println("예매 인원 : " + peopleCount + "명");
        System.out.println("상영관 유형 : " + theaterType);
        System.out.println("=================================");
    }
}
