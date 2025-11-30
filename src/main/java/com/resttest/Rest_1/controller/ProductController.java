package com.resttest.Rest_1.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.resttest.Rest_1.bo.Product;

@RestController
public class ProductController {
	
	@GetMapping(value="/getDetails")
	public List<Product> getProductDetails()
	{
		
	System.out.println("Inside GetDetails Controller");
		List<Product> listProd = new ArrayList<>();
		
		
		listProd.add(new Product("Dell",101,"Dell_B"));
		listProd.add(new Product("Mac",105,"Dell_B"));
		listProd.add(new Product("Lenovo",104,"Dell_B"));
		listProd.add(new Product("Linux",103,"Dell_B"));
		listProd.add(new Product("Max",102,"Dell_B"));
		
		return listProd.stream().sorted(Comparator.comparing(Product::getPid)).collect(Collectors.toList());
	}

}
