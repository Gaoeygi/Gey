package cn.edu.xcu.demo.service.impl;

import cn.edu.xcu.demo.entity.Book;
import cn.edu.xcu.demo.mapper.BookMapper;
import cn.edu.xcu.demo.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-03
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
