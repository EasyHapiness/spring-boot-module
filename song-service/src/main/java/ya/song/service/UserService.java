package ya.song.service;

import ya.song.entity.User;

public interface UserService {

    User getInfoByName(String name);

    User getById(Long id);
}
