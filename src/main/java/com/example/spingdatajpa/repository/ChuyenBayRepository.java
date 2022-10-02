package com.example.spingdatajpa.repository;

import com.example.spingdatajpa.entity.ChuyenBay;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
    // 1. Cho biết các chuyến bay đi Đà Lạt (DAD)
    @Query(value = "select * from chuyenbay where GaDen ='DaD'", nativeQuery = true)
    public List<ChuyenBay> lstDad();

    // 4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn
    // 8.000km.
    @Query(value = "select * from chuyenbay where dodai > 8000 and dodai < 10000", nativeQuery = true)
    public List<ChuyenBay> lstCBBy10kand8k();

    // 5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
    @Query(value = "select * from chuyenbay where gadi = 'sgn' and gaden ='bmv'", nativeQuery = true)
    public List<ChuyenBay> lstCBBySGNToBMV();

    // 6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
    @Query(value = "select COUNT(*) as sochuyenbay from chuyenbay where gadi = 'sgn'", nativeQuery = true)
    public int lstCBBySGN();

    // 28. Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay
    // Boeing.
    @Query(value = "SELECT DISTINCT cb.* FROM CHUYENBAY cb, MAYBAY mb WHERE DoDai < TamBay AND Loai Like 'Boeing%'", nativeQuery = true)
    public List<ChuyenBay> lstCBCau28();
}
