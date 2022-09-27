package com.ugi.PJRO.entity;

import com.ugi.PJRO.Enum.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public User(String name, Role role, String email){
        this.name=name;
        this.role=role;
        this.email=email;
    }

    public String getRoleKey(){
        return this.role.getKey();
    }
}
