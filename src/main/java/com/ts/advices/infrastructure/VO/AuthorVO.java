package com.ts.advices.infrastructure.VO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "authors")
public class AuthorVO implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    public AuthorVO() {
    }

    public AuthorVO(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorVO authorVO = (AuthorVO) o;

        if (id != null ? !id.equals(authorVO.id) : authorVO.id != null) return false;
        return name != null ? name.equals(authorVO.name) : authorVO.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AuthorVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
