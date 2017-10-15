package cn.cpj.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ye on 2017/10/12
 */
@Entity
public class Collect {
    private long id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte showFlag;
    private Long userId;
    private String collectTitle;
    private String collectDescribe;

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
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "collect_title")
    public String getCollectTitle() {
        return collectTitle;
    }

    public void setCollectTitle(String collectTitle) {
        this.collectTitle = collectTitle;
    }

    @Basic
    @Column(name = "collect_describe")
    public String getCollectDescribe() {
        return collectDescribe;
    }

    public void setCollectDescribe(String collectDescribe) {
        this.collectDescribe = collectDescribe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collect collect = (Collect) o;

        if (id != collect.id) return false;
        if (createTime != null ? !createTime.equals(collect.createTime) : collect.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(collect.updateTime) : collect.updateTime != null) return false;
        if (showFlag != null ? !showFlag.equals(collect.showFlag) : collect.showFlag != null) return false;
        if (userId != null ? !userId.equals(collect.userId) : collect.userId != null) return false;
        if (collectTitle != null ? !collectTitle.equals(collect.collectTitle) : collect.collectTitle != null)
            return false;
        if (collectDescribe != null ? !collectDescribe.equals(collect.collectDescribe) : collect.collectDescribe != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (showFlag != null ? showFlag.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (collectTitle != null ? collectTitle.hashCode() : 0);
        result = 31 * result + (collectDescribe != null ? collectDescribe.hashCode() : 0);
        return result;
    }
}
