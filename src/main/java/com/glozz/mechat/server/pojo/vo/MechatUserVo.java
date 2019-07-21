package com.glozz.mechat.server.pojo.vo;

public class MechatUserVo {
    private String userId;

    private String username;

    private String faceImg;

    private String faceImgBig;

    private String nickname;

    public String getUserId() {
        return userId;
    }

    public MechatUserVo setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MechatUserVo setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFaceImg() {
        return faceImg;
    }

    public MechatUserVo setFaceImg(String faceImg) {
        this.faceImg = faceImg;
        return this;
    }

    public String getFaceImgBig() {
        return faceImgBig;
    }

    public MechatUserVo setFaceImgBig(String faceImgBig) {
        this.faceImgBig = faceImgBig;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public MechatUserVo setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
}