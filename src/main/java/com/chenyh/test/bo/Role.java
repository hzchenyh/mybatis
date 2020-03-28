package com.chenyh.test.bo;

/**
 * @author yihui.chen@geely.com
 * @create 2020-03-27 15:31
 * @description
 */
public class Role {

    private long id;

    private String roleName;

    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
