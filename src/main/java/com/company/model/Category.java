package com.company.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private Integer idCategory;
    private String name;

    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idCategory; //camelCase lowerCamelCase | snake id_category

    @Column(nullable = false, length = 50)
    private String name;*/

    /*
    @Column(nullable = false, length = 50)
    private String description;

    @Column(nullable = false)
    private boolean enabled;*/
}
