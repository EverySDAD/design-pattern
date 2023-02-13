package model;

public enum Sites {

    BLOG("기술 블로그", "https://blog.com/hoonj"),
    ADULT("애들은 가라! 히히", "https://video.com/under19-stop"),
    NUNNUTV("눈누티비", "https://nunnu.tv"),
    ARMY("한국 국방부", "https://army.com/korea");

    private final String name;
    private final String site;
    Sites(String name, String site) {
        this.name = name;
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public String getSite() {
        return site;
    }
}
