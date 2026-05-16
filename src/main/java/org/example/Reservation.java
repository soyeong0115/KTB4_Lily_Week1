package org.example;

public class Reservation {
    String theaterType;
    int ticketPrice;

    // 생성자 사용
    public Reservation(int inputTheaterType) {
        setTheaterType(inputTheaterType);
    }

    public void setTheaterType(int inputTheaterType) {
        switch (inputTheaterType) {
            case 1:
                theaterType = "2D";
                ticketPrice = 14000;
                break;
            case 2:
                theaterType = "IMAX";
                ticketPrice = 18000;
                break;
            case 3:
                theaterType = "4DX";
                ticketPrice = 18000;
                break;
            case 4:
                theaterType = "SCREENX";
                ticketPrice = 16000;
                break;
        }
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
