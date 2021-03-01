package tables;

public class country {
    private int country_id;
    private String country;

    public country(int country_id, String country) {
        this.country_id = country_id;
        this.country = country;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCountry_id() {
        return country_id;
    }

    public String getCountry() {
        return country;
    }
}
