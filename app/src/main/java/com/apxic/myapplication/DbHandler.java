package com.apxic.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;


public class DbHandler extends SQLiteOpenHelper {
    private static final int DB_VERSION = 2;

    private static final String DB_NAME = "tuition";

    private static final String TABLE_STUDENTS = "students";
    private static final String COL_ID = "student_id";
    private static final String COL_NAME = "student_name";
    private static final String COL_ROLL = "roll_number";


    public DbHandler(Context context){
        super(context,DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){

        String CREATE_TABLE_STUDENT = "CREATE TABLE " + TABLE_STUDENTS + "("
                + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COL_NAME + " TEXT,"
                + COL_ROLL + " TEXT"+ ")";
        db.execSQL(CREATE_TABLE_STUDENT);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        // Drop older table if exist
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);
        // Create tables again
        onCreate(db);
    }

    void AddStudent(String student_name, String roll_number){
        //Get the Data Repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();
        //Create a new map of values, where column names are the keys
        ContentValues cValues = new ContentValues();

        cValues.put(COL_NAME, student_name);
        cValues.put(COL_ROLL, roll_number);

        // Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(TABLE_STUDENTS,null, cValues);
        dbClose(db);
    }
    // Update User Details
    public int UpdateStudent(String student_id, String student_name, String roll_number){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cValues = new ContentValues();
        cValues.put(COL_NAME, student_name);
        cValues.put(COL_ROLL, roll_number);

        int count = db.update(TABLE_STUDENTS, cValues, COL_ID + " = ?",new String[]{student_id});
        dbClose(db);
        return  count;
    }
    // Delete User Details
    public void DeleteOption(String COL_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_STUDENTS, COL_ID + " = ?",new String[]{COL_ID});
        dbClose(db);
    }

    public void dbClose(SQLiteDatabase db){
        if (db != null) {
            db.close();
        }


    }
}
