package cn.edu.xcu.demo.controller;
///我添加的注释
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.edu.xcu.demo.entity.Book;
import cn.edu.xcu.demo.service.IBookService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-11-03
 */
@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private IBookService iBookService;

	@RequestMapping("/list")
	@ResponseBody // 返回数据给客户端
	public IPage<Book> list(@RequestParam(defaultValue = "1", required = false) int page,
			@RequestParam(defaultValue = "2", required = false) int limit) {
		// 告诉要查询那一页以及查询提交
		IPage<Book> toWhichPage = new Page<Book>(page, limit);
		QueryWrapper<Book> wrapper = new QueryWrapper<>();// 构建查询条
		/*
		 * wrapper.gt("id", 1); wrapper.like("name","文");//查询条件id>1且name中包含‘文’
		 * IPage<Type> resultPage=bookServiceImpl.page(toWhichPage,wrapper);
		 */

		IPage<Book> resultPage = iBookService.page(toWhichPage, wrapper);
		return resultPage;
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Map<String, Object> delete(Integer id) {
		boolean result = iBookService.removeById(id);
		Map<String, Object> ret = new HashMap<>();
		if (result) {
			ret.put("code", 1);
			ret.put("msg", "删除成功");
		} else {
			ret.put("code", -1);
			ret.put("msg", "删除失败");
		}
		return ret;
	}
}
