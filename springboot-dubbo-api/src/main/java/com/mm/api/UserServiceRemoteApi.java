package com.mm.api;

import com.mm.pojo.User;

public interface UserServiceRemoteApi {

    int save(User pojo);

    User get(Long id);

    int update(User pojo);
}
