package com.api.FeignApplication2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PrintTable {
	@GetMapping("/table/{num}")
	public List<String> printTable(@PathVariable("num") int num) {
		List<String> tableList = new ArrayList<String>();
		for(int i= 1; i<=10;i++) {
			tableList.add(num+" * "+i+" = "+(num*i));
		}
		return tableList;
	}
}
