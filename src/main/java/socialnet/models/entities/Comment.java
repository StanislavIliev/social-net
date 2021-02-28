package socialnet.models.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {


    private String content;
    private User author;
    private LocalDateTime dateCreate = LocalDateTime.now();

    public Comment() {
        super();
    }


    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "date_create", nullable = false)
    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDateTime dateCreate) {
        this.dateCreate = dateCreate;
    }

    @ManyToOne
	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
}
