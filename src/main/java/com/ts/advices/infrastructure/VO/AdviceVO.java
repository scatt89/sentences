package com.ts.advices.infrastructure.VO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "advices")
public class AdviceVO implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
    @ManyToOne(targetEntity = AuthorVO.class)
	private AuthorVO author;
	
	@Column(name="sentence", nullable = false)
	private String sentence;

    public AdviceVO() {
    }

    public AdviceVO(AuthorVO author, String sentence) {
        this.author = author;
        this.sentence = sentence;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuthorVO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorVO author) {
        this.author = author;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdviceVO adviceVO = (AdviceVO) o;

        if (id != null ? !id.equals(adviceVO.id) : adviceVO.id != null) return false;
        if (author != null ? !author.equals(adviceVO.author) : adviceVO.author != null) return false;
        return sentence != null ? sentence.equals(adviceVO.sentence) : adviceVO.sentence == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (sentence != null ? sentence.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AdviceVO{" +
                "id=" + id +
                ", author=" + author +
                ", sentence='" + sentence + '\'' +
                '}';
    }
}
