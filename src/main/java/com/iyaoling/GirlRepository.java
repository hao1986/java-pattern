package com.iyaoling;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dingyiming on 2017/2/20.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    // 通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
