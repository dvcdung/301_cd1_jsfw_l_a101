package com.crud.demofinal.controllers;

import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.demofinal.models.KhachHang;
import com.crud.demofinal.models.TiemChung;
import com.crud.demofinal.services.KhachHangService;
import com.crud.demofinal.services.TiemChungService;

@Controller
public class KhachHangController {
	@Autowired
	private KhachHangService khachHangService;
	@Autowired
	private TiemChungService tiemChungService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/cus-add")
	public String addCustomer() {
		return "cus-add";
	}
	
	@PostMapping("/cus-save")
	public String insertCustomer(@ModelAttribute KhachHang khachHang, @ModelAttribute TiemChung tiemChung) {
		khachHangService.save(khachHang);
		while(true) {
			if(khachHangService.existId(khachHang.getMaKH()))
				tiemChungService.save(tiemChung);			
				break;
		}
		
		return "index";
	}
}
