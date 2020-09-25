package com.jyyy.isip.app.api.company.model;

import java.io.Serializable;

public class BaseInfo implements Serializable {
    private String statDate;

    private String statTime;

    private String regNo;

    private String uniscId;

    private String regState;

    private String regStateCn;

    private String entType;

    private String entTypeCn;

    private String regCap;

    private String regCapcurCn;

    private String name;

    private String industryPhy;

    private String busExceptCount;

    private String illCount;

    private String nodeNum;

    private String opFrom;

    private String opTo;

    private String regOrg;

    private String estDate;

    private String apprDate;

    private String revDate;

    private String id;

    private String entName;

    private String dom;

    private String opScope;

    private String regOrgCn;

    private String historyName;

    private static final long serialVersionUID = 1L;

    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate == null ? null : statDate.trim();
    }

    public String getStatTime() {
        return statTime;
    }

    public void setStatTime(String statTime) {
        this.statTime = statTime == null ? null : statTime.trim();
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo == null ? null : regNo.trim();
    }

    public String getUniscId() {
        return uniscId;
    }

    public void setUniscId(String uniscId) {
        this.uniscId = uniscId == null ? null : uniscId.trim();
    }

    public String getRegState() {
        return regState;
    }

    public void setRegState(String regState) {
        this.regState = regState == null ? null : regState.trim();
    }

    public String getRegStateCn() {
        return regStateCn;
    }

    public void setRegStateCn(String regStateCn) {
        this.regStateCn = regStateCn == null ? null : regStateCn.trim();
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType == null ? null : entType.trim();
    }

    public String getEntTypeCn() {
        return entTypeCn;
    }

    public void setEntTypeCn(String entTypeCn) {
        this.entTypeCn = entTypeCn == null ? null : entTypeCn.trim();
    }

    public String getRegCap() {
        return regCap;
    }

    public void setRegCap(String regCap) {
        this.regCap = regCap == null ? null : regCap.trim();
    }

    public String getRegCapcurCn() {
        return regCapcurCn;
    }

    public void setRegCapcurCn(String regCapcurCn) {
        this.regCapcurCn = regCapcurCn == null ? null : regCapcurCn.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIndustryPhy() {
        return industryPhy;
    }

    public void setIndustryPhy(String industryPhy) {
        this.industryPhy = industryPhy == null ? null : industryPhy.trim();
    }

    public String getBusExceptCount() {
        return busExceptCount;
    }

    public void setBusExceptCount(String busExceptCount) {
        this.busExceptCount = busExceptCount == null ? null : busExceptCount.trim();
    }

    public String getIllCount() {
        return illCount;
    }

    public void setIllCount(String illCount) {
        this.illCount = illCount == null ? null : illCount.trim();
    }

    public String getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(String nodeNum) {
        this.nodeNum = nodeNum == null ? null : nodeNum.trim();
    }

    public String getOpFrom() {
        return opFrom;
    }

    public void setOpFrom(String opFrom) {
        this.opFrom = opFrom == null ? null : opFrom.trim();
    }

    public String getOpTo() {
        return opTo;
    }

    public void setOpTo(String opTo) {
        this.opTo = opTo == null ? null : opTo.trim();
    }

    public String getRegOrg() {
        return regOrg;
    }

    public void setRegOrg(String regOrg) {
        this.regOrg = regOrg == null ? null : regOrg.trim();
    }

    public String getEstDate() {
        return estDate;
    }

    public void setEstDate(String estDate) {
        this.estDate = estDate == null ? null : estDate.trim();
    }

    public String getApprDate() {
        return apprDate;
    }

    public void setApprDate(String apprDate) {
        this.apprDate = apprDate == null ? null : apprDate.trim();
    }

    public String getRevDate() {
        return revDate;
    }

    public void setRevDate(String revDate) {
        this.revDate = revDate == null ? null : revDate.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName == null ? null : entName.trim();
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom == null ? null : dom.trim();
    }

    public String getOpScope() {
        return opScope;
    }

    public void setOpScope(String opScope) {
        this.opScope = opScope == null ? null : opScope.trim();
    }

    public String getRegOrgCn() {
        return regOrgCn;
    }

    public void setRegOrgCn(String regOrgCn) {
        this.regOrgCn = regOrgCn == null ? null : regOrgCn.trim();
    }

    public String getHistoryName() {
        return historyName;
    }

    public void setHistoryName(String historyName) {
        this.historyName = historyName == null ? null : historyName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", statDate=").append(statDate);
        sb.append(", statTime=").append(statTime);
        sb.append(", regNo=").append(regNo);
        sb.append(", uniscId=").append(uniscId);
        sb.append(", regState=").append(regState);
        sb.append(", regStateCn=").append(regStateCn);
        sb.append(", entType=").append(entType);
        sb.append(", entTypeCn=").append(entTypeCn);
        sb.append(", regCap=").append(regCap);
        sb.append(", regCapcurCn=").append(regCapcurCn);
        sb.append(", name=").append(name);
        sb.append(", industryPhy=").append(industryPhy);
        sb.append(", busExceptCount=").append(busExceptCount);
        sb.append(", illCount=").append(illCount);
        sb.append(", nodeNum=").append(nodeNum);
        sb.append(", opFrom=").append(opFrom);
        sb.append(", opTo=").append(opTo);
        sb.append(", regOrg=").append(regOrg);
        sb.append(", estDate=").append(estDate);
        sb.append(", apprDate=").append(apprDate);
        sb.append(", revDate=").append(revDate);
        sb.append(", id=").append(id);
        sb.append(", entName=").append(entName);
        sb.append(", dom=").append(dom);
        sb.append(", opScope=").append(opScope);
        sb.append(", regOrgCn=").append(regOrgCn);
        sb.append(", historyName=").append(historyName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}