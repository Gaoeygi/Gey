package cn.edu.xcu.demo.service.impl;

import cn.edu.xcu.demo.entity.User;
import cn.edu.xcu.demo.mapper.UserMapper;
import cn.edu.xcu.demo.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
