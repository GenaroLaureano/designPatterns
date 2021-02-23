/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.List;

/**
 *
 * @author laure
 */
public class User {
    
    private int id;
    private String name;
    private String lastName;
    private int age;
    private int phone;
    private String profession;
    private List<String> tags;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
//
//    @Override
//    public String toString() {
//        return "User{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone + ", profession=" + profession + ", tags=" + tags + '}';
//    }

    
    
    
    
}
