package com.example.groceries;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ProductDAO {
    private SQLiteDatabase db;
    private GroceriesDbhelper dbHelper; //bdhelper sirve para la comunicacion con las base de datos
    public ProductDAO(Context context){
        dbHelper=new GroceriesDbhelper(context);
    }
    public int insertProduct(Product product){
        int result = 0;
        db=dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(GroceriesContract.Student.)
        return result;
    }
}
