package com.example.spingdatajpa.entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "maybay")
public class MayBay implements Serializable {

    @Id
    @Column(name = "MaMB")
    private Integer MaMB;

    @Column(name = "Loai")
    private String Loai;

    @Column(name = "TamBay")
    private Integer TamBay;
}