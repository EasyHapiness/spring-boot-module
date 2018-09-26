package ya.song.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ya.song.service.UserService;

@RequestMapping("/user")
@ResponseBody
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/info")
    public Object getInfo(){

        return "hello everyBody !";
    }

    @RequestMapping("/name")
    public Object getInfoByName(){

        return userService.getInfoByName("name");
    }

    @RequestMapping("/byId")
    public Object getInfoById(Long id){

        return userService.getById(id);
    }
}
