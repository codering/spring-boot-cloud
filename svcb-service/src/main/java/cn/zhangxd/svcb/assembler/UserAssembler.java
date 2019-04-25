package cn.zhangxd.svcb.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cn.zhangxd.svcb.dto.UserDTO;
import cn.zhangxd.svcb.entity.User;

/**
 * 对象转换
 */
@Mapper
public interface UserAssembler {

    UserAssembler INSTANCE = Mappers.getMapper(UserAssembler.class);

    UserDTO toDto(User user);

    User toEntity(UserDTO userDTO);
}
