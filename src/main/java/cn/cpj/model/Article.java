package cn.cpj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ye on 2017/10/12
 */
@Entity
public class Article {
    private long id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte showFlag;
    private String articleTitle;
    private String articleTag;
    private String articleContent;
    private String articleType;
    private Integer thumbUp;
    private Integer thumbDown;
    private long userId;

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
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "show_flag")
    public Byte getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(Byte showFlag) {
        this.showFlag = showFlag;
    }

    @Basic
    @Column(name = "article_title")
    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    @Basic
    @Column(name = "article_tag")
    public String getArticleTag() {
        return articleTag;
    }

    public void setArticleTag(String articleTag) {
        this.articleTag = articleTag;
    }

    @Basic
    @Column(name = "article_content")
    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Basic
    @Column(name = "article_type")
    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    @Basic
    @Column(name = "thumb_up")
    public Integer getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(Integer thumbUp) {
        this.thumbUp = thumbUp;
    }

    @Basic
    @Column(name = "thumb_down")
    public Integer getThumbDown() {
        return thumbDown;
    }

    public void setThumbDown(Integer thumbDown) {
        this.thumbDown = thumbDown;
    }

    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != article.id) return false;
        if (userId != article.userId) return false;
        if (createTime != null ? !createTime.equals(article.createTime) : article.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(article.updateTime) : article.updateTime != null) return false;
        if (showFlag != null ? !showFlag.equals(article.showFlag) : article.showFlag != null) return false;
        if (articleTitle != null ? !articleTitle.equals(article.articleTitle) : article.articleTitle != null)
            return false;
        if (articleTag != null ? !articleTag.equals(article.articleTag) : article.articleTag != null) return false;
        if (articleContent != null ? !articleContent.equals(article.articleContent) : article.articleContent != null)
            return false;
        if (articleType != null ? !articleType.equals(article.articleType) : article.articleType != null) return false;
        if (thumbUp != null ? !thumbUp.equals(article.thumbUp) : article.thumbUp != null) return false;
        if (thumbDown != null ? !thumbDown.equals(article.thumbDown) : article.thumbDown != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (showFlag != null ? showFlag.hashCode() : 0);
        result = 31 * result + (articleTitle != null ? articleTitle.hashCode() : 0);
        result = 31 * result + (articleTag != null ? articleTag.hashCode() : 0);
        result = 31 * result + (articleContent != null ? articleContent.hashCode() : 0);
        result = 31 * result + (articleType != null ? articleType.hashCode() : 0);
        result = 31 * result + (thumbUp != null ? thumbUp.hashCode() : 0);
        result = 31 * result + (thumbDown != null ? thumbDown.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        return result;
    }
}
