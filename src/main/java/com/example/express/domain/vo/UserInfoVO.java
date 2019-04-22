package com.example.express.domain.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息VO
 * @author xiangsheng.wu
 * @date 2019年04月22日 13:05
 */
@Data
@Builder
public class UserInfoVO implements Serializable {
    private String username;

    private String sex;

    private String tel;
    /**
     * 学校名
     */
    private String school;

    private String studentIdCard;

    private String role;

    private String star;

    private String idCard;

    private String realName;
}
