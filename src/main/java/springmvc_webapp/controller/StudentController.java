package springmvc_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/insert")
	public void insertData() {
		System.out.println("data inserted");
	}
	
	@RequestMapping("/delete")
	public void deleteData(){
		System.out.println("data deleted");
	}
	
	@RequestMapping("/fetch")
	public void fetchData() {
		System.out.println("data fetched");
	}

	@RequestMapping("/update")
	public void updateData() {
		System.out.println("data updated");
	}
}
