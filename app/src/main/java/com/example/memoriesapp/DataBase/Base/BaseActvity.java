package com.example.memoriesapp.DataBase.Base;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActvity extends AppCompatActivity {
    public AppCompatActivity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity=this;
    }

     public void showMessage(String message , String posActionname){
         AlertDialog.Builder builder =new AlertDialog.Builder(this);
         builder.setMessage(message);
         builder.setPositiveButton(posActionname, new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                 dialogInterface.dismiss();
             }
         });
         builder.show();
     }

    public void showMessage(int message , int posActionname,
                            DialogInterface.OnClickListener posaction){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setPositiveButton(posActionname,posaction) ;
        builder.show();
    }

    public void showMessage(int message , String posActionnameId){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setPositiveButton(posActionnameId, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

    public void showMessage(int messageId , String posActionStringId,
                            DialogInterface.OnClickListener posaction){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage(messageId);
        builder.setPositiveButton(posActionStringId,posaction) ;
        builder.show();
    }

}
