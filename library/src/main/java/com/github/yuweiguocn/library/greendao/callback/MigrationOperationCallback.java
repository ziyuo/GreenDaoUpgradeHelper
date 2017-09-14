package com.github.yuweiguocn.library.greendao.callback;

/**
 * Created by ziyuo on 2017/9/13.
 * <p>
 * 如果表中有新增的列，对新增的列进行赋值策略
 */

public interface MigrationOperationCallback {

    //为新字段赋值
    String onNewColumnSetting(String tableName, String columnName);

}
