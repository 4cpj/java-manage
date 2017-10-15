package cn.cpj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ye on 2017/10/12
 */
@Entity
public class Answer {
    private long id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte showFlag;
    private long userId;
    private Integer thumbUp;
    private String answerContent;
    private Integer thumbDown;
    private Long askId;

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
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
    @Column(name = "answer_content")
    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
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
    @Column(name = "ask_id")
    public Long getAskId() {
        return askId;
    }

    public void setAskId(Long askId) {
        this.askId = askId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        if (id != answer.id) return false;
        if (userId != answer.userId) return false;
        if (createTime != null ? !createTime.equals(answer.createTime) : answer.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(answer.updateTime) : answer.updateTime != null) return false;
        if (showFlag != null ? !showFlag.equals(answer.showFlag) : answer.showFlag != null) return false;
        if (thumbUp != null ? !thumbUp.equals(answer.thumbUp) : answer.thumbUp != null) return false;
        if (answerContent != null ? !answerContent.equals(answer.answerContent) : answer.answerContent != null)
            return false;
        if (thumbDown != null ? !thumbDown.equals(answer.thumbDown) : answer.thumbDown != null) return false;
        if (askId != null ? !askId.equals(answer.askId) : answer.askId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (showFlag != null ? showFlag.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (thumbUp != null ? thumbUp.hashCode() : 0);
        result = 31 * result + (answerContent != null ? answerContent.hashCode() : 0);
        result = 31 * result + (thumbDown != null ? thumbDown.hashCode() : 0);
        result = 31 * result + (askId != null ? askId.hashCode() : 0);
        return result;
    }
}
