package com.example.spingdatajpa.controller;

import com.example.spingdatajpa.repository.NhanVienReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NhanVienController {

    @Autowired
    NhanVienReponsitory nhanVienReponsitory;

    @GetMapping("/cau3")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> findEmpsBySalaryLT10000() {
        return ResponseEntity.ok().body(nhanVienReponsitory.findEmpsBySalaryLT10000());
    }

    @GetMapping("/cau8")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> sumOfSalaryPaidEmp() {
        return ResponseEntity.ok().body(nhanVienReponsitory.sumOfSalaryPaidEmp());
    }

    @GetMapping("/cau9")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> findPilotInBoeing() {
        return ResponseEntity.ok().body(nhanVienReponsitory.findPilotInBoeing());
    }

    @GetMapping("/cau10")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> findEmpCanFlyWith747() {
        return ResponseEntity.ok().body(nhanVienReponsitory.findEmpCanFlyWith747());
    }

    @GetMapping("/cau12")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> findNameEmpCanUseBoeAndAir() {
        return ResponseEntity.ok().body(nhanVienReponsitory.findNameEmpCanUseBoeAndAir());
    }

    @GetMapping("/cau15")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> findNameEmpUseBoeing() {
        return ResponseEntity.ok().body(nhanVienReponsitory.findNameEmpUseBoeing());
    }

    @GetMapping("/cau22")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> find3EmpCanDrive3TypeOfPlane() {
        return ResponseEntity.ok().body(nhanVienReponsitory.find3EmpCanDrive3TypeOfPlane());
    }

    @GetMapping("/cau23")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> findEmpsCau23() {
        return ResponseEntity.ok().body(nhanVienReponsitory.findEmpsCau23());
    }

    @GetMapping("/cau24")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> findEmpsCau24() {
        return ResponseEntity.ok().body(nhanVienReponsitory.findEmpsCau24());
    }

    @GetMapping("/cau25")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> findEmpsNotPilot() {
        return ResponseEntity.ok().body(nhanVienReponsitory.findEmpsNotPilot());
    }

    @GetMapping("/cau26")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> findEmpsTopSalary() {
        return ResponseEntity.ok().body(nhanVienReponsitory.findEmpsTopSalary());
    }

    @GetMapping("/cau27")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<?> sumOfSalaryPilot() {
        return ResponseEntity.ok().body(nhanVienReponsitory.sumOfSalaryPilot());
    }

}
