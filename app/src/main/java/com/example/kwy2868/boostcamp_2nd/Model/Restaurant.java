package com.example.kwy2868.boostcamp_2nd.Model;

/**
 * Created by kwy2868 on 2017-07-11.
 */

public class Restaurant {
    // 이미지 리소스.
    private int image;
    // 맛집 이름.
    private String name;
    // 맛집에 대한 소개.
    private String content;
    // 거리.
    private int distance;
    // 인기.
    private int popularity;
    // 최근.
    private int latest;
    // 맛집 체크 했는지 담기 위한 변수. 기본 값은 false로 설정한다. 흰색 체크박스.
    private boolean is_checked = false;

    public Restaurant() {

    }

    public Restaurant(int image, String name, String content, int distance, int popularity, int latest) {
        this.image = image;
        this.name = name;
        this.content = content;
        this.distance = distance;
        this.popularity = popularity;
        this.latest = latest;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getLatest() {
        return latest;
    }

    public void setLatest(int latest) {
        this.latest = latest;
    }

    public boolean is_checked() {
        return is_checked;
    }

    public void setIs_checked(boolean is_checked) {
        this.is_checked = is_checked;
    }
}
