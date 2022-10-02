package com.example.spingdatajpa;

import com.example.spingdatajpa.repository.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpingDataJpaApplicationTests {

    @Autowired
    ChuyenBayRepository chuyenBayRepository;
    @Autowired
    MayBayReponsitory mayBayReponsitory;
    @Autowired
    NhanVienReponsitory nhanVienReponsitory;

    @Test
    void cau1DaD() {
        chuyenBayRepository.lstDad()
                .forEach(e -> {
                    System.out.println(e.toString());
                });
    }

    @Test
    void cau2MayBay() {
        mayBayReponsitory.lstMaybayThan10K().forEach(System.out::println);
    }

    @Test
    void cau3NhanVien() {
        nhanVienReponsitory.findEmpsBySalaryLT10000().forEach(System.out::println);
    }

    @Test
    void cau4ChuyenBay() {
        chuyenBayRepository.lstCBBy10kand8k().forEach(System.out::println);
    }

    @Test
    void cau5ChuyenBay() {
        chuyenBayRepository.lstCBBySGNToBMV().forEach(System.out::println);
    }

    @Test
    void cau6ChuyenBay() {
        System.out.println("so chuyen bay : " + chuyenBayRepository.lstCBBySGN());
    }

    @Test
    void cau7MayBay() {
        System.out.println("so maybay boeing : " + mayBayReponsitory.countMayBayLikeBoeing());
    }

    @Test
    void cau8NhanVien() {
        System.out.println("so lương của nhân viên : " + nhanVienReponsitory.sumOfSalaryPaidEmp());
    }

    @Test
    void cau9NhanVien() {
        nhanVienReponsitory.findPilotInBoeing().forEach(e -> System.out.println(e));
    }

    @Test
    void cau10NhanVien() {
        nhanVienReponsitory.findEmpCanFlyWith747().forEach(System.out::println);
    }

    @Test
    void cau11MayBay() {
        mayBayReponsitory.findMaMBUsedByNguyen().forEach(e -> System.out.println(e));
    }

    @Test
    void cau12NhanVien() {
        mayBayReponsitory.findMaMBUsedByNguyen().forEach(e -> System.out.println(e));
    }

    @Test
    void cau13ChuyenBay() {
        mayBayReponsitory.lstCBByVN280().forEach(System.out::println);
    }

    @Test
    void cau14ChuyenBay() {
        mayBayReponsitory.lstCBByA320().forEach(System.out::println);
    }

    @Test
    void cau15NhanVien() {
        nhanVienReponsitory.findNameEmpUseBoeing().forEach(e -> System.out.println(e));
    }

    @Test
    void cau16MayBay() {
        mayBayReponsitory.findPlaneHavePilot().forEach(e -> System.out.println(e));
    }

    @Test
    void cau17MayBay() {
        mayBayReponsitory.lstMayBayCoTamBayLonHon10000().forEach(e -> System.out.println(e));
    }

    @Test
    void cau19MayBay() {
        System.out.println(mayBayReponsitory.lstMayBayFlyBefore12h());
    }

    @Test
    void cau21MayBay() {
        mayBayReponsitory.lstMayBayFlyInBefore12h().forEach(System.out::println);
    }

    @Test
    void cau22NhanVien() {
        nhanVienReponsitory.find3EmpCanDrive3TypeOfPlane().forEach(System.out::println);
    }

    @Test
    void cau23NhanVien() {
        nhanVienReponsitory.findEmpsCau23().forEach(System.out::println);
    }

    @Test
    void cau24NhanVien() {
        nhanVienReponsitory.findEmpsCau24().forEach(System.out::println);
    }

    @Test
    void cau25NhanVien() {
        nhanVienReponsitory.findEmpsNotPilot().forEach(System.out::println);
    }

    @Test
    void cau26NhanVien() {
        nhanVienReponsitory.findEmpsTopSalary().forEach(System.out::println);
    }

    @Test
    void cau27NhanVien() {
        System.out.println("Số lương phải trả cho các phi công" + nhanVienReponsitory.sumOfSalaryPilot());
    }

    @Test
    void cau28NhanVien() {
        chuyenBayRepository.lstCBCau28().forEach(System.out::println);
    }
}
