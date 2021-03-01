package tables;

import com.microsoft.sqlserver.jdbc.SQLServerResource_zh_TW;

public class filmText {

    private int film_id;
    private String title;
    private String descripcion;

    public filmText(int film_id, String title, String descripcion) {
        this.film_id = film_id;
        this.title = title;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
