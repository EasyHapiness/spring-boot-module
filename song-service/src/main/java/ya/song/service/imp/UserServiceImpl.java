package ya.song.service.imp;

import org.springframework.stereotype.Service;
import ya.song.entity.User;
import ya.song.mapper.UserMapper;
import ya.song.service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getInfoByName(String name) {
        User user = new User();
        user.setName("hello yinYaSong");
        return  user;
    }

    @Override
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
