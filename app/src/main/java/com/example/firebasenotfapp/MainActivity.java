package com.example.firebasenotfapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    FirebaseInstanceId.getInstance().getInstanceId()
//        .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
//        @Override
//        public void onComplete(@NonNull Task<InstanceIdResult> task) {
//            if (!task.isSuccessful()) {
//                Log.w(TAG, "getInstanceId failed", task.getException());
//                return;
//            }
//
//            // Get new Instance ID token
//            String token = task.getResult().getToken();
//
//            // Log and toast
//            String msg = getString(R.string.msg_token_fmt, token);
//            Log.d(TAG, msg);
//            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
//        }
//    });
}
