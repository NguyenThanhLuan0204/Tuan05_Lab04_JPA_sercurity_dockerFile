package com.example.spingdatajpa.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.io.Serializable;

//@Embeddable
public class ChungNhanID implements Serializable {
    @Basic(optional = false)
    @Column(name = "MaNV")
    private String MaNV;

    @Basic(optional = false)
    @Column(name = "MaMB")
    private Integer MaMB;
}