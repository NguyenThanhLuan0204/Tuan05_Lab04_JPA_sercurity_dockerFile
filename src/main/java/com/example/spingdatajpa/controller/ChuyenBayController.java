package com.example.spingdatajpa.controller;

import com.example.spingdatajpa.entity.ChuyenBay;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.spingdatajpa.repository.ChuyenBayRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChuyenBayController {

  @Autowired
  ChuyenBayRepository chuyenBayRepository;

  @GetMapping("/cau2")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<List<ChuyenBay>> getChuyenBayDiDaLat() {
    return new ResponseEntity<List<ChuyenBay>>(chuyenBayRepository.lstDad(), HttpStatus.OK);
  }

  @GetMapping("/cau4")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public List<ChuyenBay> getCBBy10Kand8k() {
    return chuyenBayRepository.lstCBBy10kand8k();
  }

  @GetMapping("/cau5")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public List<ChuyenBay> lstCBBySGNToBMV() {
    return chuyenBayRepository.lstCBBySGNToBMV();
  }

  @GetMapping("/cau6")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> lstCBBySGN() {
    int soChyenBay = chuyenBayRepository.lstCBBySGN();
    return ResponseEntity.ok().body(soChyenBay);
  }

  @GetMapping("/cau28")
  @PreAuthorize("hasAnyAuthority('USER_READ')")
  public ResponseEntity<?> lstCBCau28() {
    return ResponseEntity.ok().body(chuyenBayRepository.lstCBCau28());
  }

}
