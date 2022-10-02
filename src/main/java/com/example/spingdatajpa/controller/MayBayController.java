package com.example.spingdatajpa.controller;

import com.example.spingdatajpa.entity.MayBay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spingdatajpa.repository.MayBayReponsitory;

import java.util.List;

@RestController
public class MayBayController {

  @Autowired
  MayBayReponsitory mayBayReponsitory;

//   @GetMapping("/cau2")
//   public ResponseEntity<List<MayBay>> lstMaybayThan10K() {
//     return ResponseEntity.ok().body(mayBayReponsitory.lstMaybayThan10K());
//   }

  @GetMapping("/cau7")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> countMayBayLikeBoeing() {
    return ResponseEntity.ok().body(mayBayReponsitory.countMayBayLikeBoeing());
  }

  @GetMapping("/cau11")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> findMaMBUsedByNguyen() {
    return ResponseEntity.ok().body(mayBayReponsitory.findMaMBUsedByNguyen());
  }

  @GetMapping("/cau13")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> lstCBByVN280() {
    return ResponseEntity.ok().body(mayBayReponsitory.lstCBByVN280());
  }

  @GetMapping("/cau14")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> lstCBByA320() {
    return ResponseEntity.ok().body(mayBayReponsitory.lstCBByA320());
  }

  @GetMapping("/cau16")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> findPlaneHavePilot() {
    return ResponseEntity.ok().body(mayBayReponsitory.findPlaneHavePilot());
  }

  @GetMapping("/cau17")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> lstMayBayCoTamBayLonHon10000() {
    return ResponseEntity.ok().body(mayBayReponsitory.lstMayBayCoTamBayLonHon10000());
  }

  @GetMapping("/cau19")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> lstMayBayFlyBefore12h() {
    return ResponseEntity.ok().body(mayBayReponsitory.lstMayBayFlyBefore12h());
  }

  @GetMapping("/cau21")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> lstMayBayFlyInBefore12h() {
    return ResponseEntity.ok().body(mayBayReponsitory.lstMayBayFlyInBefore12h());
  }

}
