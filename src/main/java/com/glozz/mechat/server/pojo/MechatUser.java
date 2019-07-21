package com.glozz.mechat.server.pojo;

import java.io.Serializable;

public class MechatUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mechat_user.id
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mechat_user.user_id
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mechat_user.username
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mechat_user.password
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mechat_user.face_img
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String faceImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mechat_user.face_img_big
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String faceImgBig;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mechat_user.nickname
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mechat_user.cid
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mechat_user
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public MechatUser setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public MechatUser setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MechatUser setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MechatUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFaceImg() {
        return faceImg;
    }

    public MechatUser setFaceImg(String faceImg) {
        this.faceImg = faceImg;
        return this;
    }

    public String getFaceImgBig() {
        return faceImgBig;
    }

    public MechatUser setFaceImgBig(String faceImgBig) {
        this.faceImgBig = faceImgBig;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public MechatUser setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getCid() {
        return cid;
    }

    public MechatUser setCid(String cid) {
        this.cid = cid;
        return this;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}