package cn.zhangxd.svcb.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.zhangxd.svcb.entity.User;

@Repository
public interface UserRepository {

    void add(User user);

    void update(User user);

    void delete(@Param("id") Long id);

    User get(@Param("id") Long id);

    @Select("select * from user")
    List<User> listAll();
}
