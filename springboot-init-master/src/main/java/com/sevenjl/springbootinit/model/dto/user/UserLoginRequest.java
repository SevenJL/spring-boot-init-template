package com.sevenjl.springbootinit.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户登录请求
 * @author # @author <a href="https://github.com/SevenJL">SevenJL</a>
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}
