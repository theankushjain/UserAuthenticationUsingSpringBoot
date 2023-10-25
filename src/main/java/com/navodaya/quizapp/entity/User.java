package com.navodaya.quizapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity   //specified that the class in mapped to a db table
@Table(name="users") //Name of DB Table that the Class is mapped to
public class User
{
    private static final long serialVersionUID = 1L;

    @Id  //Primary Key for DB Table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //primary key value to be auto generated
    private Long id;

    @Column(nullable=false) //field cannot be null
    private String name;

    @Column(nullable=false, unique=true)
    private String email;

    @Column(nullable=false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL) //relation bw user and role is many-to-many
    @JoinTable(  //specifies name of join table and foreign keys for join table
            name="users_roles",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
    private List<Role> roles = new ArrayList<>();

}