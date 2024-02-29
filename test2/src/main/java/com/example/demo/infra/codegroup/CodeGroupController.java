package com.example.demo.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService service;
	
	@RequestMapping(value = "/codeGroupXdmList")
	public String codeGroupXdmList(Model model) throws Exception {
		
//		List<CodeGroupDto> list = service.selectList();
//		model.addAttribute("list", list);
		
		model.addAttribute("list", service.selectList());
		
//		for(CodeGroupDto a : list) {
//			System.out.println(a.getName());
//		}
			
		
		return "codeGroupXdmList";
	}
	
}
