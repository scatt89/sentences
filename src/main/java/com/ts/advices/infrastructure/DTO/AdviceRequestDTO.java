package com.ts.advices.infrastructure.DTO;

public class AdviceRequestDTO {

    private String userName;
    private String sentence;

    public AdviceRequestDTO() {
    }

    public AdviceRequestDTO(String userName, String sentence) {
        this.userName = userName;
        this.sentence = sentence;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

        AdviceRequestDTO adviceRequestDTO = (AdviceRequestDTO) o;

        if (userName != null ? !userName.equals(adviceRequestDTO.userName) : adviceRequestDTO.userName != null) return false;
        return sentence != null ? sentence.equals(adviceRequestDTO.sentence) : adviceRequestDTO.sentence == null;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (sentence != null ? sentence.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AdviceRequestDTO{" +
                "userName='" + userName + '\'' +
                ", sentence='" + sentence + '\'' +
                '}';
    }
}
