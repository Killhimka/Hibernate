package ru.javabegin.hibernate.entity;

import java.util.Objects;

@jakarta.persistence.Entity
public class Pets {
    private int id;
    private String animal;
    private Integer age;

    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @jakarta.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "animal", nullable = true, length = 30)
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "age", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pets pets = (Pets) o;
        return id == pets.id && Objects.equals(animal, pets.animal) && Objects.equals(age, pets.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, animal, age);
    }
}
