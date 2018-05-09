package com.admin.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDescrIsNull() {
            addCriterion("descr is null");
            return (Criteria) this;
        }

        public Criteria andDescrIsNotNull() {
            addCriterion("descr is not null");
            return (Criteria) this;
        }

        public Criteria andDescrEqualTo(String value) {
            addCriterion("descr =", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotEqualTo(String value) {
            addCriterion("descr <>", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThan(String value) {
            addCriterion("descr >", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThanOrEqualTo(String value) {
            addCriterion("descr >=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThan(String value) {
            addCriterion("descr <", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThanOrEqualTo(String value) {
            addCriterion("descr <=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLike(String value) {
            addCriterion("descr like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotLike(String value) {
            addCriterion("descr not like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrIn(List<String> values) {
            addCriterion("descr in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotIn(List<String> values) {
            addCriterion("descr not in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrBetween(String value1, String value2) {
            addCriterion("descr between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotBetween(String value1, String value2) {
            addCriterion("descr not between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andParamExamIsNull() {
            addCriterion("param_exam is null");
            return (Criteria) this;
        }

        public Criteria andParamExamIsNotNull() {
            addCriterion("param_exam is not null");
            return (Criteria) this;
        }

        public Criteria andParamExamEqualTo(String value) {
            addCriterion("param_exam =", value, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamNotEqualTo(String value) {
            addCriterion("param_exam <>", value, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamGreaterThan(String value) {
            addCriterion("param_exam >", value, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamGreaterThanOrEqualTo(String value) {
            addCriterion("param_exam >=", value, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamLessThan(String value) {
            addCriterion("param_exam <", value, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamLessThanOrEqualTo(String value) {
            addCriterion("param_exam <=", value, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamLike(String value) {
            addCriterion("param_exam like", value, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamNotLike(String value) {
            addCriterion("param_exam not like", value, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamIn(List<String> values) {
            addCriterion("param_exam in", values, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamNotIn(List<String> values) {
            addCriterion("param_exam not in", values, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamBetween(String value1, String value2) {
            addCriterion("param_exam between", value1, value2, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExamNotBetween(String value1, String value2) {
            addCriterion("param_exam not between", value1, value2, "paramExam");
            return (Criteria) this;
        }

        public Criteria andParamExplIsNull() {
            addCriterion("param_expl is null");
            return (Criteria) this;
        }

        public Criteria andParamExplIsNotNull() {
            addCriterion("param_expl is not null");
            return (Criteria) this;
        }

        public Criteria andParamExplEqualTo(String value) {
            addCriterion("param_expl =", value, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplNotEqualTo(String value) {
            addCriterion("param_expl <>", value, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplGreaterThan(String value) {
            addCriterion("param_expl >", value, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplGreaterThanOrEqualTo(String value) {
            addCriterion("param_expl >=", value, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplLessThan(String value) {
            addCriterion("param_expl <", value, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplLessThanOrEqualTo(String value) {
            addCriterion("param_expl <=", value, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplLike(String value) {
            addCriterion("param_expl like", value, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplNotLike(String value) {
            addCriterion("param_expl not like", value, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplIn(List<String> values) {
            addCriterion("param_expl in", values, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplNotIn(List<String> values) {
            addCriterion("param_expl not in", values, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplBetween(String value1, String value2) {
            addCriterion("param_expl between", value1, value2, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andParamExplNotBetween(String value1, String value2) {
            addCriterion("param_expl not between", value1, value2, "paramExpl");
            return (Criteria) this;
        }

        public Criteria andResultExamIsNull() {
            addCriterion("result_exam is null");
            return (Criteria) this;
        }

        public Criteria andResultExamIsNotNull() {
            addCriterion("result_exam is not null");
            return (Criteria) this;
        }

        public Criteria andResultExamEqualTo(String value) {
            addCriterion("result_exam =", value, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamNotEqualTo(String value) {
            addCriterion("result_exam <>", value, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamGreaterThan(String value) {
            addCriterion("result_exam >", value, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamGreaterThanOrEqualTo(String value) {
            addCriterion("result_exam >=", value, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamLessThan(String value) {
            addCriterion("result_exam <", value, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamLessThanOrEqualTo(String value) {
            addCriterion("result_exam <=", value, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamLike(String value) {
            addCriterion("result_exam like", value, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamNotLike(String value) {
            addCriterion("result_exam not like", value, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamIn(List<String> values) {
            addCriterion("result_exam in", values, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamNotIn(List<String> values) {
            addCriterion("result_exam not in", values, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamBetween(String value1, String value2) {
            addCriterion("result_exam between", value1, value2, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExamNotBetween(String value1, String value2) {
            addCriterion("result_exam not between", value1, value2, "resultExam");
            return (Criteria) this;
        }

        public Criteria andResultExplIsNull() {
            addCriterion("result_expl is null");
            return (Criteria) this;
        }

        public Criteria andResultExplIsNotNull() {
            addCriterion("result_expl is not null");
            return (Criteria) this;
        }

        public Criteria andResultExplEqualTo(String value) {
            addCriterion("result_expl =", value, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplNotEqualTo(String value) {
            addCriterion("result_expl <>", value, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplGreaterThan(String value) {
            addCriterion("result_expl >", value, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplGreaterThanOrEqualTo(String value) {
            addCriterion("result_expl >=", value, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplLessThan(String value) {
            addCriterion("result_expl <", value, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplLessThanOrEqualTo(String value) {
            addCriterion("result_expl <=", value, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplLike(String value) {
            addCriterion("result_expl like", value, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplNotLike(String value) {
            addCriterion("result_expl not like", value, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplIn(List<String> values) {
            addCriterion("result_expl in", values, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplNotIn(List<String> values) {
            addCriterion("result_expl not in", values, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplBetween(String value1, String value2) {
            addCriterion("result_expl between", value1, value2, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andResultExplNotBetween(String value1, String value2) {
            addCriterion("result_expl not between", value1, value2, "resultExpl");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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