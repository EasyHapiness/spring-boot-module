package ya.song.mapper;

import org.apache.ibatis.annotations.Mapper;
import ya.song.entity.User;

@Mapper
public interface UserMapper {

    User selectByPrimaryKey(Long id);
}
