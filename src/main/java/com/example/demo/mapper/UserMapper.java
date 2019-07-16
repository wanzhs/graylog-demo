package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author wanzhs
 * @since 2019-07-08
 */
public interface UserMapper extends BaseMapper<User> {

    int insertOrUpdate(@Param("param") User entity, @Param("tableIndex") String tableIndex);

    int deleteUser(String userId,@Param("tableIndex")String tableIndex);

    List<User> getUserList(@Param("tableIndex") String tableIndex);
}
