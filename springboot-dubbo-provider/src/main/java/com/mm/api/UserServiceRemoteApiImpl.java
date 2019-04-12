package com.mm.api;

import com.mm.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class UserServiceRemoteApiImpl implements UserServiceRemoteApi {

    ConcurrentHashMap<Long, User> users = new ConcurrentHashMap<>();

    @Override
    public int save(User pojo) {
        log.info("pojo:{}", pojo);
        users.put(pojo.getId(), pojo);
        return 1;
    }

    @Override
    public User get(Long id) {
        log.info("id:{}", id);
        return users.get(id);
    }

    @Override
    public int update(User pojo) {
        log.info("pojo:{}", pojo);
        users.put(pojo.getId(), pojo);
        return 1;
    }
}
