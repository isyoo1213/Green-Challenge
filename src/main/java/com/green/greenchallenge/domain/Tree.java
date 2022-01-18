package com.green.greenchallenge.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Tree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long treeId;
    private long challengeId;
    private String treeName;
    private String treeImg;
}
