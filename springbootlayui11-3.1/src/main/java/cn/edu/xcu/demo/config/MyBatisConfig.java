package cn.edu.xcu.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//Spring boot方式
@Configuration
@MapperScan("cn.edu.xcu.demo.mapper")
public class MyBatisConfig {
	@Bean//配置分页拦截器
	public PaginationInterceptor paginationInterceptor() {
	PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
    // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
    // paginationInterceptor.setOverflow(false);
    // 设置最大单页限制数量，默认 500 条，-1 不受限制
    // paginationInterceptor.setLimit(500);
    return paginationInterceptor;
	}
}
