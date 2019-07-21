package com.glozz.mechat.server.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FriendsRequestExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public FriendsRequestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdIsNull() {
            addCriterion("friends_request_id is null");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdIsNotNull() {
            addCriterion("friends_request_id is not null");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdEqualTo(String value) {
            addCriterion("friends_request_id =", value, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdNotEqualTo(String value) {
            addCriterion("friends_request_id <>", value, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdGreaterThan(String value) {
            addCriterion("friends_request_id >", value, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("friends_request_id >=", value, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdLessThan(String value) {
            addCriterion("friends_request_id <", value, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdLessThanOrEqualTo(String value) {
            addCriterion("friends_request_id <=", value, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdLike(String value) {
            addCriterion("friends_request_id like", value, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdNotLike(String value) {
            addCriterion("friends_request_id not like", value, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdIn(List<String> values) {
            addCriterion("friends_request_id in", values, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdNotIn(List<String> values) {
            addCriterion("friends_request_id not in", values, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdBetween(String value1, String value2) {
            addCriterion("friends_request_id between", value1, value2, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andFriendsRequestIdNotBetween(String value1, String value2) {
            addCriterion("friends_request_id not between", value1, value2, "friendsRequestId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdIsNull() {
            addCriterion("send_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSendUserIdIsNotNull() {
            addCriterion("send_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendUserIdEqualTo(String value) {
            addCriterion("send_user_id =", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotEqualTo(String value) {
            addCriterion("send_user_id <>", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdGreaterThan(String value) {
            addCriterion("send_user_id >", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("send_user_id >=", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdLessThan(String value) {
            addCriterion("send_user_id <", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdLessThanOrEqualTo(String value) {
            addCriterion("send_user_id <=", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdLike(String value) {
            addCriterion("send_user_id like", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotLike(String value) {
            addCriterion("send_user_id not like", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdIn(List<String> values) {
            addCriterion("send_user_id in", values, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotIn(List<String> values) {
            addCriterion("send_user_id not in", values, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdBetween(String value1, String value2) {
            addCriterion("send_user_id between", value1, value2, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotBetween(String value1, String value2) {
            addCriterion("send_user_id not between", value1, value2, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdIsNull() {
            addCriterion("accept_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdIsNotNull() {
            addCriterion("accept_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdEqualTo(String value) {
            addCriterion("accept_user_id =", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotEqualTo(String value) {
            addCriterion("accept_user_id <>", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdGreaterThan(String value) {
            addCriterion("accept_user_id >", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("accept_user_id >=", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdLessThan(String value) {
            addCriterion("accept_user_id <", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdLessThanOrEqualTo(String value) {
            addCriterion("accept_user_id <=", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdLike(String value) {
            addCriterion("accept_user_id like", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotLike(String value) {
            addCriterion("accept_user_id not like", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdIn(List<String> values) {
            addCriterion("accept_user_id in", values, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotIn(List<String> values) {
            addCriterion("accept_user_id not in", values, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdBetween(String value1, String value2) {
            addCriterion("accept_user_id between", value1, value2, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotBetween(String value1, String value2) {
            addCriterion("accept_user_id not between", value1, value2, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeIsNull() {
            addCriterion("request_date_time is null");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeIsNotNull() {
            addCriterion("request_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeEqualTo(Date value) {
            addCriterion("request_date_time =", value, "requestDateTime");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeNotEqualTo(Date value) {
            addCriterion("request_date_time <>", value, "requestDateTime");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeGreaterThan(Date value) {
            addCriterion("request_date_time >", value, "requestDateTime");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("request_date_time >=", value, "requestDateTime");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeLessThan(Date value) {
            addCriterion("request_date_time <", value, "requestDateTime");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("request_date_time <=", value, "requestDateTime");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeIn(List<Date> values) {
            addCriterion("request_date_time in", values, "requestDateTime");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeNotIn(List<Date> values) {
            addCriterion("request_date_time not in", values, "requestDateTime");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeBetween(Date value1, Date value2) {
            addCriterion("request_date_time between", value1, value2, "requestDateTime");
            return (Criteria) this;
        }

        public Criteria andRequestDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("request_date_time not between", value1, value2, "requestDateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table friends_request
     *
     * @mbg.generated do_not_delete_during_merge Sat Jul 20 22:55:38 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}