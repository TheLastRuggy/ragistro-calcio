package com.elis.registrocalcio.dto;

import com.elis.registrocalcio.model.general.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    public String username;
    public String name;
    public String surname;
    public String password;
    public String role;
    public String email;
    public Boolean isActive;
    public Boolean newsLetter;

    public UserDTO() {
    }

    public UserDTO(String username, String name, String surname, String password, String role) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.role = role;
    }

    public UserDTO(User user) {
        setFields(user);
    }

    public UserDTO(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getNewsLetter() {
        return newsLetter;
    }

    public void setNewsLetter(Boolean newsLetter) {
        this.newsLetter = newsLetter;
    }

    public void setFields(User user) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.username = user.getUsername();
        this.role = user.getRole().toString();
        this.email = user.getEmail();
        this.isActive = user.getActive();
    }

    public UserDTO withoutPassword(){
        this.setPassword(null);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("username", username)
                .append("name", name)
                .append("surname", surname)
                .append("password", password)
                .append("role", role)
                .toString();
    }

}
