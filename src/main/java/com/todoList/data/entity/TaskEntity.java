package com.todoList.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "TASK")
public class TaskEntity { // veri modelleri biz oluştururuz
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
