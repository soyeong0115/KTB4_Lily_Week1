package org.example;

public class Movie {
    String movieTitle;

    // 생성자 사용
    public Movie(int inputMovieNumber) {
        setMovieTitle(inputMovieNumber);
    }

    public void setMovieTitle(int inputMovieNumber) {
        switch (inputMovieNumber) {
            case 1:
                movieTitle = "악마는 프라다를 입는다2";
                break;
            case 2:
                movieTitle = "살목지";
                break;
            case 3:
                movieTitle = "프로젝트 헤일메리";
                break;
            case 4:
                movieTitle = "왕과 사는 남자";
                break;
            case 5:
                movieTitle = "군체";
                break;
        }
    }

    public String getMovieTitle() {
        return  movieTitle;
    }

    public String getEndTime(String startTime) {
        String[] arr = startTime.split(":");

        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);

        hour += 2;

        if (hour >= 24) {
            hour -= 24;
        }

        return String.format("%02d:%02d", hour, minute);
    }
}
