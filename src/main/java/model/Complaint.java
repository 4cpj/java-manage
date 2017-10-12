package model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ye on 2017/10/12
 */
@Entity
public class Complaint {
    private long id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String complaintTitle;
    private String complaintContent;
    private Long userId;
    private Integer status;
    private Integer appraise;
    private String appraiseContent;

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
    @Column(name = "complaint_title")
    public String getComplaintTitle() {
        return complaintTitle;
    }

    public void setComplaintTitle(String complaintTitle) {
        this.complaintTitle = complaintTitle;
    }

    @Basic
    @Column(name = "complaint_content")
    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent;
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
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "appraise")
    public Integer getAppraise() {
        return appraise;
    }

    public void setAppraise(Integer appraise) {
        this.appraise = appraise;
    }

    @Basic
    @Column(name = "appraise_content")
    public String getAppraiseContent() {
        return appraiseContent;
    }

    public void setAppraiseContent(String appraiseContent) {
        this.appraiseContent = appraiseContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Complaint complaint = (Complaint) o;

        if (id != complaint.id) return false;
        if (createTime != null ? !createTime.equals(complaint.createTime) : complaint.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(complaint.updateTime) : complaint.updateTime != null) return false;
        if (complaintTitle != null ? !complaintTitle.equals(complaint.complaintTitle) : complaint.complaintTitle != null)
            return false;
        if (complaintContent != null ? !complaintContent.equals(complaint.complaintContent) : complaint.complaintContent != null)
            return false;
        if (userId != null ? !userId.equals(complaint.userId) : complaint.userId != null) return false;
        if (status != null ? !status.equals(complaint.status) : complaint.status != null) return false;
        if (appraise != null ? !appraise.equals(complaint.appraise) : complaint.appraise != null) return false;
        if (appraiseContent != null ? !appraiseContent.equals(complaint.appraiseContent) : complaint.appraiseContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (complaintTitle != null ? complaintTitle.hashCode() : 0);
        result = 31 * result + (complaintContent != null ? complaintContent.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (appraise != null ? appraise.hashCode() : 0);
        result = 31 * result + (appraiseContent != null ? appraiseContent.hashCode() : 0);
        return result;
    }
}
