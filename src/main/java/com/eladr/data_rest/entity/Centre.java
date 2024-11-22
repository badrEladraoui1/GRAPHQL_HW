package com.eladr.data_rest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "centre")
public class Centre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nomCentre;
    private String address;

    @OneToMany(mappedBy = "centre")
    private List<Student> students;

    public Centre(Integer id, String nomCentre, String address) {
        this.id = id;
        this.nomCentre = nomCentre;
        this.address = address;
    }
}
