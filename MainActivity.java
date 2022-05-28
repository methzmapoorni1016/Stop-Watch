
package com.example.mystopwatch;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2;
    Button button;
    Animation atg,btgone,btntwo;
    ImageView ivSplash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=findViewById(R.id.text1);
        textView2=findViewById(R.id.text2);
        button=findViewById(R.id.get);
        ivSplash=findViewById(R.id.stop);

        //load animations
        atg= AnimationUtils.loadAnimation(this,R.anim.atg);
        btgone= AnimationUtils.loadAnimation(this,R.anim.btgone);
        btntwo= AnimationUtils.loadAnimation(this,R.anim.btntwo);

        //passing animation
        ivSplash.startAnimation(atg);
        textView1.startAnimation(btgone);
//        textView2.startAnimation(btgone);
        button.setAnimation(btntwo);


        //passing event

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(MainActivity.this,WatchActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        //import font
       /* Typeface MLight=Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
        Typeface MMedium=Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");
        Typeface MRegular=Typeface.createFromAsset(getAssets(),"fonts/MRegular.ttf");
*/
        //customize font
       /* textView1.setTypeface(MRegular);
        textView2.setTypeface(MLight);
        button.setTypeface(MMedium);*/
    }
}