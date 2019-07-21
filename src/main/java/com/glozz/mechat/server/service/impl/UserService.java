package com.glozz.mechat.server.service.impl;

import com.glozz.mechat.server.idworker.Sid;
import com.glozz.mechat.server.mapper.MechatUserMapper;
import com.glozz.mechat.server.pojo.MechatUser;
import com.glozz.mechat.server.pojo.MechatUserExample;
import com.glozz.mechat.server.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scala.Option;
import scala.Some;
import scala.collection.JavaConversions;

import javax.annotation.Resource;

/**
 * @author zhuji on 2019-07-20
 */
@Service
public class UserService implements UserServiceI {

    @Resource
    private MechatUserMapper userMapper;
    @Autowired
    private Sid sid;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameExist(String username) {
        MechatUserExample userExample = new MechatUserExample();
        userExample.createCriteria().andPasswordEqualTo(username);
        return userMapper.countByExample(userExample) > 0;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Option<MechatUser> queryUserForLogin(String username, String password) {
        MechatUserExample example = new MechatUserExample();
        example.createCriteria().andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        return JavaConversions.asScalaIterator(userMapper.selectByExample(example).iterator()).toList().headOption();
    }

    @Override
    public Option<MechatUser> saveUser(MechatUser user) {
        userMapper.insert(user.setUserId(sid.nextShort()));
        return new Some<>(user);
    }
}
