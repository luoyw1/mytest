package cn.itcast.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
	/** 查询得到数据 */
	@GetMapping("/item")
	//@ResponseBody
	public String item(Model model) {
		/** 添加响应数据 */
		model.addAttribute("itemArr", new String[]{"iphone7手机","华为手机","小米手机"});
		
		/** 返回视图 */
		return "item";
	}
}
