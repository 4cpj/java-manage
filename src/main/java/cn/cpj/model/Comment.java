package cn.cpj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ye on 2017/10/12
 */
@Entity
public class Comment {
    private long id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte showFlag;
    private Integer thumbUp;
    private Integer thumbDown;
    private Long articleId;
    private long userId;
    private Long answerId;
    private String commentContent;
    private String commentType;
    private Long responseId;
    private String responseContent;
    private Integer parentCommentId;

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
    @Column(name = "article_id")
    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "answer_id")
    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    @Basic
    @Column(name = "comment_content")
    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    @Basic
    @Column(name = "comment_type")
    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    @Basic
    @Column(name = "response_id")
    public Long getResponseId() {
        return responseId;
    }

    public void setResponseId(Long responseId) {
        this.responseId = responseId;
    }

    @Basic
    @Column(name = "response_content")
    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }

    @Basic
    @Column(name = "parent_comment_id")
    public Integer getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Integer parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (id != comment.id) return false;
        if (userId != comment.userId) return false;
        if (createTime != null ? !createTime.equals(comment.createTime) : comment.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(comment.updateTime) : comment.updateTime != null) return false;
        if (showFlag != null ? !showFlag.equals(comment.showFlag) : comment.showFlag != null) return false;
        if (thumbUp != null ? !thumbUp.equals(comment.thumbUp) : comment.thumbUp != null) return false;
        if (thumbDown != null ? !thumbDown.equals(comment.thumbDown) : comment.thumbDown != null) return false;
        if (articleId != null ? !articleId.equals(comment.articleId) : comment.articleId != null) return false;
        if (answerId != null ? !answerId.equals(comment.answerId) : comment.answerId != null) return false;
        if (commentContent != null ? !commentContent.equals(comment.commentContent) : comment.commentContent != null)
            return false;
        if (commentType != null ? !commentType.equals(comment.commentType) : comment.commentType != null) return false;
        if (responseId != null ? !responseId.equals(comment.responseId) : comment.responseId != null) return false;
        if (responseContent != null ? !responseContent.equals(comment.responseContent) : comment.responseContent != null)
            return false;
        if (parentCommentId != null ? !parentCommentId.equals(comment.parentCommentId) : comment.parentCommentId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (showFlag != null ? showFlag.hashCode() : 0);
        result = 31 * result + (thumbUp != null ? thumbUp.hashCode() : 0);
        result = 31 * result + (thumbDown != null ? thumbDown.hashCode() : 0);
        result = 31 * result + (articleId != null ? articleId.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (answerId != null ? answerId.hashCode() : 0);
        result = 31 * result + (commentContent != null ? commentContent.hashCode() : 0);
        result = 31 * result + (commentType != null ? commentType.hashCode() : 0);
        result = 31 * result + (responseId != null ? responseId.hashCode() : 0);
        result = 31 * result + (responseContent != null ? responseContent.hashCode() : 0);
        result = 31 * result + (parentCommentId != null ? parentCommentId.hashCode() : 0);
        return result;
    }
}
