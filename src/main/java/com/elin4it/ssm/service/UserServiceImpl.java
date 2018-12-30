package com.elin4it.ssm.service;

import com.elin4it.ssm.mapper.UserMapper;
import com.elin4it.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 烽 on 2015/7/11.
 */
@Service
public class UserServiceImpl implements UserService {

    //User接口 此处注入UserMapper时需要在UserMapper接口上添加<span style="font-family: Arial, Helvetica, sans-serif;">@Component进行依赖注入</span>
    @Autowired
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<User> users = userMapper.selectByExample(null);

        return users;
    }
}