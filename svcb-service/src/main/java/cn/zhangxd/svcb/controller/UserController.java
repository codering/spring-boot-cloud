package cn.zhangxd.svcb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.zhangxd.svcb.common.ResultModel;
import cn.zhangxd.svcb.dto.UserDTO;
import cn.zhangxd.svcb.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/users")
    public ResultModel createUser(@RequestBody UserDTO userDTO) {
        userService.createUser(userDTO);
        return ResultModel.success("用户创建成功");
    }

    @PutMapping(value = "/users/{id}")
    public ResultModel createUser(@PathVariable("id") Long id,
                                  @RequestBody UserDTO userDTO) {
        userDTO.setId(id);
        userService.updateUser(userDTO);
        return ResultModel.success("用户修改成功");
    }

    @DeleteMapping(value = "/users/{id}")
    public ResultModel removeUser(@PathVariable("id") Long id) {
        userService.removeUser(id);
        return ResultModel.success("用户删除成功");
    }

    @GetMapping(value = "/users/{id}")
    public ResultModel getUser(@PathVariable("id") Long id) {
        return ResultModel.success(userService.getUser(id));
    }

    @GetMapping(value = "/users")
    public ResultModel getAllUsers() {
        return ResultModel.success(userService.findAll());
    }
}
