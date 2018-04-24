package com.example.administrator.test;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    private Button button;
//    private EditText editText;
//    private ImageView imageView;
//    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.hide();
        }

//        button = (Button) findViewById(R.id.button);
//        editText = (EditText) findViewById(R.id.edit);
//        imageView = (ImageView) findViewById(R.id.image);
//        progressBar = (ProgressBar) findViewById(R.id.progressBar);
//        button.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//
//        switch (v.getId())
//        {
//            case R.id.button:
////                String inputText = editText.getText().toString();
////                Toast.makeText(this,inputText,Toast.LENGTH_SHORT).show();
////                int prodress = progressBar.getProgress();
////                prodress = prodress+10;
////                progressBar.setProgress(prodress);
//
//                //对话框
////                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
////                dialog.setTitle("This is Dialog");
////                dialog.setMessage("Something Importat.");
////                dialog.setCancelable(false);
////                dialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
////
////                    @Override
////                    public void onClick(DialogInterface dialog, int which) {
////
////                    }
////                });
////                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
////                    @Override
////                    public void onClick(DialogInterface dialog, int which) {
////
////                    }
////                });
////                dialog.show();
//
//                //进度条对话框
//                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
//                progressDialog.setTitle("This is progressDialog");
//                progressDialog.setMessage("Loading...");
//                progressDialog.setCancelable(true);
//                progressDialog.show();
//
//                break;
//            default:
//                break;
//        }

//    }
}
