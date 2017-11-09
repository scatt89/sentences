package com.ts.advices.domain.model;

public class Author {

    private String name;
    private String userName;

    public Author(String name, String userName) {
        if(userName == null) throw new IllegalArgumentException("userName Can't be null");

        this.name = name;
        this.userName = userName;
    }

    public String userName() {
        return this.userName;
    }

    public String name() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (name != null ? !name.equals(author.name) : author.name != null) return false;
        return userName != null ? userName.equals(author.userName) : author.userName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
