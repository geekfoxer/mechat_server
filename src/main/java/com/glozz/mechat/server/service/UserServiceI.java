package com.glozz.mechat.server.service;

import com.glozz.mechat.server.pojo.MechatUser;
import scala.Option;

/**
 * @author zhuji on 2019-07-20
 */

public interface UserServiceI {

    boolean queryUsernameExist(String username);

    Option<MechatUser> queryUserForLogin(String username, String password);

    Option<MechatUser> saveUser(MechatUser user);

}
