package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.R;

public class NotificationView extends AppCompatActivity {

    ImageView notification_image;
    TextView notification_title,notification_date,notification_body;

    String NotificationTitle,NotificationDate,NotificationBody,NotificationImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_notification_view );


        notification_image = findViewById( R.id.notification_image );

        notification_title = findViewById( R.id.notification_title );
        notification_date = findViewById( R.id.notification_date );
        notification_body = findViewById( R.id.notification_body );


        NotificationTitle = getIntent().getStringExtra("notification_title");
        NotificationDate = getIntent().getStringExtra("notification_date");
        NotificationBody = getIntent().getStringExtra("notification_body");
        NotificationImage = getIntent().getStringExtra("notification_image");

        notification_title.setText( NotificationTitle );
        notification_date.setText( NotificationDate );
        notification_body.setText( NotificationBody );

        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.image_load_bg).error(R.drawable.image_load_bg);
        Glide.with(this).load(NotificationImage).apply(requestOptions).into(notification_image);


    }
}
