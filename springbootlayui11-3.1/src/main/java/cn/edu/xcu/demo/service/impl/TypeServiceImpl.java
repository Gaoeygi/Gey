package cn.edu.xcu.demo.service.impl;

import cn.edu.xcu.demo.entity.Type;
import cn.edu.xcu.demo.mapper.TypeMapper;
import cn.edu.xcu.demo.service.ITypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {

}
