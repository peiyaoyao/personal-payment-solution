package cn.xyiio.pay.repository;

import cn.xyiio.pay.entity.SubmitEntity;
import cn.xyiio.pay.errno.StatusCode;

public interface SubmitRepository {

    StatusCode saveSubmit(SubmitEntity submitEntity, String secret);

    StatusCode updateLastLimit(String secret);

    SubmitEntity queryLastLimit(String secret);

    StatusCode destruction(String secret);

}