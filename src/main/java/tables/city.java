package tables;

public class city {
    private int city_id;
    private String city;
    private int country_id;

    public city(int city_id, String city, int country_id) {
        this.city_id = city_id;
        this.city = city;
        this.country_id = country_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public String getCity() {
        return city;
    }

    public int getCountry_id() {
        return country_id;
    }
}
