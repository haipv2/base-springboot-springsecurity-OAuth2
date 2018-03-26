package com.hai.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by haipv on 3/26/2018.
 *
 * @version 1.0
 */
@Entity
@Table(name = "BASE_USER", catalog = "")
public class BaseUser extends BaseEntity{
    private Long id;
    private String userName;
    private String password;
    private Set<BaseRole> roles;

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "BASE_USER_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Getter
    @Setter
    @Column(name = "ID")
    @Access(AccessType.PROPERTY)
    @NotFound(action = NotFoundAction.IGNORE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = false, length = 255)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "base_user_role_ref", joinColumns
            = @JoinColumn(name = "user_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id",
                    referencedColumnName = "id"))
    public Set<BaseRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<BaseRole> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseUser bdrUser = (BaseUser) o;

        if (id != null ? !id.equals(bdrUser.id) : bdrUser.id != null) return false;
        if (userName != null ? !userName.equals(bdrUser.userName) : bdrUser.userName != null) return false;
        if (password != null ? !password.equals(bdrUser.password) : bdrUser.password != null) return false;
        if (createat != null ? !createat.equals(bdrUser.createat) : bdrUser.createat != null) return false;
        if (createby != null ? !createby.equals(bdrUser.createby) : bdrUser.createby != null) return false;
        if (updateat != null ? !updateat.equals(bdrUser.updateat) : bdrUser.updateat != null) return false;
        if (updateby != null ? !updateby.equals(bdrUser.updateby) : bdrUser.updateby != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (createat != null ? createat.hashCode() : 0);
        result = 31 * result + (createby != null ? createby.hashCode() : 0);
        result = 31 * result + (updateat != null ? updateat.hashCode() : 0);
        result = 31 * result + (updateby != null ? updateby.hashCode() : 0);
        return result;
    }
}
