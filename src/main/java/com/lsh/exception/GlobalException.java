package com.lsh.exception;

import com.lsh.result.CodeMsg;

/**
 * @ClassName GlobalException
 * @Description: TODO
 * @Author lsh
 * @Date 2019/6/11 21:35
 * @Version
 */
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;


    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }
    public CodeMsg getCm() {
        return cm;
    }

}
