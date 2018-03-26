package com.hai.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
/**
 * Created by haipv on 3/26/2018.
 *
 * @version 1.0
 */
@Entity
@Table(name= "BASE_ROLE")
public class BaseRole {
    private Long id;
    private String roleName;
    private String description;

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "BASE_ROLE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Getter
    @Setter
    @Column(name = "ID")
    @NotFound(action = NotFoundAction.IGNORE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ROLE_NAME", nullable = false, length = 255)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseRole bdrRole = (BaseRole) o;

        if (id != null ? !id.equals(bdrRole.id) : bdrRole.id != null) return false;
        if (roleName != null ? !roleName.equals(bdrRole.roleName) : bdrRole.roleName != null) return false;
        if (description != null ? !description.equals(bdrRole.description) : bdrRole.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
