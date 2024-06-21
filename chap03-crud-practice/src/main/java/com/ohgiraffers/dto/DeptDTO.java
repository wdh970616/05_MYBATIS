package com.ohgiraffers.dto;

public class DeptDTO {

    private String deptCode;
    private String deptTitle;
    private String locationId;

    public DeptDTO() {
    }

    public DeptDTO(String deptCode, String deptTitle, String locationId) {
        this.deptCode = deptCode;
        this.deptTitle = deptTitle;
        this.locationId = locationId;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptTitle() {
        return deptTitle;
    }

    public void setDeptTitle(String deptTitle) {
        this.deptTitle = deptTitle;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "[부서코드 : " + deptCode + "] [부서명 : " + deptTitle + "] [지역ID : " + locationId + ']';
    }
}
