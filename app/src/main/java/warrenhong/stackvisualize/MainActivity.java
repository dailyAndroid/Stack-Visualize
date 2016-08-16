package warrenhong.stackvisualize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button push;
    Button pop;

    int count;

    View element1;
    View element2;
    View element3;
    View element4;
    View element5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        push = (Button) findViewById(R.id.push);
        pop = (Button) findViewById(R.id.pop);
        count = 0;

        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                moveElem();
            }
        });

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                returnElem();
            }
        });
    }

    public void moveElem() {
        RelativeLayout.LayoutParams positionRules;
        ViewGroup.LayoutParams sizeRules;

        if (count == 1) {
            element1 = findViewById(R.id.element1);
            positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            positionRules.addRule(RelativeLayout.CENTER_HORIZONTAL);
            element1.setLayoutParams(positionRules);

            sizeRules = element1.getLayoutParams();
            sizeRules.width = 400;
            sizeRules.height = 200;
            element1.setLayoutParams(sizeRules);
        }
        if (count == 2) {
            element2 = findViewById(R.id.element2);
            positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.CENTER_HORIZONTAL);
            positionRules.addRule(RelativeLayout.ABOVE, element1.getId());
            element2.setLayoutParams(positionRules);

            sizeRules = element2.getLayoutParams();
            sizeRules.width = 400;
            sizeRules.height = 200;
            element2.setLayoutParams(sizeRules);
        }
        if (count == 3) {
            element3 = findViewById(R.id.element3);
            positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.CENTER_HORIZONTAL);
            positionRules.addRule(RelativeLayout.ABOVE, element2.getId());
            element3.setLayoutParams(positionRules);

            sizeRules = element3.getLayoutParams();
            sizeRules.width = 400;
            sizeRules.height = 200;
            element3.setLayoutParams(sizeRules);
        }
        if (count == 4) {
            element4 = findViewById(R.id.element4);
            positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.CENTER_HORIZONTAL);
            positionRules.addRule(RelativeLayout.ABOVE, element3.getId());
            element4.setLayoutParams(positionRules);

            sizeRules = element4.getLayoutParams();
            sizeRules.width = 400;
            sizeRules.height = 200;
            element4.setLayoutParams(sizeRules);
        }
        if (count == 5) {
            element5 = findViewById(R.id.element5);
            positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.CENTER_HORIZONTAL);
            positionRules.addRule(RelativeLayout.ABOVE, element4.getId());
            element5.setLayoutParams(positionRules);

            sizeRules = element5.getLayoutParams();
            sizeRules.width = 400;
            sizeRules.height = 200;
            element5.setLayoutParams(sizeRules);
        }
        if (count > 5) {
            count = 5;
            Toast.makeText(this, "The Stack is Full", Toast.LENGTH_SHORT).show();
        }
    }

    public void returnElem() {
        if (count == 4) {
            element5 = findViewById(R.id.element5);

            RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            element5.setLayoutParams(positionRules);

            ViewGroup.LayoutParams sizeRules = element5.getLayoutParams();
            sizeRules.width = 30;
            sizeRules.height = 30;
            element5.setLayoutParams(sizeRules);
        }
        if (count == 3) {
            element4 = findViewById(R.id.element4);

            RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            element4.setLayoutParams(positionRules);

            ViewGroup.LayoutParams sizeRules = element4.getLayoutParams();
            sizeRules.width = 30;
            sizeRules.height = 30;
            element4.setLayoutParams(sizeRules);
        }
        if (count == 2) {
            element3 = findViewById(R.id.element3);

            RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            element3.setLayoutParams(positionRules);

            ViewGroup.LayoutParams sizeRules = element3.getLayoutParams();
            sizeRules.width = 30;
            sizeRules.height = 30;
            element3.setLayoutParams(sizeRules);
        }
        if (count == 1) {
            element2 = findViewById(R.id.element2);

            RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            element2.setLayoutParams(positionRules);

            ViewGroup.LayoutParams sizeRules = element2.getLayoutParams();
            sizeRules.width = 30;
            sizeRules.height = 30;
            element2.setLayoutParams(sizeRules);
        }
        if (count == 0) {
            element1 = findViewById(R.id.element1);

            RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            positionRules.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            element1.setLayoutParams(positionRules);

            ViewGroup.LayoutParams sizeRules = element1.getLayoutParams();
            sizeRules.width = 30;
            sizeRules.height = 30;
            element1.setLayoutParams(sizeRules);
        }
        if (count < 0) {
            count = 0;
            Toast.makeText(this, "The Stack is Empty", Toast.LENGTH_SHORT).show();
        }
    }
}
