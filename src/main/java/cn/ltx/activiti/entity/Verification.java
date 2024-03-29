package cn.ltx.activiti.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="T_VERIFICATION")
public class Verification implements Serializable {
    private Long vfId;
    private String name;
    private String reason;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long getVfId() {
        return vfId;
    }

    public void setVfId(Long vfId) {
        this.vfId = vfId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Verification{" +
                "vfId=" + vfId +
                ", name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
