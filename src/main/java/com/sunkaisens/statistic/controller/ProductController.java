package com.sunkaisens.statistic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunkaisens.statistic.modal.Student;
import com.sunkaisens.statistic.service.StudentService;

/**
 * Product controller
 */
@RestController
@RequestMapping("/student")
public class ProductController {

   @Autowired
   private StudentService studentService;

   @RequestMapping("/getAll")
   public void getStudent(){
	   List<Student> list = studentService.getList();
	   System.err.println("list的大小:"+list.size());
	   List<Student> list1 = studentService.getListByDs1();
	   System.err.println("list1的大小:"+list1.size());
	   List<Student> list2 = studentService.getListByDs2();
	   System.err.println("list2的大小:"+list2.size());
   }
}
