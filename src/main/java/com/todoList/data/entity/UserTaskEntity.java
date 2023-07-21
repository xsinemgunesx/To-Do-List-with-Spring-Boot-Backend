package com.todoList.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "USERTASK")
public class UserTaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
}
