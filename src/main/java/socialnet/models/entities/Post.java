package socialnet.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post extends BaseEntity {

    private String title;
    private String content;
    private LocalDateTime dateCreate = LocalDateTime.now();



    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Post setContent(String content) {
        this.content = content;
        return this;
    }

    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public Post setDateCreate(LocalDateTime dateCreate) {
        this.dateCreate = dateCreate;
        return this;
    }
}
