package model;

import javax.persistence.*;

/**
 * Created by ye on 2017/10/12
 */
@Entity
@Table(name = "tag_content", schema = "cpj", catalog = "")
public class TagContent {
    private long id;
    private long tagId;
    private Long askId;
    private Long articleId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tag_id")
    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    @Basic
    @Column(name = "ask_id")
    public Long getAskId() {
        return askId;
    }

    public void setAskId(Long askId) {
        this.askId = askId;
    }

    @Basic
    @Column(name = "article_id")
    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagContent that = (TagContent) o;

        if (id != that.id) return false;
        if (tagId != that.tagId) return false;
        if (askId != null ? !askId.equals(that.askId) : that.askId != null) return false;
        if (articleId != null ? !articleId.equals(that.articleId) : that.articleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (tagId ^ (tagId >>> 32));
        result = 31 * result + (askId != null ? askId.hashCode() : 0);
        result = 31 * result + (articleId != null ? articleId.hashCode() : 0);
        return result;
    }
}
