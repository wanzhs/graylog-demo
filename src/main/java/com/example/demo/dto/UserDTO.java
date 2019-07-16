package com.example.demo.dto;

import com.example.demo.dto.group.IUserGroup;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 *
 * </p>
 *
 * @author wanzhs
 * @since 2019-07-08
 */
@Data
@Accessors(chain = true)
public class UserDTO {

    /**
     * 用户id
     */
    @NotBlank(groups = {IUserGroup.Update.class},message = "用户id不能为空")
    private String userId;
    /**
     * 用户姓名
     */
    @NotBlank(groups = {IUserGroup.Update.class,IUserGroup.Add.class},message = "用户姓名不能为空")
    private String userName;
    /**
     * 用户电话
     */
    @NotBlank(groups = {IUserGroup.Update.class,IUserGroup.Add.class},message = "用户电话不能为空")
    private String userTel;
    /**
     * 用户年龄
     */
    private Integer userAge;
}
