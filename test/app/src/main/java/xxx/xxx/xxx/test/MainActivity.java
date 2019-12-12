package xxx.xxx.xxx.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

public class MainActivity extends AppCompatActivity {
	HorizontalScrollView m_hs;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.m_hs = new HorizontalScrollView(this);
		this.m_hs = findViewById(R.id.hs_001);
		MainActivity.this.m_hs.post(new Runnable() {
			public void run() {
				//MainActivity.this.m_sv.scrollTo(0, MainActivity.this.m_sv.getBottom());
				MainActivity.this.m_hs.scrollTo(2000, 0);
			}
		});
	}
}
