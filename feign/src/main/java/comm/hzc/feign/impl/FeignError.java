package comm.hzc.feign.impl;

import comm.hzc.entity.Student;
import comm.hzc.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中，请稍后再进行访问！！！";
    }
}
