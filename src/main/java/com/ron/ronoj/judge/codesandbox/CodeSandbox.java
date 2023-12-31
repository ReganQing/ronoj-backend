package com.ron.ronoj.judge.codesandbox;

import com.ron.ronoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.ron.ronoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱的接口定义
 * @author Ron_567
 */
public interface CodeSandbox {
    /**
     *
     * @param executeCodeRequest 请求执行代码
     * @return 返回执行结果
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
