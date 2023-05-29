package org.example;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "pets", schema = "pets", catalog = "")
public class PetsEntity {
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @jakarta.persistence.Column(name = "id", nullable = false)
    private int id;
    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "animal", nullable = true, length = 30)
    private String animal;
    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "age", nullable = true)
    private Integer age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
