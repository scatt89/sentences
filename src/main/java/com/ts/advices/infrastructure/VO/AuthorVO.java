package com.ts.advices.infrastructure.VO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "authors")
public class AuthorVO implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="USERNAME", nullable = false)
    private String userName;

    public AuthorVO() {
    }

    public AuthorVO(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    public AuthorVO(String userName) {
        this(null, userName);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorVO authorVO = (AuthorVO) o;

        if (id != null ? !id.equals(authorVO.id) : authorVO.id != null) return false;
        if (name != null ? !name.equals(authorVO.name) : authorVO.name != null) return false;
        return userName != null ? userName.equals(authorVO.userName) : authorVO.userName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AuthorVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
