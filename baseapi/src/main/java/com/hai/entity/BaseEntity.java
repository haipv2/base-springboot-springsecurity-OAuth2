package com.hai.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.time.LocalDateTime;

/**
 * Created by haipv on 3/26/2018.
 *
 * @version 1.0
 */
public class BaseEntity {
    protected LocalDateTime createat;
    protected String createby;
    protected LocalDateTime updateat;
    protected String updateby;

    @Basic
    @Column(name = "CREATEAT", nullable = true)
    public LocalDateTime getCreateat() {
        return createat;
    }

    public void setCreateat(LocalDateTime createat) {
        this.createat = createat;
    }

    @Basic
    @Column(name = "CREATEBY", nullable = true, length = 255)
    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    @Basic
    @Column(name = "UPDATEAT", nullable = true)
    public LocalDateTime getUpdateat() {
        return updateat;
    }

    public void setUpdateat(LocalDateTime updateat) {
        this.updateat = updateat;
    }

    @Basic
    @Column(name = "UPDATEBY", nullable = true, length = 255)
    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

}
