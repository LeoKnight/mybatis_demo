package pub.leo123.mybatis_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.leo123.mybatis_demo.mapper.UserMapper;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    private UserMapper userMapper;

    public UserResource( UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @GetMapping("/all")
    public List<User> getAll() {
        return this.userMapper.findAll();
    }
}
