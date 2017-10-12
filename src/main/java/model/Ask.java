package model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ye on 2017/10/12
 */
@Entity
public class Ask {
    private long id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String askTitle;
    private String askTag;
    private String askType;
    private String askContent;
    private Byte showFlag;
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
    @Column(name = "ask_title")
    public String getAskTitle() {
        return askTitle;
    }

    public void setAskTitle(String askTitle) {
        this.askTitle = askTitle;
    }

    @Basic
    @Column(name = "ask_tag")
    public String getAskTag() {
        return askTag;
    }

    public void setAskTag(String askTag) {
        this.askTag = askTag;
    }

    @Basic
    @Column(name = "ask_type")
    public String getAskType() {
        return askType;
    }

    public void setAskType(String askType) {
        this.askType = askType;
    }

    @Basic
    @Column(name = "ask_content")
    public String getAskContent() {
        return askContent;
    }

    public void setAskContent(String askContent) {
        this.askContent = askContent;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ask ask = (Ask) o;

        if (id != ask.id) return false;
        if (userId != ask.userId) return false;
        if (createTime != null ? !createTime.equals(ask.createTime) : ask.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(ask.updateTime) : ask.updateTime != null) return false;
        if (askTitle != null ? !askTitle.equals(ask.askTitle) : ask.askTitle != null) return false;
        if (askTag != null ? !askTag.equals(ask.askTag) : ask.askTag != null) return false;
        if (askType != null ? !askType.equals(ask.askType) : ask.askType != null) return false;
        if (askContent != null ? !askContent.equals(ask.askContent) : ask.askContent != null) return false;
        if (showFlag != null ? !showFlag.equals(ask.showFlag) : ask.showFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (askTitle != null ? askTitle.hashCode() : 0);
        result = 31 * result + (askTag != null ? askTag.hashCode() : 0);
        result = 31 * result + (askType != null ? askType.hashCode() : 0);
        result = 31 * result + (askContent != null ? askContent.hashCode() : 0);
        result = 31 * result + (showFlag != null ? showFlag.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        return result;
    }
}
