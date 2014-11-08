package simples.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import simples.bean.SimpleBean;
import simples.service.SimpleService;

@Controller
public class SimpleController {
	
	@Autowired
	private SimpleService simpleService;
	
	@RequestMapping("/save")
	public String save(ModelMap modelMap){
		System.out.println("SimpleController.save()");
		SimpleBean bean = new SimpleBean();
		bean.setName("bean111");
		bean.setRemark("bean1");
		simpleService.save(bean);
		modelMap.addAttribute("result", "保存成功");
		return "index";
	}
	@RequestMapping("/update")
	public String update(ModelMap modelMap){
		System.out.println("SimpleController.update()");
		SimpleBean bean = simpleService.get(1L);
		bean.setName("simple1");
		bean.setRemark("simple2");
		simpleService.update(bean);
		modelMap.addAttribute("result", "更新成功");
		return "index";
	}
	@RequestMapping("/delete")
	public String delete(ModelMap modelMap){
		System.out.println("SimpleController.delete()");
		simpleService.delete(1L);
		modelMap.addAttribute("result", "删除成功");
		return "index";
	}
	@RequestMapping("/get")
	public String get(ModelMap modelMap){
		System.out.println("SimpleController.get()");
		SimpleBean bean = simpleService.get(1L);
		modelMap.addAttribute("result", bean);
		return "index";
	}
}
