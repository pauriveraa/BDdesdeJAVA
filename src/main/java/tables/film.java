package tables;

public class film {
    private int film_id;
    private String title;
    private String text;
    private int language_id;
    private int original_language_id;
    private int rental_duration;
    private int length;
    private int replacement_cost;
    private String rating;

    public film(int film_id, String title, String text, int language_id,
                int original_language_id, int rental_duration, int length,
                int replacement_cost, String rating) {
        this.film_id = film_id;
        this.title = title;
        this.text = text;
        this.language_id = language_id;
        this.original_language_id = original_language_id;
        this.rental_duration = rental_duration;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(int original_language_id) {
        this.original_language_id = original_language_id;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(int replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
