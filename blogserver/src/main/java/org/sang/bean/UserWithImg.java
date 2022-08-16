package org.sang.bean;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class UserWithImg {
    private Long id;
    private String username;
    private String nickname;
    private boolean enabled;
    private List<Role> roles;
    private String email;
    private String userface;
    private Timestamp regTime;
    private String base64;
}
