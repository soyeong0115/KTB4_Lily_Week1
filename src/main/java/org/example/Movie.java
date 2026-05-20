package org.example;

import java.util.HashMap;
import java.util.Map;

public class Movie {
    private String movieTitle;
    private Map<Integer, String> movieMap = new HashMap<>();

    // 생성자
    public Movie(int inputMovieNumber) {
        // 영화 목록 저장
        movieMap.put(1, "악마는 프라다를 입는다2");
        movieMap.put(2, "살목지");
        movieMap.put(3, "프로젝트 헤일메리");
        movieMap.put(4, "왕과 사는 남자");
        movieMap.put(5, "군체");

        setMovieTitle(inputMovieNumber);
    }

    // 영화 제목 설정
    public void setMovieTitle(int inputMovieNumber) {
        movieTitle = movieMap.get(inputMovieNumber);
    }

    // 영화 제목 반환
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
