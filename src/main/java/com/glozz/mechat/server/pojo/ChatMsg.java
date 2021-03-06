package com.glozz.mechat.server.pojo;

import java.io.Serializable;
import java.util.Date;

public class ChatMsg implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.id
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.chat_id
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String chatId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.send_user_id
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String sendUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.accept_user_id
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String acceptUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.sign_flag
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private Byte signFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.create_time
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.msg
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private String msg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chat_msg
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.id
     *
     * @return the value of chat_msg.id
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.id
     *
     * @param id the value for chat_msg.id
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.chat_id
     *
     * @return the value of chat_msg.chat_id
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public String getChatId() {
        return chatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.chat_id
     *
     * @param chatId the value for chat_msg.chat_id
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.send_user_id
     *
     * @return the value of chat_msg.send_user_id
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public String getSendUserId() {
        return sendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.send_user_id
     *
     * @param sendUserId the value for chat_msg.send_user_id
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.accept_user_id
     *
     * @return the value of chat_msg.accept_user_id
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public String getAcceptUserId() {
        return acceptUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.accept_user_id
     *
     * @param acceptUserId the value for chat_msg.accept_user_id
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.sign_flag
     *
     * @return the value of chat_msg.sign_flag
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public Byte getSignFlag() {
        return signFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.sign_flag
     *
     * @param signFlag the value for chat_msg.sign_flag
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void setSignFlag(Byte signFlag) {
        this.signFlag = signFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.create_time
     *
     * @return the value of chat_msg.create_time
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.create_time
     *
     * @param createTime the value for chat_msg.create_time
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.msg
     *
     * @return the value of chat_msg.msg
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.msg
     *
     * @param msg the value for chat_msg.msg
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}