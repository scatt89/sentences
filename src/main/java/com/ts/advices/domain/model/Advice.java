package com.ts.advices.domain.model;

public class Advice {

    private String id;
    private String sentence;
    private Author author;

    public Advice(String id, String sentence, Author author) {
        this.id = id;
        this.sentence = sentence;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advice advice = (Advice) o;

        if (id != null ? !id.equals(advice.id) : advice.id != null) return false;
        if (sentence != null ? !sentence.equals(advice.sentence) : advice.sentence != null) return false;
        return author != null ? author.equals(advice.author) : advice.author == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (sentence != null ? sentence.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Advice{" +
                "id='" + id + '\'' +
                ", sentence='" + sentence + '\'' +
                ", author=" + author +
                '}';
    }
}
