package ru.miit.kisproject.model;

/**
 * Table: student2
 */
public class Student2 {
    /**
     * Column: ID
     * Type: int4
     */
    private Integer id;

    /**
     * Column: Name
     * Type: varchar(2147483647)
     */
    private String name;

    /**
     * Column: SurName
     * Type: varchar(2147483647)
     */
    private String surname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }
}