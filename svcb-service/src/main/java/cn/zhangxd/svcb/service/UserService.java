package cn.zhangxd.svcb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zhangxd.svcb.assembler.UserAssembler;
import cn.zhangxd.svcb.dto.UserDTO;
import cn.zhangxd.svcb.entity.User;
import cn.zhangxd.svcb.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(UserDTO userDTO) {
        User user = UserAssembler.INSTANCE.toEntity(userDTO);
        userRepository.add(user);
    }

    public void updateUser(UserDTO userDTO) {
        User user = UserAssembler.INSTANCE.toEntity(userDTO);
        userRepository.update(user);
    }

    public void removeUser(Long id) {
       User user = userRepository.get(id);
       if (user != null) {
           userRepository.delete(id);
       } else {
           // throw exception ?
       }
    }

    public UserDTO getUser(Long id) {
        User user = userRepository.get(id);
        return UserAssembler.INSTANCE.toDto(user);
    }

    public List<UserDTO> findAll() {
        return userRepository
                .listAll()
                .stream()
                .map(user -> UserAssembler.INSTANCE.toDto(user))
                .collect(Collectors.toList());
    }

}
