package com.github.yuweiguocn.demo.greendao.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.github.yuweiguocn.library.greendao.MigrationHelper;
import com.github.yuweiguocn.library.greendao.callback.MigrationOperationCallback;

import org.greenrobot.greendao.database.Database;

/**
 * Created by Growth on 2016/3/3.
 */
public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {
    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        MigrationHelper.migrate(db, new MigrationHelper.ReCreateAllTableListener() {
            @Override
            public void onCreateAllTables(Database db, boolean ifNotExists) {
                DaoMaster.createAllTables(db, ifNotExists);
            }

            @Override
            public void onDropAllTables(Database db, boolean ifExists) {
                DaoMaster.dropAllTables(db, ifExists);
            }
        }, new MigrationOperationCallback() {
            @Override
            public String onNewColumnSetting(String tableName, String columnName) {
                Log.d("MigrationHelper", "tableName is " + tableName + ", columnName is " + columnName);
                StringBuilder updateTableStringBuilder = null;
                if ("TEST_DATA2".equals(tableName) && "MD5_STRING".equals(columnName)) {
                    updateTableStringBuilder = new StringBuilder();
//                update user set passwd=md5("123321") where uName="lihua";
                    // update test set name1=name;
                    updateTableStringBuilder.append("update ")
                            .append(tableName)
                            .append(" set ")
                            .append(columnName)
                            .append("=")
                            .append("substr(" + "TEST_STRING,1,2" + ") ");
                }


                return updateTableStringBuilder == null ? "" : updateTableStringBuilder.toString();
            }
        }, TestDataDao.class, TestData2Dao.class, TestData3Dao.class);
    }

/*    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        db.addCustomFunction("_GET_FILE_EXT", 1, mGetFileExtension);

    }

    private final SQLiteDatabase.CustomFunction mGetFileExtension =
                         new SQLiteDatabase.CustomFunction() {
                 @Override
                 public void callback(String[] args) {
                         String file = args[0];
                         int index = file.lastIndexOf(".");
                         if (index != -1 && file.length() > index + 1) {
                                 mFileExt = file.substring(index);  // 获取到扩展名
                             }
                     }
             };*/
}
