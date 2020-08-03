package dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JdbcUtil;

/**
 * Description : 基础的Dao，Dao查询基础
 *
 * @author lyh
 * @date 2020-07-31
 */
public abstract class BaseDao {

    protected JdbcTemplate template = new JdbcTemplate(JdbcUtil.getDatasource());

}
