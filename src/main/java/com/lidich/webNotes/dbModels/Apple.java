package com.lidich.webNotes.dbModels;

import jakarta.persistence.*;

@Entity
@Table(name = "apples")
public class Apple {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "apples_id_seq")
    @SequenceGenerator(name = "apples_id_seq", sequenceName = "apples_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "value")
    private int value;

    public Apple() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
