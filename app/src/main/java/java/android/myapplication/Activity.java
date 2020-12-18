package java.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity extends MainActivity {
    private CheckBox mDefault, mProtected, mPublic, mPrivate;
    private Button mWriteResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        mDefault = findViewById(R.id.check_default);
        mPrivate = findViewById(R.id.check_private);
        mProtected = findViewById(R.id.check_protected);
        mPublic = findViewById(R.id.check_public);

        mWriteResult = findViewById(R.id.write_result);

        mDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDefault.isChecked())
                    points=points+1;
            }
        });

        mPrivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPrivate.isChecked())
                    points=points+1;
            }
        });

        mPublic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPublic.isChecked())
                    points=points+1;
            }
        });

        mProtected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mProtected.isChecked())
                    points=points+1;
                Toast toast = Toast.makeText(getApplicationContext(), "Вы крут на "+points+" Гусейнов Гасановых из 5", Toast.LENGTH_SHORT);
                toast.show();
            }
        });



    }
}