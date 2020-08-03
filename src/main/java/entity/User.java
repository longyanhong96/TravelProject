package entity;

import lombok.Data;

/**
 * Description : 用户的基本信息
 *
 * @author lyh
 * @date 2020-07-19
 */

@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String email;

}
