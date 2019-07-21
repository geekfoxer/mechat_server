package com.glozz.mechat.server.controller;

import com.glozz.mechat.server.pojo.MechatUser;
import com.glozz.mechat.server.pojo.vo.MechatUserVo;
import com.glozz.mechat.server.service.UserServiceI;
import com.glozz.mechat.server.utils.JSONResult;
import com.glozz.mechat.server.utils.Md5Utils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scala.Option;
import scala.runtime.AbstractFunction0;
import scala.runtime.AbstractFunction1;

/**
 * @author zhuji on 2019-07-20
 */
@RestController
@RequestMapping("u")
public class UserController {

    @Autowired
    private UserServiceI userServiceI;

    @PostMapping("/")
    public JSONResult registerOrLogin(@RequestBody MechatUser user) {
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            return JSONResult.errorMsg("用户名或密码为空");
        }
        boolean usernameExist = userServiceI.queryUsernameExist(user.getUsername());
        Option<MechatUser> forLogin = null;
        if (usernameExist) {
            //login
            forLogin = userServiceI.queryUserForLogin(user.getUsername(), Md5Utils.md5(user.getPassword()));
            if (forLogin.isEmpty()) {
                return JSONResult.errorMsg("用户名或密码错误");
            }
        } else {
            //register
            user.setNickname(user.getUsername())
                    .setFaceImg("")
                    .setFaceImgBig("")
                    .setPassword(Md5Utils.md5(user.getPassword()));
            forLogin = userServiceI.saveUser(user);
        }
        MechatUserVo userVo = forLogin.map(new AbstractFunction1<MechatUser, MechatUserVo>() {
            @Override
            public MechatUserVo apply(MechatUser u) {
                MechatUserVo vo = new MechatUserVo();
                BeanUtils.copyProperties(u, vo);
                return vo;
            }
        }).getOrElse(new AbstractFunction0<MechatUserVo>() {
            @Override
            public MechatUserVo apply() {
                return new MechatUserVo();
            }
        });
        return JSONResult.ok(userVo);
    }

}
