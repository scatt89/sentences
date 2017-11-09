package com.ts.advices.infrastructure.DTO;

public class AdviceResponseDTO {

    class Author{
        String userName;
        String name;

        public Author(String userName, String name) {
            if(userName == null) throw new IllegalArgumentException("userName can't be null");
            if(name == null) throw new IllegalArgumentException("name can't be null");

            this.userName = userName;
            this.name = name;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
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

            Author author = (Author) o;

            if (userName != null ? !userName.equals(author.userName) : author.userName != null) return false;
            return name != null ? name.equals(author.name) : author.name == null;
        }

        @Override
        public int hashCode() {
            int result = userName != null ? userName.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "userName='" + userName + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    private String id;
    private String sentence;
    private Author author;

    public AdviceResponseDTO(String id, String sentence, String userName, String name) {
        if(id == null) throw new IllegalArgumentException("id can't be null");
        if(sentence == null) throw new IllegalArgumentException("sentence can't be null");

        this.id = id;
        this.sentence = sentence;
        this.author = new Author(userName, name);
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

        AdviceResponseDTO that = (AdviceResponseDTO) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (sentence != null ? !sentence.equals(that.sentence) : that.sentence != null) return false;
        return author != null ? author.equals(that.author) : that.author == null;
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
        return "AdviceResponseDTO{" +
                "id='" + id + '\'' +
                ", sentence='" + sentence + '\'' +
                ", author=" + author +
                '}';
    }
}
