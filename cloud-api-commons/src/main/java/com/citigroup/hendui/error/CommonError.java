package com.citigroup.hendui.error;

/**
 * @author Shawn
 * @date 2020/9/12 0:09
 * @title Function
 */
public interface CommonError {
    int getErrCode();
    String getErrMsg();
    CommonError setErrMsg(String errMsg);
}
