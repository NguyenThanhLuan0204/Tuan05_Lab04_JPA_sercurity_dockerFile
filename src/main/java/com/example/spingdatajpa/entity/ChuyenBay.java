package com.example.spingdatajpa.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "chuyenbay")
@ToString
public class ChuyenBay implements Serializable {
    @Id
    @Column(name = "MaCB", unique=true)
    private String MaCB;

    @Column(name = "gaDi")
    private String gaDi;

    @Column(name = "gaDen")
    private String gaDen;

    @Column(name = "doDai")
    private Integer doDai;

    @Column(name = "gioDi")
    private LocalDate gioDi;

    @Column(name = "gioDen")
    private LocalDate gioDen;

    @Column(name = "chiPhi")
    private Integer chiPhi;
}