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
@Table(name = "nhanvien")
public class NhanVien implements Serializable {
    @Id
    @Column(name = "maNV")
    private String MaNV;

    @Column(name = "ten")
    private String Ten;

    @Column(name = "luong")
    private Integer Luong;
}