/**
 * Copyright  2017  Pemass
 * All Right Reserved.
 */
package com.eljob.lite.domain;

import com.biloba.common.domain.BaseDomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description: User
 * @Author: estn.zuo
 * @CreateTime: 2017-05-04 20:52
 */
@Entity
@Table(name = "sys_user")
public class User extends BaseDomain {

    @Column(name = "username", nullable = false, length = 50, unique = true)
    private String username; //用户名

    @Column(name = "nickname", length = 50)
    private String nickname; //昵称

    @Column(name = "avatar", length = 200)
    private String avatar; //头像

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
